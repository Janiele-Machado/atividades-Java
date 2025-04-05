
package aula1;

/**
 *
 * @author Janiele
 */
public class Smartphone implements GPS,RADIO{
      @Override
      public void obterCoordenadas(){
          System.out.println("Sua coordenada");
      }
      @Override
      public void ligarRadio(){
          System.out.println("Ligando radio");
      }
      @Override
  public void pararRadio(){
      System.out.println("Parando radio");
  }
}
