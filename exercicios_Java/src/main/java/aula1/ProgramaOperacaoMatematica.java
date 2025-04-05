
package aula1;

/**
 *
 * @author Janiele
 */
public class ProgramaOperacaoMatematica {
    
    //Exemplo de utilização de polimorfismo
    //utilizando o método static para poder utiliza-lo na mesma classe
    
    public static void calculaOperacao (OperacaoMatematica op, double x, double y){
        
        System.out.println(op.calcular(x, y));
    }
    
    public static void main(String[] args) {
        
        calculaOperacao(new Soma(), 10, 10);
        calculaOperacao(new Subtrai(), 10, 10);
        calculaOperacao(new Multiplica(), 10, 10);
        calculaOperacao(new Divido(), 10, 10);
        
    }
}
