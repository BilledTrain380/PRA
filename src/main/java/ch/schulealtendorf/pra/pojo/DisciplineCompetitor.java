package ch.schulealtendorf.pra.pojo;

import java.util.Objects;

/**
 * Data class for a competitor of a single discipline.
 * 
 * @author nmaerchy
 * @version 2.0.0
 */
public class DisciplineCompetitor {
    
    private String prename = "";
    private String surname = "";
    private String clazz = "";
    private Result result = new Result(Integer.MIN_VALUE);
    private int points = 0;

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
                "prename='" + prename + '\'' +
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
        return points == that.points &&
                Objects.equals(prename, that.prename) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {

        return Objects.hash(prename, surname, clazz, result, points);
    }
}
