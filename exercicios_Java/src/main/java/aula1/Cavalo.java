
package aula1;

/**
 *
 * @author Janiele
 */
public class Cavalo extends Animal {
    private String raca;

    public Cavalo(String raca, float tamanho, String cor) {
        super(tamanho, cor);
        this.raca = raca;
    }
    
    public Cavalo (){}

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void fugir(String fugiu){
        System.out.println("O cavalo fugiu para as "+fugiu);
    }

    @Override
    public void comer(String comida) {
        System.out.println("O cavalo comeu:"+comida); 
    }
    public void imprimirCavalo(Cavalo o){
        System.out.println("O tamanho do cavalo e: "+ this.getTamanho());
        System.out.println("A cor do cavalo e: "+ this.getCor());
        System.out.println("A raca do cavalo e: "+this.raca);
    }
}
