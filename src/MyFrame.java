import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setVisible(true); // Allow frame to be shown
        this.setSize(700, 400); // Set dimensions
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame will close when pressing close on Jframe
        // this.setResizable(false); // Don't allow Jframe to be resized
        this.setTitle("Custom Jframe Title"); // Set the title of the Jframe
        // Create a new image
        ImageIcon img = new ImageIcon("C:\\Pictures\\hkLogo.png");
        this.setIconImage(img.getImage()); // Set the icon image of the Jframe
        this.getContentPane().setBackground(new Color(100, 100, 100)); // Set Jframe background color
    }
}
