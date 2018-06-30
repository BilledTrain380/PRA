package ch.schulealtendorf.pra.pojo;

import java.util.Objects;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public class Starter extends Participant {

    private int startnumber = 1;

    public int getStartnumber() {
        return startnumber;
    }

    public void setStartnumber(int startnumber) {
        this.startnumber = startnumber;
    }

    @Override
    public String toString() {
        return "Starter{" +
                "startnumber=" + startnumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Starter starter = (Starter) o;
        return startnumber == starter.startnumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), startnumber);
    }
}
