import java.util.function.Function;

/**
 * API for calculating an integral of a function.
 */
public interface Integral {
    /**
     * Calculates the definite integral of a function between the limits a and b.
     * 
     * @param f the integrand.
     * @param a the lower bound of the limit.
     * @param b the upper bound of the limit.
     * @param dx a small step size for iterating over the specified interval.
     * @return the numerical approximation of the definite integral.
     * @throws IllegalArgumentException if b <= a or f is null or dx <= 0. 
     */
    double calculate(Function<Double,Double> f, double a, double b, double dx);
}