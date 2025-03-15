package aula1;

/**
 *
 * @author Janiele
 */
public class Cliente extends Pessoa {

    private String cpf;
    private double salario;
    private double impostoRenda;

    public Cliente(){}
    
    public Cliente(String cpf, String nome, String idade, String endereco,String email,String dataNasc) {
        super(nome, idade, endereco,email,dataNasc);
        this.cpf = cpf;
    }

    public void imprimirCliente() {
        System.out.println("CPF do cliente: " + this.getCpf());
        System.out.println("Nome do cliente: " + this.getNome());
        System.out.println("Idade do cliente: " + this.getIdade());
        System.out.println("Endereco do cliente: " + this.getEndereco());
        System.out.println("Email do cliente: "+ this.getEmail());
        System.out.println("Data de nascimendo do cliente: "+this.getDataNasc());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImpostoRenda() {
        return impostoRenda;
    }

    public void setImpostoRenda(double impostoRenda) {
        this.impostoRenda = impostoRenda;
    }

    public double salarioFinal(Cliente p){
        double salarioFinal;
        return salarioFinal = p.salario - p.salario *(p.impostoRenda/100);
    }
}
