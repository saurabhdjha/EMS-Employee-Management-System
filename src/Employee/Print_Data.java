
package Employee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Print_Data implements ActionListener{
     
    JFrame f1;
    JLabel l1,l2,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
    JLabel id1a,id2a,id3a,id4a,id5a,id6a,id7a,id8a,id9a,id10a;
    String name,empId,age,dob,email,phone,address,aadhar,post,education;
    JButton b1,b2;
    Print_Data(String e_id)
    {
        try{
            conn con = new conn();
            String str = "select * from employee where e_id = '"+e_id+"'";
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){

               
                name = rs.getString("e_name");
                empId = rs.getString("e_id");
                age = rs.getString("e_age");
                dob = rs.getString("e_dob");
                email = rs.getString("e_email");
                phone = rs.getString("e_phone");
                address = rs.getString("e_addr");
                aadhar = rs.getString("e_aadhar");
                post = rs.getString("e_post");
                education = rs.getString("e_education");

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        f1=new JFrame();
        f1.setBackground(Color.WHITE);
        f1.setLayout(null);
        
        
        l1=new JLabel();
        l1.setBounds(0,0,900,750);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/add.jpg"));
        l1.setIcon(i1);
       
        l2=new JLabel("Employee's Details");
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
        
        
        id1a=new JLabel(name);
        id1a.setBounds(150,150,150,30);
        id1a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id1a);
        
        //******EmpId***********************
        id4= new JLabel("Employee's ID");
        id4.setBounds(400,150,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id4);

        id4a=new JLabel(empId);
        id4a.setBounds(600,150,150,30);
        id4a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id4a);  

        //**************AGE***************************
        id2= new JLabel("Age");
        id2.setBounds(50,200,100,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id2);

        id3a=new JLabel(age);
        id3a.setBounds(150,200,150,30);
        id3a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id3a);
        

        //*************DATE OF BIRTH*****************
        id3= new JLabel("Date Of Birth");  
        id3.setBounds(400,200,200,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id3);

        id3a=new JLabel(dob);
        id3a.setBounds(600,200,150,30);
        id3a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id3a);

        //***************E-MAIL*********************
        id5= new JLabel("Email Id");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id5);

        id5a=new JLabel(email);
        id5a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id5a);
        id5a.setBounds(150,250,150,30);
        
        //***************PHONE***********************
        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id6);

        id6a=new JLabel(phone);
        id6a.setBounds(600,250,150,30);
        id6a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id6a);
        

        //*************ADDRESS********************
        id7= new JLabel("Address");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id7);

        id7a=new JLabel(address);
        id7a.setBounds(150,300,150,30);
        id7a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id7a);
        
        
        //***********AADHAR DETAILS**************
        id8= new JLabel("Aadhar No");
        id8.setBounds(400,300,100,30);
        id8.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id8);

        id8a=new JLabel(aadhar);
        id8a.setBounds(600,300,150,30);
        id8a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id8a);
        
        
        //*********JOB POST********************
        id9= new JLabel("Job Post");
        id9.setBounds(50,350,100,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id9);

        id9a=new JLabel(post);
        id9a.setBounds(150,350,150,30);
        id9a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id9a);
        

        //**********EDUCATION*******************
        id10= new JLabel("Education");
        id10.setBounds(400,350,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));    
        l1.add(id10);

        id10a=new JLabel(education);
        id10a.setFont(new Font("serif",Font.BOLD,25));
        l1.add(id10a);
        id10a.setBounds(600,350,150,30);
        
        //***************BUTTONS*********
       
        b1=new JButton("Print");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,520,100,30);
        b1.addActionListener(this);
        f1.add(b1);

        b2=new JButton("BACK");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,520,100,30);
        b2.addActionListener(this);
        f1.add(b2);
        
        
        
        
        f1.setVisible(true);
        f1.setSize(900,750);
        f1.setLocation(200,100);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            f1.setVisible(false);
            details d=new details();
        }
        if(e.getSource()==b2){
            f1.setVisible(false);
            new details();
        }
    }
}
