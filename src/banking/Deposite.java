package banking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.net.*;
import javax.swing.border.Border;
public class Deposite extends javax.swing.JFrame {
      int cnt=0;
      Border borderRed,borderBlack;
    /**
     * Creates new form Deposite
     */
    public Deposite() {
        borderBlack=BorderFactory.createLineBorder(Color.gray);
	borderRed=BorderFactory.createLineBorder(Color.red);
        initComponents();
        // first make all component invisible
        l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);l6.setVisible(false);l7.setVisible(false);
l10.setVisible(false);this.jComboBox1.setVisible(false);l11.setVisible(false);t2.setVisible(false);
l12.setVisible(false);t4.setVisible(false);l13.setVisible(false);t5.setVisible(false);deposite.setVisible(false);
 deposite1.setVisible(false);       setBounds(170,100,1115,520);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l9 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        l11 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l12 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l13 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        deposite = new javax.swing.JButton();
        deposite1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Deposite form ");
        setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(null);

        l9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l9.setForeground(new java.awt.Color(102, 102, 255));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setText("Deposite Form");
        getContentPane().add(l9);
        l9.setBounds(297, 31, 174, 43);

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 0, 0));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("Enter Account No.");
        getContentPane().add(l1);
        l1.setBounds(51, 107, 164, 32);

        t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(233, 108, 258, 32);

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 51, 51));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(509, 107, 141, 31);

        l2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(102, 0, 0));
        l2.setText("Name");
        getContentPane().add(l2);
        l2.setBounds(145, 158, 59, 27);

        l3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(l3);
        l3.setBounds(233, 158, 196, 27);

        l4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(102, 0, 0));
        l4.setText("Phone No.");
        getContentPane().add(l4);
        l4.setBounds(485, 158, 76, 27);

        l5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(l5);
        l5.setBounds(603, 158, 181, 28);

        l6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l6.setForeground(new java.awt.Color(102, 0, 0));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setText("City");
        getContentPane().add(l6);
        l6.setBounds(814, 158, 49, 28);

        l7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(l7);
        l7.setBounds(893, 159, 151, 27);

        l10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l10.setForeground(new java.awt.Color(102, 0, 0));
        l10.setText("Transfer Mode");
        getContentPane().add(l10);
        l10.setBounds(61, 223, 143, 32);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Cheque", "Draft", "NEFT", "RTGS", "Transfer" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(233, 229, 111, 23);

        l11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l11.setForeground(new java.awt.Color(102, 0, 0));
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l11.setText("Refference");
        getContentPane().add(l11);
        l11.setBounds(374, 223, 118, 32);

        t2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(529, 226, 167, 32);

        l12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l12.setForeground(new java.awt.Color(102, 0, 0));
        l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l12.setText("Ammount");
        getContentPane().add(l12);
        l12.setBounds(61, 284, 98, 22);

        t4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t4);
        t4.setBounds(233, 283, 132, 30);

        l13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l13.setForeground(new java.awt.Color(102, 0, 0));
        l13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l13.setText("Remarks");
        getContentPane().add(l13);
        l13.setBounds(411, 280, 81, 30);

        t5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(t5);
        t5.setBounds(529, 281, 167, 34);

        deposite.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deposite.setForeground(new java.awt.Color(0, 51, 51));
        deposite.setText("DEPOSITE");
        deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeActionPerformed(evt);
            }
        });
        getContentPane().add(deposite);
        deposite.setBounds(230, 350, 213, 46);

        deposite1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deposite1.setForeground(new java.awt.Color(0, 51, 51));
        deposite1.setText("CANCEL");
        deposite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposite1ActionPerformed(evt);
            }
        });
        getContentPane().add(deposite1);
        deposite1.setBounds(480, 350, 213, 46);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\GOLU\\Desktop\\New folder\\edit_pic\\deposit1100.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       try{search();}catch(Exception e){}
    }//GEN-LAST:event_searchActionPerformed

    private void depositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeActionPerformed
       try{ deposite();}catch(Exception e){}
    }//GEN-LAST:event_depositeActionPerformed

    private void deposite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposite1ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_deposite1ActionPerformed
