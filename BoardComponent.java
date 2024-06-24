import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class BoardComponent extends JComponent {
    public static int SQUARE_SIZE = 50;
    public BoardComponent() {
        MouseListener listener = new BoardMouseListener(this);
        this.addMouseListener(listener);
    }
    public void paintComponent(Graphics g) {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                //color based on coordinates
                int color = Chess.getSquareColor(x, y);
                //color based on color based on boolean
                Color tileColor = color == Chess.BLACK ? new Color(233, 174, 95) : new Color(177, 113, 24);
                g.setColor(tileColor);
                //Space out the squares
                g.fillRect(x * SQUARE_SIZE, y * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }
        }
        for(int x = 0; x < 8; x = x+1){
            for(int y = 0; y < 8; y = y + 1){
                if(Chess.position[x][y]!= null){
                    Chess.position[x][y].draw(g,x,y);
                }
            }
        }
    }
    //file getting called
    //defining the window
    public void main(String[] args) {
        Chess.position[4][7] = new King(true);
        Chess.position[3][7] = new Queen(true);
        Chess.position[2][7] = new Bishop(true);
        Chess.position[5][7] = new Bishop(true);
        Chess.position[1][7] = new Knight(true);
        Chess.position[6][7] = new Knight(true);
        Chess.position[0][7] = new Rook(true);
        Chess.position[7][7] = new Rook(true);
        for(int i=0;i<8; i=i+1){
            Chess.position[i][6] = new Pawn(true);
        }
        Chess.position[4][0] = new King(false);
        Chess.position[3][0] = new Queen(false);
        Chess.position[2][0] = new Bishop(false);
        Chess.position[5][0] = new Bishop(false);
        Chess.position[1][0] = new Knight(false);
        Chess.position[6][0] = new Knight(false);
        Chess.position[0][0] = new Rook(false);
        Chess.position[7][0] = new Rook(false);
        for(int i=0;i<8; i=i+1){
            Chess.position[i][1] = new Pawn(false);
        }
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Chessboard");
        frame.setSize(8 * SQUARE_SIZE + 12, 8 * SQUARE_SIZE + 37);
        BoardComponent board = new BoardComponent();
        frame.add(board);
        frame.setVisible(true);
    }


}