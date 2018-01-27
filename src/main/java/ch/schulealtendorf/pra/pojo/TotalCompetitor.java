package ch.schulealtendorf.pra.pojo;

import java.util.Objects;

/**
 * Data class for a competitor in total ranking.
 * 
 * @author nmaerchy
 * @version 3.0.0
 */
public class TotalCompetitor {
    
    private int rank = 1;
    private String prename = "";
    private String Surname = "";
    private String clazz = "";
    private Discipline schelllauf = new Discipline();
    private Discipline ballwurf = new Discipline();
    private Discipline ballzielWurf = new Discipline();
    private Discipline korbeinwurf = new Discipline();
    private Discipline seilspringen = new Discipline();
    private Discipline weitsprung = new Discipline();

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Discipline getSchelllauf() { return schelllauf; }

    public void setSchelllauf(Discipline schelllauf) { this.schelllauf = schelllauf; }

    public Discipline getBallwurf() { return ballwurf; }

    public void setBallwurf(Discipline ballwurf) { this.ballwurf = ballwurf; }

    public Discipline getBallzielWurf() { return ballzielWurf; }

    public void setBallzielWurf(Discipline ballzielWurf) { this.ballzielWurf = ballzielWurf; }

    public Discipline getKorbeinwurf() { return korbeinwurf; }

    public void setKorbeinwurf(Discipline korbeinwurf) { this.korbeinwurf = korbeinwurf; }

    public Discipline getSeilspringen() { return seilspringen; }

    public void setSeilspringen(Discipline seilspringen) { this.seilspringen = seilspringen; }

    public Discipline getWeitsprung() { return weitsprung; }

    public void setWeitsprung(Discipline weitsprung) { this.weitsprung = weitsprung; }

    @Override
    public String toString() {
        return "TotalCompetitor{" +
                "rank=" + rank +
                ", prename='" + prename + '\'' +
                ", Surname='" + Surname + '\'' +
                ", clazz='" + clazz + '\'' +
                ", schelllauf=" + schelllauf +
                ", ballwurf=" + ballwurf +
                ", ballzielWurf=" + ballzielWurf +
                ", korbeinwurf=" + korbeinwurf +
                ", seilspringen=" + seilspringen +
                ", weitsprung=" + weitsprung +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalCompetitor that = (TotalCompetitor) o;
        return rank == that.rank &&
                Objects.equals(prename, that.prename) &&
                Objects.equals(Surname, that.Surname) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(schelllauf, that.schelllauf) &&
                Objects.equals(ballwurf, that.ballwurf) &&
                Objects.equals(ballzielWurf, that.ballzielWurf) &&
                Objects.equals(korbeinwurf, that.korbeinwurf) &&
                Objects.equals(seilspringen, that.seilspringen) &&
                Objects.equals(weitsprung, that.weitsprung);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rank, prename, Surname, clazz, schelllauf, ballwurf, ballzielWurf, korbeinwurf, seilspringen, weitsprung);
    }
}
