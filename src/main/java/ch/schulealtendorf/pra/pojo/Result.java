package ch.schulealtendorf.pra.pojo;

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * Can store both, floating point and non floating point numbers.
 * 
 * The string representation is either a floating point number or a not floating point number,
 * depending on the constructor called.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class Result {
    
    private final double doubleValue;
    private final int intValue;

    public Result(double value) {
        this.doubleValue = value;
        this.intValue = Integer.MIN_VALUE;
    }

    public Result(int value) {
        this.intValue = value;
        this.doubleValue = Double.MIN_VALUE;
    }

    /**
     * If the constructor with the double value is used, this method returns that double value.
     * If the constructor with the int value is used, this method returns that int as double value.
     * 
     * @return the resulting value
     */
    public double getAsDouble() {
        return this.ifDouble() ? doubleValue : intValue;
    }

    /**
     * If the constructor with the double value is used, this method returns that double value by casting it to int.
     * If the constructor with the int value is used, this method returns that int value.
     * 
     * @return the resulting value
     */
    public int getAsInt() {
        return this.ifInteger() ? intValue : (int) doubleValue;
    }

    /**
     * If the constructor with the double value is used, this method returns the string representation of the double value.
     * If the constructor with the int value is used, this method returns the string representation of the int value.
     * 
     * @return either the double value or the int value
     */
    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return this.ifDouble() ? formatter.format(doubleValue) : String.valueOf(intValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(result.doubleValue, doubleValue) == 0 &&
                intValue == result.intValue;
    }

    @Override
    public int hashCode() {

        return Objects.hash(doubleValue, intValue);
    }
    
    private boolean ifDouble() {
        return intValue == Integer.MIN_VALUE;
    }
    
    private boolean ifInteger() {
        return doubleValue == Double.MIN_VALUE;
    }
}
