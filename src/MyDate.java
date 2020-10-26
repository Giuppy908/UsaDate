
public class MyDate {
	// Attributi - Proprietà - Variabili di istanza
	public int giorno=0;
	public int mese=0;
	public int anno=0;
	public String formato="it";
	
	public void setFormato(String formato) {
		
		this.formato = formato;
	}
	
	public int getGiorno() {
		return giorno;
	}
	
	public void setGiorno(int giorno) {
		if (giorno <1) {
			System.err.println("Hai inserito un giorno minore di 1");
			System.out.println("Il giorno deve essere maggiore di 1");
			System.exit(0);
		}
		switch (mese) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				if ( giorno > 31 ) {
					System.err.println("Il giorno deve essere minore o uguale a 31");
					System.exit(0);
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if ( giorno > 30 ) {
					System.err.println("Il giorno deve essere minore o uguale a 30");
					System.exit(0);
				}
				break;
			case 2:
				if ( giorno >28 ) {
					System.err.println("Il giorno deve essere minore o uguale a 28");
					System.exit(0);
				}
				break;
 		}
		
		this.giorno = giorno;
	}
	
	public int getMese() {
		return mese;
	}
	
	public void setMese(int mese) {
		if (mese < 1) {
			System.err.println("Hai inserito un mese minore di 1");
			System.out.println("Il mese deve essere maggiore di 1");
			System.exit(0);
		} if (mese > 12) {
			System.err.println("Hai inserito un mese che non esiste");
			System.out.println("I mesi sono 12");
			System.exit(0);
		}
		this.mese = mese;
	}
	
	public int getAnno() {
		return anno;
	}
	
	public void setAnno(int anno) {
		if (anno < 2020) {
			System.err.println("Devi inserire un anno valido che sia minore di 2020");
			System.exit(0);
		}
		this.anno = anno;
	}
	
	public String toString() {
		if (formato.equalsIgnoreCase("it")) {
		return this.giorno+"/"+this.mese+"/"+this.anno;
		} else {
			return this.mese+"-"+this.giorno+"-"+this.anno;
		}
	}
	
	
	
    
}
