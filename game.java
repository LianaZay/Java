package org.example;

import javax.swing.*;

public class game extends JFrame {
    public game() {
        setTitle("Hr");
        setSize(1210, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setVisible(true);

        New n = new New();
        add(n);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(game::new);
    }
}
