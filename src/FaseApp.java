import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 
Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).
Ompliu els nous arrays lletra per lletra.
Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).

 * 
 */
public class FaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;

		ArrayList<String> arrayCiutat1 = new ArrayList<String>();
		ArrayList<String> arrayCiutat2 = new ArrayList<String>();
		ArrayList<String> arrayCiutat3 = new ArrayList<String>();
		ArrayList<String> arrayCiutat4 = new ArrayList<String>();
		ArrayList<String> arrayCiutat5 = new ArrayList<String>();
		ArrayList<String> arrayCiutat6 = new ArrayList<String>();

		Scanner myObj = new Scanner(System.in);
		String ciutatAux = new String();

		System.out.println("Introdueix 6 noms de ciutats\n");
		ciutat1 = myObj.nextLine();
		ciutat2 = myObj.nextLine();
		ciutat3 = myObj.nextLine();
		ciutat4 = myObj.nextLine();
		ciutat5 = myObj.nextLine();
		ciutat6 = myObj.nextLine();
		System.out.println("Noms introduïts");

		for (int i = 1; i <= 6; i++) {
			switch (i) {
			case 1:
				arrayCiutat1.add(invertirString(ciutat1));
				System.out.println(arrayCiutat1);
				break;
			case 2:
				arrayCiutat2.add(invertirString(ciutat2));
				System.out.println(arrayCiutat2);
				break;
			case 3:
				arrayCiutat3.add(invertirString(ciutat3));
				System.out.println(arrayCiutat3);
				break;
			case 4:
				arrayCiutat4.add(invertirString(ciutat4));
				System.out.println(arrayCiutat4);
				break;
			case 5:
				arrayCiutat5.add(invertirString(ciutat5));
				System.out.println(arrayCiutat5);
				break;
			case 6:
				arrayCiutat6.add(invertirString(ciutat6));
				System.out.println(arrayCiutat6);
				break;

			default:
				break;
			}

		}

	}

	public static String invertirString(String ciutat) {
		String ciutatAux = "";
		for (int i = ciutat.length() - 1; i >= 0; i--) {
			ciutatAux += ciutat.charAt(i);
		}
		return ciutatAux;

	}

	/*
	 * Metode per revertir un String amb String Builder
	 * 
	 * public static String invertirString (String cadena) {
	 * 
	 * StringBuilder stringBuilder = new StringBuilder(cadena); String invertida =
	 * stringBuilder.reverse().toString(); return invertida; }
	 * 
	 */
}

