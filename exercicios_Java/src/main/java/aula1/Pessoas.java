
package aula1;

/**
 *
 * @author Janiele
 */
//classe abstrata 
public abstract class Pessoas {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Pessoas(String nome){
        this.nome = nome;
    }
    public Pessoas (){};
    
}
