public class Countdown {
    public static void main(String[] args) throws Exception{
        for(int num = 10; num >= 1; num--){
            System.out.println(num);
            Thread.sleep(500
            );
        }
        System.out.println("Liftoff!");
    }
}