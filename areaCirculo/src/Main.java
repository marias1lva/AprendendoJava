import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi;
        pi = 3.14159;

        System.out.print("Raio: ");
        raio = sc.nextDouble();
        area = pi * (raio * raio);
        // area = pi * (Math.sqrt(raio);
        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}