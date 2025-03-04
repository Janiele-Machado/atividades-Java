package aula1;

public class CalculosImc {
    
    public double calculoImc(PessoaImc p) {
        double imc = p.getPeso() / (p.getAltura() * p.getAltura());
        return imc;
    }

    public void faixaImc(double imc) {
        String imc_formatado = String.format("%.2f",imc);
       // System.out.println(String.format("%2f", imc));
        if (imc >= 18.50 && imc <= 24.99) {
            System.out.println( imc_formatado+"---Peso Normal");
        } else if (imc >= 25.00 && imc <= 29.99) {
            System.out.println(imc_formatado + "---Pre-Obesidade");
        } else if (imc >= 30.00 && imc <= 34.99) {
            System.out.println(imc_formatado + "---Obesidade Grau I ");
        } else if (imc >= 35.00 && imc <= 39.99) {
            System.out.println(imc_formatado + "---Obesidade Grau II ");
        } else if (imc >= 40.00) {
            System.out.println(imc_formatado + "---Obesidade Grau III");
        }else{
            System.out.println("IMC menor que 18.5 ");
        }
    }
}
