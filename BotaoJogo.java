import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;


public class BotaoJogo extends JButton{
  Color[] cores = {
    Color.BLUE,
    Color.RED,
    Color.YELLOW,
    Color.GREEN
  };
  Color[] coresDaltonico = {
    Color.BLACK,
    Color.CYAN,
    Color.MAGENTA,
    Color.WHITE
  };

   //numeroBotao deve ser de 1 a 4
  public BotaoJogo(int numeroBotao, boolean modoDaltonico){
    super();
    Color cor;
    if(!modoDaltonico){
      cor = cores[numeroBotao-1];
	  this.setBorder(new LineBorder(cor, 10));
    }else{
      cor = coresDaltonico[numeroBotao-1];
	  this.setBorder(new LineBorder(cor, 10));
    }
    this.setBackground(cor);
    
  }

}
