package ListaDeExercicios.ExerciciosLista04.GestaoDeContasBancarias;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(double taxaDeRendimento, double saldo) {
        super(saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }
    public void retornarRendimento() {
        saldo += saldo * taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }
}
