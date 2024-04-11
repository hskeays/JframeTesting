import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button;

    MyFrame() {
        this.setLayout(null); // Make layout manager layout manager to null

        this.setVisible(true); // Allow frame to be shown
        this.setSize(700, 400); // Set dimensions
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame will close when pressing close on Jframe
        // this.setResizable(false); // Don't allow Jframe to be resized
        this.setTitle("Custom Jframe Title"); // Set the title of the Jframe

        ImageIcon img = new ImageIcon("C:\\Pictures\\hkLogo.png"); // Instantiate a new image
        this.setIconImage(img.getImage()); // Set the icon image of the Jframe
        this.getContentPane().setBackground(new Color(100, 100, 100)); // Set Jframe background color

        JLabel label = new JLabel(); // Instantiate new label
        label.setVisible(false);
        label.setText("Hello World!"); // Add text to label
        label.setIcon(img); // Add image to label
        label.setForeground(new Color(175, 175, 175)); // Set text color
        label.setBackground(new Color(30, 30, 30)); // Set background color
        label.setOpaque(true); // Display background color
        label.setFont(new Font("Calibri", Font.PLAIN, 20)); // Set font and attributes
        label.setIconTextGap(5); // Set gap between text and icon
        label.setHorizontalAlignment(JLabel.CENTER); // Set component alignment
        label.setVerticalAlignment(JLabel.CENTER); // Set component alignment
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text alignment
        label.setVerticalTextPosition(JLabel.TOP); // Set text alignment
        label.setBounds(0, 0, 150, 100);

        button = new JButton(); // Instantiate new button
        button.setBounds(280, 150, 150, 40); // Position button
        button.addActionListener(e -> label.setVisible(true)); // Add event listener to button
        button.setText("Say hello"); // Add text to button
        button.setFocusable(false); // Turn off border focusable around text
        button.setIcon(img); // Add image to button
        button.setForeground(new Color(40, 0, 0)); // Set text color
        button.setFont(new Font("Calibri", Font.PLAIN, 15)); // Set font for button
        button.setBackground(new Color(151, 159, 120, 255)); // Set button background color
        button.setVerticalTextPosition(JButton.CENTER); // Position text in button
        button.setHorizontalTextPosition(JButton.LEFT); // Position text in button
        button.setBorder(BorderFactory.createBevelBorder(1));

        this.add(button); // Add button to the frame
        this.add(label); // Add label to the frame

        this.revalidate(); // Lays out the components again within label
        this.repaint(); // Refreshes the appearance
    }
}
