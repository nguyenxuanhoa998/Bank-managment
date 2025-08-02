package bank.managment.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login() {
        // Đặt tiêu đề và thông số khởi đầu
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(800, 400);
        setLocation(400, 200);
        setLayout(null); // Rất quan trọng khi dùng setBounds
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load hình ảnh từ thư mục package-
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("package-icons/thumbnail-logo-BIDV.jpg"));

        // Kiểm tra ảnh có load được không
        if (i1.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.out.println("❌ Không tìm thấy hoặc không load được ảnh. =)))");
        }

        // Scale và đặt vào
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(20, 20, 100, 100);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
