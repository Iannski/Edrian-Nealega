public class General_Weighted_Average{
	public static void main(String[] args){
		int Prog = 95;
		int Eng = 85;
		int Fil = 89;
		int Science = 85;
		int Math = 96;
		int PE = 90;
		int score = Prog + Eng + Fil + Science + Math + PE;
		int FG = score / 6;
		
		System.out.println("Programming: " + Prog);
		System.out.println("English: " + Eng);
		System.out.println("Filipino: " + Fil);
		System.out.println("Science: " + Science);
		System.out.println("Math: " + Math);
		System.out.println("PE: " + PE);
		System.out.println("Final Grade (GWA): " + FG);
	}
}