import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("C:\\Pictures\\hkLogo.png");
        MyFrame frame = new MyFrame();
        JLabel label = new JLabel();

        label.setText("Hello World!"); // Add text to label
        label.setIcon(img); // Add image to label
        label.setForeground(new Color(175, 175, 175)); // Set text color
        label.setBackground(new Color(30, 30, 30)); // Set background color
        label.setOpaque(true); // Display background color
        label.setFont(new Font("Calibri", Font.PLAIN, 20)); // Set font and attributes
        label.setIconTextGap(5); // Set gap between text and icon

        // Set component alignment
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        // Set text alignment
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        frame.add(label); // Add label to the frame

        frame.revalidate(); // Lays out the components again within label
        frame.repaint(); // Refreshes the appearance
    }
}