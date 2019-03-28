import java.util.Scanner;
public class FaixasNotas
{
	public static void main (String [] args)
	{
		Scanner tc = new Scanner(System.in);

		Double nota1 = tc.nextDouble();
		String faixa1 = tc.next();
		if(0.0 < nota1 && nota1 <= 60.0){
			System.out.println("Notas entre 0,0 e 60,0 tem o conceito Ruim.");
			}

		Double nota2 = tc.nextDouble();
		String faixa2 = tc.next();
		if(60.1 <= nota2 && nota2 <= 70.0){
			System.out.println("Notas entre 60,1 e 70,0 tem o conceito Mediano.");
				}
		
		Double nota3 = tc.nextDouble();
		String faixa3 = tc.next();
		if(70.1 <= nota3 && nota3 <= 85.0){
			System.out.println("Notas entre 70,1 e 85,0 tem o conceito Bom.");
				}

		/*else if (85.1 <= nota4 && nota4 <= 100.0){
			System.out.println("Notas entre 85,1 e 100,0 tem o conceito Ótimo.");
				} */
		
		String faixa4 = tc.next();
		if ("faixa4".equalsIgnoreCase("Otimo")){
			System.out.println("Notas entre 85,1 e 100,0 tem o conceito Ótimo.");
				}
	}
}