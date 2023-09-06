import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num, num2;
		
		System.out.println("digite o primeiro valor:");
		num = in.nextInt();
		
		do {
			System.out.println("Digite outro valor:");
			num2 = in.nextInt();
		} while (num2 == 0);
			int res = num / num2;
			System.out.println(res);
	}

}