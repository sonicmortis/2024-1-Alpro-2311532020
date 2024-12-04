package pekan6;

import java.util.Random;
import java.util.Scanner;

public class Tugas6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int percobaan = 0;
        int dadu;

        while (true) {
            System.out.print("Tebakan Anda Salah\nApakah mau lempar dadu (ya / tidak)? ");
            String jawab = scanner.nextLine();

            if (jawab.equalsIgnoreCase("ya")) {
                dadu = random.nextInt(6) + 1;
                System.out.print("Tebakan Anda: ");
                int tebakan = scanner.nextInt();
                scanner.nextLine();
                percobaan++;

                if (tebakan == dadu) {
                    System.out.println("Tebakan Anda Benar");
                    System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                    break;  
                } else {
                    System.out.println("Tebakan Anda Salah");
                }
            } else {
                System.out.println("Permainan dihentikan.");
                break;
            }
        }

        scanner.close();
    }

	
}
