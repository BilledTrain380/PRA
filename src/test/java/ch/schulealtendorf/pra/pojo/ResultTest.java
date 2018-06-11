package ch.schulealtendorf.pra.pojo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author nmaerchy
 * @version 0.0.1
 */
public class ResultTest {

    @Test
    public void getAsDoubleWithInteger() {
        
        Result result = new Result(5);


        Assert.assertEquals(5.0, result.getAsDouble(), 0.0);
    }

    @Test
    public void getAsIntegerWithDouble() {
        
        Result result = new Result(5.56);
        
        Assert.assertEquals(5, result.getAsInt());
    }

    @Test
    public void toStringWithDouble() {

        Result result = new Result(5.56);

        Assert.assertEquals("5.56", result.toString());
    }

    @Test
    public void toStringWithInteger() {

        Result result = new Result(5);

        Assert.assertEquals("5", result.toString());
    }
}