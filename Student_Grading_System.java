public class Student_Grading_System {
    public static void main(String args[]) throws Exception{

        int Programming = 99;
        int English = 85;
        int Filipino = 89;
        int Science = 85;
        int Math = 88;
        int Pe = 95;
        int Total = Programming + English + Filipino + Science + Math + Pe;
        int Average = Total / 6;

        System.out.println("Programming: " + Programming);
        System.out.println("English: " + English);
        System.out.println("Filipino: " + Filipino);
        System.out.println("Science: " + Science);
        System.out.println("Math: " + Math);
        System.out.println("PE: " + Pe);
        System.out.println("Total: " + Total);
        System.out.println("Average: " + Average);
    }
}