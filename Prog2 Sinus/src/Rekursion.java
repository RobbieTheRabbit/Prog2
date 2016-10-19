
public class Rekursion {
	static int fun;
	static int n;
	
	public static void main(String[] args){
			System.out.println(berechne(8));
	}
	
	public static int berechne(int n){
		if (n<=1) 
			return 0;
		else if (n==2) 
			return 1;
		else return berechne(n-1)+berechne(n-2);
	}
}