package ch.schulealtendorf.pra.pojo;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Data class for the discipline ranking.
 * 
 * @author nmaerchy
 * @version 2.0.0
 */
public class DisciplineRanking {
    
    private Year year = Year.now();
    private boolean gender = true;
    private String discipline = "";
    private List<DisciplineCompetitor> competitors = new ArrayList<>();

    public Year getYear() { return year; }

    public void setYear(Year year) { this.year = year; }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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
                ", discipline='" + discipline + '\'' +
                ", competitors=" + competitors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineRanking that = (DisciplineRanking) o;
        return gender == that.gender &&
                Objects.equals(year, that.year) &&
                Objects.equals(discipline, that.discipline) &&
                Objects.equals(competitors, that.competitors);
    }

    @Override
    public int hashCode() {

        return Objects.hash(year, gender, discipline, competitors);
    }
}
