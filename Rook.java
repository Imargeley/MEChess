import javax.swing.*;
import java.awt.*;
public class Rook extends Piece{
    public Rook(boolean isW){
        if(isW){
            icon = new ImageIcon("wrook.gif");
        }
        else{
            icon = new ImageIcon("brook.gif");
        }
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy) {
        return false;
    }
}