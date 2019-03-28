import java.util.Scanner;
public class GalinhasCabras
{
	public static void main (String [] args)
	{
		Scanner tc = new Scanner(System.in);
		
		int cabecas = tc.nextInt();
		int patas = tc.nextInt();
 		
 		int galinhas = cabecas - 15;
 		int cabras = patas / 4;

		System.out.println("Neste cercado há " + galinhas + " galinhas(s) e " + cabras + "cabra(s).");
	}
}