import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaNomeUsuario extends JFrame implements ActionListener{
  private static final long serialVersionUID = 1L;

  private JButton botaoEnviar = new JButton("Enviar");
  private JTextField campoNome = new JTextField(20);
  private JLabel labelCampoNome = new JLabel("Nome:");

  public TelaNomeUsuario (){
    super("Genius - Login");
    this.setSize(400,100);
    this.setLocation(100,100);
    this.setVisible(true);
    this.setLayout(new FlowLayout());
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);

    this.add(labelCampoNome);
    this.add(campoNome);
    this.add(botaoEnviar);

    botaoEnviar.addActionListener(this);

	this.getRootPane().setDefaultButton(botaoEnviar);

  }

  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == botaoEnviar){
      Configuracoes.nomeUsuario = campoNome.getText();
      if( Configuracoes.nomeUsuario != null && !Configuracoes.nomeUsuario.isEmpty() ){
        new Menu();
        this.dispose();
      }else{
        JOptionPane.showMessageDialog(null,"Digite um nome de usuario");
      }
    }
  }


}
