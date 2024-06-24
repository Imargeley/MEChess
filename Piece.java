import javax.swing.*;
import java.awt.*;

public abstract class Piece{
    private final int isW;
    ImageIcon icon;
    public Piece() {
        this.isW = Chess.WHITE;
    }
    void draw(Graphics g, int x, int y){
        g.drawImage(icon.getImage(), x * 50, y * 50, null);
    }

    public abstract boolean canMove(int startx, int starty, int endx, int endy);
}
