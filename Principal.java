import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Escribe la cantidad que avanzara el hilo (hilo 1): ");
        int pasoNum1 = t.nextInt();
        System.out.print("Escribe la cantidad que avanzara el hilo (hilo 2): ");
        int pasoNum2 = t.nextInt();
        System.out.println("Ahora elige un hilo para que se ponga a correr: ");
        System.out.println("1. Hilo 1\n2. Hilo 2\n3. Ambos hilos");
        int hiloElegir = t.nextInt();
        HiloExamen hilo1 = new HiloExamen(pasoNum1);
        HiloExamen2 hilo2 = new HiloExamen2(pasoNum2);
        switch (hiloElegir) {
            case 1:
                hilo1.start();
                break;
            case 2:
                hilo2.start();
                break;
            case 3:
                hilo1.start();
                hilo2.start();
            default:
                break;
        }
    }
}