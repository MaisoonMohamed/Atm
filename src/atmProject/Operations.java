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

/**
 *
 * @author 2B
 */
public class Operations extends JFrame {

    String input = "0";
    JButton dep = new JButton("Deposit");
    JButton bal = new JButton("CurrentBalance");
    JButton wit = new JButton("Withdraw");
    JButton prev = new JButton("Previous");
    JButton next = new JButton("Next");
    JLabel label = new JLabel("");

    public Operations(MyAcc a) {
        Atm3 m = new Atm3(a);
        setLayout(null);
        add(dep);
        dep.setBounds(50, 50, 200, 30);
        add(bal);
        bal.setBounds(50,100, 200, 30);
        add(label);
        label.setBounds(300,100,200, 30);
        add(wit);
        wit.setBounds(50, 150, 200, 30);
        add(prev);
        prev.setBounds(50, 200, 200, 30);
        add(next);
        next.setBounds(50, 250, 200, 30);

        bal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(m.getCurrentBalance());
            }
        });

        dep.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Value v = new Value(m);
                v.setVisible(true);
                v.setSize(500, 600);
            }
        });

        wit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                GWith g=new GWith(m);
                g.setVisible(true);
                g.setSize(500, 600);
            }
        });

        prev.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 label.setText(m.previous());
            }
        });
        next.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 label.setText(m.next());
            }
        });
    }
}
