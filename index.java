import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;

public class student extends Frame implements ActionListener
{     
      BufferedImage img,img1,img2,img3; 
      Button b1=new Button("REGISTER");
      Button b3=new Button("CLEAR");
      Button b4=new Button("EXIT");
      
      Label l11=new Label("A SIZZLIN' SUMMER",Label.CENTER);
      Label l1=new Label("NAME*",Label.LEFT);
      Label l2=new Label("GENDER*",Label.LEFT);
      Label l3=new Label("MOBILE NO.*",Label.LEFT);
      Label l4=new Label("EMAIL ID*",Label.LEFT);
      Label l5=new Label("COURSE*",Label.LEFT);
      Label l6=new Label("SEMESTER*",Label.LEFT);
      Label l7=new Label("AGE*",Label.LEFT);
      Label l8=new Label("Student details registred successfully!",Label.LEFT);
      Label l9=new Label("Incomplete details...Please fill out the required fields!", Label.LEFT);
      Label l10=new Label("Safar Khubsurat hai, Manzil se bhi!",Label.CENTER);
      Label l12=new Label("TRIPZEE",Label.CENTER);
      Label l13=new Label("WORK SAVE TRAVEL REPEAT",Label.CENTER);
      Label l14=new Label("Buckle up!!!",Label.CENTER);
      Label l15=new Label("For the most breathtaking Northern Trip of the year.",Label.LEFT);
      Label l16=new Label("TRIPZEE holidays organizes a 15 Nights/16 Days-",Label.LEFT);
      Label l17=new Label("TRIP to UTTARAKHAND",Label.LEFT);
      Label l18=new Label("Total cost inclusive of Everything will be-16,500Rs",Label.LEFT);
      Label l19=new Label("Not all those who wander are lost!",Label.LEFT);
      Label l20=new Label("Enroute the wildest yet the most serene experience!",Label.LEFT);
      Label l21=new Label("Register yourself and your fellow friends",Label.LEFT);
      Label l22=new Label("for the same asap right here==>",Label.LEFT);
      Label l23=new Label();
      Label l24=new Label();
      Label l25=new Label();
      Label l26=new Label("(Full Name)",Label.LEFT);
      Label l27=new Label("(10 digit)",Label.LEFT);
      
      TextField t1=new TextField();
      TextField t2=new TextField();
      TextField t3=new TextField();
            
