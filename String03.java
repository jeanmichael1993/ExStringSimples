import java.util.Scanner;
import java.util.Locale;

public class String03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String email= sc.next();
		
		String[] pedacos = email.split("@");
		
		System.out.println("Usuario: " + pedacos[0]);
		System.out.println("dominio: " + pedacos[1]);

		sc.close();

	}

}
