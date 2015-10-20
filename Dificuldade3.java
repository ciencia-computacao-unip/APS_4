import java.util.Random; 




public class Dificuldade3 { 
	
	public static void main(String[] args) {
		
		int[] vetor3 = new int[20];
		Random gerador = new Random(); 
		
		
		
		for (int i = 0; i < 20; i++) {
			vetor3[i] = gerador.nextInt(5); 
			System.out.print(vetor3[i]);
		
				
			try{
					Thread.sleep(1000);                 //1000 = 1 segundo
					} 
				
				catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
												}
			
			}
		}
}
	
