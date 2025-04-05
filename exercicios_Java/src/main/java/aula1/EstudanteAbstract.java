/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

/**
 *
 * @author Janiele
 */
//exemplo de classe abstrata
public abstract class EstudanteAbstract  implements PessoaInterface{
    // metodo herdado da interface
    //exemplo de polimorfismo
    @Override
    public void provas (){
        
        System.out.println("Eu faco provas");
    }
}
