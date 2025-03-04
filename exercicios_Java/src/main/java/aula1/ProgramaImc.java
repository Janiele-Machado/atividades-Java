package aula1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Janiele
 */
public class ProgramaImc {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         PessoaImc pessoa = new PessoaImc();
         CalculosImc calculos = new CalculosImc();

    int opc = 1;
    
    while ( opc != 0) {
        System.out.println("Digite o seu nome:");
        pessoa.setNome(scan.nextLine());
        System.out.println("Digite seu cpf:");
        pessoa.setCpf(scan.nextLine());
        System.out.println("Digite sua altura:");
        pessoa.setAltura(scan.nextDouble());
        System.out.println("Digite seu peso:");
        pessoa.setPeso(scan.nextDouble());
        scan.nextLine();
        
        calculos.faixaImc(calculos.calculoImc(pessoa));
        
        System.out.println("Gostaria de calcular o seu indice novamente: Digite 1 para sim e 0 para nao");
        opc = scan.nextInt();
        scan.nextLine();
        
        }
        System.out.println("Obrigada por Utilizar esse sistema");
    
    }
    
}

