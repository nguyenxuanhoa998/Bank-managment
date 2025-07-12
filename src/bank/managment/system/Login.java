package bank.managment.system;

import javax.swing.*;

public class Login extends JFrame {
    
    Login(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource())
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(800, 400);
        setVisible(true);
        setLocation(400, 200);
    }
    public static void main (String [] args ){
        new Login();
    }
}
