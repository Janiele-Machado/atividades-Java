
package aula1;

/**
 *
 * @author Janiele
 */
public abstract class AnimalAbstract {
    
    public abstract double obterCotaDiariaDeLeite();
    
    //tbm é permite fazer métodos nao abstratos
    public void imprimir(){
        System.out.println("aula01.AnimalAbstract.imprimir()");
    }
}
