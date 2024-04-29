import java.util.List;
public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int numeroAtual) {
        int proximoPrimo = numeroAtual + 1;
        while (!verificarPrimalidade(proximoPrimo)) {
            proximoPrimo++;
        }
        return proximoPrimo;
    }
}
