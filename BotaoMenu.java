import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;


public class BotaoMenu extends JButton{

  public BotaoMenu(String textoBotao){
    super(textoBotao);
    this.setPreferredSize( new Dimension(200, 80) );
  }

}
