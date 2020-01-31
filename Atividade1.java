package atividades;

import java.util.Scanner;
import java.util.Locale;

public class Atividade1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		String[] frase = sc.nextLine().split(" ");
		String palavra = sc.next();

		for (int i = 0; i < frase.length; i++) {

			if (cont == 0) {
				if (frase[i].contains(palavra)) {

					System.out.println(frase[i].toUpperCase());
					cont++;
				}
			}
		}
		if(cont == 0) {
			
			System.out.printf("Não existe palavra que inicia com a palavra %s",palavra);
		}

		sc.close();

	}

}
