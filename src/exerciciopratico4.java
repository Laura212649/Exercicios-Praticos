public class exerciciopratico4 {
    public static void main(String[] args) {
        char letra = 'a';
        char letraMaiuscula = Character.toUpperCase(letra);
        boolean ehVogal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
        // Outras opções
        // boolean ehVogal = "AEIOU".contains(String.valueOf(letraMaiuscula));
        // boolean ehVogal = String.valueOf(letraMaiuscula).matches("^[AEIOU]$");
        System.out.println("Letra minúscula " + letra);
        System.out.println("Letra maiúcula " + letraMaiuscula);
        System.out.println("É vogal? " + ehVogal);
    }
}
