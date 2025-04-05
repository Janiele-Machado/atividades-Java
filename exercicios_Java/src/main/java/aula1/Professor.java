
package aula1;

/**
 *
 * @author Janiele
 */
public class Professor extends EstudanteAbstract {
     // metodo herdado da classe abstrata estudante
    @Override
    public void provas (){
        
        System.out.println("Eu corrijo provas");
    }
}
