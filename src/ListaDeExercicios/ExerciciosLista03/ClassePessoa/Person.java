package ListaDeExercicios.ExerciciosLista03.ClassePessoa;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate birthDate;
    private int weight;
    private int height;

    public Person(String id, String name, String email, String cpf, LocalDate birthDate, int weight, int height) throws Exception{
        if (!validateName(name)) {
            throw new Exception("Nome inválido.");
        }
        if (!validateEmail(email)) {
            throw new Exception("Email inválido.");
        }
        if (!validateCPF(cpf)) {
            throw new Exception("CPF inválido.");
        }
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCpf() { return cpf; }
    public LocalDate getBirthDate() { return birthDate; }
    public int getWeight() { return weight; }
    public int getHeight() { return height; }

    public static boolean validateName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean validateEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public static boolean validateCPF(String cpf) {
        return cpf != null && cpf.length() == 11;
    }

    public int calculateAge(LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public double calculateIMC() {
        double pesoKg = weight / 1000.0;
        double alturaM = height / 100.0;
        if (alturaM == 0) return 0;
        return pesoKg / (alturaM * alturaM);
    }
}