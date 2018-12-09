public class QuadraticEquation {

    public double a;
    public double b;
    public double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calc() throws ImaginaryNumbersException, AIsZeroException, NotPlausibleException {
        double s1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double s2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        if (a == 0) throw new AIsZeroException();

        if (Math.pow(b, 2) < 4*a*c) {
            throw new NotPlausibleException();
        }

        if (Double.isNaN(s1) || Double.isNaN(s2)) {
            throw new ImaginaryNumbersException();
        } else {
            System.out.println("Results:");
            System.out.format("%.10f %n", s1);
            System.out.format("%.10f %n", s2);
        }
    }
}
