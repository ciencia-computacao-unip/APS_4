import java.util.Random;

public class Dificuldade1 {

	public static void main(String[] args) {

		int[] vetor1 = new int[8];
		Random gerador = new Random();

		for (int z = 0; z <= 7; z++){ //preenche o vetor com os valores randomicos
			vetor1[z] = gerador.nextInt(5);
		}
		for (int x = 0; x <= 7; x++ ){  // faz o for recomecar mostrando o vetor desde o inicio
			for (int z = 0; z <= x ; z++) { //mostra os valores do vetor
				System.out.print(vetor1[z]);
				try{
						Thread.sleep(500); //1000 = 1 segundo
				}
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}

}
