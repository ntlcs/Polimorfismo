import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double[] precosAnoFusca = {25000.00, 27000.00, 29000.00};
        ModeloCarro fusca = new ModeloCarro("Fusca", precosAnoFusca);
        fusca.mostrarInformacoes();

        Animal animal = new Animal();
        animal.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        ContaCorrente conta = new ContaCorrente(1000.00, 10.00);

        conta.depositar(500.00);
        System.out.println("Saldo atual: R$" + df.format(conta.getSaldo()));

        conta.sacar(200.00);
        System.out.println("Saldo atual: R$" + df.format(conta.getSaldo()));

        conta.cobrarTarifaMensal();
        System.out.println("Saldo atual: R$" + df.format(conta.getSaldo()));

        VerificadorPrimo verificador = new VerificadorPrimo();
        if (verificador.verificarPrimalidade(17)) {
            System.out.println("17 é primo.");
        } else {
            System.out.println("17 não é primo.");
        }

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        double valor = 123.456;
        System.out.println("Valor formatado: " + df.format(valor));
    }
}
