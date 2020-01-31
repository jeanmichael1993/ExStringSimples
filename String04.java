import java.util.Scanner;
import java.util.Locale;

public class String04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String data = sc.next();

		String[] partes = data.split("/");
		int dia = Integer.parseInt(partes[0]);
		int mes = Integer.parseInt(partes[1]);
		int ano = Integer.parseInt(partes[2]);
		
		System.out.println("Dia:"+dia);
		System.out.println("Mês:"+mes);
		System.out.println("Ano:"+ano);

		
sc.close();
	}

}
