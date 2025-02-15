package aula1;

public class Usuario {

    private int id;
    private String nome;
    private String endereco;
    private String email;
    private byte receita;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getReceita() {
        return receita;
    }

    public void setReceita(byte receita) {
        this.receita = receita;
    }

    public void consultaMedicamento() {
        System.out.println("Esse metodo faz a consulta de medicamentos");
    }

    public void comprarMedicamento() {
        System.out.println("Esse metodo faz a compra de medicamentos");
    }

    public void efetuarPagamento() {
        System.out.println("Esse metodo efetua pagamento");
    }

    public double impostoMedicamento(double valor) {
        if (valor <= 100) {
            double valorImposto = valor * 0.10;
            return valorImposto;
        } else {
            double valorImposto = valor * 0.15;
            return valorImposto;
        }
    }

    public static void main(String[] args) {
        Usuario usu = new Usuario();

        double valorQualquer = 200;
        double valorimposto = usu.impostoMedicamento(valorQualquer);
        System.out.println("O valor de imposto do remedio e: " + valorimposto);
    }
}
