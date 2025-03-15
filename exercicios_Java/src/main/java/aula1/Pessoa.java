package aula1;

/**
 *
 * @author Janiele
 */
public class Pessoa {

    private String nome, idade, endereco,email,dataNasc;
    
    public Pessoa(){}

    public Pessoa(String nome, String idade, String endereco,String email,String dataNasc) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
