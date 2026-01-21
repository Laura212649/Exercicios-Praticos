package ExerciciosLista1;

public class exerciciopratico4 {
    public static void main(String[] args) {
        char letra = 'a';
        char letraMaiuscula = Character.toUpperCase(letra);
        boolean ehVogal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
        System.out.println("Letra minúscula " + letra);
        System.out.println("Letra maiúcula " + letraMaiuscula);
        System.out.println("É vogal? " + ehVogal);
    }
}
