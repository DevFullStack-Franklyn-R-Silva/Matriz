package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// System.out.println("Digite a quantidade de linha: ");
		int linha = sc.nextInt();
		// System.out.println("Digite a quantidade de coluna: ");
		int coluna = sc.nextInt();

		int[][] mat = new int[linha][coluna];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();

			}
		}
		System.out.println("Digite o n�mero: ");
		int x = sc.nextInt();

		for (int i = 0; i <  mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posi��o: linha " + i + ", coluna " + j + ".");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
				
			}
		}
		
		sc.close();
	}

}
