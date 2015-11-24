import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MenuMouseAdapter extends MouseAdapter {

    public void mouseClicked(MouseEvent event) {
        System.out.println(event.getComponent());
    }

    public static void main(String args[]){
    }

}
