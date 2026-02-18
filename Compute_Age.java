import java.time.LocalDate;

public class Compute_Age {
    public static void main(String[] args) throws Exception {
        int BirthYear = 2004;
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - BirthYear;
        System.out.println("Compute Age");
        System.out.println();
        System.out.println("Year of Birth: " + BirthYear);
        System.out.println();
        System.out.println("Age: " + age);
    }
}