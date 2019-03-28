import java.util.Scanner;
public class Exercicio1while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int n = tc.nextInt();
		int i = 0;
		int impar = 1;

		while(i < n){
			System.out.println(impar);
			impar = impar + 2;
			i++;
		}

	}
}