package ExerciciosLista1;

public class exerciciopratico3 {
    public static void main(String[] args) {
        int valorInt = 45;
        double valorDouble = 4.32;
        valorDouble = valorInt;
        double outroDouble = 7.89;
        int novoInt = (int) outroDouble;
        System.out.println("valorInt " + valorInt);
        System.out.println("valorDouble (após receber int) " + valorDouble);
        System.out.println("outroDouble " + outroDouble);
        System.out.println("novoInt (casting explícito de outroDouble) " + novoInt);
    }
}
