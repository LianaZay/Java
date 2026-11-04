package org.example;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.Objects;

public class New extends JPanel implements MouseMotionListener {

    Image daimage = new ImageIcon(Objects.requireNonNull(New.class.getResource("/playerShip.png"))).getImage();
    Image daimage2 = new ImageIcon(Objects.requireNonNull(New.class.getResource("/Astr.png"))).getImage();
    Image daimage3 = new ImageIcon(Objects.requireNonNull(New.class.getResource("/pozadi.png"))).getImage();
    Rectangle enama = new Rectangle(500, -60, 100, 100);
    Rectangle plr = new Rectangle(130, 130, 40*2, 40*2);
    int HP = 1000;

    public New(){
        setBackground(new Color(17, 0, 124));
        addMouseMotionListener(this);

        new Timer (10, e ->{
            System.out.println(plr.getBounds().intersects(enama.getBounds()));

            if(plr.getBounds().intersects(enama.getBounds())){
                HP--;
                System.out.println(HP);
            }
            repaint();

    }).start();
    }


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(daimage3,0 ,0, null);
        g.drawImage(daimage, plr.x, plr.y, plr.width, plr.height, null);
        g.drawImage(daimage2, enama.x, enama.y, enama.width, enama.height, null);
        g.setColor(Color.BLUE);
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/70BOLD.ttf")).deriveFont(40f);
        } catch (FontFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.setFont(font);
        g.drawString("HP:" + HP, 40, 60 );
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        plr.x = e.getX() - plr.width / 2;
        plr.y = e.getY() - plr.height / 2;

    }
}
