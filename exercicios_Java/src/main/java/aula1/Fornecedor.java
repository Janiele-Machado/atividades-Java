package aula1;

/**
 *
 * @author Janiele
 */
public class Fornecedor extends Pessoa {

    private String cnpj;
    private double valorProduto;
    private double imposto;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String nome, String idade, String endereco, String email, String dataNasc) {
        super(nome, idade, endereco, email, dataNasc);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimirFornecedor() {
        System.out.println("CNPJ do Fornecedor: " + this.getCnpj());
        System.out.println("Nome do Fornecedor: " + this.getNome());
        System.out.println("Idade do Fornecedor: " + this.getIdade());
        System.out.println("Endereco do Fornecedor: " + this.getEndereco());
        System.out.println("Email do fornecedor: " + this.getEmail());
        System.out.println("Data de nascimendo do fornecedor: " + this.getDataNasc());
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double valorProdutoFinal(Fornecedor f) {
        double valorfinal;
        return valorfinal = f.valorProduto + f.valorProduto * (f.imposto / 100);
    }
}
