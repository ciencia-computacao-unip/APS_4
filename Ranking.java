import java.awt.*;
import javax.swing.*;

public class Ranking extends JFrame{

  private static final long serialVersionUID = 1L;
  private static final String USUARIO = "aps4";
  private static final String SENHA = "Af8z7!U_HVAc";
  private static final String DATABASE = "aps4";
  private static final String DRIVER_CONEXAO = "com.mysql.jdbc.Driver";
  private static final String STR_CONEXAO = "";



  JTable tabela;
  JLabel jogador, pontuacao;
  JButton voltar;
  JPanel modo1, modo2, modo3, p1fundo, modo1flow;
  JTabbedPane modos;

    Object [][] dados = {
      {"10", "Player1"},
      {"20", "Player2"},
      {"30", "Player3"},
    };

    String [] colunas = {"Pontuacao", "Jogador"};

  public Ranking(){

  super("Ranking");

  tabela = new JTable(dados, colunas);

  modo1 = new JPanel ();
  p1fundo = new JPanel ();
  modo1flow = new JPanel ();
  modos = new JTabbedPane ();
  jogador = new JLabel ("Jogadores");
  pontuacao  = new JLabel ("Pontuação");
  voltar = new JButton ("Voltar");

  modos.addTab("Modo 1", modo1);
  modos.addTab("Modo 2", modo2);
  modos.addTab("Modo 3", modo3);

  modo1flow.setLayout(new FlowLayout());
  p1fundo.setLayout(new BorderLayout());
  p1fundo.add(tabela, BorderLayout.CENTER);
  p1fundo.add(voltar, BorderLayout.SOUTH);
  p1fundo.add(modo1flow, BorderLayout.NORTH);

  modo1flow.add(pontuacao);
  modo1flow.add(jogador);
  modo1.add(p1fundo);

  Container janela;
  janela = getContentPane();
  janela.setLayout(new BorderLayout());

  janela.add(modos);
  }
  public static void main(String[]args){
    Ranking r = new Ranking();
    r.setVisible(true);
    r.pack();
    r.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
