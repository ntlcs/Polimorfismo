public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente(double saldoInicial, double tarifaMensal) {
        super(saldoInicial);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada com sucesso.");
    }

    public double getSaldo() {
        return saldo;

    }
}
