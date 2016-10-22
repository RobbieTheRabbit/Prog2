
//	Aufgabe 4 Vorfuehrung
public class vorfuehren {

	public static void main(String[] args){
		

		zahlen(200);	//	4.1
//		vorzeichen(35, 10);	//	4.2
		
	}
		
	//	Wechelt das Vorzeichen bei jedem Durchgang
	public static void vorzeichen(int zahl, int durchlauf) {
		int ausgabe = 0;
		for (int i = 0; i<durchlauf; ++i) {
			ausgabe = zahl;
			System.out.print(ausgabe + ", ");
			ausgabe = zahl - zahl*2; 
			System.out.print(ausgabe + ", ");
		}
	}


	//	Gibt aus, welche Zahl Gerade und Ungerade ist
	public static void zahlen(int anzahl) {
		for (int i = 0; i<anzahl; ++i) {
			if(i%2 !=0) {
				System.out.println(i + " ist eine ungerade Zahl");
			} else{
				System.out.println(i + " ist eine gerade Zahl");
			}
		}	
	}
	
	
	
}



