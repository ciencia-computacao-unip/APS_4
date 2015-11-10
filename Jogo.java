import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;



public class Jogo extends JFrame implements ActionListener {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total,jp_center,jp_east,jp_north,jp_south,jp_west;
	private Botao[] botoes = new Botao[20];
	public int daltonico;


	public JFrame frame = new JFrame("Genius");


	//MTD. CONSTRUTOR;
	public Jogo(){

		super("Jogo");

		//Setando configs da janela
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocation(0,0);
		frame.setSize(200,180);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		//Layouts
		jp_total = new JPanel(new BorderLayout());
		jp_center = new JPanel(new GridLayout(2,2));
		jp_north = new JPanel(new FlowLayout());
		jp_south = new JPanel(new FlowLayout());
		jp_east = new JPanel(new FlowLayout());
		jp_west = new JPanel(new FlowLayout());

		//BOTOES DO JOGO

		Color[] cores = new Color[10];
		cores[1] = Color.BLUE;
		cores[2] = Color.RED;
		cores[3] = Color.YELLOW;
		cores[4] = Color.GREEN;
		cores[5] = Color.BLACK;
		cores[6] = Color.CYAN;
		cores[7] = Color.MAGENTA;
		cores[8] = Color.WHITE;


		//JOGO

		for(int x=1;x<5;x++){
			botoes[x]= new Botao();
			jp_center.add(botoes[x]);
			botoes[x].addActionListener(this);

		}

		//MENU
		for(int x=5;x<7;x++){

			botoes[x]= new Botao();
			botoes[x].addActionListener(this);
			jp_south.add(botoes[x]);
			botoes[x].setPreferredSize(new Dimension(200, 80));
			botoes[x].setBorder(new LineBorder(Color.WHITE, 3));
			botoes[x].setForeground(Color.WHITE);

		}

		botoes[5].setText("JOGAR");
		botoes[6].setText("VOLTAR");

		if(daltonico==0){

			jp_north.setBackground(Color.BLACK);
			jp_south.setBackground(Color.BLACK);
			jp_east.setBackground(Color.BLACK);
			jp_west.setBackground(Color.BLACK);

			for(int x=1;x<5;x++){

				Color Col = cores[x];
				botoes[x].setBorder(new LineBorder(Col, 10));
				botoes[x].setBackground(Col);

			}
			for(int x=5;x<7;x++){

				Color Col = cores[x];
				botoes[x].setBackground(Color.BLACK);

			}

		}else{

			jp_north.setBackground(Color.GRAY);
			jp_south.setBackground(Color.GRAY);
			jp_east.setBackground(Color.GRAY);
			jp_west.setBackground(Color.GRAY);

			for(int x=1;x<5;x++){

				Color Col = cores[x+4];
				botoes[x].setBorder(new LineBorder(Col, 10));
				botoes[x].setBackground(Col);

			}
			for(int x=5;x<7;x++){

				Color Col = cores[x];
				botoes[x].setBackground(Color.GRAY);

			}

		}



		//ADDS

		frame.add(jp_total);
		jp_total.add(jp_center,BorderLayout.CENTER);
		jp_total.add(jp_east,BorderLayout.EAST);
		jp_total.add(jp_west,BorderLayout.WEST);
		jp_total.add(jp_north,BorderLayout.NORTH);
		jp_total.add(jp_south,BorderLayout.SOUTH);



	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource()== botoes[6]){
			frame.dispose();
		}
	}

	public static void main(String[] args) {

	new Jogo();

	}
}
