package ua.nikiforov;

import java.math.BigInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author snikiforov
 */
public class Fibonachi {
    public Stream<BigInteger> streamGenerate() {
        return Stream.generate(new Supplier<BigInteger>() {
            BigInteger first = BigInteger.ZERO;
            BigInteger second = BigInteger.ONE;

            @Override
            public BigInteger get() {
                BigInteger t = first.add(second);
                first = second;
                second = t;
                return first;
            }
        });

    }
}
