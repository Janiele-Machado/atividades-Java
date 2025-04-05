package aula1;

/**
 *
 * @author Janiele
 */
public class ProgramaAnimalAbstract {

    public static void main(String[] args) {
        AnimalAbstract gato = new GatoAbstract();
        System.out.println("A cota diaria de leite de gato e " + gato.obterCotaDiariaDeLeite());
        AnimalAbstract rato = new RatoAbstract();
        System.out.println("A cota diaria de leite de rato e " + rato.obterCotaDiariaDeLeite());
    }

}
