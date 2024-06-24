import javax.swing.*;
import java.awt.*;
public class Knight extends Piece{
    public Knight(boolean isW){
        if(isW){
            icon = new ImageIcon("wknight.gif");
        }
        else{
            icon = new ImageIcon("bknight.gif");
        }
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy) {
        return false;
    }
}
