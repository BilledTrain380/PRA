package ch.schulealtendorf.pra.pojo;

import java.util.Objects;

/**
 * Data class for a competitor used for discipline group api.
 * 
 * @author nmaerchy
 * @version 2.0.0
 */
public class DisciplineGroupCompetitor {
    
    private String prename = "";
    private String surname = "";
    private String clazz = "";
    private Discipline schnelllauf = new Discipline();
    private Discipline weitsprung = new Discipline();
    private Discipline ballwurf = new Discipline();

    public String getPrename() { return prename; }

    public void setPrename(String prename) { this.prename = prename; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getClazz() { return clazz; }

    public void setClazz(String clazz) { this.clazz = clazz; }

    public Discipline getSchnelllauf() { return schnelllauf; }

    public void setSchnelllauf(Discipline schnelllauf) { this.schnelllauf = schnelllauf; }

    public Discipline getWeitsprung() { return weitsprung; }

    public void setWeitsprung(Discipline weitsprung) { this.weitsprung = weitsprung; }

    public Discipline getBallwurf() { return ballwurf; }

    public void setBallwurf(Discipline ballwurf) { this.ballwurf = ballwurf; }

    @Override
    public String toString() {
        return "DisciplineGroupCompetitor{" +
                ", prename='" + prename + '\'' +
                ", surname='" + surname + '\'' +
                ", clazz='" + clazz + '\'' +
                ", schnelllauf=" + schnelllauf +
                ", weitsprung=" + weitsprung +
                ", ballwurf=" + ballwurf +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineGroupCompetitor that = (DisciplineGroupCompetitor) o;
        return Objects.equals(prename, that.prename) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(schnelllauf, that.schnelllauf) &&
                Objects.equals(weitsprung, that.weitsprung) &&
                Objects.equals(ballwurf, that.ballwurf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(prename, surname, clazz, schnelllauf, weitsprung, ballwurf);
    }
}
