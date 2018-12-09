import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        double a = Double.parseDouble(s.nextLine());

        System.out.println("Enter a value for b: ");
        double b = Double.parseDouble(s.nextLine());

        System.out.println("Enter a value for c: ");
        double c = Double.parseDouble(s.nextLine());
        s.close();

        QuadraticEquation q = new QuadraticEquation(a, b, c);
        try {
            q.calc();
        } catch (ImaginaryNumbersException e) {
            e.printStackTrace();
        }
    }

}
