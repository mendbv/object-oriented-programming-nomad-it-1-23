import javax.swing.*;

public class game extends JFrame {

    private GamePanel contentPane;

    public void Main(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args){
        System.out.println("HEllo World");
    }
}
