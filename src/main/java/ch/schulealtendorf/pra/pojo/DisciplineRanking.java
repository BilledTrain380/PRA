package ch.schulealtendorf.pra.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for the discipline ranking.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class DisciplineRanking {
    
    private int year = 1970;
    private boolean gender = true;
    private int age = 1;
    private String discipline = "";
    private List<DisciplineCompetitor> competitors = new ArrayList<>();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public List<DisciplineCompetitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<DisciplineCompetitor> competitors) {
        this.competitors = competitors;
    }

    @Override
    public String toString() {
        return "DisciplineRanking{" +
                "year=" + year +
                ", gender=" + gender +
                ", age=" + age +
                ", discipline='" + discipline + '\'' +
                ", competitors=" + competitors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisciplineRanking that = (DisciplineRanking) o;

        if (year != that.year) return false;
        if (gender != that.gender) return false;
        if (age != that.age) return false;
        if (!discipline.equals(that.discipline)) return false;
        return competitors.equals(that.competitors);
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (gender ? 1 : 0);
        result = 31 * result + age;
        result = 31 * result + discipline.hashCode();
        result = 31 * result + competitors.hashCode();
        return result;
    }
}
