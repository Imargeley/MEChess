import javax.swing.*;
import java.awt.*;
public class Pawn extends Piece{
    public Pawn(boolean isW){
        if(isW){
            icon = new ImageIcon("wpawn.gif");
        }
        else{
            icon = new ImageIcon("bpawn.gif");
        }
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy) {
        return false;
    }
}

