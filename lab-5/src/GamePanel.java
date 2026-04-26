import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 900;
    private GameBoard gameBoard;


    public GamePanel() {
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        gameBoard = new GameBoard();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 36));

        g.setColor(Color.BLACK);
        String title = "2048";
        g.drawString(title, (SCREEN_WIDTH / 2) - 40, 40);

        g.setColor(Color.BLACK);
        int cellWidth = 200;
        int cellHeight = 200;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = j * cellWidth;
                int y = i * cellHeight + 50;
                drawBoard(g, x, y, gameBoard.board[i][j]);
            }
        }
    }

    public void drawBoard(Graphics g, int coordinateX, int coordinateY, Tile tile) {
        if (tile != null) {
            g.setColor(tile.getColor());
            g.setFont(new Font("Arial", Font.BOLD, 36));

            g.setColor(tile.getColor());
            g.fillRect(coordinateX, coordinateY, 200, 200);

            String title = String.format("%d", tile.getValue());
            g.setColor(Color.BLACK);
            g.drawString(title, coordinateX + 100, coordinateY + 100);

        } else {
            g.setColor(Color.WHITE);
            g.drawRect(coordinateX, coordinateY, 200, 200);
        }


    }
}