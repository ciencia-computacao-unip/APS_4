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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Menu extends JFrame implements ActionListener {



	
	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total,jp_center,jp_lateral,jp_lateral2,jp_top;
	private JLabel jl_nome,jl_rodape;
	private ArrayList<BotaoMenu> botao  = new ArrayList<BotaoMenu>();
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
		jl_nome = new JLabel("GENIUS DOS DESENVOLVEDORES");
		jl_nome.setFont( new Font("Dialog", Font.BOLD, 20) );
		jp_top.add(jl_nome);
		jl_nome.setHorizontalAlignment(SwingConstants.CENTER);

		//CENTERTOP
		String[] menus = {"MODO JOGO 1", "RANKING", "MODO JOGO 2", "OPCOES", "MODO JOGO 3", "SAIR"};

		for( int x = 0; x < menus.length; x++ ){
				botao.add( new BotaoMenu(menus[x]));
				jp_center.add( botao.get(x) );
				botao.get(x).addActionListener(this);
				this.setForeground(Color.WHITE);
		}

		//RODAPE
		jl_rodape.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public void actionPerformed(ActionEvent e){
		for(int x = 0; x<=5; x++){
			if(e.getSource()== botao.get(x)){
				switch(x){
					case 0:
						new TelaJogo();break;
					case 1:
						new Ranking();frame.dispose();break;
					case 2:
						new MenuDificuldade();break;
					case 3:
						new TelaDeOpcoes();frame.dispose();break;
					case 4:
						new TelaJogo();break;
					default:
						System.exit(0);
				}
			}
		}
	}

}
