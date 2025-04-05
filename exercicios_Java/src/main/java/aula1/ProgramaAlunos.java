package aula1;

import java.util.Scanner;

/**
 *
 * @author Janiele
 */
public class ProgramaAlunos {

    //metodo static para calculos na própria classe
    public static double calcularMedia(double soma, int n) {
       double media = soma / n;
        return media;
        
    }
    //método principal para rodar o código
    public static void main(String[] args) {
        int cont = 0;
        double soma = 0;
        double maior = 0;
        double menor = 10000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos que vc quer inserir: ");
        int n = scan.nextInt();
        scan.nextLine();

        Alunos[] alunos = new Alunos[n];

        for (int x = 0; x < n; x++) {
            System.out.println("Digite a nome do aluno:");
            String nome = scan.nextLine();
            System.out.println("Digite a nota do aluno:");
            double nota = scan.nextDouble();
            scan.nextLine();
            soma = soma + nota;
            //utilizando o construtor
            alunos[x] = new Alunos(nome, nota);

            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }
        
        for (int x = 0; x < n; x++){
            System.out.println("O nome do "+(x+1)+" Aluno: "+ alunos[x].getNome());
            System.out.println("A nota do "+(x+1)+" Aluno: "+ alunos[x].getNota());
        }
        System.out.println("A maior nota : "+ maior);
        System.out.println("A menor nota : "+ menor);
        System.out.println("A media das notas e "+ String.format("%.2f",calcularMedia(soma,n))); //método que arredondanda para duas casas decimais
        
    }
}
