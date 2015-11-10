import java.util.Random;

public class Dificuldade3 {
	
	public static void main(String[] args) {

		int[] vetor3 = new int[20];
		Random gerador = new Random();

		for (int z = 0; z <= 19; z++){ //preenche o vetor com os valores randomicos
			vetor3[z] = gerador.nextInt(5);
		}
		for (int x = 0; x <= 19; x++ ){ // faz o for recomecar mostrando o vetor desde o inicio
			for (int i = 0; i <= x; i++) { //mostra os valores do vetor
				System.out.print(vetor3[i]);
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
