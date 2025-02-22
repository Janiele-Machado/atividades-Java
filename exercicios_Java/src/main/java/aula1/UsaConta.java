package aula1;

/**
 *
 * @author Janiele
 */
import java.util.Scanner;

public class UsaConta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        //conta1.setNome("Joao Paula");
        //conta2.setNome("Maria jose");
        int opc = 1;
        while (opc != 0) {

            System.out.println("Digite o seu nome: ");
            String nome = scan.next();//setando o nome;
            System.out.println("Digite o valor que voce deseja depositar: ");
            double n1 = scan.nextDouble();
            System.out.println("Digite a porcentagem que voce quer sobre esse valor:");
            double n2 = scan.nextDouble();

            //depositando valores nas contas
            conta1.depositar(n1, n2);
            conta1.setNome(nome);//setando o nome;

            System.out.println("Conta 1 nome: " + conta1.getNome());
            System.out.printf("Conta 1 saldo: %.2f \n", conta1.getSaldo());//para retirar as casas decimais
            // System.out.println("Conta 2: " + conta2.getNome());
            // System.out.printf("Conta 2: saldo %.3f \n" , conta2.getSaldo());
            System.out.println("Menu de opcoes: ");
            System.out.println("1- Para Calcular o saldo novamente");
            System.out.println("0 - Para sair");
            opc = scan.nextInt();
        }
    }

}
