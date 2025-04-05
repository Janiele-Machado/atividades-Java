
package aula1;

/**
 *
 * @author Janiele
 */
//uutilizando herança
public class Alunos extends Pessoas {
    
    private double nota; 
    
     public Alunos(){};
     
     public Alunos (String nome, double n){
         super(nome);
         this.nota = n;
     }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
     
}
