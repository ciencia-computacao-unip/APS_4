import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Dimension;


public class Jogo extends JFrame implements ActionListener {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total,jp_center,jp_east,jp_north,jp_south,jp_west;
	private BotaoJogo[] botoesDeJogo = new BotaoJogo[4];
	private BotaoMenu[] botoesDeMenu = new BotaoMenu[2];
	public int daltonico;


	public JFrame frame = new JFrame("Genius");


	//MTD. CONSTRUTOR;
	public Jogo(){

		super("Jogo");

		//Setando configs da janela
		Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
		double porcentagemDaTelaAOcupar = 0.75;
		frame.setBounds(
			(int)(tamanhoDaTela.width - tamanhoDaTela.width*porcentagemDaTelaAOcupar)/2,
			(int)(tamanhoDaTela.height - tamanhoDaTela.height*porcentagemDaTelaAOcupar)/2,
			(int)(tamanhoDaTela.width*porcentagemDaTelaAOcupar),
			(int)(tamanhoDaTela.height*porcentagemDaTelaAOcupar)
		);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Layouts
		jp_total = new JPanel(new BorderLayout());
		jp_center = new JPanel(new GridLayout(2,2));
		jp_north = new JPanel(new FlowLayout());
		jp_south = new JPanel(new FlowLayout());
		jp_east = new JPanel(new FlowLayout());
		jp_west = new JPanel(new FlowLayout());

		//BOTOES DO JOGO

		Color[] cores = {null,Color.BLUE,Color.RED,Color.YELLOW,Color.GREEN,Color.BLACK,Color.CYAN,Color.MAGENTA,Color.WHITE};


		//JOGO

		for(int x=1;x<=4;x++){
			botoesDeJogo[x-1]= new BotaoJogo(x,false);
			jp_center.add(botoesDeJogo[x-1]);
			botoesDeJogo[x-1].addActionListener(this);

		}

		//MENU
		String[] textosBotoes = {"JOGAR","VOLTAR"};
		for(int x=0;x<=1;x++){

			botoesDeMenu[x]= new BotaoMenu();
			botoesDeMenu[x].addActionListener(this);
			jp_south.add(botoesDeMenu[x]);
			botoesDeMenu[x].setPreferredSize(new Dimension(200, 80));
			botoesDeMenu[x].setForeground(Color.WHITE);
			botoesDeMenu[x].setText(textosBotoes[x]);
		}

		if(daltonico==0){

			jp_north.setBackground(Color.BLACK);
			jp_south.setBackground(Color.BLACK);
			jp_east.setBackground(Color.BLACK);
			jp_west.setBackground(Color.BLACK);

			for(int x=1;x<=4;x++){

				Color Col = cores[x];
				botoesDeJogo[x-1].setBorder(new LineBorder(Col, 10));

			}
			for(int x=0;x<=1;x++){
				botoesDeMenu[x].setBackground(Color.BLACK);
			}

		}else{

			jp_north.setBackground(Color.GRAY);
			jp_south.setBackground(Color.GRAY);
			jp_east.setBackground(Color.GRAY);
			jp_west.setBackground(Color.GRAY);

			for(int x=1;x<5;x++){

				Color Col = cores[x+4];
				botoesDeJogo[x].setBorder(new LineBorder(Col, 10));
				botoesDeJogo[x].setBackground(Col);

			}
			for(int x=0;x<=1;x++){
				botoesDeMenu[x].setBackground(Color.GRAY);
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
		if (e.getSource()== botoesDeMenu[1]){
			frame.dispose();
		}
	}

	public static void main(String[] args) {

	new Jogo();

	}
}
