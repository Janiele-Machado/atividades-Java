
package aula1;

/**
 *
 * @author Janiele
 */
public class Carro implements Veiculo{
    @Override
    public void parar(){
        System.out.println("Parando...");
    }
    @Override
    public void iniciar(){
        System.out.println("Iniciando...");
    }
}
