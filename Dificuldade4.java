import java.util.Random; 




public class Dificuldade4 { 
		
	public static void main(String[] args) {
		
		int[] vetor4 = new int[31];
		Random gerador = new Random();
		
		
		
		for (int i = 0; i < 1; i++) {
			
			vetor4[i] = gerador.nextInt(5); 
			System.out.print(vetor4[i]);
		    
				try{
					Thread.sleep(1000);                 //1000 milliseconds is one second.
					} 
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}

			} 
	}		
}
