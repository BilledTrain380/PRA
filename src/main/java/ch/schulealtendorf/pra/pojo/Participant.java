package ch.schulealtendorf.pra.pojo;

/**
 * Data class for a participant used in the participant list.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class Participant {
    
    private int number = 1;
    private String prename = "";
    private String surname = "";
    private boolean gender = true;
    private String clazz = "";
    private String teacher = "";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "number=" + number +
                ", prename='" + prename + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", clazz='" + clazz + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Participant that = (Participant) o;

        if (number != that.number) return false;
        if (gender != that.gender) return false;
        if (!prename.equals(that.prename)) return false;
        if (!surname.equals(that.surname)) return false;
        if (!clazz.equals(that.clazz)) return false;
        return teacher.equals(that.teacher);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + prename.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + (gender ? 1 : 0);
        result = 31 * result + clazz.hashCode();
        result = 31 * result + teacher.hashCode();
        return result;
    }
}
