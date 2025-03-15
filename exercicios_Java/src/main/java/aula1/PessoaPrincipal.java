package aula1;

import java.util.Scanner;

/**
 *
 * @author Janiele
 */
public class PessoaPrincipal {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        Cliente oCliente = new Cliente();
        Fornecedor oFornecedor = new Fornecedor();
        //oCliente.imprimirCliente();
        System.out.println("Ola, digite os dados abaixo:");
        
        System.out.println("Digite o nome do cliente:");
        oCliente.setNome(scan.nextLine());
        System.out.println("Digite o cpf do cliente:");
        oCliente.setCpf(scan.nextLine());
        System.out.println("Digite o endereco do cliente: ");
        oCliente.setEndereco(scan.nextLine());
        System.out.println("Digite o email do cliente: ");
        oCliente.setEmail(scan.nextLine());
        System.out.println("Digite a idade do cliente:");
        oCliente.setIdade(scan.nextLine());
        System.out.println("Digite a data de nascimento do cliente");
        oCliente.setDataNasc(scan.nextLine());
        System.out.println("Agora digite os dados do fornecedor");
        
        System.out.println("Digite o nome do fornecedor:");
        oFornecedor.setNome(scan.nextLine());
        System.out.println("Digite o cnpj do fornecedor:");
        oFornecedor.setCnpj(scan.nextLine());
        System.out.println("Digite o endereco do fornecedor: ");
        oFornecedor.setEndereco(scan.nextLine());
        System.out.println("Digite o email do fornecedor: ");
        oFornecedor.setEmail(scan.nextLine());
        System.out.println("Digite a idade do fornecedor:");
        oFornecedor.setIdade(scan.nextLine());
        System.out.println("Digite a data de nascimento do fornecedor");
        oFornecedor.setDataNasc(scan.nextLine());
        System.out.println("Agora digite o salario do cliente: ");
        oCliente.setSalario(scan.nextDouble());
        System.out.println("Agora digite o imposto de renda sobre o salario do cliente: ");
        oCliente.setImpostoRenda(scan.nextDouble());
        oCliente.salarioFinal(oCliente);
        System.out.println("Agora digite o valor do produto: ");
        oFornecedor.setValorProduto(scan.nextDouble());
        System.out.println("Agora digite o imposto sobre o produto: ");
        oFornecedor.setImposto(scan.nextDouble());
        System.out.println("O valor do salario final e: "+oCliente.salarioFinal(oCliente));
        System.out.println("O valor do produto final e: "+oFornecedor.valorProdutoFinal(oFornecedor));
        oCliente.imprimirCliente();
        oFornecedor.imprimirFornecedor();
    }
}
