package ch.schulealtendorf.pra.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for a competitor in total ranking.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class TotalCompetitor {
    
    private int rank = 1;
    private String prename = "";
    private String Surname = "";
    private String clazz = "";
    private int totalPoints = 0;
    private double deletedResult = 0.0;
    private List<Discipline> results = new ArrayList<>();

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public double getDeletedResult() {
        return deletedResult;
    }

    public void setDeletedResult(double deletedResult) {
        this.deletedResult = deletedResult;
    }

    public List<Discipline> getResults() {
        return results;
    }

    public void setResults(List<Discipline> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "TotalCompetitor{" +
                "rank=" + rank +
                ", prename='" + prename + '\'' +
                ", Surname='" + Surname + '\'' +
                ", clazz='" + clazz + '\'' +
                ", totalPoints=" + totalPoints +
                ", deletedResult=" + deletedResult +
                ", results=" + results +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TotalCompetitor that = (TotalCompetitor) o;

        if (rank != that.rank) return false;
        if (totalPoints != that.totalPoints) return false;
        if (Double.compare(that.deletedResult, deletedResult) != 0) return false;
        if (!prename.equals(that.prename)) return false;
        if (!Surname.equals(that.Surname)) return false;
        if (!clazz.equals(that.clazz)) return false;
        return results.equals(that.results);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = rank;
        result = 31 * result + prename.hashCode();
        result = 31 * result + Surname.hashCode();
        result = 31 * result + clazz.hashCode();
        result = 31 * result + totalPoints;
        temp = Double.doubleToLongBits(deletedResult);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + results.hashCode();
        return result;
    }
}
