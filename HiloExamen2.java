public class HiloExamen2 extends Thread{
    private int num2;
    public HiloExamen2 (int num2){
        this.num2 = num2;
    }
    public void run(){
        for (int j = 0; j <= num2; j++) {
            System.out.println("Hilo 2: " + j);
            try {
                HiloExamen2.sleep(180);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}