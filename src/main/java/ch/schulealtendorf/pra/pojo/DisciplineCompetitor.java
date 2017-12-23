package ch.schulealtendorf.pra.pojo;

/**
 * Data class for a competitor of a single discipline.
 * 
 * @author nmaerchy
 * @version 2.0.0
 */
public class DisciplineCompetitor {
    
    private int rank = 1;
    private String prename = "";
    private String surname = "";
    private String clazz = "";
    private Result result = new Result(Integer.MIN_VALUE);
    private int points = 0;

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
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "DisciplineCompetitor{" +
                "rank=" + rank +
                ", prename='" + prename + '\'' +
                ", surname='" + surname + '\'' +
                ", clazz='" + clazz + '\'' +
                ", result=" + result +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisciplineCompetitor that = (DisciplineCompetitor) o;

        if (rank != that.rank) return false;
        if (points != that.points) return false;
        if (!prename.equals(that.prename)) return false;
        if (!surname.equals(that.surname)) return false;
        if (!clazz.equals(that.clazz)) return false;
        return result.equals(that.result);
    }

    @Override
    public int hashCode() {
        int result1 = rank;
        result1 = 31 * result1 + prename.hashCode();
        result1 = 31 * result1 + surname.hashCode();
        result1 = 31 * result1 + clazz.hashCode();
        result1 = 31 * result1 + result.hashCode();
        result1 = 31 * result1 + points;
        return result1;
    }
}
