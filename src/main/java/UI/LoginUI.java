package UI;

import javax.swing.*;

public class LoginUI {
    public static void main(String[] args) {
        new LoginUI();
    }
    public LoginUI(){
        JFrame frame = new JFrame();
        JLabel usernameLbl=new JLabel("Enter Username : ");
        usernameLbl.setBounds(120,130,150,20);

        JLabel passwordLbl=new JLabel("Enter Password : ");
        passwordLbl.setBounds(120,180,150,20);

        JTextField usernameTf = new JTextField();
        usernameTf.setBounds(250,130,150,20);

        JTextField passwordTf = new JTextField();
        passwordTf.setBounds(250,180,150,20);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(200,210,100,20);

        loginBtn.addActionListener(e ->{

            if(usernameTf.getText().equalsIgnoreCase("admin")&&passwordTf.getText().equalsIgnoreCase("admin")){
                JOptionPane.showMessageDialog(frame,"sami successful");
                frame.dispose();
            }
            usernameTf.setText("");
            passwordTf.setText("");
        });
        frame.add(usernameLbl);
        frame.add(usernameTf);
        frame.add(passwordLbl);
        frame.add(passwordTf);
        frame.add(loginBtn);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
