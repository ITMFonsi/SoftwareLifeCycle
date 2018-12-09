import java.util.LinkedList;
import java.util.List;

public class QuadraticEquation {

    public double a;
    public double b;
    public double c;
    public List<Double> results;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        results = new LinkedList<Double>();
    }

    public List<Double> calc() throws ImaginaryNumbersException, AIsZeroException {
        if (a == 0) {
            throw new AIsZeroException();
        }

        double s1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double s2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        if (Double.isNaN(s1) || Double.isNaN(s2)) {
            throw new ImaginaryNumbersException();
        } else {
            results.add(s1);
            results.add(s2);
        }

        return results;
    }
}
