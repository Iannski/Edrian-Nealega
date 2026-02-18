public class Multiplication_Table {
    public static void main(String[] args) throws Exception{
    int count = 7;
    int num = 1;
    do{
        System.out.println(count + " x " + num + " = " + (count * num));
        num = num + 1;
        Thread.sleep(500);
     } while (num <= 10);
        System.out.println("Multiplication Table Completed");
    }
}