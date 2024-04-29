import java.util.Arrays;
public class Carro {
    private String nomeModelo;
    private double[] precosAno;

    public Carro(String nomeModelo, double[] precosAno) {
        this.nomeModelo = nomeModelo;
        this.precosAno = precosAno;
    }

    public double getMenorPreco() {
        return Arrays.stream(precosAno).min().orElse(0);
    }

    public double getMaiorPreco() {
        return Arrays.stream(precosAno).max().orElse(0);
    }
    public double getPrecoAno(int ano) {
        if (ano >= 1 && ano <= precosAno.length) {
            return precosAno[ano - 1];
        } else {
            System.out.println("Ano inválido.");
            return 0.0; // ou outra ação apropriada
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo do carro: " + nomeModelo);
        System.out.println("Preços ao longo dos anos:");
        for (int i = 0; i < precosAno.length; i++) {
            System.out.println("Ano " + (i + 1) + ": R$" + precosAno[i]);
        }
        System.out.println("Menor preço: R$" + getMenorPreco());
        System.out.println("Maior preço: R$" + getMaiorPreco());
    }
}
