package juoma;

import java.util.Scanner;

public class JuomaAutomaatti { 
	
	private int Teetä;
    private int Kahvia;
    private int Kaakaota;
    
    public JuomaAutomaatti() {
    	this.Teetä = 50;
    	this.Kahvia = 50;
    	this.Kaakaota = 50;
    }
    
    public void valmistaKahvi() {
    	if (this.Kahvia - 10 < 0) {
			this.Kahvia = 0;
			System.out.println("Kahvia ei ole enää jäljellä. Täytä säiliö.");}
		else this.Kahvia -= 10;
			System.out.println("Odota hetki, Kahvisi valmistuu. Kahvia jälellä "  + this.Kahvia + " yksikköä");
    	}
    
    public void valmistaTee() {
    	if (this.Teetä - 10 < 0) {
			this.Teetä = 0;
			System.out.println("Teetä ei ole enää jäljellä. Täytä säiliö.");}
		else this.Teetä -= 10;
			System.out.println("Odota hetki, teesi valmistuu. Teetä jälellä "  + this.Teetä + " yksikköä");
    	}
    
    public void valmistaKaakao() {
    	if (this.Kaakaota - 10 < 0) {
			this.Kaakaota = 0;
			System.out.println("Kaakaota ei ole enää jäljellä. Täytä säiliö.");}
		else this.Kahvia -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. Kaakaota jäljellä " + this.Kaakaota + " yksikköä.");
    	}
    	

    
	
	public static void main(String[] args) {
	    
		int valinta = 0;
		
		Scanner lukija = new Scanner(System.in);
        
		JuomaAutomaatti omaKone = new JuomaAutomaatti();
		
		
        
		while(true) {
			
			System.out.println("*******Juoma-Automaatti*******");
			System.out.println("1. Kahvi");
			System.out.println("2. Tee");
			System.out.println("3. Kaakao");
			System.out.println("4. Lopeta");
			System.out.println("******************************");
			
			valinta = lukija.nextInt();
			
			if (valinta == 1)
				omaKone.valmistaKahvi();
			
			else if (valinta == 2)
				omaKone.valmistaTee();
			else if (valinta == 3)
				omaKone.valmistaKaakao();
			else if (valinta == 4)
					break;
			
			}
        
		
		
		
		
		}
	
}
