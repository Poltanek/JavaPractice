import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingPractice {
    private JPanel MainWindow;
    private JTextField textField; 
    private JButton clickButton;

    // Constructor
    public SwingPractice() {

        MainWindow = new JPanel();
        textField = new JTextField(10);
        clickButton = new JButton("Click Me");

        MainWindow.add(textField);
        MainWindow.add(clickButton);

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText(textField.getText().toUpperCase());
            }
        });
    }

    // Main method to create and display the GUI
    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SwingPractice swingPractice = new SwingPractice();
        frame.setContentPane(swingPractice.MainWindow);

        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
