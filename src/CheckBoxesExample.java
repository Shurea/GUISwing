import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxesExample extends JFrame implements ActionListener {

    private JButton button;
    private JCheckBox checkBox;
    private ImageIcon icon;
    private ImageIcon iconSelected;

    public CheckBoxesExample(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        icon = new ImageIcon("user.png");
        iconSelected = new ImageIcon("electric-meter.png");

        button = new JButton("submit");
        button.addActionListener(this);


        checkBox = new JCheckBox();
        checkBox.setText("Idk this is a test");
        checkBox.setFont(new Font("Consolas", Font.BOLD, 30));
        checkBox.setFocusable(false);
        checkBox.setIcon(icon);
        checkBox.setSelectedIcon(iconSelected);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
