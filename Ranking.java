import java.awt.*;
import javax.swing.*;

public class Ranking extends JFrame{
	
private static final long serialVersionUID = 1L;

  private JTabbedPane modos;
  private JLabel pontuacao, jogador;
  private JButton voltar;
  private JPanel modo1, modo1grid, modo1flow, modo2, modo3;
  private JTextField txfield[];

  public Ranking (){

    super ("Ranking");

    pontuacao = new JLabel ("Pontuação");
    jogador = new JLabel ("Jogador");
    voltar = new JButton ("Voltar");
    JTextField txfield[] = new JTextField[ 20 ]; 
    for (int i=0; i < txfield.length; i++){
    	txfield[i] = new JTextField(5);
    	txfield[i].setEditable(false);
    }
    
    modo1 = new JPanel();
    modo2 = new JPanel();
    modo3 = new JPanel();
    modo1flow = new JPanel(new FlowLayout());
    
    modo1.setLayout(new BorderLayout());
    modo2.setLayout(null);
    modo3.setLayout(null);
    
    modo1grid = new JPanel();
    modo1grid.setLayout(new GridLayout(10,2));
    
    for (int i=0; i < txfield.length; i++){
    modo1grid.add(txfield[i]);
    }
    
    
    modos = new JTabbedPane();

    modos.addTab("Modo 1", modo1);
    modos.addTab("Modo 2", modo2);
    modos.addTab("Modo 3", modo3);
    
    modo1flow.add(pontuacao);
    modo1flow.add(jogador);
    
    modo1.add(voltar, BorderLayout.SOUTH);
    modo1.add(modo1flow,BorderLayout.NORTH);
    modo1.add(modo1grid, BorderLayout.CENTER);
    
    Container janela;
    janela = getContentPane();
    janela.setLayout(new BorderLayout());
    janela.add(modos, BorderLayout.CENTER); 
    
  }
  public static void main(String[]main){
	Ranking r = new Ranking();
	r.setVisible(true);
	r.setDefaultCloseOperation (EXIT_ON_CLOSE);
	r.setSize(400,500);
	
  }
}
