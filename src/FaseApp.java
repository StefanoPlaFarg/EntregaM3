import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
 * 
 */

public class FaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1, var2, var3, var4, var5, var6;
		ArrayList<String> arrayCiutats = new ArrayList<String>();
		ArrayList<String> arrayCiutatsModificades = new ArrayList<String>();
		Scanner myObj = new Scanner(System.in);
		String ciutatAux = new String();

		System.out.println("Introdueix 6 noms de ciutats\n");
		var1 = myObj.nextLine();
		var2 = myObj.nextLine();
		var3 = myObj.nextLine();
		var4 = myObj.nextLine();
		var5 = myObj.nextLine();
		var6 = myObj.nextLine();
		System.out.println("Noms introduïts");
		arrayCiutats.add(var1);
		arrayCiutats.add(var2);
		arrayCiutats.add(var3);
		arrayCiutats.add(var4);
		arrayCiutats.add(var5);
		arrayCiutats.add(var6);
		Collections.sort(arrayCiutats);

		for (String ciutat : arrayCiutats) {

			for (int i = 0; i < ciutat.length(); i++) {

				if (ciutat.charAt(i) == 'a' || ciutat.charAt(i) == 'A') {

					ciutatAux = ciutatAux + "4";
				}

				else {
					ciutatAux = ciutatAux + ciutat.charAt(i);

				}

			}
			arrayCiutatsModificades.add(ciutatAux);
			ciutatAux = "";

		}

		Collections.sort(arrayCiutats);
		System.out.println(arrayCiutatsModificades);

	}

}
