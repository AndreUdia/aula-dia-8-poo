import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String palavraUm = in.nextLine();
		String palavraDois = in.nextLine();
		
		if(palavraUm.equals(palavraDois)) {
			System.out.println("igual");
		}
		else {
			System.out.println("diferente");
		}

	}

}
