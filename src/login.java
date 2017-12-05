import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JButton existButton;

    public static JFrame loginFR = new JFrame ("Login Screen");

    public login() {
        existButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"still not complete");
            }
        });
    }

    public static void main(String[] args)
    {
        loginFR.setContentPane(new login().panel1);
        loginFR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFR.pack();
        loginFR.setVisible(true);
    }
}
