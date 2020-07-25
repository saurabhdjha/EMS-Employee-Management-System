package Employee;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class Update_Employee extends Add_Employee implements ActionListener{

    JFrame f;
    JLabel l1,l2,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,lab,lab1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JLabel id1a,id2a,id3a,id4a,id5a,id6a,id7a,id8a,id9a,id10a;
    String id_emp;
    
    JButton b,b1,b2,b3; 
    
    
    Update_Employee(String idaa){
        super(0);
        f=new JFrame("update Employee details");
        f.setVisible(true);
        f.setSize(900,500);
        f.setLocation(450,250);
        f.setBackground(Color.white);
        f.setLayout(null);

        id_emp=idaa;    
        l1=new JLabel();
        l1.setBounds(0,0,900,750);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/add.jpg"));
        l1.setIcon(i1);
       
        l2=new JLabel("Update Existing Employee Details");
        l2.setBounds(140,20,850,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);
        
        
        //*****************NAME******************
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id1);

        
        //******EmpId***********************
        id4= new JLabel("Employee's ID");
        id4.setBounds(400,150,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id4);

        
        //**************AGE***************************
        id2= new JLabel("Age");
        id2.setBounds(50,200,100,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id2);

        
        
        //*************DATE OF BIRTH*****************
        id3= new JLabel("Date Of Birth");  
        id3.setBounds(400,200,200,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id3);

        
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
        
        
        b=new JButton("update");
        b.setBounds(250,400,100,30);
        b.addActionListener(this);
        l1.add(b);

        b1=new JButton("Cancel");
        b1.setBounds(450,400,100,30);
        b1.addActionListener(this);
        l1.add(b1);
        
        showData(idaa);
        
    }

    int i=0;
    String name,empId,age,dob,aadhar;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from employee where e_id = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                name = rs.getString(1);
                empId = rs.getString(2);
                age = rs.getString(3);
                dob = rs.getString(4);
                
                
                
                t5.setText(rs.getString(5));
                t6.setText(rs.getString(6));
                t7.setText(rs.getString(7));
                aadhar = rs.getString(8);
                t9.setText(rs.getString(9));
                t10.setText(rs.getString(10));
                
                id1a=new JLabel(name);
        id1a.setBounds(150,150,150,30);
        id1a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id1a);
        
        id4a=new JLabel(empId);
        id4a.setBounds(600,150,150,30);
        id4a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id4a);  
        
        id2a=new JLabel(age);
        id2a.setBounds(150,200,150,30);
        id2a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id2a);
        
        id3a=new JLabel(dob);
        id3a.setBounds(600,200,150,30);
        id3a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id3a);

        id8a=new JLabel(aadhar);
        id8a.setBounds(600,300,150,30);
        id8a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id8a);   
            
            }
            if(i==0)
                JOptionPane.showMessageDialog(null,"Id not found");
            new Search_Employee();
        }catch(Exception ex){}
        f1.add(l1);
        f.setVisible(true);
        f.setSize(900,500);
        f.setLocation(400,100);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                conn con = new conn();
                String str = "update employee set e_name='"+name+"',e_id='"+empId+"',e_age='"+age+"',e_dob='"+dob+"',e_email='"+t5.getText()+"',e_phone='"+t6.getText()+"',e_addr='"+t7.getText()+"',e_aadhar='"+aadhar+"',e_post='"+t7.getText()+"',e_education='"+t6.getText()+"' where e_id='"+empId+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new Search_Employee();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            details d=new details();
        }
    }
    
    public static void main(String[] arg){
        new Update_Employee("Update Employee");
    }
    
    
    
}