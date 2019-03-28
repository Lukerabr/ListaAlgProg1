import java.util.Scanner;
public class Exercicio10while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int n = tc.nextInt();
		int i = 1;
		int quantimpar = 0;
		int quantpar = 0;

		while(i <= n){
			int x = tc.nextInt();
				if(x % 2 == 0){
					quantpar = i - quantimpar;
				} 
				else{
					quantimpar = i - quantpar;
				}
			i++;
		}
		System.out.println(quantpar + " " + quantimpar);
	}	

}