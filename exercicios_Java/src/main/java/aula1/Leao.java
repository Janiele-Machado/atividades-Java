package aula1;

/**
 *
 * @author Janiele
 */
public class Leao extends Animal {

    private boolean juba;
    
    public Leao (){}
    
    public Leao(boolean juba, float tamanho, String cor) {
        super(tamanho, cor);
        this.juba = juba;
    }
     public void cacar(String cacou) {
        System.out.println("O leao cacou um "+cacou);
    }

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    @Override
    public void comer(String comida) {
        System.out.println("O leao comeu:" + comida);
    }
 public void imprimirleao(Leao o){
        System.out.println("O tamanho do leao e: "+ this.getTamanho());
        System.out.println("A cor do leao e: "+ this.getCor());
        System.out.println("O leao tem juba: "+this.juba);
    }

}
