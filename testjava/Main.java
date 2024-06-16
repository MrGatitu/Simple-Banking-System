package testjava;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        
        bank usr_1 = new bank("John Doe", 5000.0);

        System.out.println(usr_1.get_usrName());

        Scanner scanner = new Scanner(System.in);

        int charr = scanner.nextInt();

        System.out.println(charr);
        // scanner.close();

        
    }
}
