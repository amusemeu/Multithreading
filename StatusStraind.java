
public class StatusStraind extends  Thread{

    @Override
    public void run(){
        while (Main.enable) {
            Status.working();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
