import javax.swing.*;

public class Chess {
    //assign colors a number
    public static final int BLACK = 0;
    public static final int WHITE = 1;
    public static Piece[][] position = new Piece[8][8];
    //make a function to decide colors
    //take in coordinates
    public static int getSquareColor(int x, int y) {
        if (x % 2 == 0) {
            // had to learn about conditional operator "?"
            // if true then true : false
            return y % 2 == 0 ? BLACK : WHITE;
        } else {
            return y % 2 == 0 ? WHITE : BLACK;
        }
    }
}
