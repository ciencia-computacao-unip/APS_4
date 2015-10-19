import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Menu extends JFrame implements ActionListener {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total,jp_center,jp_lateral,jp_lateral2,jp_top;
	private JLabel jl_nome,jl_rodape;
	private botao[] Botao = new botao[20];
	
	
	public JFrame frame = new JFrame("Menu");
	
	
	
	//MTD. CONSTRUTOR;
	public Menu(){
		
		super("Tela Menu");
		
		
		//Setando configs da janela
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		frame.setLocation(100,100);
		frame.setSize(540,340);
		frame.setResizable(false); 
		frame.setVisible(true);
		
		//Layouts
		jp_total = new JPanel(new BorderLayout());
		jp_center = new JPanel(new FlowLayout());
		jp_lateral = new JPanel(new GridLayout(4,1));
		jp_lateral2 = new JPanel(new GridLayout(4,1));
		jp_top = new JPanel(new FlowLayout());
		
		
		//ADDS
		frame.add(jp_total);
		jp_total.add(jp_center,BorderLayout.CENTER);
		jp_total.add(jp_lateral,BorderLayout.EAST);
		jp_total.add(jp_lateral2,BorderLayout.WEST);
		jp_total.add(jp_top,BorderLayout.NORTH);
		
		
		//NORTH
		jl_nome = new JLabel ("GENIUS DOS DESENVOLVEDORES");
		jp_top.add(jl_nome);
		jl_nome.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		
		//LATERAL
		
		for(int x=7;x<11;x++){ 
			Botao[x]= new botao();
			Botao[x].setEnabled(false);
			jp_lateral.add(Botao[x]);
			//Botao[x].addActionListener(this);
		}
		
		Botao[10].setBackground(Color.CYAN); 
		Botao[9].setBackground(Color.WHITE); 
		Botao[7].setBackground(Color.MAGENTA); 
		Botao[8].setBackground(Color.BLACK); 
		
		
		//LATERAL2
		
		for(int x=11;x<15;x++){ 
			Botao[x]= new botao();
			Botao[x].setEnabled(false);
			jp_lateral2.add(Botao[x]);
			//Botao[x].addActionListener(this);
		}
		
		Botao[14].setBackground(Color.GREEN); 
		Botao[12].setBackground(Color.RED); 
		Botao[11].setBackground(Color.YELLOW); 
		Botao[13].setBackground(Color.BLUE); 
		
		
		
		//CENTERTOP
		
		
		for(int x=1;x<7;x++){ 
			Botao[x]= new botao();
			Botao[x].setBorder(new LineBorder(Color.BLACK, 5));
			Botao[x].setPreferredSize(new Dimension(200, 80));
			jp_center.add(Botao[x]);
			Botao[x].addActionListener(this);
		}
		
		Botao[1].setText("MODO JOGO 1");
		Botao[3].setText("MODO JOGO 2");
		Botao[5].setText("MODO JOGO 3");
		Botao[2].setText("RANKING");
		Botao[4].setText("OPCOES");
		Botao[6].setText("SAIR");
		
		//RODAPE
		
		jl_rodape = new JLabel ("Jogo criado pelos alunos de Ciencias da Computacao - UNIP 2015");
		jp_total.add(jl_rodape,BorderLayout.SOUTH);
		jl_rodape.setHorizontalAlignment(SwingConstants.CENTER);
		
	
		
	}
	
	
	public void actionPerformed(ActionEvent e){
	
		if (e.getSource()== Botao[6]){
			System.exit(0);
		}if (e.getSource()== Botao[4]){
			new Opcoes();
			frame.dispose();
		}if (e.getSource()== Botao[2]){
			new Ranking();
			frame.dispose();
		}
	}
}	
