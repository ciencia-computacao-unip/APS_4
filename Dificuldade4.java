import java.util.Random;

public class Dificuldade4 {

	public  Dificuldade4() {

		int[] vetor4 = new int[31];
		Random gerador = new Random();

		for (int z = 0; z <= 30; z++){ //preenche o vetor com os valores randomicos
			vetor4[z] = gerador.nextInt(5);
		}
		for (int x = 0; x <= 7; x++ ){ // faz o for recomecar mostrando o vetor desde o inicio
			for (int i = 0; i < x; i++) { //mostra os valores do vetor
				System.out.print(vetor4[i]);
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
