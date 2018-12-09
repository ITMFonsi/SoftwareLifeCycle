import java.util.List;
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
        long start_time = System.nanoTime();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        try {
            List<Double> results = q.calc();
            // print results
            for(int i = 0; i < results.size(); i++) {
                System.out.format("%.10f %n", results.get(i));
            }
           //Thread.sleep(1000);
        } catch (ImaginaryNumbersException e) {
            e.printStackTrace();
        } catch (AIsZeroException e) {
            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
        } finally {
            long end_time = System.nanoTime();
            double difference = (end_time - start_time) / 1e6;
            System.out.println("Duration: (msec) ");
            if(difference < 500) {
                System.out.println(difference);
            } else {
                System.err.println(difference);
            }
        }

    }

}
