import javax.swing.*;
import java.awt.*;
public class Queen extends Piece{
    public Queen(boolean isW){
        if(isW){
            icon = new ImageIcon("wqueen.gif");
        }
        else{
            icon = new ImageIcon("bqueen.gif");
        }
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy) {
        return false;
    }
}
