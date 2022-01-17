import java.util.Locale;

public class StringFunctions {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		System.out.println("Original............: -" + original + "-");
		System.out.println("toLowerCase.........: -" + s01 + "-");
		
		String s02 = original.toUpperCase();
		System.out.println("toUpperCase.........: -" + s02 + "-");
		
		String s03 = original.trim();
		System.out.println("trim................: -" + s03 + "-");
		
		String s04 = original.substring(2); //Pega o character 2 em diante
		System.out.println("substring(2)........: -" + s04 + "-");
		
		String s05 = original.substring(2, 9); //Recorta a string a partir do 2 até o 9
		System.out.println("substring(2, 9).....: -" + s05 + "-");
		
		String s06 = original.replace('a', 'x'); //Troca 'a' por 'x'
		System.out.println("replace('a', 'x')...: -" + s06 + "-");
		
		String s07 = original.replace("abc", "xy");
		System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
	
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Index of 'bc'.......: " + i);
		System.out.println("Last index of 'bc'..: " + j);
		
		String s = "potato apple lemon orange";
		String [] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
