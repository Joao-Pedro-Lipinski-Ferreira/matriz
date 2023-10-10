package matriz;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int [4][4];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite valor: ");
				matriz[linha][coluna] = sc.nextInt();
			}
			
		}
		
	}

}
