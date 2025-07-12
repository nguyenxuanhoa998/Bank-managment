package bank.managment.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    
    Login(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/thumbnail-logo-BIDV.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new JLabel(i2);
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(800, 400);
        setVisible(true);
        setLocation(400, 200);
    }
    public static void main (String [] args ){
        new Login();
    }
}
