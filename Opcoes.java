import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;





public class Opcoes extends JFrame implements ActionListener {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total,jp_save,jp_quadrantes,jp_daltonismo,jp_volume,jp_volslider,jp_nome;
	private JLabel jl_daltonismo,jl_volume,jl_volslider,jl_nome,jl_opcoes,jl_status;
	private JTextField tf_nome;
	private JSlider slider;
	private JRadioButton radon_dal,radoff_dal,radon_vol,radoff_vol;
	private ButtonGroup group_dalt,group_vol;
	private JButton Botao,Bot_save,Bot_cancel;

	JFrame frame = new JFrame("Opcoes");
	
	
	//MTD. CONSTRUTOR;
	public Opcoes(){
		
		super("Tela de Opcoes");
		
		
		//Setando configs da janela
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 
		frame.setLocation(100,100);
		frame.setSize(450,250);
		frame.setResizable(false); 
		frame.setVisible(true);
		
	
		//LAYOUTS
		
		jp_total = new JPanel (new BorderLayout());
		jp_quadrantes = new JPanel(new GridLayout(2,2,3,3));
		jp_daltonismo = new JPanel(new GridLayout(3,1));
		jp_volume = new JPanel(new GridLayout(3,1));
		jp_volslider = new JPanel(new FlowLayout());
		jp_nome = new JPanel (new GridLayout(3,1));
		jp_save = new JPanel (new GridLayout(1,2));
		
		
		
		
		
		//PANEL NORTH AND SOUTH
		
		jl_opcoes = new JLabel("OPCOES DO JOGO");
		jl_opcoes.setHorizontalAlignment(SwingConstants.CENTER);
		Bot_cancel = new JButton("CANCELAR");
		Bot_save = new JButton("SALVAR E SAIR");
		Bot_cancel.addActionListener(this);
		
		
		
		//NOME
		
		Botao = new JButton();
		Botao.setText("ALTERAR NOME");
		jl_nome = new JLabel("NOME DO JOGADOR : ");
		jl_nome.setHorizontalAlignment(SwingConstants.CENTER); 
		tf_nome = new JTextField("");
		jp_nome.add(jl_nome);
		jp_nome.add(tf_nome);
		jp_nome.add(Botao);
		Botao.addActionListener(this);
		
		
		
		
		//DALTONISMO
	
		jl_daltonismo = new JLabel(" MODO DALTONICO: ");
   		radon_dal = new JRadioButton("LIGADO");
        radoff_dal = new JRadioButton("DESLIGADO", true);

		
		group_dalt = new ButtonGroup();
		group_dalt.add(radon_dal);
		group_dalt.add(radoff_dal);
	
		jp_daltonismo.add(jl_daltonismo);
		jp_daltonismo.add(radon_dal);
		jp_daltonismo.add(radoff_dal);
		
		
		jl_daltonismo.setHorizontalAlignment(SwingConstants.CENTER);
		radon_dal.setHorizontalAlignment(SwingConstants.CENTER);
		radoff_dal.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		//VOLUME
		
		jl_volume = new JLabel(" SOM DO JOGO : ");
		radon_vol = new JRadioButton("LIGADO", true);
        radoff_vol = new JRadioButton("DESLIGADO");

		
		group_vol = new ButtonGroup();
		group_vol.add(radon_vol);
		group_vol.add(radoff_vol);
		jp_volume.add(jl_volume);
		jp_volume.add(radon_vol);
		jp_volume.add(radoff_vol);
		
		radon_vol.addActionListener(this);
		radoff_vol.addActionListener(this);
		
		
		jl_volume.setHorizontalAlignment(SwingConstants.CENTER);
		radon_vol.setHorizontalAlignment(SwingConstants.CENTER);
		radoff_vol.setHorizontalAlignment(SwingConstants.CENTER);
   
	
		//SLIDER
		
		jl_status = new JLabel("Volume : 50",JLabel.CENTER);
		jl_volslider = new JLabel("VOLUME : ");
		slider = new JSlider(JSlider.HORIZONTAL,0,100,50);
		jp_volslider.add(jl_volslider);
		jp_volslider.add(slider);
		jp_volslider.add(jl_status);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			jl_status.setText("Volume : " 
			+ ((JSlider)e.getSource()).getValue());
			}
		});
		
		
		
		
		//ADDS
		
		frame.add(jp_total);
		jp_total.add(jp_quadrantes,BorderLayout.CENTER);
		jp_total.add(jl_opcoes,BorderLayout.NORTH);
		jp_total.add(jp_save,BorderLayout.SOUTH);
		jp_quadrantes.add(jp_nome);
		jp_quadrantes.add(jp_daltonismo);
		jp_quadrantes.add(jp_volume);
		jp_quadrantes.add(jp_volslider);
		jp_save.add(Bot_save);
		jp_save.add(Bot_cancel);
		
	}
	
	public void actionPerformed(ActionEvent e){
	
	if (e.getSource()== Bot_cancel){
		frame.dispose();
		Menu menu = new Menu ();
	}if (e.getSource()== Botao){
		jl_nome.setText("NOME DO JOGADOR : " + tf_nome.getText());
	}if (e.getSource()== radon_vol){
		jp_volslider.setVisible(true);
	}if (e.getSource()== radoff_vol){
		jp_volslider.setVisible(false);
	}
	
	}
}	
