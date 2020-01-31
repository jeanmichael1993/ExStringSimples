
import java.util.Scanner;

public class Ex1049 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] a = new String[3];

		a[0] = sc.nextLine();
		a[1] = sc.nextLine();
		a[2] = sc.nextLine();

		if (a[0].equals("vertebrado")) {
			if (a[1].equals("ave")) {
				if (a[2].equals("carnivoro")) {
					System.out.println("aguia");

				} else {
					System.out.println("pomba");
				}

			} else {
				if (a[2].equals("onivoro")) {
					System.out.println("homem");
				}

				else {
					System.out.println("vaca");

				}
			}

		}

		else {

			if (a[1].equals("inseto")) {
				if (a[2].equals("hematofago")) {

					System.out.println("pulga");
				}

				else {

					System.out.println("lagarta");
				}

			} else {

				if (a[2].equals("hematofago")) {

					System.out.println("sanguessuga");

				}

				else {
					System.out.println("minhoca");
				}
			}

		}

		sc.close();
	}

}
