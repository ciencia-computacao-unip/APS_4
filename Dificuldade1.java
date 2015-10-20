import java.util.Random; 




public class Dificuldade1 { 
	
	
	public static void main(String[] args) {
		
	
		int[] vetor1 = new int[8];
		Random gerador = new Random(); 
		
		
	
		
		for (int i = 0; i < 8; i++) {	
				
			
			vetor1[i] = gerador.nextInt(5); 
			System.out.print(vetor1[i]);
				
				
				
				try{
					Thread.sleep(1000);                 //1000 = 1 segundo
					} 
				
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
												}
		
			
		} 
		
	}

}
