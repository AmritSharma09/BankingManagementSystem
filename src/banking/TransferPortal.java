package banking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.net.*;
import javax.swing.border.Border;
public class TransferPortal extends javax.swing.JFrame {

    int count = 0;
    int cnt=0;
    double sumammount=0.0;
    JLabel message;
    Border borderRed,borderBlack;
     
    /**
     * Creates new form TransferPortal
     */
    public TransferPortal() {
        message =new JLabel(" ");
            borderBlack=BorderFactory.createLineBorder(Color.gray);
	    borderRed=BorderFactory.createLineBorder(Color.red);
        initComponents();
        setBounds(50,30,1260,690);
    lAccDis.setVisible(false); accNoLable.setVisible(false); lBCode.setVisible(false); bCodeLable.setVisible(false); lIfsc.setVisible(false);
		ifscLable.setVisible(false); lName.setVisible(false); nameLable.setVisible(false);lCity.setVisible(false); cityLable.setVisible(false);
		lPin.setVisible(false); pinLable.setVisible(false); lState.setVisible(false); stateLable.setVisible(false); 
		 
		/* Part Two */ 
	 	lTo.setVisible(false); lAcc1.setVisible(false); tAccNo.setVisible(false); lAccDis1.setVisible(false); accNoLable1.setVisible(false); 
		lBCode1.setVisible(false); bCodeLable1.setVisible(false); lIfsc1.setVisible(false); ifscLable1.setVisible(false); lName1.setVisible(false); 
		nameLable1.setVisible(false);lCity1.setVisible(false); cityLable1.setVisible(false); lPin1.setVisible(false); pinLable1.setVisible(false); 
		lState1.setVisible(false); stateLable1.setVisible(false); veri1.setVisible(false); 
		lTransMode.setVisible(false); this.jComboBox1.setVisible(false); lRefNo.setVisible(false); transRefNo.setVisible(false); lAmount.setVisible(false); amountT.setVisible(false); 
		sub.setVisible(false); clr.setVisible(false);clr1.setVisible(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lFrom = new javax.swing.JLabel();
        lAccDis = new javax.swing.JLabel();
        fAccNo = new javax.swing.JTextField();
        veri = new javax.swing.JButton();
        lAcc = new javax.swing.JLabel();
        ifscLable = new javax.swing.JLabel();
        lBCode = new javax.swing.JLabel();
        accNoLable = new javax.swing.JLabel();
        lIfsc = new javax.swing.JLabel();
        bCodeLable = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        nameLable = new javax.swing.JLabel();
        lCity = new javax.swing.JLabel();
        cityLable = new javax.swing.JLabel();
        lPin = new javax.swing.JLabel();
        stateLable = new javax.swing.JLabel();
        lState = new javax.swing.JLabel();
        pinLable = new javax.swing.JLabel();
        lTo = new javax.swing.JLabel();
        lAccDis1 = new javax.swing.JLabel();
        lAcc1 = new javax.swing.JLabel();
        tAccNo = new javax.swing.JTextField();
        veri1 = new javax.swing.JButton();
        accNoLable1 = new javax.swing.JLabel();
        lBCode1 = new javax.swing.JLabel();
        bCodeLable1 = new javax.swing.JLabel();
        lIfsc1 = new javax.swing.JLabel();
        ifscLable1 = new javax.swing.JLabel();
        lName1 = new javax.swing.JLabel();
        nameLable1 = new javax.swing.JLabel();
        lCity1 = new javax.swing.JLabel();
        cityLable1 = new javax.swing.JLabel();
        lPin1 = new javax.swing.JLabel();
        pinLable1 = new javax.swing.JLabel();
        lState1 = new javax.swing.JLabel();
        stateLable1 = new javax.swing.JLabel();
        lTransMode = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        lRefNo = new javax.swing.JLabel();
        transRefNo = new javax.swing.JTextField();
        lAmount = new javax.swing.JLabel();
        amountT = new javax.swing.JTextField();
        sub = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        clr1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Transfer Money");
        getContentPane().setLayout(null);

        lFrom.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lFrom.setForeground(new java.awt.Color(102, 51, 255));
        lFrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFrom.setText("FROM");
        getContentPane().add(lFrom);
        lFrom.setBounds(36, 64, 70, 31);

        lAccDis.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lAccDis.setForeground(new java.awt.Color(102, 0, 0));
        lAccDis.setText("Account No.");
        getContentPane().add(lAccDis);
        lAccDis.setBounds(18, 165, 88, 16);

        fAccNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(fAccNo);
        fAccNo.setBounds(179, 107, 258, 32);

        veri.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        veri.setForeground(new java.awt.Color(0, 51, 51));
        veri.setText("Varify");
        veri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veriActionPerformed(evt);
            }
        });
        getContentPane().add(veri);
        veri.setBounds(460, 106, 141, 31);

        lAcc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lAcc.setForeground(new java.awt.Color(102, 0, 0));
        lAcc.setText("Account No.");
        getContentPane().add(lAcc);
        lAcc.setBounds(72, 112, 97, 20);

        ifscLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(ifscLable);
        ifscLable.setBounds(840, 170, 141, 23);

        lBCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lBCode.setForeground(new java.awt.Color(102, 0, 0));
        lBCode.setText("Branch Code ");
        getContentPane().add(lBCode);
        lBCode.setBounds(336, 171, 85, 16);

        accNoLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(accNoLable);
        accNoLable.setBounds(124, 165, 165, 20);

        lIfsc.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lIfsc.setForeground(new java.awt.Color(102, 0, 0));
        lIfsc.setText("IFSC Code ");
        getContentPane().add(lIfsc);
        lIfsc.setBounds(686, 167, 93, 28);

        bCodeLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(bCodeLable);
        bCodeLable.setBounds(478, 167, 123, 20);

        lName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lName.setForeground(new java.awt.Color(102, 0, 0));
        lName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lName.setText("Name");
        getContentPane().add(lName);
        lName.setBounds(32, 217, 55, 16);

        nameLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(nameLable);
        nameLable.setBounds(124, 213, 165, 20);

        lCity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCity.setForeground(new java.awt.Color(102, 0, 0));
        lCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCity.setText("City");
        getContentPane().add(lCity);
        lCity.setBounds(379, 213, 42, 17);

        cityLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cityLable);
        cityLable.setBounds(478, 213, 123, 20);

        lPin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPin.setForeground(new java.awt.Color(102, 0, 0));
        lPin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPin.setText("Pin No.");
        getContentPane().add(lPin);
        lPin.setBounds(712, 213, 58, 20);

        stateLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(stateLable);
        stateLable.setBounds(1085, 217, 123, 20);

        lState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lState.setForeground(new java.awt.Color(102, 0, 0));
        lState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lState.setText("State");
        getContentPane().add(lState);
        lState.setBounds(998, 217, 58, 20);

        pinLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(pinLable);
        pinLable.setBounds(837, 217, 123, 20);

        lTo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lTo.setForeground(new java.awt.Color(102, 51, 255));
        lTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTo.setText("TO");
        getContentPane().add(lTo);
        lTo.setBounds(48, 270, 58, 31);

        lAccDis1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lAccDis1.setForeground(new java.awt.Color(102, 0, 0));
        lAccDis1.setText("Account No.");
        getContentPane().add(lAccDis1);
        lAccDis1.setBounds(40, 378, 78, 16);

        lAcc1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lAcc1.setForeground(new java.awt.Color(102, 0, 0));
        lAcc1.setText("Account No.");
        getContentPane().add(lAcc1);
        lAcc1.setBounds(89, 325, 97, 20);

        tAccNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tAccNo);
        tAccNo.setBounds(204, 320, 258, 32);

        veri1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        veri1.setForeground(new java.awt.Color(0, 51, 51));
        veri1.setText("Varify");
        veri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veri1ActionPerformed(evt);
            }
        });
        getContentPane().add(veri1);
        veri1.setBounds(480, 319, 141, 31);

        accNoLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(accNoLable1);
        accNoLable1.setBounds(144, 378, 165, 20);

        lBCode1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lBCode1.setForeground(new java.awt.Color(102, 0, 0));
        lBCode1.setText("Branch Code ");
        getContentPane().add(lBCode1);
        lBCode1.setBounds(355, 378, 85, 16);

        bCodeLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(bCodeLable1);
        bCodeLable1.setBounds(480, 378, 123, 20);

        lIfsc1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lIfsc1.setForeground(new java.awt.Color(102, 0, 0));
        lIfsc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lIfsc1.setText("IFSC Code ");
        getContentPane().add(lIfsc1);
        lIfsc1.setBounds(694, 370, 85, 28);

        ifscLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(ifscLable1);
        ifscLable1.setBounds(837, 370, 123, 20);

        lName1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lName1.setForeground(new java.awt.Color(102, 0, 0));
        lName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lName1.setText("Name");
        getContentPane().add(lName1);
        lName1.setBounds(63, 422, 55, 16);

        nameLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(nameLable1);
        nameLable1.setBounds(144, 422, 165, 20);

        lCity1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCity1.setForeground(new java.awt.Color(102, 0, 0));
        lCity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCity1.setText("City");
        getContentPane().add(lCity1);
        lCity1.setBounds(398, 425, 42, 17);

        cityLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cityLable1);
        cityLable1.setBounds(480, 416, 123, 20);

        lPin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPin1.setForeground(new java.awt.Color(102, 0, 0));
        lPin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPin1.setText("Pin No.");
        getContentPane().add(lPin1);
        lPin1.setBounds(713, 416, 58, 20);

        pinLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(pinLable1);
        pinLable1.setBounds(837, 416, 123, 20);

        lState1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lState1.setForeground(new java.awt.Color(102, 0, 0));
        lState1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lState1.setText("State");
        getContentPane().add(lState1);
        lState1.setBounds(998, 416, 58, 20);

        stateLable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(stateLable1);
        stateLable1.setBounds(1085, 416, 123, 20);

        lTransMode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lTransMode.setForeground(new java.awt.Color(102, 0, 0));
        lTransMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTransMode.setText("Transfer Mode");
        getContentPane().add(lTransMode);
        lTransMode.setBounds(18, 475, 100, 17);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Cheque", "Draft", "NEFT", "RTGS", "Transfer" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(198, 472, 111, 23);

        lRefNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lRefNo.setForeground(new java.awt.Color(102, 0, 0));
        lRefNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lRefNo.setText("Refference");
        getContentPane().add(lRefNo);
        lRefNo.setBounds(351, 467, 89, 32);

        transRefNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(transRefNo);
        transRefNo.setBounds(491, 474, 130, 30);

        lAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAmount.setForeground(new java.awt.Color(102, 0, 0));
        lAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAmount.setText("Ammount");
        getContentPane().add(lAmount);
        lAmount.setBounds(694, 475, 98, 17);

        amountT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(amountT);
        amountT.setBounds(857, 474, 120, 30);

        sub.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        sub.setForeground(new java.awt.Color(0, 51, 51));
        sub.setText("TRANSFER");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        getContentPane().add(sub);
        sub.setBounds(351, 571, 151, 35);

        clr.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        clr.setForeground(new java.awt.Color(0, 51, 51));
        clr.setText("CLEAR");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        getContentPane().add(clr);
        clr.setBounds(562, 571, 105, 35);

        clr1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        clr1.setForeground(new java.awt.Color(0, 51, 51));
        clr1.setText("CANCEL");
        clr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr1ActionPerformed(evt);
            }
        });
        getContentPane().add(clr1);
        clr1.setBounds(723, 571, 121, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\GOLU\\Desktop\\New folder\\edit_pic\\withdraw1.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 1240, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veriActionPerformed
       try{varifi1();}catch(Exception e){}
    }//GEN-LAST:event_veriActionPerformed

    private void veri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veri1ActionPerformed
        try{varifi2();}catch(Exception e){}
    }//GEN-LAST:event_veri1ActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        try{transfer();}catch(Exception e){}
    }//GEN-LAST:event_subActionPerformed

    private void clr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_clr1ActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
       fAccNo.setText("");accNoLable.setText("");bCodeLable.setText("");ifscLable.setText("");nameLable.setText("");
       cityLable.setText("");pinLable.setText("");stateLable.setText("");tAccNo.setText("");accNoLable1.setText("");
       bCodeLable1.setText("");ifscLable1.setText("");nameLable1.setText("");
    cityLable1.setText("");pinLable1.setText("");stateLable1.setText("");transRefNo.setText("");amountT.setText("");

    }//GEN-LAST:event_clrActionPerformed

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
    
    public void varifi1() throws Exception{


		
			if(fAccNo.getText().equals(""))
			{
                                fAccNo.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Please Enter Account Number","Warning",JOptionPane.WARNING_MESSAGE);
		
			}	
			else {
		
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
					PreparedStatement ps = con.prepareStatement("Select accNo,bCode,ifsCode,firstName,city,pin,state from accounts where accNo = ?");
					
					ps.setInt(1,Integer.parseInt(fAccNo.getText()));
					
					ResultSet rs = ps.executeQuery();
					
					while(rs.next()){
						count++;
						
						// Part One 
						lAccDis.setVisible(true); accNoLable.setVisible(true); lBCode.setVisible(true); bCodeLable.setVisible(true); lIfsc.setVisible(true);
						ifscLable.setVisible(true); lName.setVisible(true); nameLable.setVisible(true);lCity.setVisible(true); cityLable.setVisible(true);
						lPin.setVisible(true); pinLable.setVisible(true); lState.setVisible(true); stateLable.setVisible(true);
						
						//Part Two
						lTo.setVisible(true); lAcc1.setVisible(true); tAccNo.setVisible(true); veri1.setVisible(true);
						
						accNoLable.setText(rs.getString("accNo"));
						bCodeLable.setText(rs.getString("bCode"));
						ifscLable.setText(rs.getString("ifsCode"));
						nameLable.setText(rs.getString("firstName"));
						cityLable.setText(rs.getString("city"));
						pinLable.setText(rs.getString("pin"));
						stateLable.setText(rs.getString("state"));
						
						
					}
					con.close();
					
					if(count == 0){
                                                fAccNo.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Account Number Not Found","Warning",JOptionPane.WARNING_MESSAGE);
                                        }
				}
				catch(Exception ex){
					System.out.println(ex.getMessage());
					
				}
			
			}
		}
