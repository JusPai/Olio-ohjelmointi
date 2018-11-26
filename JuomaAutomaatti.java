package juoma;

import java.util.Scanner;

public class JuomaAutomaatti { 
	
	private int Teet�;
    private int Kahvia;
    private int Kaakaota;
    
    public JuomaAutomaatti() {
    	this.Teet� = 50;
    	this.Kahvia = 50;
    	this.Kaakaota = 50;
    }
    
    public void valmistaKahvi() {
    	if (this.Kahvia - 10 < 0) {
			this.Kahvia = 0;
			System.out.println("Kahvia ei ole en�� j�ljell�. T�yt� s�ili�.");}
		else this.Kahvia -= 10;
			System.out.println("Odota hetki, Kahvisi valmistuu. Kahvia j�lell� "  + this.Kahvia + " yksikk��");
    	}
    
    public void valmistaTee() {
    	if (this.Teet� - 10 < 0) {
			this.Teet� = 0;
			System.out.println("Teet� ei ole en�� j�ljell�. T�yt� s�ili�.");}
		else this.Teet� -= 10;
			System.out.println("Odota hetki, teesi valmistuu. Teet� j�lell� "  + this.Teet� + " yksikk��");
    	}
    
    public void valmistaKaakao() {
    	if (this.Kaakaota - 10 < 0) {
			this.Kaakaota = 0;
			System.out.println("Kaakaota ei ole en�� j�ljell�. T�yt� s�ili�.");}
		else this.Kahvia -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. Kaakaota j�ljell� " + this.Kaakaota + " yksikk��.");
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
