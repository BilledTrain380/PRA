package ch.schulealtendorf.pra.api;

import ch.schulealtendorf.pra.pojo.ParticipantList;

import java.io.InputStream;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public interface ParticipantListAPI {
    
    InputStream createReport(ParticipantList data);
}
