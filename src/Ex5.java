import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, resultado;

        System.out.println("Digite sua primeira nota:");
        n1 = in.nextDouble();
        System.out.println("Digite sua segunda nota:");
        n2 = in.nextDouble();

        if ( n1 > 10) {
            System.out.println("Nota incorreta, o limite é 10");
        }
        else if (n2 > 10) {
            System.out.println("Nota incorreta, o limite é 10");
        } 
        else {
        resultado = (n1 + n2) / 2;

        System.out.println("Sua nota foi: " + resultado);
        }
    }
}