package aula1;

import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        App date = new App();

        System.out.println("A data de hoje em milisegundos é:" + date.dataSegundos());

        System.out.println("Digite dois numeros para vermos qual é o maior:");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        double maiorNum = date.imprimirMaiorNum(n1, n2);

        System.out.println("O maior numero e : " + maiorNum);

    }

    public double dataSegundos() {
        Date objDate = new Date();
        return objDate.getTime();
    }

    public double imprimirMaiorNum(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
