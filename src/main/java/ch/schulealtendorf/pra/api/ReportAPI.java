package ch.schulealtendorf.pra.api;

import java.io.InputStream;

/**
 * Describes an api that generates a report with the given data.
 * 
 * @author nmaerchy
 * @version 1.1.0
 */
public interface ReportAPI<T> {

    /**
     * Creates a report with the given {@code data}.
     * 
     * @param data the data to use in the report
     *             
     * @return the generated report as an input stream
     * @throws ReportAPIException if something went wrong during the report generation
     */
    InputStream createReport(T data) throws ReportAPIException;
}