public String GetPhoneNo(String AccountNo)
    {
        String phone="";
        
        try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
					PreparedStatement ps = con.prepareStatement("Select mobile from accounts where ACCNO =?");
					
					ps.setInt(1,Integer.parseInt(AccountNo));
					
					ResultSet rs = ps.executeQuery();
					
					while(rs.next()){
                                        phone=rs.getString("mobile");
                                        }
        
        }catch(Exception ex){}
                
                
       return phone;
    }
    
    
    public void search() throws Exception{

try{
    if(t1.getText().equals(""))
			{
                            t1.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Please Enter Account Number","Warning",JOptionPane.WARNING_MESSAGE);
		
			}
    
                        t1.setBorder(borderBlack);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
		    PreparedStatement ps=con.prepareStatement("Select FIRSTNAME||' '||MIDNAME||' '||LASTNAME as Name,MOBILE,CITY from ACCOUNTS where ACCNO = ?");
			ps.setInt(1,Integer.parseInt(t1.getText()));	
			ResultSet rs = ps.executeQuery();
			 while(rs.next())
          {
		cnt++;	  
	      l3.setText(rs.getString("Name"));
          l5.setText(rs.getString("MOBILE"));
          l7.setText(rs.getString("CITY"));
          
     l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
     l6.setVisible(true);l7.setVisible(true);this.jComboBox1.setVisible(true);l9.setVisible(true);
     l10.setVisible(true);l11.setVisible(true);t2.setVisible(true);
    l12.setVisible(true);t4.setVisible(true);l13.setVisible(true);t5.setVisible(true);deposite.setVisible(true);
    deposite1.setVisible(true);      }
con.close();


                     if(cnt == 0)
                         { t1.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Invalid Accoun No. Click OK and try Again","Warning",JOptionPane.WARNING_MESSAGE);
                         }

}catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}

}
 public void deposite() throws Exception{
 if(this.jComboBox1.getSelectedItem().equals("--Select--")){
					JOptionPane.showMessageDialog((Component)null,"Please Select Transfer Mode","Warning",JOptionPane.WARNING_MESSAGE);
					
			}
 else if(this.t4.getText().equals(""))
			{
				JOptionPane.showMessageDialog((Component)null,"Please Enter Amount","Warning",JOptionPane.WARNING_MESSAGE);
				
			}
    else if(this.t5.getText().equals(""))
			{
				JOptionPane.showMessageDialog((Component)null,"Please Remark","Warning",JOptionPane.WARNING_MESSAGE);
				
			}
 else
 try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
    PreparedStatement ps=con.prepareStatement("insert into TRANSACTIONS values(traid.NEXTVAL,?,?,?,?,SYSDATE,?,?)");
	//PreparedStatement ps=con.prepareStatement("insert into cus values(14,'Ahbcf','ef')");
	ps.setInt(1,Integer.parseInt(t1.getText()));
	ps.setString(2,"deposit");
	ps.setString(3,jComboBox1.getSelectedItem().toString());
	ps.setString(4,t2.getText());
	ps.setInt(5,Integer.parseInt(t4.getText()));
	ps.setString(6,t5.getText());
	ps.executeQuery();
	con.close();
        JOptionPane.showMessageDialog(null, "Amount Deposited SuccessFully");
        
       
         NewClass ob=new NewClass(); //new class is for there is sms getway so that we are able to send message to account holder
        //sending message
         ob.sendSms(GetPhoneNo(t1.getText()),"Thank you  for using SBI "+t4.getText()+" Rs. is Deposited in your Account. current Balence is "+getbalence(t1.getText())+" ");
	
        l3.setText("");l5.setText("");l7.setText("");
        
        t1.setText("");
    t5.setText(""); 
    //t3.setText(""); 
    t2.setText("");
    t4.setText("");	 
	 //ch1.setSelected(false);
}catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
 
 
 }
 public String getbalence(String Accno) throws Exception{
    String bl="";
if(t1.getText().equals(""))
			{ 
				t1.setBorder(borderRed);
                                JOptionPane.showMessageDialog(null, "Please Enter Account Number");
			}
		else
		    {
				t1.setBorder(borderBlack);
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
			PreparedStatement ps=con.prepareStatement("select firstName||' '||LastName as Name,nvl( (Select sum(ammount) from accbalence where accno=accounts.accno),0) as Balence,nvl(pic,'H:\\EDUCATION\\IMPORTANT DOCUMENT\\10.jpg') as pic from accounts where accno=?");
			ps.setInt(1,Integer.parseInt(Accno));
			ResultSet rs = ps.executeQuery();
			 while(rs.next())
			 {
				cnt++; 
				// l3.setText(rs.getString("Name"));
				bl=rs.getString("Balence");
                                 
                               
                                 
                                 
				 
			
			 }
			 con.close();
                         if(cnt == 0)
                         { t1.setBorder(borderRed);
			    JOptionPane.showMessageDialog(null, "invalid Accoun No. Click OK and try again");
                         }
			
		   } catch(Exception ex){System.out.println(ex.getMessage()+"Exception");}
			}
return bl;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deposite;
    private javax.swing.JButton deposite1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l9;
    private javax.swing.JButton search;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}