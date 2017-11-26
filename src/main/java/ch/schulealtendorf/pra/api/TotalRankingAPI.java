package ch.schulealtendorf.pra.api;

import ch.schulealtendorf.pra.pojo.TotalRanking;

import java.io.InputStream;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public interface TotalRankingAPI {
    
    InputStream createReport(TotalRanking data);
}
