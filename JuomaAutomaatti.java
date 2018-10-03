package juoma_automaatti;


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
			System.out.println("Odota hetki, Kahvisi valmistuu. Kahvia jälellä"  + this.Kahvia + " yksikköä");
    	}
    
    public void valmistaTee() {
    	if (this.Teetä - 10 < 0) {
			this.Teetä = 0;
			System.out.println("Teetä ei ole enää jäljellä. Täytä säiliö.");}
		else this.Teetä -= 10;
			System.out.println("Odota hetki, teesi valmistuu. Teetä jälellä"  + this.Teetä + " yksikköä");
    	}
    
    public void valmistaKaakao() {
    	if (this.Kaakaota - 10 < 0) {
			this.Kaakaota = 0;
			System.out.println("Kaakaota ei ole enää jäljellä. Täytä säiliö.");}
		else this.Kahvia -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. Kaakaota jäljellä" + this.Kaakaota + " yksikköä.");
    	}
    	

    
	
	public static void main(String[] args) {
	    
		
		
		JuomaAutomaatti omaKone = new JuomaAutomaatti();
		
		omaKone.valmistaKahvi();
		omaKone.valmistaKahvi();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		omaKone.valmistaTee();
		}
	
}
