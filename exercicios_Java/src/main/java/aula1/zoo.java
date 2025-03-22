package aula1;

import java.util.Scanner;

/**
 *
 * @author Janiele
 */
public class zoo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cavalo cavalo1 = new Cavalo();
        Leao leao1 = new Leao();
        System.out.println("Insira a raca do cavalo:");
        cavalo1.setRaca(scan.nextLine());
        System.out.println("Insira 1 se o leao tiver juba se nao digite 2:");
        int opc = scan.nextInt();
        if (opc ==1 ) {
            leao1.setJuba(true);
        }else{
            leao1.setJuba(false);
        }
        scan.nextLine();
        System.out.println("Digite a cor do cavalo:");
        cavalo1.setCor(scan.nextLine());
        System.out.println("Digite a cor do leao:");
        leao1.setCor(scan.nextLine());
        System.out.println("Digite o tamanho do leao:");
        leao1.setTamanho(scan.nextFloat());
        System.out.println("Digite o tamanho do cavalo");
        cavalo1.setTamanho(scan.nextFloat());

        scan.nextLine();
        System.out.println("Insira para onde o cavalo fugiu:");
        String fugiu = scan.nextLine();
         System.out.println("Insira o que o leao cacou:");
        String cacou = scan.nextLine();
        System.out.println("Informe a comida que o cavalo comeu:");
        String comeu = scan.nextLine();
         System.out.println("Informe a comida que o leao comeu:");
        String comer_leao = scan.nextLine() ;
        
        cavalo1.imprimirCavalo(cavalo1);
        leao1.imprimirleao(leao1);
        cavalo1.fugir(fugiu);
        leao1.cacar(cacou);
        cavalo1.comer(comeu);
        leao1.comer(comer_leao) ;
        
        Cavalo cavalo2 = new Cavalo("Manga larga",100,"Verde");
        Leao leao2 = new Leao(false,145,"Amarelo");
        
        cavalo2.imprimirCavalo(cavalo2);
        leao2.imprimirleao(leao2);

    }
}
