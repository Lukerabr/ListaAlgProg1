import java.util.Scanner;
public class Exercicio2while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int n = tc.nextInt();
		int i = 1;
		int fatorial = 1;

		while(i <= n){
			fatorial *= i;
			i++;
		}
		System.out.println(fatorial);
	}	

}