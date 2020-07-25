
package Employee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Add_Employee implements ActionListener{
    JFrame f1; 
    JLabel l1,l2,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b,b1;
    
    public Add_Employee(int i){}
    
    public Add_Employee() {
        f1=new JFrame();
        f1.setBackground(Color.WHITE);
        f1.setLayout(null);
        
        
        l1=new JLabel();
        l1.setBounds(0,0,900,750);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/add.jpg"));
        l1.setIcon(i1);
       
        l2=new JLabel("New Employee Addition into Comapny's DataBase");
        l2.setBounds(140,20,850,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);
        f1.add(l1);
        
        //*****************NAME******************
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id1);

        t1=new JTextField();
        t1.setBounds(150,150,150,30);
        l1.add(t1);
        
        //******EmpId***********************
        id4= new JLabel("Employee's ID");
        id4.setBounds(400,150,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id4);

        t4=new JTextField();   
        t4.setBounds(600,150,150,30);
        l1.add(t4);
        
        //**************AGE***************************
        id2= new JLabel("Age");
        id2.setBounds(50,200,100,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id2);

        t2=new JTextField();
        t2.setBounds(150,200,150,30);
        l1.add(t2);
        
        
        //*************DATE OF BIRTH*****************
        id3= new JLabel("Date Of Birth");  
        id3.setBounds(400,200,200,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id3);

        t3=new JTextField();
        t3.setBounds(600,200,150,30);
        l1.add(t3);
        
        //***************E-MAIL*********************
        id5= new JLabel("Email Id");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id5);

        t5=new JTextField();
        t5.setBounds(150,250,150,30);
        l1.add(t5);
        //***************PHONE***********************
        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        l1.add(t6);
        //*************ADDRESS********************
        id7= new JLabel("Address");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id7);

        t7=new JTextField();
        t7.setBounds(150,300,150,30);
        l1.add(t7);
        //***********AADHAR DETAILS**************
        id8= new JLabel("Aadhar No");
        id8.setBounds(400,300,100,30);
        id8.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id8);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        l1.add(t8);
        //*********JOB POST********************
        id9= new JLabel("Job Post");
        id9.setBounds(50,350,100,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id9);

        t9=new JTextField();
        t9.setBounds(150,350,150,30);
        l1.add(t9);
        //**********EDUCATION*******************
        id10= new JLabel("Education");
        id10.setBounds(400,350,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));    
        l1.add(id10);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        l1.add(t10);
        
        //***************BUTTONS*********
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        l1.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        l1.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        
        
        
        
        f1.setVisible(true);
        f1.setSize(900,750);
        f1.setLocation(200,100);
    }
    
    public static void main(String args[])
    {
        Add_Employee a1=new Add_Employee();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
        {
            String name=t1.getText();
            String empId=t4.getText();
            String age=t2.getText();
            String dob=t3.getText();
            String email=t5.getText();
            String phone=t6.getText();
            String address=t7.getText();
            String aadhar=t8.getText();
            String post=t9.getText();
            String education=t10.getText();
             try{
                conn cc = new conn();
                String q = "insert into employee values('"+name+"','"+empId+"','"+age+"','"+dob+"','"+email+"','"+phone+"','"+address+"','"+aadhar+"','"+post+"','"+education+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                f1.setVisible(false);
                new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
            
            
        }
        if(e.getSource()==b1)
        {
             f1.setVisible(false);
            new details();
        }
    }
    
}
