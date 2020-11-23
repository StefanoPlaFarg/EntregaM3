/*
Crea sis variables tipu string buides.
Demana per consola que s’introdueixin els noms. 
Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat.
Mostra per consola el nom de les 6 ciutats.
 * 
 * 
 */


import java.util.Scanner;

public class FaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1,var2,var3,var4,var5,var6;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Introdueix 6 noms de ciutats\n" );		
		var1=myObj.nextLine();
		var2=myObj.nextLine();
		var3=myObj.nextLine();
		var4=myObj.nextLine();
		var5=myObj.nextLine();
		var6=myObj.nextLine();
		System.out.println("Noms introduïts");
	}

}
