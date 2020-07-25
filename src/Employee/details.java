/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class details implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    
    public details() {
       f=new JFrame("Employee Details");
       f.setBackground(Color.white);
       f.setLayout(null);
       
       l1=new JLabel();
       l1.setBounds(0,0,700,500);
       l1.setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/icons/details.jpg"));
       l1.setIcon(i1);
       f.add(l1);
       
       l2=new JLabel("Employee Details");
       l2.setBounds(470,20,200,40);
       l2.setFont(new Font("serif",Font.BOLD,25));
       l2.setForeground(Color.black);
       l1.add(l2);
       
       b1=new JButton("Add");
       b1.setBounds(520,70,120,40);
       b1.setFont(new Font("serif",Font.BOLD,20));
       b1.setForeground(Color.WHITE);
       b1.setBackground(Color.BLACK);
       b1.addActionListener(this);
       l1.add(b1);
       
       b2=new JButton("View");
       b2.setBounds(520,130,120,40);
       b2.setFont(new Font("serif",Font.BOLD,20));
       b2.setForeground(Color.WHITE);
       b2.setBackground(Color.BLACK);
       b2.addActionListener(this);
       l1.add(b2);
       
       b3=new JButton("Remove");
       b3.setBounds(520,190,120,40);
       b3.setFont(new Font("serif",Font.BOLD,20));
       b3.setForeground(Color.WHITE);
       b3.setBackground(Color.BLACK);
       b3.addActionListener(this);
       l1.add(b3);
       
       b4=new JButton("Update");
       b4.setBounds(520,250,120,40);
       b4.setFont(new Font("serif",Font.BOLD,20));
       b4.setForeground(Color.WHITE);
       b4.setBackground(Color.BLACK);
       b4.addActionListener(this);
       l1.add(b4);
       
        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);

    }
    
    public static void main(String args[])
    {
        details d=new details();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            f.setVisible(false);
            new Add_Employee();
        }
        if(e.getSource()==b2)
        {
          f.setVisible(false);
          new View_Employee();
        }
        if(e.getSource()==b3)
        {
            f.setVisible(false);
            new Remove_Employee();
        }
        if(e.getSource()==b4)
        {
            f.setVisible(false);
            new Search_Employee();
        }
    }
    
}
