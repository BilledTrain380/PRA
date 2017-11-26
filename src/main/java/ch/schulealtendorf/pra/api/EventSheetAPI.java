package ch.schulealtendorf.pra.api;

import ch.schulealtendorf.pra.pojo.EventSheet;

import java.io.InputStream;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public interface EventSheetAPI {
    
    InputStream createReport(EventSheet data);
}
