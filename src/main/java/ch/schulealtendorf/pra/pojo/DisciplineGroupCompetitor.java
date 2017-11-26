package ch.schulealtendorf.pra.pojo;

/**
 * Data class for a competitor used for discipline group api.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class DisciplineGroupCompetitor {
    
    private int rank = 1;
    private String prename = "";
    private String surname = "";
    private String clazz = "";
    private DisciplineGroup disciplineGroup = new DisciplineGroup();
}
