package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] mat = new int[n][n];
		
		for (int linha = 0; linha < mat.length; linha++) { // linha
			for (int coluna = 0; coluna < mat[linha].length; coluna++) {// coluna
				mat[linha][coluna] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println();
		
		int count = 0;
		for(int i =0; i<mat.length;i++) {
			for(int j =0; j <mat[i].length; j++) {
				if(mat[i][j] <0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = "+count);
		sc.close();
	}

}
