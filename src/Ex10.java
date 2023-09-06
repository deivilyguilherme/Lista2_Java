import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 System.out.print("Digite um valor N maior que zero: ");
	        int N = in.nextInt();

	        if (N > 0) {
	            for (int i = 1; i <= N; i++) {
	                System.out.println(i);
	            }
	        } else {
	            System.out.println("O valor de N deve ser maior que zero.");
	        }

	    }

}
