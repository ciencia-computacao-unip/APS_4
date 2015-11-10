import java.util.Random;

public class Dificuldade2{

	public  Dificuldade2() {

		int[] vetor2 = new int[14];
		Random gerador = new Random();

		for (int z = 0; z <= 13; z++){ //preenche o vetor com os valores randomicos
			vetor2[z] = gerador.nextInt(5);
		}
		for (int x = 0; x <= 13; x++ ){ // faz o for recomecar mostrando o vetor desde o inicio
			for (int i = 0; i <= x; i++) { //mostra os valores do vetor
				System.out.print(vetor2[i]);
				try{
						Thread.sleep(1000); //1000 = 1 segundo
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}
}