public void varifi2() throws Exception{

if(tAccNo.getText().equals(""))
			{      tAccNo.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Please Enter Account Number","Warning",JOptionPane.WARNING_MESSAGE);
				
			}	
			else {
			
				try{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
						PreparedStatement ps = con.prepareStatement("Select accNo,bCode,ifsCode,firstName,city,pin,state from accounts where accNo = ?");
					
						ps.setInt(1,Integer.parseInt(tAccNo.getText()));
						
						ResultSet rs = ps.executeQuery();
						while(rs.next()){
							cnt++;
							 //Part Two 
							lAccDis1.setVisible(true); accNoLable1.setVisible(true); lBCode1.setVisible(true); bCodeLable1.setVisible(true); lIfsc1.setVisible(true);
							ifscLable1.setVisible(true); lName1.setVisible(true); nameLable1.setVisible(true);lCity1.setVisible(true); cityLable1.setVisible(true);
							lPin1.setVisible(true); pinLable1.setVisible(true); lState1.setVisible(true); stateLable1.setVisible(true);
						
							lTransMode.setVisible(true); this.jComboBox1.setVisible(true); lRefNo.setVisible(true); transRefNo.setVisible(true); lAmount.setVisible(true); amountT.setVisible(true); 
							sub.setVisible(true); clr.setVisible(true);clr1.setVisible(true);
						
							accNoLable1.setText(rs.getString("accNo"));
							bCodeLable1.setText(rs.getString("bCode"));
							ifscLable1.setText(rs.getString("ifsCode"));
							nameLable1.setText(rs.getString("firstName"));
							cityLable1.setText(rs.getString("city"));
							pinLable1.setText(rs.getString("pin"));
							stateLable1.setText(rs.getString("state"));
						}
						con.close();
                                                if(cnt == 0){
                                                tAccNo.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Account Number Not Found","Warning",JOptionPane.WARNING_MESSAGE);
                                        }
						//fAccNo.setText("");
				
				}
				catch(Exception ex){
				System.out.println(ex.getMessage());
					
				}
					
			}


}
public void transfer() throws Exception{
if(accNoLable1.getText().equals("")  /* accNoLable.getText().equals("") */)
			{
				JOptionPane.showMessageDialog(message, "Please Verify Account Number");
				
			}	
			else if(this.jComboBox1.getSelectedItem().equals("--Select--")){
					JOptionPane.showMessageDialog((Component)null,"Please Select Transfer Mode","Warning",JOptionPane.WARNING_MESSAGE);
					
			}
                        else if(this.transRefNo.getText().equals(""))
			{
				JOptionPane.showMessageDialog((Component)null,"Please Enter Refferences","Warning",JOptionPane.WARNING_MESSAGE);
				
			}
    else if(this.amountT.getText().equals(""))
			{
				JOptionPane.showMessageDialog((Component)null,"Please Enter Ammount","Warning",JOptionPane.WARNING_MESSAGE);
				
			}
			
			else 
			{    
		        sumammount = checkAmmount();
		        if(Double.parseDouble(amountT.getText())<=sumammount)
				{
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
						PreparedStatement ps = con.prepareStatement("insert into TRANSACTIONS(TID,ACCNO,TYPE,PMODE,REFNO,DOT,AMMOUNT,REMARK) values(traid.NEXTVAL,?,'Withdraw',?,?,SYSDATE,?,'Transfer')");
						
						ps.setInt(1,Integer.parseInt(accNoLable.getText()));
						ps.setString(2,this.jComboBox1.getSelectedItem().toString());
						ps.setString(3,transRefNo.getText());
						ps.setInt(4,Integer.parseInt(amountT.getText()));
						
						ps.executeQuery();
                                                NewClass ob1=new NewClass();
                                                 ob1.sendSms(GetPhoneNo(accNoLable.getText()),"Thank you  for using SBI, transaction of"+amountT.getText()+"RS. is sucessfull  to Account No."+tAccNo.getText()+" Now Your Account Balance is "+getbalence(fAccNo.getText())+"Rs.");
						
						PreparedStatement ps1 = con.prepareStatement("insert into TRANSACTIONS(TID,ACCNO,TYPE,PMODE,REFNO,DOT,AMMOUNT) values(traid.NEXTVAL,?,'Deposit',?,?,SYSDATE,?)");
						
						ps1.setInt(1,Integer.parseInt(accNoLable1.getText()));
						ps1.setString(2,this.jComboBox1.getSelectedItem().toString());
						ps1.setString(3,transRefNo.getText());
						ps1.setInt(4,Integer.parseInt(amountT.getText()));
						
						
						ps1.executeQuery();
						con.close();
						JOptionPane.showMessageDialog(message, "Transaction SuccessFull");
                                                
                                                NewClass ob=new NewClass();
                                                 ob.sendSms(GetPhoneNo(accNoLable1.getText()),"In Your Account "+amountT.getText()+"RS. is sucessfully transfered from Account No. "+fAccNo.getText()+" Now Your Account Balance is "+getbalence(tAccNo.getText())+"Rs.");
					}
					catch(Exception ex){
					System.out.println(ex.getMessage());
					
					}
					
				}
				else{
				JOptionPane.showMessageDialog((Component)null,"Insuffecient ammount Cann't transfer","Warning",JOptionPane.WARNING_MESSAGE);
				}
			
				
			}
		}
