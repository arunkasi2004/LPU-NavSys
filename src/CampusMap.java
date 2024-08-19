import javax.swing.*;
import java.awt.*;

public class CampusMap extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // GROUND
        g.setColor(Color.GREEN);
        g.fillRect(1, 1, 700, 80);
        g.setColor(Color.BLACK);
        g.drawString("GROUND", 290, 40);

        // HOSTEL
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(900, 1, 440, 80);
        g.setColor(Color.BLACK);
        g.drawString("HOSTEL", 1100, 45);

        // ENROLLMENT OFFICE
        g.setColor(new Color(139, 69, 19));  // BROWN
        g.fillRect(1, 500, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("ENROLLMENT", 2, 550);
        g.drawString("OFFICE", 2, 570);

        // BARONS
        g.setColor(Color.MAGENTA);
        g.fillRect(1, 140, 100, 30);
        g.setColor(Color.BLACK);
        g.drawString("BARONS", 20, 160);

        // MAC
        g.setColor(Color.YELLOW);
        g.fillRect(1, 200, 100, 200);
        g.setColor(Color.BLACK);
        g.drawString("MAC", 35, 310);

        // Library
        g.setColor(Color.CYAN);
        g.fillRect(200, 140, 150, 160);
        g.setColor(Color.BLACK);
        g.drawString("Library", 240, 240);

        // IT Block
        g.setColor(Color.CYAN);
        g.fillRect(450, 140, 100, 80);
        g.setColor(Color.BLACK);
        g.drawString("IT BLOCK", 460, 170);

        // DESIGN-BLOCK
        g.setColor(Color.MAGENTA);
        g.fillRect(600, 140, 100, 80);
        g.setColor(Color.BLACK);
        g.drawString("DESIGN-BLOCK", 605, 170);

        // SCIENCE BLOCK
        g.setColor(Color.ORANGE);
        g.fillRect(200, 320, 150, 160);
        g.setColor(Color.BLACK);
        g.drawString("SCIENCE BLOCK", 230, 400);

        // ADMINISTRATION BUILDING
        g.setColor(new Color(165, 42, 42));  // REDDISH BROWN
        g.fillRect(450, 320, 100, 160);
        g.setColor(Color.BLACK);
        g.drawString("ADMINISTRATION", 455, 400);
        g.drawString("BUILDING", 475, 420);

        // CAFETERIA
        g.setColor(Color.PINK);
        g.fillRect(600, 320, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("CAFETERIA", 620, 370);

        // SPORTS COMPLEX
        g.setColor(Color.BLUE);
        g.fillRect(800, 140, 200, 80);
        g.setColor(Color.BLACK);
        g.drawString("SPORTS COMPLEX", 850, 170);

        // AUDITORIUM
        g.setColor(Color.DARK_GRAY);
        g.fillRect(800, 320, 200, 160);
        g.setColor(Color.BLACK);
        g.drawString("AUDITORIUM", 850, 400);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1370, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CampusMap());
        frame.setVisible(true);
    }
}
