import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rekursion {
	static int n;
	
	public static void main(String[] args) throws IOException{
		// einlesen eine Zahl von der Konsole
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.print("Gib eine positive Zahl ein: ");
	    String eingabe = br.readLine();
	    n = Integer.parseInt(eingabe);
	    
	    System.out.println();
		System.out.println("Zahl " + "  Summe");
		// Ausgabe der Summe von 0 bis zur Zahl
		for (int i=0; i<=n; i++){
			System.out.println(i + "       " + berechne(i));
		}
	}
	
	// rekursive Methode
	public static int berechne(int n){
			if (n<=1){ 
				return 0;
			}
			else if (n==2) 
				return 1;
			else return berechne(n-1)+berechne(n-2);
		
	}
}