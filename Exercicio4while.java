import java.util.Scanner;
public class Exercicio4while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int x = tc.nextInt();
		int n = tc.nextInt();
		int i = 1;
		int potencia = 1;

		while(i <= n){
			potencia = potencia * x ;
			i++;
			System.out.println(potencia);
		}
	}	

}