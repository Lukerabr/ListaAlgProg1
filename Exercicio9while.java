import java.util.Scanner;
public class Exercicio9while
{
	public static void main(String [] args)
	{
		Scanner tc = new Scanner(System.in);
		int n = tc.nextInt();
		int i = 1;
		int quantpositivo = 0;
		int quantnegativo = 0;

		while(i <= n){
			int x = tc.nextInt();
				if(x <= 0){
					quantnegativo = i - quantpositivo;
				} 
				else{
					quantpositivo = i - quantnegativo;
				}
			i++;
		}
		System.out.println(quantpositivo + " " + quantnegativo);
	}	

}