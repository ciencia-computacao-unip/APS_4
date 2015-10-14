import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TelaNomeUsuario extends JFrame implements ActionListener{
  private static final long serialVersionUID = 1L;

  public TelaNomeUsuario (){
    super("Genius - Login");
    this.setSize(400,100);
    this.setVisible(true);
    this.setLayout(new FlowLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JButton enviar = new JButton("Enviar");
    JTextField campoNome = new JTextField(20);
    JLabel labelCampoNome = new JLabel("Nome:");

    this.add(labelCampoNome);
    this.add(campoNome);
    this.add(enviar);

    enviar.addActionListener(this);

  }

  public void actionPerformed(ActionEvent evento){
      System.out.print("oi!");
  }


}
