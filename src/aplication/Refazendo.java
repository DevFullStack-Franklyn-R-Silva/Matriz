package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Refazendo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("======================================");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " "); // imprime caracter a caracter
			}
			System.out.println(" ");// muda de linha
		}
		sc.close();
	}

}
