package ch.schulealtendorf.pra.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for the participant list.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class ParticipantList {
    
    private String sport = "";
    private List<Participant> participants = new ArrayList<>();

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "ParticipantList{" +
                "sport='" + sport + '\'' +
                ", participants=" + participants +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParticipantList that = (ParticipantList) o;

        if (!sport.equals(that.sport)) return false;
        return participants.equals(that.participants);
    }

    @Override
    public int hashCode() {
        int result = sport.hashCode();
        result = 31 * result + participants.hashCode();
        return result;
    }
}