public String getbalence(String Accno) throws Exception{
    String bl="";
if(tAccNo.getText().equals(""))
			{ 
				tAccNo.setBorder(borderRed);
                                JOptionPane.showMessageDialog(null, "Please Enter Account Number");
			}
		else
		    {
				tAccNo.setBorder(borderBlack);
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
                         { tAccNo.setBorder(borderRed);
			    JOptionPane.showMessageDialog(null, "invalid Accoun No. Click OK and try again");
                         }
			
		   } catch(Exception ex){System.out.println(ex.getMessage()+"Exception");}
			}
return bl;
}
public double checkAmmount()
	{
	 double amt=0.0;
		try{
					 Class.forName("oracle.jdbc.driver.OracleDriver");
			         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","GOLU","852");
					 PreparedStatement ps2=con.prepareStatement("select sum(ammount) as balence from accbalence where Accno=?");
		            ps2.setInt(1,Integer.parseInt(accNoLable.getText()));
				ResultSet rs =	ps2.executeQuery();
					while(rs.next())
					{
					
					amt=rs.getDouble(1);
					}
				    con.close();
		}catch(Exception ex){ System.out.println(ex.getMessage());}
		return amt;
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
            java.util.logging.Logger.getLogger(TransferPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accNoLable;
    private javax.swing.JLabel accNoLable1;
    private javax.swing.JTextField amountT;
    private javax.swing.JLabel bCodeLable;
    private javax.swing.JLabel bCodeLable1;
    private javax.swing.JLabel cityLable;
    private javax.swing.JLabel cityLable1;
    private javax.swing.JButton clr;
    private javax.swing.JButton clr1;
    private javax.swing.JTextField fAccNo;
    private javax.swing.JLabel ifscLable;
    private javax.swing.JLabel ifscLable1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lAcc;
    private javax.swing.JLabel lAcc1;
    private javax.swing.JLabel lAccDis;
    private javax.swing.JLabel lAccDis1;
    private javax.swing.JLabel lAmount;
    private javax.swing.JLabel lBCode;
    private javax.swing.JLabel lBCode1;
    private javax.swing.JLabel lCity;
    private javax.swing.JLabel lCity1;
    private javax.swing.JLabel lFrom;
    private javax.swing.JLabel lIfsc;
    private javax.swing.JLabel lIfsc1;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lName1;
    private javax.swing.JLabel lPin;
    private javax.swing.JLabel lPin1;
    private javax.swing.JLabel lRefNo;
    private javax.swing.JLabel lState;
    private javax.swing.JLabel lState1;
    private javax.swing.JLabel lTo;
    private javax.swing.JLabel lTransMode;
    private javax.swing.JLabel nameLable;
    private javax.swing.JLabel nameLable1;
    private javax.swing.JLabel pinLable;
    private javax.swing.JLabel pinLable1;
    private javax.swing.JLabel stateLable;
    private javax.swing.JLabel stateLable1;
    private javax.swing.JButton sub;
    private javax.swing.JTextField tAccNo;
    private javax.swing.JTextField transRefNo;
    private javax.swing.JButton veri;
    private javax.swing.JButton veri1;
    // End of variables declaration//GEN-END:variables
}
