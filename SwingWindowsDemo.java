import javax.swing.*;
import java.awt.*;
public class file{

JFrame selectionFrame;
JLabel statusLabel;
public static void main(String[] args) {
    new file().showSelectionFrame();
}
    void showSelectionFrame() {
        selectionFrame = new JFrame("Welcome Princess");
        selectionFrame.setSize(500, 200);
        selectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectionFrame.setLayout(new FlowLayout());

        JButton refButton = new JButton("Click me");
        JButton inputButton = new JButton ("Thanks for clicking me");

        selectionFrame.add(refButton);
        selectionFrame.add(inputButton);

        refButton.addActionListener(e -> ReferenceFile());

        selectionFrame.setVisible(true);
}


        void ReferenceFile(){

        selectionFrame.dispose();

        JFrame resultFrame = new JFrame("");
        resultFrame.setSize(500, 300);
        resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        resultFrame.setLayout(new BorderLayout());

        JLabel messageLabel = new JLabel(
        "Hello Yogita 🎉😊",
        SwingConstants.CENTER
    );

    messageLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));

    resultFrame.add(messageLabel, BorderLayout.CENTER);
    resultFrame.setVisible(true);
}

        }
