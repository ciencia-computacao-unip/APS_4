import javax.swing.JFrame;
import java.awt.GridLayout;

public class TelaNomeUsuario extends JFrame{
  private static final long serialVersionUID = 1L;

  public TelaNomeUsuario (){
    super("Genius - Login");
    this.setSize(400,100);
    this.setVisible(true);
    this.setLayout(new GridLayout(2,1));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