      Checkbox checkBox1 = new Checkbox("MALE");
      Checkbox checkBox2 = new Checkbox("FEMALE");
      CheckboxGroup cbg=new CheckboxGroup();
      Checkbox r1 = new Checkbox("17", cbg, false);
      Checkbox r2 = new Checkbox("18", cbg, false);
      Checkbox r3 = new Checkbox("19", cbg, false);
      Checkbox r4 = new Checkbox("20", cbg, false);
      Checkbox r5 = new Checkbox("21", cbg, false);
      Checkbox r6 = new Checkbox("22", cbg, false);
      CheckboxGroup c=new CheckboxGroup();
      Checkbox r7 = new Checkbox("CMPS", c, false);
      Checkbox r8 = new Checkbox("IT", c, false);
      Checkbox r9 = new Checkbox("EXTC", c, false);
      Checkbox r10 = new Checkbox("ETRX", c, false);
      CheckboxGroup b=new CheckboxGroup();
      Checkbox r11= new Checkbox("1", b, false);
      Checkbox r12 = new Checkbox("2", b, false);
      Checkbox r13= new Checkbox("3", b, false);
      Checkbox r14 = new Checkbox("4", b, false);
      Checkbox r15= new Checkbox("5", b, false);
      Checkbox r16= new Checkbox("6", b, false);
      Checkbox r17= new Checkbox("7", b, false);
      Checkbox r18= new Checkbox("8", b, false);
      
      
      public student()  
      {       
        t2.addKeyListener(new KeyAdapter()
                {
                public void keyTyped(KeyEvent e)
                {
               try
               { int i=Integer.parseInt(t2.getText());
               
               l23.setText("");
               int len=Integer.parseInt(t2.getText());
                   len=t2.getText().length();
                  if(len>9||len<9)
                  {   l23.setText("*Invalid Mobile Number");
                      
                  }
                  else
                      l23.setText("");
                }
               catch(NumberFormatException exp)
               {    
                   
                   l23.setText("*Invalid Mobile Number");
                   
               }
                              
            }
        });
      
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) 
        {   try{
            char c = evt.getKeyChar();
            if(Character.isLetter(c)||Character.isSpaceChar(c))
            {
                l24.setText("");
            }
            else
                l24.setText("*Invalid Name Format");
            
        }
            catch(Exception e )
            { }
        }
    });
        
        t3.addKeyListener(new java.awt.event.KeyAdapter(){
         public void keyTyped(java.awt.event.KeyEvent evt)
         {
             String email=(String)t3.getText();
             String pattern="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
             if (!email.matches(pattern))
             {
                 l25.setText("*Invalid Email ID");
             }
             else
             {
                 l25.setText("");
             }
         }
        });
        
       
        try {
        img=ImageIO.read(new File("D:\\TitleMain.jpg"));
        img1=ImageIO.read(new File("D:\\summer-camp.png"));
        img2=ImageIO.read(new File("D:\\utt.jpg"));
        img3=ImageIO.read(new File("D:\\images.jfif"));
       
             } catch (IOException ex){}
         setVisible(true);
         addWindowListener(new myWindowAdapter());
         setBackground(Color.black);
         setForeground(Color.WHITE);
         setLayout(null);
         
         Font f = new Font("Times Roman",Font.BOLD,40);
         l11.setFont(f);
         l17.setFont(f);
         
         Font f1 = new Font("Times Roman",Font.BOLD,20);
         l8.setFont(f1);
         l9.setFont(f1);
         l13.setFont(f1);
         
         Font myFont = new Font("SansSerif",Font.BOLD,25);
         l1.setFont(myFont);
         l2.setFont(myFont);
         l3.setFont(myFont);
         l4.setFont(myFont);
         l5.setFont(myFont);
         l6.setFont(myFont);
         l7.setFont(myFont);
         l10.setFont(myFont);
         l12.setFont(myFont);
         l16.setFont(myFont);
         checkBox1.setFont(myFont);
         checkBox2.setFont(myFont);
         r1.setFont(myFont);
         r2.setFont(myFont);
         r3.setFont(myFont);
         r4.setFont(myFont);
         r5.setFont(myFont);
         r6.setFont(myFont);
         r7.setFont(myFont);
         r8.setFont(myFont);
         r9.setFont(myFont);
         r10.setFont(myFont);
         r11.setFont(myFont);
         r12.setFont(myFont);
         r13.setFont(myFont);
         r14.setFont(myFont);
         r15.setFont(myFont);
         r16.setFont(myFont);
         r17.setFont(myFont);
         r18.setFont(myFont);
         l8.setFont(myFont);
         l9.setFont(myFont);
         
         Font font1 = new Font("Times Roman", Font.PLAIN, 18);
         t1.setFont(font1);
         t2.setFont(font1);
         t3.setFont(font1);
         b1.setFont(font1);
         b3.setFont(font1);
         b4.setFont(font1);
         l23.setFont(font1);
         l24.setFont(font1);
         l25.setFont(font1);
         l26.setFont(font1);
         l27.setFont(font1);
         
         Font font11 = new Font("Times Roman", Font.PLAIN, 25);
         l14.setFont(font11);
         l15.setFont(font11);
         l18.setFont(font11);
         l19.setFont(font11);
         l20.setFont(font11);
         l21.setFont(font11);
         l22.setFont(font11);
        
         l9.setForeground(Color.red);
         l8.setForeground(Color.red);
         l11.setForeground(Color.white);
         l11.setBackground(Color.red);
         l10.setForeground(Color.yellow);
         l12.setForeground(Color.yellow);
         l13.setForeground(Color.yellow);
         l14.setForeground(Color.yellow);
         l15.setForeground(Color.yellow);
         l16.setForeground(Color.yellow);
         l18.setForeground(Color.yellow);
         l19.setForeground(Color.yellow);
         l20.setForeground(Color.yellow);
         l21.setForeground(Color.yellow);
         l22.setForeground(Color.yellow);
         l23.setForeground(Color.red);
         l24.setForeground(Color.red);
         l25.setForeground(Color.red);
         l26.setForeground(Color.red);
         l27.setForeground(Color.red);
         
         add(l11);
         add(l1);
         add(l2);
         add(l3);
         add(l4);
         add(l5);
         add(l6);
         add(l7);
         add(l10);
         add(l12);
         add(l13);
         add(l14);
         add(l15);
         add(l16);
         add(l17);
         add(l18);
         add(l19);
         add(l20);
         add(l21);
         add(l22);        
         add(l23);
         add(l24);
         add(l25);
         add(l26);
         add(l27);
         add(t1);
         add(t2);
         add(t3);
         add(checkBox1);
         add(checkBox2);
         add(r1);
         add(r2);
         add(r3);
         add(r4);
         add(r5);
         add(r6);
         add(r7);
         add(r8);
         add(r9);
         add(r10);
         add(r11);
         add(r12);
         add(r13);
         add(r14);
         add(r15);
         add(r16);
         add(r17);
         add(r18);
         add(b1);
         add(b3);
         add(b4);
         b1.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         
         l1.setBounds(700,290,150,30);
         l2.setBounds(700,370,150,20);
         l7.setBounds(700,440,80,40);
         l3.setBounds(700,530,200,20);
         l4.setBounds(700,610,150,20);
         l5.setBounds(700,690,150,20);
         l6.setBounds(700,770,150,20);
         l8.setBounds(750,925,500, 50);
         l9.setBounds(700, 925, 1000, 50);
         l11.setBounds(725,225,500,50);
         
         l10.setBounds(50,225,500,50);
         l12.setBounds(30,275,500,50);
         l13.setBounds(30,325,500,50);
         l14.setBounds(30,375,500,50);
         l15.setBounds(20,425,800,50);
         l16.setBounds(30,475,800,50);
         l17.setBounds(30,525,500,50);
         l18.setBounds(30,575,650,50);
         l19.setBounds(30,625,700,50);
         l20.setBounds(30,675,700,50);
         l21.setBounds(90, 725,700, 50);
         l22.setBounds(90,775,700,50);
         l23.setBounds(900,560,270,20);
         l24.setBounds(900,320,270,20);
         l25.setBounds(900,640,270,20);
         l26.setBounds(700,320,270,20);
         l27.setBounds(700,560,270,20);
         
         t1.setBounds(900,290,270,30);
         t2.setBounds(900,530,270,30);
         t3.setBounds(900,610,270,30);
         t1.setForeground(Color.black);
         t2.setForeground(Color.black);
         t3.setForeground(Color.black);
         
         b1.setBounds(750,850,120,50);
         b1.setForeground(Color.BLACK);
         b3.setBounds(925,850,120,50);
         b3.setForeground(Color.BLACK);
         b4.setBounds(1100,850,120,50);
         b4.setForeground(Color.BLACK);
         
         checkBox1.setBounds(900, 360, 100, 40);
         checkBox2.setBounds(1050,360,180,40);
         r1.setBounds(900, 440,50,40);
         r2.setBounds(960, 440,50,40);
         r3.setBounds(1020,440,50,40);
         r4.setBounds(1080,440,50,40);
         r5.setBounds(1140,440,50,40);
         r6.setBounds(1200,440,50,40);
         r7.setBounds(900,680,90,40);
         r8.setBounds(1005,680,50,40);
         r9.setBounds(1060,680,90,40);
         r10.setBounds(1160,680,90,40);
         r11.setBounds(900,760,40,40);
         r12.setBounds(950,760,40,40);
         r13.setBounds(1000,760,40,40);
         r14.setBounds(1050, 760,40,40);
         r15.setBounds(1100, 760,40,40);
         r16.setBounds(1150, 760,40,40);
         r17.setBounds(1200, 760,40,40);
         r18.setBounds(1250, 760,40,40);
         
         r1.setLabel("17");
         r2.setLabel("18");
         r3.setLabel("19");
         r4.setLabel("20");
         r5.setLabel("21");
         r6.setLabel("22");
         r7.setLabel("CMPS");
         r8.setLabel("IT");
         r9.setLabel("EXTC");
         r10.setLabel("ETRX");
         r11.setLabel("1");
         r12.setLabel("2");
         r13.setLabel("3");
         r14.setLabel("4");
         r15.setLabel("5");
         r16.setLabel("6");
         r17.setLabel("7");
         r18.setLabel("8");
         checkBox1.setLabel("Male");
         checkBox2.setLabel("Female");
                         
        }
      public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(img,0,0,1950,195,null);
        g.drawImage(img1,0,800,700,195,null);
        g.drawImage(img3,1300,200,700,400,null);
        g.drawImage(img2,1300,600,700,400,null);
    }
       
       public void actionPerformed(ActionEvent ae)
       {   
           if(ae.getSource()==b1)
           {    if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty())
           
           {   l8.setVisible(false);
               l9.setVisible(true);
                add(l9);               
           }
            else if(checkBox1.getSelectedObjects()==null&&checkBox2.getSelectedObjects()==null)
            {   l8.setVisible(false);
                l9.setVisible(true);
                add(l9);
            }
            else if(cbg.getSelectedCheckbox()==null||c.getSelectedCheckbox()==null||b.getSelectedCheckbox()==null)
            {   l8.setVisible(false);
                l9.setVisible(true);
                add(l9);               
            }
            else if(!l23.getText().isEmpty())
            {   l8.setVisible(false);
                l9.setVisible(true);
                add(l9);
            }
            else if(!l24.getText().isEmpty())
            {   l8.setVisible(false);
                l9.setVisible(true);
                add(l9);
            }
            else if(!l25.getText().isEmpty())
            {
                l8.setVisible(false);
                l9.setVisible(true);
                add(l9);
            }
                                          
            else  
           {   l9.setVisible(false);
                l8.setVisible(true);
                add(l8);
           }
                     
         
                 
            if(!l8.getText().isEmpty())
            {
                try
               { 
                   String driver = "org.apache.derby.jdbc.ClientDriver";
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/REGISTER","abc123","abc123");
                                        
                PreparedStatement pst=conn.prepareStatement("insert into INFO(NAME,GENDER,AGE,PHONE,EMAILID,COURSE,SEMESTER) values (?,?,?,?,?,?,?)");
                pst.setString(1, t1.getText());
                if(checkBox1.getSelectedObjects()!=null)
                {
                    pst.setString(2,checkBox1.getLabel());
                }
                else if(checkBox1.getSelectedObjects()==null)
                {
                    pst.setString(2, checkBox2.getLabel());
                }
                pst.setString(3, cbg.getSelectedCheckbox().getLabel());
                pst.setString(4, t2.getText());
                pst.setString(5, t3.getText());
                pst.setString(6, c.getSelectedCheckbox().getLabel());
                pst.setString(7,b.getSelectedCheckbox().getLabel());
                pst.execute();                                    
               }
                catch(Exception e)
               {    
                   e.printStackTrace();
               }
                
            } 
           }
    
            else if(ae.getSource()==b4)
                {
                    System.exit(0);
                }
           
            else if(ae.getSource()==b3)
           {
              t1.setText(" ");
              t2.setText(" ");
              t3.setText(" ");
              l8.setVisible(false);
              l9.setVisible(false);
              l23.setVisible(false);
              l24.setVisible(false);
              l25.setVisible(false);
              checkBox1.setState(false);
              checkBox2.setState(false);
              b.setSelectedCheckbox(null);
              cbg.setSelectedCheckbox(null);
              c.setSelectedCheckbox(null); 
              
       }
       }
        
        public static void main(String g[]) throws SQLException
        {   
            student stu=new student();
            stu.setSize(new Dimension(2000,2000));
            stu.setTitle("Summer Camp Registration Form");
            stu.setVisible(true);
            String driver = "org.apache.derby.jdbc.ClientDriver";
            try {
                try {
                    Class.forName(driver).newInstance();
                } catch (InstantiationException | IllegalAccessException ex) {
                    
                }
                } catch (ClassNotFoundException ex) {
        
        }
            
          Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/REGISTER","abc123","abc123");
            
            
        }
        
 class myWindowAdapter extends WindowAdapter
    {
        public void windowClosing(WindowEvent we)
        {   
            
            System.exit(0);
        }
    }
}



    

      







  
      
    
