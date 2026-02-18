public class Loading_Bar {
    public static void main(String[] args) throws Exception{
        for(int num = 1; num <= 20; num++){
            Thread.sleep(100);
                System.out.print( "#");
            }
            System.out.println("\nProgress Completed");
        }
    }        