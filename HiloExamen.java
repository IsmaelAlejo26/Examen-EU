public class HiloExamen extends Thread{
    private int num1;

    public HiloExamen (int num1){
        this.num1 = num1;
    }

    public void run(){
        for (int i = 0; i <= num1; i++) {
            System.out.println("Hilo 1: " + i);
            try {
                HiloExamen.sleep(120);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}