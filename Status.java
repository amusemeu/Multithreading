
import java.util.Random;

public class Status {
    static Random rnd = new Random();
    private static volatile int i;

    public static synchronized int currentSize() {

        for (int j = rnd.nextInt(750); j < rnd.nextInt(1500); j+=10) {

            i = j;
        }
        return i;
    }

    public static void working() {
        for (CurrentBreaker cr : Main.breakers) {
            if (cr.getCurrentRange() > Status.currentSize()) {
                System.out.println("Выключатель " + cr.getName() + " в работе, уровень тока в цепи : " + Status.currentSize());
            }  else if (cr.getCurrentRange() < Status.currentSize()){
                System.out.println("Сработала защита по току! Выключатель " + cr.getName() + " аварийно отключился, при уровне тока в цепи : " + Status.currentSize());

            }
        }
    }
}
