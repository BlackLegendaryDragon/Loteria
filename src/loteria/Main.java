package loteria;

import javax.swing.*;

public class Main extends JFrame
    {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        new Main();
    }

    public Main()
    {
        Game game = new Game();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Loteria");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        add(game);
    }
}
