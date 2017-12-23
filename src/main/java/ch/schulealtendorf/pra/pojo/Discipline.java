package ch.schulealtendorf.pra.pojo;

/**
 * Data class for a discipline result.
 * 
 * @author nmaerchy
 * @version 2.0.0
 */
public class Discipline {
    
    private String name = "";
    private String distance = "";
    private Result result = new Result(Integer.MIN_VALUE);
    private int points = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
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
                "name='" + name + '\'' +
                ", distance='" + distance + '\'' +
                ", result=" + result +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discipline that = (Discipline) o;

        if (that.result != result) return false;
        if (points != that.points) return false;
        if (!name.equals(that.name)) return false;
        return distance.equals(that.distance);
    }

    @Override
    public int hashCode() {
        int result1;
        result1 = name.hashCode();
        result1 = 31 * result1 + distance.hashCode();
        result1 = 31 * result1 + result.hashCode();
        result1 = 31 * result1 + points;
        return result1;
    }
}
