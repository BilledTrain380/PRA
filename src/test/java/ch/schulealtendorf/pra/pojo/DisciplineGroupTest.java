package ch.schulealtendorf.pra.pojo;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Testclass for {@link DisciplineGroup}.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class DisciplineGroupTest {
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void add() throws Exception {
        
        // Arrange
        DisciplineGroup group = new DisciplineGroup();
        
        // Act
        group.add(new Discipline());
        
        // Assert
        Assert.assertEquals(new Discipline(), group.get(0));
    }

    @Test
    public void addMoreThanPossible() throws Exception {
        
        // Assert
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Can not add more disciplines than 3");
        
        // Arrange
        DisciplineGroup group = new DisciplineGroup(3);
        group.add(new Discipline());
        group.add(new Discipline());
        group.add(new Discipline());
       
        
        // Act
        group.add(new Discipline());
    }

    @Test
    public void getMoreThanPossible() throws Exception {
        
        // Assert
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Can not get more disciplines than 3: Discipline with index 3 does not exist");
        
        // Arrange
        DisciplineGroup group = new DisciplineGroup(3);
        group.add(new Discipline());
        group.add(new Discipline());
        group.add(new Discipline());
        
        // Act
        group.get(3);
    }

    @Test
    public void getIllegalIndex() throws Exception {
        
        // Assert
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negative index is not allowed");
        
        // Arrange
        DisciplineGroup group = new DisciplineGroup(3);
        
        // Act
        group.get(-1);
    }
}