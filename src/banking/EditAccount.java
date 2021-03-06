package banking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.net.*;
import javax.swing.border.Border;
import com.toedter.calendar.JDateChooser;

public class EditAccount extends javax.swing.JFrame{
     int refid,cnt=0;
     String picpath="";
     String signpath="";
    JLabel message;
    ScrollPane scpn;
    Border borderRed,borderBlack;
    /**
     * 
     * Creates new form AddNewAccount
     */
    public EditAccount() {
        
        message = new JLabel(" ");
        scpn=new ScrollPane();
        borderBlack=BorderFactory.createLineBorder(Color.gray);
	borderRed=BorderFactory.createLineBorder(Color.red);
        //scpn.add(this.Form);
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
//INITIALIZE ALL VISIBLE COMPONENT
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        district = new javax.swing.JTextField();
        l15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mri = new javax.swing.JComboBox();
        l14 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        landMark = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        mName = new javax.swing.JTextField();
        fNAME = new javax.swing.JTextField();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        mobNo = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        accType = new javax.swing.JComboBox();
        l16 = new javax.swing.JLabel();
        prefix = new javax.swing.JComboBox();
        pre1 = new javax.swing.JComboBox();
        pin = new javax.swing.JTextField();
        l25 = new javax.swing.JLabel();
        gName = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        father = new javax.swing.JComboBox();
        l2 = new javax.swing.JLabel();
        accNo = new javax.swing.JTextField();
        l21 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        piclabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        signlabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("New Account Form");
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(1300, 1305));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 620, 111, 35);

        district.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        district.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtActionPerformed(evt);
            }
        });
        getContentPane().add(district);
        district.setBounds(500, 420, 120, 30);

        l15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l15.setForeground(new java.awt.Color(102, 0, 0));
        l15.setText("PIN *");
        getContentPane().add(l15);
        l15.setBounds(410, 470, 50, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 620, 110, 35);

        mri.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mri.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--SELECT--", "Single", "Married" }));
        getContentPane().add(mri);
        mri.setBounds(530, 260, 130, 31);

        l14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l14.setForeground(new java.awt.Color(102, 0, 0));
        l14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l14.setText("State/UT *");
        getContentPane().add(l14);
        l14.setBounds(50, 480, 89, 17);

        city.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(city);
        city.setBounds(740, 420, 123, 30);

        landMark.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(landMark);
        landMark.setBounds(190, 420, 167, 29);

        state.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(state);
        state.setBounds(190, 470, 157, 29);

        mName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mName.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(mName);
        mName.setBounds(420, 210, 140, 30);

        fNAME.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fNAME.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(fNAME);
        fNAME.setBounds(240, 210, 160, 30);

        l12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l12.setForeground(new java.awt.Color(102, 0, 0));
        l12.setText("Landmark/Street *");
        getContentPane().add(l12);
        l12.setBounds(30, 420, 144, 27);

        l13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l13.setForeground(new java.awt.Color(102, 0, 0));
        l13.setText("District *");
        getContentPane().add(l13);
        l13.setBounds(410, 420, 73, 29);

        searchText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchText.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(searchText);
        searchText.setBounds(420, 40, 260, 40);

        l5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l5.setForeground(new java.awt.Color(102, 0, 0));
        l5.setText("Date of Birth *");
        getContentPane().add(l5);
        l5.setBounds(20, 260, 101, 20);

        l9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l9.setForeground(new java.awt.Color(102, 0, 0));
        l9.setText("Applicant's Marital Status *");
        getContentPane().add(l9);
        l9.setBounds(320, 260, 187, 32);

        mobNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(mobNo);
        mobNo.setBounds(190, 520, 170, 31);

        l1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 102, 255));
        l1.setText("Enter Account No.");
        getContentPane().add(l1);
        l1.setBounds(160, 40, 240, 29);

        l11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l11.setForeground(new java.awt.Color(51, 51, 255));
        l11.setText("Pemanent Address");
        getContentPane().add(l11);
        l11.setBounds(10, 370, 240, 29);

        l3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(102, 0, 0));
        l3.setText("NAME *");
        getContentPane().add(l3);
        l3.setBounds(40, 200, 67, 30);

        l18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l18.setForeground(new java.awt.Color(102, 0, 0));
        l18.setText("Mobile No. *");
        getContentPane().add(l18);
        l18.setBounds(50, 520, 96, 25);

        lName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lName.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(lName);
        lName.setBounds(580, 210, 135, 30);

        accType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accType.setForeground(new java.awt.Color(153, 153, 255));
        accType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select>", "Saving Account", "Current Account" }));
        getContentPane().add(accType);
        accType.setBounds(170, 160, 130, 23);

        l16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l16.setForeground(new java.awt.Color(102, 0, 0));
        l16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l16.setText("City *");
        getContentPane().add(l16);
        l16.setBounds(650, 420, 51, 29);

        prefix.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prefix.setForeground(new java.awt.Color(153, 153, 255));
        prefix.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs" }));
        getContentPane().add(prefix);
        prefix.setBounds(170, 210, 60, 24);

        pre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pre1.setForeground(new java.awt.Color(153, 153, 255));
        pre1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs" }));
        getContentPane().add(pre1);
        pre1.setBounds(310, 310, 60, 30);

        pin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(pin);
        pin.setBounds(500, 470, 120, 32);

        l25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l25.setForeground(new java.awt.Color(102, 0, 0));
        l25.setText("Account No *");
        getContentPane().add(l25);
        l25.setBounds(340, 160, 96, 27);

        gName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gName.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(gName);
        gName.setBounds(390, 310, 190, 30);

        l4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(102, 0, 0));
        l4.setText("Name of  *");
        getContentPane().add(l4);
        l4.setBounds(40, 310, 75, 17);

        l19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l19.setForeground(new java.awt.Color(102, 0, 0));
        l19.setText("Email Address");
        getContentPane().add(l19);
        l19.setBounds(390, 520, 96, 25);

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(email);
        email.setBounds(500, 520, 205, 31);

        father.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        father.setForeground(new java.awt.Color(204, 0, 0));
        father.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select---", "Father/Guardian", "Husband" }));
        getContentPane().add(father);
        father.setBounds(160, 310, 127, 30);

        l2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(102, 0, 0));
        l2.setText("Account Type *");
        getContentPane().add(l2);
        l2.setBounds(30, 160, 108, 17);

        accNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accNo.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(accNo);
        accNo.setBounds(470, 150, 137, 30);

        l21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l21.setForeground(new java.awt.Color(102, 102, 255));
        l21.setText("Personal Details");
        getContentPane().add(l21);
        l21.setBounds(20, 100, 201, 29);

        search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search.setForeground(new java.awt.Color(0, 51, 51));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(720, 40, 170, 40);

        dob.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(dob);
        dob.setBounds(160, 260, 130, 30);
        getContentPane().add(piclabel);
        piclabel.setBounds(920, 120, 140, 130);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 255));
        jButton4.setText("Browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1140, 270, 140, 30);
        getContentPane().add(signlabel);
        signlabel.setBounds(1140, 110, 140, 130);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 255));
        jButton5.setText("Browse");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(920, 270, 140, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 620, 105, 35);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 51));
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(700, 620, 110, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon("PIC DESTINATION PATH")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1380, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{ 
            update();
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void update() throws Exception{
        
        
        java.text.SimpleDateFormat ft = new java.text.SimpleDateFormat("dd/MM/yyyy");
			String dobstr=ft.format(this.dob.getDate());
         if(this.searchText.getText().equals(""))
			{ 
			this.searchText.setBorder(borderRed);
                                JOptionPane.showMessageDialog(null, "Please Enter Account Number");
			}               
                        
        if(accType.getSelectedItem().equals("--Select--")){
				JOptionPane.showMessageDialog((Component)null,"Please Select Account Type","Warning",JOptionPane.WARNING_MESSAGE);
				
			}
	else if(fNAME.getText().equals(""))
			{ 
				
				JOptionPane.showMessageDialog((Component)null,"Enter First Name","Warning",JOptionPane.WARNING_MESSAGE);
			
			}
        else if(this.lName.getText().equals(""))
			{ 
				
				JOptionPane.showMessageDialog((Component)null,"Enter First Name","Warning",JOptionPane.WARNING_MESSAGE);
			
			}
	else if(father.getSelectedItem().equals("--Select--")){
				JOptionPane.showMessageDialog((Component)null,"Please Select Name of Guardian","Warning",JOptionPane.WARNING_MESSAGE);
			
			}
			
	else if(mri.getSelectedItem().equals("--Select--")){
				JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
				
			}
                        else if(accNo.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                        else if(this.landMark.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                        else if(this.city.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                        else if(this.district.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                        else if(this.state.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                         else if(this.pin.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                         else if(this.mobNo.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                         else if(this.email.getText().equals(" ")){
                        JOptionPane.showMessageDialog((Component)null,"Please Select Marital Status","Warning",JOptionPane.WARNING_MESSAGE);
                        }
                         
                        
       else
			{
                            search.setBorder(borderBlack);
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
			         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","USERNAME","PASSWORD");
					PreparedStatement ps1 = con.prepareStatement("update accounts set ACCTYPE = ?,PREFIX = ?,FIRSTNAME = ?,MIDNAME = ?,LASTNAME = ?,DOB = ?,MARITAL = ?,GUARDIAN = ?,PREFIX1 = ?,GUARDIANNAME = ?,STREET = ?,DIST = ?,STATE = ?,CITY = ?,PIN = ?,MOBILE = ?,EMAIL = ?,PIC= ?,sign = ?  WHERE ACCNO = ?");
					
//					if(male.isSelected() == true){
//						genderOpt = "Male";
//					}
//					else if(fem.isSelected() == true){
//						genderOpt = "Female";
//					}
					
					ps1.setInt(20,Integer.parseInt(accNo.getText()));

					ps1.setString(1,accType.getSelectedItem().toString());
//					ps1.setString(2,bCode.getText());
//					ps1.setString(3,ifsc.getText());
					ps1.setString(2,prefix.getSelectedItem().toString());
					ps1.setString(3,fNAME.getText());
					ps1.setString(4,mName.getText());
					ps1.setString(5,lName.getText());
                                        ps1.setString(6,dobstr);
                                        ps1.setString(7,mri.getSelectedItem().toString());
                                        
					ps1.setString(8,father.getSelectedItem().toString());
					ps1.setString(9,pre1.getSelectedItem().toString());
					ps1.setString(10,gName.getText());
                                        
                                        
					
					//ps1.setInt(12,Integer.parseInt(age.getText()));
					//ps1.setString(13,nation.getSelectedItem().toString());
//					ps1.setString(14,genderOpt);
//					ps1.setString(15,mMaidenName.getText());
//					ps1.setString(16,mari.getSelectedItem().toString());
//					ps1.setInt(17,Integer.parseInt(uid.getText()));
					ps1.setString(11,landMark.getText());
					ps1.setString(12,district.getText());
                                        ps1.setString(13,city.getText());
					ps1.setString(14,state.getText());
					
					ps1.setInt(15,Integer.parseInt(pin.getText()));
//					ps1.setString(23,telNo.getText());
					ps1.setString(16,mobNo.getText());
					ps1.setString(17,email.getText());
                                        ps1.setString(18,picpath);
                                        ps1.setString(19,signpath);
//					ps1.setString(26,nomName.getText());
//					ps1.setString(27,nomRelation.getText());
//					ps1.setString(28,nomDob.getText());
					
					ps1.executeQuery();
					con.close();
					JOptionPane.showMessageDialog(message, "Record Updated SuccessFully");
					
				}
				catch(Exception ex){
                                    
					JOptionPane.showMessageDialog(message,ex.getMessage());
				}
			}
		}
        
        
        
        
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{ clear();
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{
        search();
        }catch(Exception e){}
    }//GEN-LAST:event_searchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try{  
       
        java.io.File fl=null;
        javax.swing.JFileChooser flchoser= new javax.swing.JFileChooser(); 
        int res =flchoser.showOpenDialog(null);
        if(res==javax.swing.JFileChooser.APPROVE_OPTION)
         fl=flchoser.getSelectedFile();
        signpath=fl.getPath();
        javax.swing.ImageIcon imcn1=new javax.swing.ImageIcon(fl.getPath());
        signlabel.setIcon(imcn1);
        
        
        
        }catch(Exception e){}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        java.io.File fi=null;
        javax.swing.JFileChooser flch= new javax.swing.JFileChooser(); 
        int res =flch.showOpenDialog(null);
        if(res==javax.swing.JFileChooser.APPROVE_OPTION)
         fi=flch.getSelectedFile();
        picpath=fi.getPath();
        javax.swing.ImageIcon imcn=new javax.swing.ImageIcon(fi.getPath());
        piclabel.setIcon(imcn);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{delete();}catch(Exception e){}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void districtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed
public void delete() throws Exception{

if(searchText.getText().equals("")){
				JOptionPane.showMessageDialog(message, "First Search Account");
			}
			else{
				
				try{
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
			         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","USERNAME","PASSWORD");
					PreparedStatement ps = con.prepareStatement("delete accounts where accNo = ?");
				
					ps.setInt(1,Integer.parseInt(accNo.getText()));
					ps.executeQuery();
					con.close();
						
					JOptionPane.showMessageDialog(message, "Record Deletion SuccessFull.");
                                        this.searchText.setText(" ");accNo.setText(" "); fNAME.setText(" "); mName.setText(" ");
                                        this.piclabel.setIcon(null);
                                        signlabel.setIcon(null);
                                         lName.setText(" "); gName.setText(" "); landMark.setText(" ");
                                          district.setText(""); state.setText(""); pin.setText(""); city.setText("");
                                        mobNo.setText(""); email.setText("");
				}catch(Exception ex){System.out.println(ex.getMessage()+"Excepon");} 	


}
}





        public void search() throws Exception{

                                System.out.println("HELLO");
           if(searchText.getText().equals(""))
			{
				JOptionPane.showMessageDialog((Component)null,"Enter Account Number","Warning",JOptionPane.WARNING_MESSAGE);
				
			}
			else
			{
			 
                            try
				{	//accNo.setEditable(false);
					Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","USERNAME","PASSWORD");
PreparedStatement ps = con.prepareStatement("select ACCTYPE,ACCNO,PREFIX,FIRSTNAME,MIDNAME,LASTNAME,GUARDIAN,PREFIX1,GUARDIANNAME,DOB,MARITAL,STREET,DIST,STATE,CITY,PIN,MOBILE,EMAIL,nvl(pic,'H:\\a pic\\no-profile.png') as picture,nvl(sign,'H:\\a pic\\no sig.jpg') as signature FROM ACCOUNTS where ACCNO = ?");
					
			ps.setInt(1,Integer.parseInt(searchText.getText()));
					
			ResultSet rs = ps.executeQuery();
					
			while(rs.next())
					{
                                            cnt++;
                                            accType.setSelectedItem(rs.getString("ACCTYPE"));
                                            accNo.setText(rs.getString("ACCNO"));
                                            prefix.setSelectedItem(rs.getString("PREFIX"));
                                            fNAME.setText(rs.getString("FIRSTNAME"));
                                            mName.setText(rs.getString("MIDNAME"));
                                            lName.setText(rs.getString("LASTNAME"));
                                          //dob.setDate(rs.getString("DOB"));

                                            father.setSelectedItem(rs.getString("GUARDIAN"));
                                            pre1.setSelectedItem(rs.getString("PREFIX1"));
                                            gName.setText(rs.getString("GUARDIANNAME"));
                                            
                                            mri.setSelectedItem(rs.getString("MARITAL"));
                                          //  uid.setText(rs.getString("UIDNO"));
                                            landMark.setText(rs.getString("STREET"));
                                            district.setText(rs.getString("DIST"));
                                            state.setText(rs.getString("STATE"));
                                            city.setText(rs.getString("CITY"));
                                            pin.setText(rs.getString("PIN"));
                                            //telNo.setText(rs.getString("PHONE"));
                                            mobNo.setText(rs.getString("MOBILE"));
                                            email.setText(rs.getString("EMAIL"));
                                            
                                             javax.swing.ImageIcon im= new javax.swing.ImageIcon(rs.getString("picture"));
                                             piclabel.setIcon(im);
                                             javax.swing.ImageIcon sg= new javax.swing.ImageIcon(rs.getString("signature"));
                                             signlabel.setIcon(sg);
//                                            
					}
                        
					con.close();
                                        if(cnt == 0)
                         { this.searchText.setBorder(borderRed);
			    JOptionPane.showMessageDialog(null, "invalid Accoun No. Click OK and try again");
                         }
                                        else{
                                            JOptionPane.showMessageDialog(message, "Record Found SuccessFully");
                                        }
                                
				
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(message,ex.getMessage());
					
				}
				
			} 
            
            
            
        }
	String genderOpt;

    public void clear() throws Exception{
    this.searchText.setText(" ");accNo.setText(" "); fNAME.setText(" "); mName.setText(" ");
    this.piclabel.setIcon(null);
    signlabel.setIcon(null);
     lName.setText(" "); gName.setText(" "); landMark.setText(" ");
      district.setText(""); state.setText(""); pin.setText(""); city.setText("");
    mobNo.setText(""); email.setText(""); 
     //nomName.setText(""); nomRelation.setText(""); this.jDateChooser2.setDate(null);
    
    
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
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNo;
    private javax.swing.JComboBox accType;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField city;
    private javax.swing.JTextField district;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fNAME;
    private javax.swing.JComboBox father;
    private javax.swing.JTextField gName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField landMark;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField mobNo;
    private javax.swing.JComboBox mri;
    private javax.swing.JLabel piclabel;
    private javax.swing.JTextField pin;
    private javax.swing.JComboBox pre1;
    private javax.swing.JComboBox prefix;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel signlabel;
    private javax.swing.JTextField state;
    // End of variables declaration//GEN-END:variables
}
