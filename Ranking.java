import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ranking extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static final String USUARIO = "aps4";
	private static final String SENHA = "Af8z7!U_HVAc";
	private static final String DATABASE = "aps4";
	private static final String DRIVER_CONEXAO = "com.mysql.jdbc.Driver";
	private static final String STR_CONEXAO = "";
	private JButton voltar;
	private JPanel modo1, modo2, modo3;
	private JTabbedPane modos;

	public Ranking(){

		super("GENIUS - Ranking");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(220,400);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new BorderLayout());

		modos = new JTabbedPane ();
		voltar = new JButton ("Voltar");

		createModo1();
		createModo2();
		createModo3();

		modos.addTab("Modo 1", modo1);
		modos.addTab("Modo 2", modo2);
		modos.addTab("Modo 3", modo3);

		this.add(voltar, BorderLayout.SOUTH);
		this.add(modos, BorderLayout.CENTER);

		voltar.addActionListener(this);
		}

		public void createModo1()
		{
			JTable tabela1 = new JTable();
			modo1 = new JPanel ();
			modo1.setLayout(null);
			modo1.add(tabela1);
		}
		public void createModo2()
		{
			JTable tabela2 = new JTable();
			modo2 = new JPanel ();
			modo2.setLayout(null);
			modo2.add(tabela2);
		}
		public void createModo3()
		{
			JTable tabela3 = new JTable();
			modo3 = new JPanel ();
			modo3.setLayout(null);
			modo3.add(tabela3);

		}
		public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == voltar){
		  new Menu();
		  this.dispose();
		}
	}
}
