import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.util.Random;


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
		jl_nome = new JLabel ("GENIUS   DOS   DESENVOLVEDORES");
		jl_nome.setFont(new Font("Dialog", Font.BOLD, 20));
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
		
		Random gerador = new Random();
		
		
 
        
		Botao[8].addMouseListener(new MouseListener() {  

			public void mouseReleased(MouseEvent e) { 
			}  

			public void mousePressed(MouseEvent e) {
			}  

			public void mouseExited(MouseEvent e) {  
			}  

			public void mouseEntered(MouseEvent e) { 
				frame.dispose();
				new Panico();
			}  

			public void mouseClicked(MouseEvent e) {  
			}  
		});  
		
		
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
		
		// EFEITOS AO PASSA MOUSE... APRIMORAR.
		
		Color[] Collor = new Color[10];
		Collor[1] = Color.MAGENTA;
		Collor[2] = Color.WHITE;
		Collor[3] = Color.YELLOW;
		Collor[4] = Color.CYAN;
		Collor[5] = Color.GREEN;
		Collor[6] = Color.RED;
		Collor[7] = Color.BLACK;
		Collor[8] = Color.BLUE;
		
		
		Botao[1].addMouseListener(new MouseListener() {  
			public void mouseReleased(MouseEvent e) {}  
			public void mousePressed(MouseEvent e) {}  
			public void mouseExited(MouseEvent e) {Botao[1].setBackground(null);Botao[1].setForeground(null);}  
			public void mouseEntered(MouseEvent e) {int rnd_back = gerador.nextInt(8)+1;
				if(rnd_back >4){Botao[1].setForeground(Color.WHITE);}
				Color Col = Collor[rnd_back];
				Botao[1].setBackground(Col);
			} public void mouseClicked(MouseEvent e) {}  
		});Botao[2].addMouseListener(new MouseListener() {  
			public void mouseReleased(MouseEvent e) {}  
			public void mousePressed(MouseEvent e) {}  
			public void mouseExited(MouseEvent e) {Botao[2].setBackground(null);Botao[2].setForeground(null);}  
			public void mouseEntered(MouseEvent e) {int rnd_back = gerador.nextInt(8)+1;
				if(rnd_back >4){Botao[2].setForeground(Color.WHITE);}
				Color Col = Collor[rnd_back];
				Botao[2].setBackground(Col);
			} public void mouseClicked(MouseEvent e) {}  
		});Botao[3].addMouseListener(new MouseListener() {  
			public void mouseReleased(MouseEvent e) {}  
			public void mousePressed(MouseEvent e) {}  
			public void mouseExited(MouseEvent e) {Botao[3].setBackground(null);Botao[3].setForeground(null);}  
			public void mouseEntered(MouseEvent e) {int rnd_back = gerador.nextInt(8)+1;
				if(rnd_back >4){Botao[3].setForeground(Color.WHITE);}
				Color Col = Collor[rnd_back];
				Botao[3].setBackground(Col);
			} public void mouseClicked(MouseEvent e) {}  
		});Botao[4].addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}  
			public void mousePressed(MouseEvent e) {}  
			public void mouseExited(MouseEvent e) {Botao[4].setBackground(null);Botao[4].setForeground(null);}  
			public void mouseEntered(MouseEvent e) {int rnd_back = gerador.nextInt(8)+1;
				if(rnd_back >4){Botao[4].setForeground(Color.WHITE);}
				Color Col = Collor[rnd_back];
				Botao[4].setBackground(Col);
			} public void mouseClicked(MouseEvent e) {}  
		});Botao[5].addMouseListener(new MouseListener() { 
			public void mouseReleased(MouseEvent e) {}  
			public void mousePressed(MouseEvent e) {}  
			public void mouseExited(MouseEvent e) {Botao[5].setBackground(null);Botao[5].setForeground(null);}  
			public void mouseEntered(MouseEvent e) {int rnd_back = gerador.nextInt(8)+1;
				if(rnd_back >4){Botao[5].setForeground(Color.WHITE);}
				Color Col = Collor[rnd_back];
				Botao[5].setBackground(Col);
			} public void mouseClicked(MouseEvent e) {}  
		});Botao[6].addMouseListener(new MouseListener() {  
			public void mouseReleased(MouseEvent e) {}  
			public void mousePressed(MouseEvent e) {}  
			public void mouseExited(MouseEvent e) {Botao[6].setBackground(null);Botao[6].setForeground(null);}  
			public void mouseEntered(MouseEvent e) {int rnd_back = gerador.nextInt(8)+1;
				if(rnd_back >4){Botao[6].setForeground(Color.WHITE);}
				Color Col = Collor[rnd_back];
				Botao[6].setBackground(Col);
			} public void mouseClicked(MouseEvent e) {}  
		});
		
		
		
		
		//-----------------
		
		//RODAPE
		
		jl_rodape = new JLabel ("Jogo criado pelos alunos de Ciencias da Computacao - UNIP 2015");
		jp_total.add(jl_rodape,BorderLayout.SOUTH);
		jl_rodape.setHorizontalAlignment(SwingConstants.CENTER);
		
	
		
	}
	
	
	public void actionPerformed(ActionEvent e){
	
		if (e.getSource()== Botao[1]){
			new Jogo();
		}if (e.getSource()== Botao[3]){
			new MenuDificuldade();
		}if (e.getSource()== Botao[5]){
			new Jogo();
		}if (e.getSource()== Botao[6]){
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
