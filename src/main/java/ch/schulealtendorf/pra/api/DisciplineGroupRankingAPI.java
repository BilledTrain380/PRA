package ch.schulealtendorf.pra.api;

import ch.schulealtendorf.pra.pojo.DisciplineGroupRanking;

import java.io.InputStream;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public interface DisciplineGroupRankingAPI {
    
    InputStream createReport(DisciplineGroupRanking data);
}
