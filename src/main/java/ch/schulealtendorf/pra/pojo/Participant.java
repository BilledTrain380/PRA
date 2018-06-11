package ch.schulealtendorf.pra.pojo;

import java.util.Objects;

/**
 * Data class for a participant used in the participant list.
 * 
 * @author nmaerchy
 * @version 2.0.0
 */
public class Participant {
    
    private String prename = "";
    private String surname = "";
    private boolean gender = true;
    private String clazz = "";
    private String teacher = "";

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
        return gender == that.gender &&
                Objects.equals(prename, that.prename) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(teacher, that.teacher);
    }

    @Override
    public int hashCode() {

        return Objects.hash(prename, surname, gender, clazz, teacher);
    }
}
