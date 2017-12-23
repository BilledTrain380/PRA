package ch.schulealtendorf.pra.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Data class for a competitor in total ranking.
 * 
 * @author nmaerchy
 * @version 2.0.0
 */
public class TotalCompetitor {
    
    private int rank = 1;
    private String prename = "";
    private String Surname = "";
    private String clazz = "";
    private int totalPoints = 0;
    private Result deletedResult = new Result(Integer.MIN_VALUE);
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

    public Result getDeletedResult() {
        return deletedResult;
    }

    public void setDeletedResult(Result deletedResult) {
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
        return rank == that.rank &&
                totalPoints == that.totalPoints &&
                Objects.equals(prename, that.prename) &&
                Objects.equals(Surname, that.Surname) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(deletedResult, that.deletedResult) &&
                Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, prename, Surname, clazz, totalPoints, deletedResult, results);
    }
}
