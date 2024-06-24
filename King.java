import javax.swing.*;
import java.awt.*;
public class King extends Piece{
    public King(boolean isW){
        if(isW){
            icon = new ImageIcon("wking.gif");
        }
        else{
            icon = new ImageIcon("bking.gif");
        }
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy) {
        return false;
    }
}
