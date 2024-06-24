import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoardMouseListener implements MouseListener {

    public BoardMouseListener(BoardComponent board) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int boardX = convertPixelToBoard(x);
        int boardY = convertPixelToBoard(y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private int convertPixelToBoard(int pixel) {
        return pixel / 50;
    }
}
