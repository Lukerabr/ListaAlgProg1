import java.util.Scanner;
public class Exercicio7while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int n = tc.nextInt();
		int i = 1;
		int somapar = 0;
		int somaimpar = 0;

		while(i <= n){
			int x = tc.nextInt();
				if(x % 2 == 0){
					somapar = somapar + x;
				} 
				else{
					somaimpar = somaimpar + x;
				}
			i++;
		}
		System.out.println(somapar + " " + somaimpar);
	}	

}