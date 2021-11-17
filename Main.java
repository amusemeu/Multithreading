import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static boolean enable = true;
    public static List<CurrentBreaker> breakers = new ArrayList<>();

    public static void main(String[] args) {
    CurrentBreaker q1 = new CurrentBreaker("Q1", 630);
    CurrentBreaker q2 = new CurrentBreaker("Q2", 700);
    CurrentBreaker q3 = new CurrentBreaker("Q3", 640);
    CurrentBreaker q4 = new CurrentBreaker("Q4", 745);
    CurrentBreaker q5 = new CurrentBreaker("Q5", 698);
    breakers.add(q1);
    breakers.add(q2);
    breakers.add(q3);
    breakers.add(q4);
    breakers.add(q5);

    StatusStraind statusStraind1 = new StatusStraind();
    StatusStraind statusStraind2 = new StatusStraind();
    StatusStraind statusStraind3 = new StatusStraind();
    StatusStraind statusStraind4 = new StatusStraind();
    StatusStraind statusStraind5 = new StatusStraind();

    statusStraind1.start();
    statusStraind2.start();
    statusStraind3.start();
    statusStraind4.start();
    statusStraind5.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enable = false;
    }
}
