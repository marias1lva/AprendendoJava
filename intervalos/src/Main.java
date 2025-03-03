// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
// intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
// destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        System.out.println("Digite um valor: ");
        x = sc.nextDouble();
        if(x >= 0 && x <= 25.00){
            System.out.println("Intervalo [0,25]");
        }else if(x > 25.00 && x <= 50.00){
            System.out.println("Intervalo (25,50]");
        }else if(x > 50.00 && x <= 75.00){
            System.out.println("Intervalo (50,75]");
        }else if(x > 75.00 && x <= 100.00){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}