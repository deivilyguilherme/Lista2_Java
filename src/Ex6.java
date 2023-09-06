import java.util.Scanner;
public class Ex6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char novoCalculo;

	        do {
	            double nota1, nota2;
	            double media;

	            do {
	                System.out.print("Digite a 1ª nota (entre 0 e 10): ");
	                nota1 = scanner.nextDouble();
	            } while (nota1 < 0 || nota1 > 10);

	            do {
	                System.out.print("Digite a 2ª nota (entre 0 e 10): ");
	                nota2 = scanner.nextDouble();
	            } while (nota2 < 0 || nota2 > 10);

	            media = (nota1 + nota2) / 2;
	            System.out.println("A média é: " + media);

	            do {
	                System.out.print("NOVO CÁLCULO (S/N)? ");
	                novoCalculo = scanner.next().charAt(0);
	                novoCalculo = Character.toUpperCase(novoCalculo);
	            } while (novoCalculo != 'S' && novoCalculo != 'N');
	        } while (novoCalculo == 'S');

	        System.out.println("Programa encerrado.");
	        scanner.close();
	    }
	}