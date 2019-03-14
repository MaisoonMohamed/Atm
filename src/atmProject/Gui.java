/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui extends JFrame {

    JButton btn = new JButton("login");
    JLabel label = new JLabel("cardNumber");
    JTextField txt = new JTextField(50);
    MyAcc m = new MyAcc(0, "12345", 10, "");

    public Gui() {
        setLayout(null);
        add(label);
        label.setBounds(50, 50, 100, 30);
        add(txt);
        txt.setBounds(160, 50, 100, 30);
        add(btn);
        btn.setBounds(160, 100, 100, 30);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().equals(m.getCardNumber())) {
                    Operations p = new Operations(m);
                    p.setVisible(true);
                    p.setSize(500, 600);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "error please try again");

                }

            }
        });
    }
}
