package ch.schulealtendorf.pra.api;

import ch.schulealtendorf.pra.pojo.DisciplineRanking;

import java.io.InputStream;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public interface DisciplineRankingAPI {
    
    InputStream createReport(DisciplineRanking data);
}
