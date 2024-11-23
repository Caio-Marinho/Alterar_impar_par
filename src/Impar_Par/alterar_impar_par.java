package Impar_Par;
import java.util.Scanner;

public class alterar_impar_par {
	public static void main(String[] args) {
		int x;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o valor de X: ");
		x = entrada.nextInt();
		entrada.close();
		if (x % 2 == 0) {
			x /= 2;
		} else {
			x = 3 * x + 1;
		}
		System.out.printf("O valor de X agora é : %d",x);
	}
}
