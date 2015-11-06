import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Menu extends JFrame implements ActionListener {


	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total,jp_center,jp_lateral,jp_lateral2,jp_top;
	private JLabel jl_nome,jl_rodape;
	private Botao[] Botao = new Botao[20];
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
		jp_top = new JPanel(new FlowLayout());
		jl_rodape = new JLabel ("Jogo criado pelos alunos de Ciencias da Computacao - UNIP 2015");

		//ADDS
		frame.add(jp_total);
		jp_total.add(jp_center,BorderLayout.CENTER);
		jp_total.add(jp_top,BorderLayout.NORTH);
		jp_total.add(jl_rodape,BorderLayout.SOUTH);

		//NORTH
		jl_nome = new JLabel ("GENIUS   DOS   DESENVOLVEDORES");
		jl_nome.setFont(new Font("Dialog", Font.BOLD, 20));
		jp_top.add(jl_nome);
		jl_nome.setHorizontalAlignment(SwingConstants.CENTER);

		//CENTERTOP
		for(int x=1;x<7;x++){
			Botao[x]= new Botao();
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
		jl_rodape.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public void actionPerformed(ActionEvent e){
			for(int x = 0; x<=6; x++){
					if(e.getSource()== Botao[x]){
							switch(x){
									case 1:
											new Jogo();break;
									case 2:
											new Ranking();frame.dispose();break;
									case 3:
											new MenuDificuldade();break;
									case 4:
											new Opcoes();frame.dispose();break;
									case 5:
											new Jogo();break;
									default:
											System.exit(0);
							}
					}
			}
	}
}
