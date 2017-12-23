package ch.schulealtendorf.pra.pojo;

import java.util.Objects;

/**
 * Can store both, floating point and non floating point numbers.
 * 
 * The string representation is either a floating point number or a not floating point number,
 * depending on the constructor called.
 * 
 * If the constructor with the double value is used. toString() returns the string representation of the double value.
 * If the constructor with the int value is used. toString() returns the string representation of the int value.
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
    
    public double getAsDouble() {
        return this.doubleValue;
    }
    
    public int getAsInt() {
        return this.intValue;
    }

    @Override
    public String toString() {
        if (doubleValue == Double.MIN_VALUE) {
            return String.valueOf(this.intValue);
        }
        return String.valueOf(doubleValue);
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
}
