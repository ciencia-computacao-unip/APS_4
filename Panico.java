import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.event.*;
import java.io.*;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;





public class Panico extends JFrame implements ActionListener {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total;
	private JTextArea ta_loucura;
	private JLabel jl_titulo;
	private JButton jb_salvar,jb_sair;
	private FileWriter arquivo;


	JFrame frame = new JFrame("Panico");


	//MTD. CONSTRUTOR;
	public Panico(){

		super("Tela de Opcoes");


		//Setando configs da janela
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
		double porcentagemDaTelaAOcupar = 0.85;
		frame.setBounds(
			(int)(tamanhoDaTela.width - tamanhoDaTela.width*porcentagemDaTelaAOcupar)/2,
			(int)(tamanhoDaTela.height - tamanhoDaTela.height*porcentagemDaTelaAOcupar)/2,
			(int)(tamanhoDaTela.width*porcentagemDaTelaAOcupar),
			(int)(tamanhoDaTela.height*porcentagemDaTelaAOcupar)
		);
		frame.setResizable(true);
		frame.setVisible(true);

		//LAYOUTS


		jp_total = new JPanel (new BorderLayout());

		//INSTANCIANDO
		jl_titulo = new JLabel ("TRABALHO DE HISTORIA");


	
		ta_loucura = new JTextArea ("");
		jb_salvar = new JButton("SALVAR");
		jb_sair = new JButton();


		//CONFIGURACOES

		jb_sair.setPreferredSize(new Dimension(2, 2));
		jb_sair.setBorderPainted(false);
		
		ta_loucura.setWrapStyleWord(true);
		ta_loucura.setFont(new Font("Dialog", Font.BOLD, 16));
		jl_titulo.setFont(new Font("Dialog", Font.BOLD, 26));
		ta_loucura.setLineWrap(true);
		
		
		//CORES
		
		ta_loucura.setBackground(Color.WHITE);
		jp_total.setBackground(Color.WHITE);
		jl_titulo.setForeground(Color.BLUE);
		jl_titulo.setBackground(Color.WHITE);
		
		//SET TEXT

		ta_loucura.setText("\t Dinossauros ou Dinossaurios constituem um grupo de diversos animais membros do clado Dinosauria.Acredita-se que apareceram ha pelo menos 230 milhoes de anos, e que, durante 135 milhoes de anos, foram a especie dominantena Terra, num periodo geologico de tempo que vai desde o periodo Triassico ate o final do periodo Cretaceo, ha cerca de 65 milhoes de anos,quando um evento catastrofico ocasionou a extincao em massa de quase todos os dinossauros, com excecao das especies emplumadas. A teoria mais aceitae de que o meteorito  encontrado na Cratera de Chicxulub, no Mexico, foi o responsavel pela extincao, ao colidir com a Terra e originar uma grandeexplosao que carbonizou bilhoes de animais instantaneamente, levantando tambem uma nuvem de poeira tao espessa que bloqueou o calor do sol e transformouo planeta em um local extremamente frio, em um evento meteorologico similar ao inverno nuclear, eliminando as especies sobreviventes,com excecao dos dinossauros emplumados e dos seres mamiferos, que tinham a capacidade de sobreviver em climas de baixas temperaturas devido aseu sangue quente, podendo assim se adaptar ao novo ambiente.O registro fossil indica que os dinossauros emplumados evoluiram dos teropodasdurante o periodo jurassico, e, apos o evento da extincao em massa, deram origem as aves modernas, e os mamiferos sobreviventes evoluiram ate darorigem ao ser humano atual.Usando evidencias fosseis, os paleontologos identificaram mais de quinhentos diferentes generos e mais de mildiferentes especies de dinossauros, alguns sendo herbivoros, outros carnivoros, assim como havia tambem especies bipedes e quadrupedes.Muitas especies possuiam estruturas como chifres ou cristas (Triceratopo), e alguns grupos chegarem a desenvolver modificacoes esqueleticas,como armaduras osseas (Anquilossauro) e espinhas (Espinossauro). Estes animais variavam muito em tamanho e peso, com dinossauros teropodesadultos medindo menos de cinquenta centimetros (Compsognato), enquanto as maiores sauropodes podiam chegar a uma altura de cerca de vinte metros(Argentinossauro).Embora a palavra dinossauro signifique Lagardo, esses animais nao eram lagartos, e sim repteis, com uma postura ereta distintanao encontrada em lagartos. Durante a primeira metade do seculo 20, a maior parte da comunidade cientifica acreditava que os dinossauroseram lentos e sem inteligencia, no entanto, a maioria das pesquisas realizadas desde a decada de 70 indicaram que estes animais eram ageis,com elevado metabolismo e com numerosas adaptacoes para a interacao social, com certos grupos, principalmente os teropodes, sendoconsiderados os animais mais inteligentes de todos os tempos. O primeiro dinossauro a ser descrito foi o Megalossauro em um trabalho publicado por William Buckland em 1824, apesar de que o naturalista Gideon Mantell ja havia descoberto em 1822 o fossil de um Iguanodonte,mas somente publicou a descricao em 1825.");

		//ADDS

		frame.add(jp_total);
		frame.add(jl_titulo,BorderLayout.NORTH);
		jp_total.add(jb_salvar,BorderLayout.SOUTH);
		jp_total.add(jb_sair,BorderLayout.EAST);
		jp_total.add(ta_loucura,BorderLayout.CENTER);
		jl_titulo.setHorizontalAlignment(SwingConstants.CENTER);


		jb_salvar.addActionListener(this);


		
	}
	
	

	public void actionPerformed(ActionEvent e){
		if (e.getSource()== jb_salvar){
			try {
				arquivo = new FileWriter(new File("Arquivo.txt"));

				arquivo.write(ta_loucura.getText());
				arquivo.close();
			} catch (IOException k) {
				k.printStackTrace();
			} catch (Exception k) {
				k.printStackTrace();
			}
		if (e.getSource()== jb_sair){
			new Menu();
			frame.dispose();
		}
		}

	}
	public static void main(String[] args) {

	new Panico();

	}

}
