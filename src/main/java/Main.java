
import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	Multiplier viisi = new Multiplier(5);
        System.out.println("How many?");
        int luku = scanner.nextInt();

        System.out.println("Number is: " + viisi.multipliedBy(luku));
    }
}