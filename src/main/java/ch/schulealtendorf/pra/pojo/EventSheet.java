package ch.schulealtendorf.pra.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for a event sheet.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class EventSheet {
    
    private boolean gender = true;
    private String clazz = "";
    private String discipline = "";
    private List<Competitor> competitors = new ArrayList<>();

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    @Override
    public String toString() {
        return "EventSheet{" +
                "gender=" + gender +
                ", clazz='" + clazz + '\'' +
                ", discipline='" + discipline + '\'' +
                ", competitors=" + competitors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventSheet that = (EventSheet) o;

        if (gender != that.gender) return false;
        if (!clazz.equals(that.clazz)) return false;
        if (!discipline.equals(that.discipline)) return false;
        return competitors.equals(that.competitors);
    }

    @Override
    public int hashCode() {
        int result = (gender ? 1 : 0);
        result = 31 * result + clazz.hashCode();
        result = 31 * result + discipline.hashCode();
        result = 31 * result + competitors.hashCode();
        return result;
    }
}
