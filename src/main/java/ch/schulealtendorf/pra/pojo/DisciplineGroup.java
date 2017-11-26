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
        if (disciplines.size() < count) {
            disciplines.add(discipline);
        } else {
            throw new IllegalStateException("Can not add more disciplines than " + count);
        }
    }
    
    public Discipline get(int index) {
        
        if (index < 0) {
            throw new IllegalArgumentException("Negative index is not allowed");
        }
        
        if (disciplines.size() > index) {
            return disciplines.get(index);
        }
        throw new IllegalArgumentException("Can not get more disciplines than " + count + ": Discipline with index " + index + " does not exist");
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
