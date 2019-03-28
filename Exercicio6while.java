import java.util.Scanner;
public class Exercicio6while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int n = tc.nextInt();
		int i = 1;
		int soma = 0;

		while(i <= n){
			int x = tc.nextInt();
				if(x > 0){
					soma = soma + x;
				} 
				else{}
			i++;
		}
		System.out.println(soma);
	}	

}