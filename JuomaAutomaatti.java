package juoma_automaatti;


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
			System.out.println("Odota hetki, Kahvisi valmistuu. Kahvia j�lell�"  + this.Kahvia + " yksikk��");
    	}
    
    public void valmistaTee() {
    	if (this.Teet� - 10 < 0) {
			this.Teet� = 0;
			System.out.println("Teet� ei ole en�� j�ljell�. T�yt� s�ili�.");}
		else this.Teet� -= 10;
			System.out.println("Odota hetki, teesi valmistuu. Teet� j�lell�"  + this.Teet� + " yksikk��");
    	}
    
    public void valmistaKaakao() {
    	if (this.Kaakaota - 10 < 0) {
			this.Kaakaota = 0;
			System.out.println("Kaakaota ei ole en�� j�ljell�. T�yt� s�ili�.");}
		else this.Kahvia -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. Kaakaota j�ljell�" + this.Kaakaota + " yksikk��.");
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
