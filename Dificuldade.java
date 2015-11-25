import java.util.Random;
import java.util.ArrayList;
import java.lang.Integer;

public class Dificuldade {

	public static ArrayList<Integer> ObterBotoesASeremPrecionados(int nivel){
		ArrayList<Integer> numerosAleatorios  = new ArrayList<Integer>();
		int[] tamanhoSequenciaBaseadaNoNivel = {8,14,20,31};
		if(nivel<=tamanhoSequenciaBaseadaNoNivel.length && nivel>0){
			for(int x=0; x<tamanhoSequenciaBaseadaNoNivel[nivel-1]; x++ ){
				Random geradorDeNumeroAleatorio = new Random();
				numerosAleatorios.add(geradorDeNumeroAleatorio.nextInt(4)+1);
			}
		}
		return numerosAleatorios;
	}
}
