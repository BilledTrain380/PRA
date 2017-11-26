package ch.schulealtendorf.pra.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for a specific number of disciplines.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class DisciplineGroup {
    
    private final int count;

    private final List<Discipline> disciplines;
    
    public DisciplineGroup(int count) {
        this.count = count;
        disciplines = new ArrayList<>(this.count);
    }

    public DisciplineGroup() {
        count = 1;
        disciplines = new ArrayList<>(count);
    }

    public void add(Discipline discipline) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }
    
    public Discipline get(int index) {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    @Override
    public String toString() {
        return "DisciplineGroup{" +
                "disciplines=" + disciplines +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DisciplineGroup that = (DisciplineGroup) o;

        if (count != that.count) return false;
        return disciplines.equals(that.disciplines);
    }

    @Override
    public int hashCode() {
        int result = count;
        result = 31 * result + disciplines.hashCode();
        return result;
    }
}
