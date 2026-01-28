package ListaDeExercicios.ExerciciosLista04.GestaoDeContasBancarias;

public class ContaCorrente extends ContaBancaria {
 private static final double taxaAdministrativa = 0.50;

 public ContaCorrente(double saldo) {
     super(saldo);
 }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + taxaAdministrativa;
        if (valor > 0 && saldo >= valorTotal) {
            saldo -= valorTotal;
        }
    }
}
