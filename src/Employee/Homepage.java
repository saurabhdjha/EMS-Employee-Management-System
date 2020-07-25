
package Employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

public class Homepage implements ActionListener{
    JFrame f;
    JLabel id,l1;
    JButton b;
    public Homepage()
    {
        f=new JFrame("EMS-Home Page");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1360,530);
        f.add(l1);
        
        b = new JButton("CLICK HERE TO Proceed Further");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b.setBounds(500,600,300,70);
        b.addActionListener(this);
        
        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.white);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        f.getContentPane().setBackground(Color.BLACK);
        
        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);
        
        while(true)
        {
            lid.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
    
    
    public static void main(String args[])
    {
        new Homepage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }
}
