
public class Aula0605 {
	
	public static void main(String[] args) {
		

String original = "abcde FGHIJ ABC abc DEFG ";
String s01 = original.toLowerCase(); /*coloca tudo em minusculo*/
String s02 = original.toUpperCase(); /*colocar tudo em maiusculo*/
String s03 = original.trim();
String s04 = original.substring(2);
String s05 = original.substring(2, 9);
String s06 = original.replace('a', 'x'); /* trocar a por x*/
String s07 = original.replace("abc", "xy"); /* trocou abc (minusculo) por xy(minusculo)*/
int i = original.indexOf("bc"); /* mostra a primeira posi��o onde tem bc */
int j = original.lastIndexOf("bc"); /* retorna a posi��o da ultima ocorrencia do bc*/
/*S.charAt(posi��o) pega o char da posi��o*/
System.out.println("Original: -" + original + "-");
System.out.println("toLowerCase: -" + s01 + "-");
System.out.println("toUpperCase: -" + s02 + "-");
System.out.println("trim: -" + s03 + "-");
System.out.println("substring(2): -" + s04 + "-");
System.out.println("substring(2, 9): -" + s05 + "-");
System.out.println("replace('a', 'x'): -" + s06 + "-");
System.out.println("replace('abc', 'xy'): -" + s07 + "-");
System.out.println("Index of 'bc': " + i);
System.out.println("Last index of 'bc': " + j);


}

}
