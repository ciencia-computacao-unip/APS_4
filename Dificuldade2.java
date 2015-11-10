import java.util.Random;
public class Dificuldade2{
	public Dificuldade2() {

		int[] vetor2 = new int[14];
		Random gerador = new Random();

		for (int i = 0; i < 14; i++) {
			vetor2[i] = gerador.nextInt(5);
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
