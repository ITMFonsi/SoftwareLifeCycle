import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;

public class simpleTests {

    // tested with
    // http://www.math.com/students/calculators/source/quadratic.htm

    @Test
    public void testCalculation() throws ImaginaryNumbersException, AIsZeroException {
        List<Double> results = new LinkedList<Double>();

        // first test a = 1, b = 5, c = 1
        results.add(-0.20871215252208009);
        results.add(-4.7912878474779195);

        QuadraticEquation q = new QuadraticEquation(1, 5, 1);
        assertEquals(results, q.calc());
        results.clear();

        // second test a = 1, b = 2, c = 3
        results.add(-0.45861873485089033);
        results.add(-6.541381265149109);

        QuadraticEquation q1 = new QuadraticEquation(1, 7, 3);
        assertEquals(results, q1.calc());
        results.clear();

    }

    @Test
    public void testException() {
        // third test
        QuadraticEquation q2 = new QuadraticEquation(1, 2, 3);
        assertThrows(ImaginaryNumbersException.class, () -> {
            q2.calc();
        });

        // fourth test
        QuadraticEquation q3 = new QuadraticEquation(0, 2, 3);
        assertThrows(AIsZeroException.class, () -> {
            q3.calc();
        });
    }

}