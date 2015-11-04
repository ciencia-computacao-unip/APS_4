import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ranking extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static final String USUARIO = "aps4";
	private static final String SENHA = "Af8z7!U_HVAc";
	private static final String DATABASE = "aps4";
	private static final String DRIVER_CONEXAO = "com.mysql.jdbc.Driver";
	private static final String STR_CONEXAO = "";
	private JTable tabela;
	private JLabel jogador, pontuacao;
	private JButton voltar;
	private JPanel modo1, modo2, modo3, p1fundo, modo1flow;
	private JTabbedPane modos;
	private  String [] colunas = {"Pontuacao", "Jogador"};
	
    Object [][] dados = {
		{"10", "Player1"},
		{"20", "Player2"},
		{"30", "Player3"},
    };

   

	public Ranking(){

		super("GENIUS - Ranking");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(220,400);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new BorderLayout());

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
		this.setLayout(new BorderLayout());
		this.add(tabela, BorderLayout.CENTER);
		this.add(voltar, BorderLayout.SOUTH);
		this.add(modo1flow, BorderLayout.NORTH);

		modo1flow.add(pontuacao);
		modo1flow.add(jogador);
		modo1.add(p1fundo);
		voltar.addActionListener(this);

		}
		public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == voltar){
		  new Menu();
		  this.dispose();
		}
	}
}
