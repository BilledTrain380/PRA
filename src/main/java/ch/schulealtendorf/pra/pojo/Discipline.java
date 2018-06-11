package ch.schulealtendorf.pra.pojo;

import java.util.Objects;
import java.util.Optional;

/**
 * Data class for a discipline result.
 * 
 * @author nmaerchy
 * @version 3.0.0
 */
public class Discipline {

    private String distance = null;
    private Result result = new Result(Integer.MIN_VALUE);
    private int points = 0;

    public Optional<String> getDistance() {
        return Optional.ofNullable(distance);
    }

    public void setDistance(String distance) {
        this.distance = distance;
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
        return "Discipline{" +
                "distance='" + distance + '\'' +
                ", result=" + result +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return points == that.points &&
                Objects.equals(distance, that.distance) &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {

        return Objects.hash(distance, result, points);
    }
}
