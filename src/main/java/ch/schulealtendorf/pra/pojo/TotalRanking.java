package ch.schulealtendorf.pra.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for the total ranking.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class TotalRanking {
    
    private int year = 1970;
    private boolean gender = true;
    private int age = 1;
    private List<TotalCompetitor> competitors = new ArrayList<>();

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

    public List<TotalCompetitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<TotalCompetitor> competitors) {
        this.competitors = competitors;
    }

    @Override
    public String toString() {
        return "TotalRanking{" +
                "year=" + year +
                ", gender=" + gender +
                ", age=" + age +
                ", competitors=" + competitors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TotalRanking that = (TotalRanking) o;

        if (year != that.year) return false;
        if (gender != that.gender) return false;
        if (age != that.age) return false;
        return competitors.equals(that.competitors);
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (gender ? 1 : 0);
        result = 31 * result + age;
        result = 31 * result + competitors.hashCode();
        return result;
    }
}
