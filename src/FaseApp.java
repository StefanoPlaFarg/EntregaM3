import java.util.Scanner;
import java.util.*;

/*
 Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats).
Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic.

 * 
 * 
 */
public class FaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1,var2,var3,var4,var5,var6;
		ArrayList<String> arrayCiutats = new ArrayList<String>();
		Scanner myObj = new Scanner(System.in);
		System.out.println("Introdueix 6 noms de ciutats\n" );		
		var1=myObj.nextLine();
		var2=myObj.nextLine();
		var3=myObj.nextLine();
		var4=myObj.nextLine();
		var5=myObj.nextLine();
		var6=myObj.nextLine();
		System.out.println("Noms introduïts");
		arrayCiutats.add(var1);
		arrayCiutats.add(var2);
		arrayCiutats.add(var3);
		arrayCiutats.add(var4);
		arrayCiutats.add(var5);
		arrayCiutats.add(var6);
		Collections.sort(arrayCiutats);		
		System.out.println(arrayCiutats);

	}
	

}
