import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static javax.swing.BorderFactory.*;

public class Labels {
    public static void main(String[] args) {
        //JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon userImage = new ImageIcon("user.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Test label");
        label.setIcon(userImage);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT, CENTER or RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP);//set TOP, CENTER, BOTTOM of image icon
        label.setForeground(new Color(12, 67, 98));//set color of text
        label.setFont(new Font("MV Boli", Font.BOLD, 34));//set font of text
        label.setIconTextGap(-25);//set gap of text to image
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalTextPosition(JLabel.CENTER);
//        label.setBounds(100, 0, 350, 350);//set x,y position within frame as well as dimensions



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 750);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}
