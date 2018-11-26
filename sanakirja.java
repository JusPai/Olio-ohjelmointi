import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sanakirja {
	public static void main(String[] args) {
		
		HashMap<String,String> dictionary = new HashMap <String,String>(10);
		
		dictionary.put("kissa", "cat");
		dictionary.put("koira", "dog");
		dictionary.put("hevonen", "horse");
		dictionary.put("auto", "car");
		dictionary.put("vene", "boat");
		
		
		Scanner keyboard = new Scanner(System.in);
		String input = "q";
		
		do {
			System.out.println("\n Syötä haettava sana. \n q lopettaa");
		
			input = keyboard.nextLine();
			input = input.toLowerCase();
			input = input.replace(" ","");
			
			if ( dictionary.containsKey(input) ) {
				String definition = dictionary.get(input);
				System.out.println("input: \n" + definition);
			}
			else {
				System.err.println("Sanaa ei löytynyt");
			}
			}while (! input.equalsIgnoreCase("q") );
				System.out.println("Ohjelma lopetetaan, kiitos käynnistä!");
				
	}
}