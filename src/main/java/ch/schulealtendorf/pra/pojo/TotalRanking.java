package ch.schulealtendorf.pra.pojo;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Data class for the total ranking.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class TotalRanking {
    
    private Year year = Year.now();
    private boolean gender = true;
    private List<TotalCompetitor> competitors = new ArrayList<>();

    public Year getYear() { return year; }

    public void setYear(Year year) { this.year = year; }

    public boolean isGender() { return gender; }

    public void setGender(boolean gender) { this.gender = gender; }

    public List<TotalCompetitor> getCompetitors() { return competitors; }

    public void setCompetitors(List<TotalCompetitor> competitors) { this.competitors = competitors; }

    @Override
    public String toString() {
        return "TotalRanking{" +
                "year=" + year +
                ", gender=" + gender +
                ", competitors=" + competitors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalRanking that = (TotalRanking) o;
        return gender == that.gender &&
                Objects.equals(year, that.year) &&
                Objects.equals(competitors, that.competitors);
    }

    @Override
    public int hashCode() {

        return Objects.hash(year, gender, competitors);
    }
}
