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
import javax.swing.JTextField;

/**
 *
 * @author 2B
 */
public class GWith  extends JFrame{
     MyAcc cl = new MyAcc(1000, "12345", 10, "");
    JButton b9 = new JButton("9");
    JButton b8 = new JButton("8");
    JButton b7 = new JButton("7");
    JButton b6 = new JButton("6");
    JButton b5 = new JButton("5");
    JButton b4 = new JButton("4");
    JButton b3 = new JButton("3");
    JButton b2 = new JButton("2");
    JButton b1 = new JButton("1");
    JButton b0 = new JButton("0");
    JTextField b = new JTextField();
    JLabel j = new JLabel("Enter the amount:");
    JButton dot = new JButton(".");
   JButton d=new JButton("Add Withdraw");

    public GWith(Atm3 ma) {
        
        Atm3 m = ma;
        setLayout(null);
        add(b0);
        b0.setBounds(300, 150, 50, 50);
        add(b1);
        b1.setBounds(350, 150, 50, 50);
        add(b2);
        b2.setBounds(400, 150, 50, 50);
        add(b3);
        b3.setBounds(300, 200, 50, 50);
        add(b4);
        b4.setBounds(350, 200, 50, 50);
        add(b5);
        b5.setBounds(400, 200, 50, 50);
        add(b6);
        b6.setBounds(300, 250, 50, 50);
        add(b7);
        b7.setBounds(350, 250, 50, 50);
        add(b8);
        b8.setBounds(400, 250, 50, 50);
        add(b9);
        b9.setBounds(400, 300, 50, 50);
        add(b);
        b.setBounds(250, 300, 100, 50);
        add(j);
        j.setBounds(5, 300, 300, 50);
        add(dot);
        dot.setBounds(350, 300, 50, 50);
        add(d);
       d.setBounds(350, 350, 100, 50);

     b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b0.getText();
                b.setText(enterNum);
            }
        });
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b1.getText();
                b.setText(enterNum);
            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b2.getText();
                b.setText(enterNum);
            }
        });
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b3.getText();
                b.setText(enterNum);
            }
        });
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b4.getText();
                b.setText(enterNum);
            }
        });
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b5.getText();
                b.setText(enterNum);
            }
        });
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b6.getText();
                b.setText(enterNum);
            }
        });
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b7.getText();
                b.setText(enterNum);
            }
        });
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b8.getText();
                b.setText(enterNum);
            }
        });
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + b9.getText();
                b.setText(enterNum);
            }
        });
        dot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String enterNum = b.getText() + dot.getText();
                b.setText(enterNum);
            }
        });  
        d.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                m.withdraw(b.getText());
                setVisible(false);
            }
        });
       
}
  

}
