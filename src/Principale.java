import java.util.Scanner;
public class Principale {

	public static void main(String[] args) {
		int giorno = 0;
		int mese = 0;
		int anno = 0;
		String formato = "it";
		MyDate md = new MyDate();
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Adesso dovrai inserirmi una data");
	    System.out.print("Inserisci il mese: ");
	    mese = sc.nextInt();
	    md.setMese(mese);
	    System.out.print("Inserisci il giorno: ");
	    giorno = sc.nextInt();
	    md.setGiorno(giorno);
	    System.out.print("Inserisci l' anno: ");
	    anno = sc.nextInt();
	    md.setAnno(anno);
	    System.out.println("Questa e' la data che hai inserito: "+giorno+"/"+mese+"/"+anno);
	    System.out.println("Inserisci in che formato vuoi vedere la data (it-->Italiano o en-->Inglese)");
	    formato = sc.next();
	    md.setFormato(formato);
	    System.out.println(md);
	}

}
