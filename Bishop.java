import javax.swing.*;
import java.awt.*;
public class Bishop extends Piece{
    public Bishop(boolean isW){
        if(isW){
            icon = new ImageIcon("wbishop.gif");
        }
        else{
            icon = new ImageIcon("bbishop.gif");
        }
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy) {
        return false;
    }
}
