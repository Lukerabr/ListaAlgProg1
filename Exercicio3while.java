import java.util.Scanner;
public class Exercicio3while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int n = tc.nextInt();
		int i = 1;
		int potencia = 1;

		while(i <= n){
			potencia *= 2;
			System.out.println(potencia);
			i++;
		}
	}	

}