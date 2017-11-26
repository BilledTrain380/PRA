package ch.schulealtendorf.pra.pojo;

/**
 * Data class for competitors used in a event sheet.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class Competitor {
    
    private int startnumber = 1;
    private String prename = "";
    private String surname = "";
    private String distance = "";

    public int getStartnumber() {
        return startnumber;
    }

    public void setStartnumber(int startnumber) {
        this.startnumber = startnumber;
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

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "startnumber=" + startnumber +
                ", prename='" + prename + '\'' +
                ", surname='" + surname + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Competitor that = (Competitor) o;

        if (startnumber != that.startnumber) return false;
        if (!prename.equals(that.prename)) return false;
        if (!surname.equals(that.surname)) return false;
        return distance.equals(that.distance);
    }

    @Override
    public int hashCode() {
        int result = startnumber;
        result = 31 * result + prename.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + distance.hashCode();
        return result;
    }
}
