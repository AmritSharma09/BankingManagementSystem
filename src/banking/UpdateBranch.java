package banking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.sql.*;
import javax.swing.border.Border;


/**
 *
 * @author GOLU
 */
public class UpdateBranch extends javax.swing.JFrame {
    int ct=0;
    //int pt=0;
    JLabel message;
    Border borderRed,borderBlack;
    public UpdateBranch() {
       borderBlack=BorderFactory.createLineBorder(Color.gray);
	borderRed=BorderFactory.createLineBorder(Color.red); 
      message = new JLabel(" ");
        initComponents();
       //first make invisible all physical component
         l13.setVisible(false); l14.setVisible(false); l15.setVisible(false);
		l16.setVisible(false); l17.setVisible(false); l18.setVisible(false);
                this.jLabel7.setVisible(false);
                this.jLabel6.setVisible(false);this.jLabel8.setVisible(false);this.jLabel10.setVisible(false);
                this.jLabel5.setVisible(false);this.jLabel9.setVisible(false);this.setVisible(false);
		 branchCodeLable.setVisible(false); l15.setVisible(false);
                serialLable.setVisible(false);l19.setVisible(false);
                
		
		bNameLable.setVisible(false); ifscLable.setVisible(false); branchMng.setVisible(false);
		landMark.setVisible(false); district.setVisible(false); 
                state.setVisible(false);
                pin.setVisible(false);
		city.setVisible(false); branchConNo.setVisible(false);
		
		sub.setVisible(false); clr.setVisible(false);clr1.setVisible(false); edit.setVisible(false);
        
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
        l10 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        deleteText = new javax.swing.JTextField();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        branchCodeLable = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        serialLable = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        bNameLable = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        ifscLable = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        branchMng = new javax.swing.JTextField();
        l19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        landMark = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        district = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        branchConNo = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        clr1 = new javax.swing.JButton();
        state = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        l9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        l9.setForeground(new java.awt.Color(102, 102, 255));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setText("Search Branch");
        getContentPane().add(l9);
        l9.setBounds(10, 41, 148, 25);

        l10.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        l10.setForeground(new java.awt.Color(102, 0, 0));
        l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l10.setText("Branch Code");
        getContentPane().add(l10);
        l10.setBounds(36, 77, 108, 21);

        searchText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(searchText);
        searchText.setBounds(18, 104, 139, 23);

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(0, 51, 51));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(38, 138, 79, 25);

        l11.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        l11.setForeground(new java.awt.Color(102, 0, 0));
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l11.setText("Branch Code");
        getContentPane().add(l11);
        l11.setBounds(33, 296, 108, 21);

        l12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        l12.setForeground(new java.awt.Color(102, 102, 255));
        l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l12.setText("Delete Branch");
        getContentPane().add(l12);
        l12.setBounds(23, 260, 143, 25);

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 51, 51));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(54, 357, 75, 25);

        deleteText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(deleteText);
        deleteText.setBounds(23, 328, 139, 23);

        l13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l13.setForeground(new java.awt.Color(102, 102, 255));
        l13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l13.setText("Branch Details");
        getContentPane().add(l13);
        l13.setBounds(306, 25, 132, 22);

        l14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l14.setForeground(new java.awt.Color(0, 102, 102));
        l14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l14.setText("Branch Code *");
        getContentPane().add(l14);
        l14.setBounds(324, 58, 102, 17);

        branchCodeLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(branchCodeLable);
        branchCodeLable.setBounds(452, 58, 110, 17);

        l15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l15.setForeground(new java.awt.Color(0, 102, 102));
        l15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l15.setText("Branch Serial No. *");
        getContentPane().add(l15);
        l15.setBounds(580, 58, 131, 17);

        serialLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(serialLable);
        serialLable.setBounds(729, 58, 110, 17);

        l16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l16.setForeground(new java.awt.Color(0, 102, 102));
        l16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l16.setText("Branch Name *");
        getContentPane().add(l16);
        l16.setBounds(324, 86, 106, 17);

        bNameLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(bNameLable);
        bNameLable.setBounds(448, 86, 110, 17);

        l17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l17.setForeground(new java.awt.Color(0, 102, 102));
        l17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l17.setText("IFSC Code *");
        getContentPane().add(l17);
        l17.setBounds(600, 86, 87, 17);

        ifscLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(ifscLable);
        ifscLable.setBounds(729, 86, 110, 17);

        l18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l18.setForeground(new java.awt.Color(0, 102, 102));
        l18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l18.setText("Branch Manager");
        getContentPane().add(l18);
        l18.setBounds(324, 122, 113, 17);

        branchMng.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(branchMng);
        branchMng.setBounds(455, 121, 177, 30);

        l19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l19.setForeground(new java.awt.Color(102, 102, 255));
        l19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l19.setText("Branch Address");
        getContentPane().add(l19);
        l19.setBounds(316, 174, 141, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("LandMark/Street *");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 240, 132, 17);

        landMark.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(landMark);
        landMark.setBounds(470, 240, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("District *");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(760, 240, 61, 20);

        district.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(district);
        district.setBounds(880, 230, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("State *");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 300, 50, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Pin *");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(770, 300, 34, 17);

        pin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(pin);
        pin.setBounds(880, 290, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("City *");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 340, 40, 17);

        city.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(city);
        city.setBounds(470, 340, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Branch Contact No. *");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(700, 350, 149, 17);

        branchConNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(branchConNo);
        branchConNo.setBounds(880, 340, 170, 30);

        edit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 51, 51));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(390, 440, 125, 33);

        clr.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        clr.setForeground(new java.awt.Color(0, 51, 51));
        clr.setText("Clear");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        getContentPane().add(clr);
        clr.setBounds(680, 440, 94, 33);

        sub.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sub.setForeground(new java.awt.Color(0, 51, 51));
        sub.setText("Submit");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        getContentPane().add(sub);
        sub.setBounds(540, 440, 120, 33);

        clr1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        clr1.setForeground(new java.awt.Color(0, 51, 51));
        clr1.setText("Cancel");
        clr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr1ActionPerformed(evt);
            }
        });
        getContentPane().add(clr1);
        clr1.setBounds(790, 440, 110, 33);

        state.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECT>", "Andaman and Nicobar Islands", "Andra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh", "Chhattisgarh", "Dadar and Nagar Haveli", "Daman and Diu", "Delhi", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Lakshadeep", "Madya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Pondicherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttaranchal", "Uttar Pradesh", "West Bengal" }));
        getContentPane().add(state);
        state.setBounds(470, 290, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\GOLU\\Desktop\\New folder\\images\\TD-Branch_2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{
        search();
        }catch(Exception e){}
    }//GEN-LAST:event_searchActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        JOptionPane.showMessageDialog(message, "Editing is Enable.");
			clr.setVisible(true);
			branchMng.setEditable(true);
			landMark.setEditable(true); district.setEditable(true); 
                        state.setEditable(true); 
                        pin.setEditable(true);
			city.setEditable(true); branchConNo.setEditable(true);
			sub.setVisible(true);
    }//GEN-LAST:event_editActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
       try{ submit();}catch(Exception e){}
    }//GEN-LAST:event_subActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        //when user click on clear button all tectBox will Empty    
        bNameLable.setText("");ifscLable.setText(""); branchCodeLable.setText("");serialLable.setText(" "); branchMng.setText(""); landMark.setText("");
			district.setText("");
                         
                        pin.setText(""); city.setText(""); branchConNo.setText("");        
    }//GEN-LAST:event_clrActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{ delete(); //call delete opration
        }catch(Exception e){}
    }//GEN-LAST:event_deleteActionPerformed

    private void clr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_clr1ActionPerformed
public void delete() throws Exception{ //define delete opration 
   if(this.deleteText.getText().equals("")) //check delete Text Box is Empty 
{
        deleteText.setBorder(borderRed);// make that text box red
                               //show in pop-up window
				JOptionPane.showMessageDialog((Component)null,"BRANCH CODE IS EMPTY PLEASE ENTER A VALID BRANCH CODE","Warning",JOptionPane.WARNING_MESSAGE);
                        }
        else
       try{ 
          
      
		Class.forName("oracle.jdbc.driver.OracleDriver"); //resister with Oracle Driver
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","USERNAME","PASSWORD"); // establish connection with database
	PreparedStatement ps = con.prepareStatement("delete branch where bcode = ? "); //take valid branchCode and delete that branch infrommation from branch database
					
					ps.setString(1,deleteText.getText().toUpperCase());				
                                        ps.executeQuery();
                                        ResultSet rs = ps.executeQuery();
                                        while(rs.next()){
                                                
					con.close();
                                        
					deleteText.setText("");
                                        }
	
					JOptionPane.showMessageDialog(message, "Record Deletion SuccessFull.");
  }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}



}
    public void search() throws Exception{
    
        if(this.searchText.getText().equals(""))
			{
                           searchText.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"BRANCH CODE IS EMPTY PLEASE ENTER A VALID BRANCH CODE","Warning",JOptionPane.WARNING_MESSAGE);
                        }
        else
        try{
            searchText.setBorder(borderBlack);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","USERNAME","PASSWORD");
		    PreparedStatement ps = con.prepareStatement("Select * from branch where bcode=? "); //select all data from branch table
					
			ps.setString(1,searchText.getText().toUpperCase());
                                        
			ResultSet rs = ps.executeQuery(); //execute query 
					while(rs.next()){
                                                ct++;//increment count
                                                //make all componet visible
						l13.setVisible(true);l14.setVisible(true);				
						this.jLabel5.setVisible(true); this.jLabel9.setVisible(true); this.jLabel7.setVisible(true); l19.setVisible(true);
						this.jLabel6.setVisible(true); this.jLabel8.setVisible(true); this.jLabel10.setVisible(true); 
						l9.setVisible(true); l10.setVisible(true); l11.setVisible(true); l12.setVisible(true);						
						branchCodeLable.setVisible(true); l15.setVisible(true); serialLable.setVisible(true);
						l18.setVisible(true);l14.setVisible(true);l16.setVisible(true);l17.setVisible(true);
												
						bNameLable.setVisible(true); ifscLable.setVisible(true); branchMng.setVisible(true);
						landMark.setVisible(true); district.setVisible(true); state.setVisible(true); pin.setVisible(true);
						city.setVisible(true); branchConNo.setVisible(true);
						clr.setVisible(true); sub.setVisible(false); edit.setVisible(true);
						clr1.setVisible(true);
//						
						branchMng.setEditable(false);
						landMark.setEditable(false); district.setEditable(false); state.setEditable(false); pin.setEditable(false);
						city.setEditable(false); branchConNo.setEditable(false);
					//set all text in there respective text box which we get from database	
						serialLable.setText(rs.getString("bid"));
						branchCodeLable.setText(rs.getString("bcode"));
						bNameLable.setText(rs.getString("bname"));
						ifscLable.setText(rs.getString("ifscode"));
						branchMng.setText(rs.getString("bmng"));
						landMark.setText(rs.getString("bstreet"));
						district.setText(rs.getString("bdist"));
						state.setSelectedItem(rs.getString("bstate"));
						pin.setText(rs.getString("bpin"));
						city.setText(rs.getString("bcity"));
						branchConNo.setText(rs.getString("bcont"));
					}
					con.close();
					//searchText.setText("");
                                        if(ct == 0){ 
                                   searchText.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"BRANCH CODE IS ENVALID PLEASE ENTER A VALID BRANCH CODE","Warning",JOptionPane.WARNING_MESSAGE);
                         }
		
				}catch(Exception ex){System.out.println(ex.getMessage()+"Branch");}
    }
    public void submit() throws Exception{
    if(this.branchMng.getText().equals(""))
			{
                           branchMng.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Branch Manager Name is Empty","Warning",JOptionPane.WARNING_MESSAGE);
                        }
    else if(this.landMark.getText().equals(""))
			{
                           landMark.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"landmark is Empty","Warning",JOptionPane.WARNING_MESSAGE);
                        }
     else if(this.district.getText().equals(""))
			{
                           district.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"District Empty","Warning",JOptionPane.WARNING_MESSAGE);
                        }
     else if(this.pin.getText().equals(""))
			{
                           pin.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Pin Code Empty","Warning",JOptionPane.WARNING_MESSAGE);
                        }
     else if(this.city.getText().equals(""))
			{
                           city.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"City Empty","Warning",JOptionPane.WARNING_MESSAGE);
                        }
     if(this.state.getSelectedItem().equals("<SELECT>")){
                                        state.setBorder(borderRed);
					JOptionPane.showMessageDialog((Component)null,"Choose State","Warning",JOptionPane.WARNING_MESSAGE);
					
			}
     else if(this.branchConNo.getText().equals(""))
			{
                           branchConNo.setBorder(borderRed);
				JOptionPane.showMessageDialog((Component)null,"Branch Contact No. Empty","Warning",JOptionPane.WARNING_MESSAGE);
                        }
    else
    try{
						
        
        
                                                branchMng.setBorder(borderBlack);
                                                landMark.setBorder(borderBlack);
                                                district.setBorder(borderBlack);
                                                pin.setBorder(borderBlack);
                                                city.setBorder(borderBlack);
                                                branchConNo.setBorder(borderBlack);
                                                state.setBorder(borderBlack);
                                               
                                                
			
		  Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","USERNAME","852");
          //update branch infromation 
		  PreparedStatement ps=con.prepareStatement("update branch set bmng = ?,bstreet = ?,bdist = ?,bstate = ?,bpin = ?,bcity = ?,bcont = ? where bcode = ? ");
					
					ps.setString(8,branchCodeLable.getText().toUpperCase());
					ps.setString(1,branchMng.getText());
					ps.setString(2,landMark.getText());
					ps.setString(3,district.getText());
					ps.setString(4,state.getSelectedItem().toString());
					ps.setString(5,pin.getText());
					ps.setString(6,city.getText());
					ps.setString(7,branchConNo.getText());
				
					ps.executeQuery();
					con.close();
					
//					branchMng.setBorder(borderBlack);
//					landMark.setBorder(borderBlack);
//					district.setBorder(borderBlack);
//					state.setBorder(borderBlack);
//					pin.setBorder(borderBlack);
//					city.setBorder(borderBlack);
//					branchConNo.setBorder(borderBlack);
					
					JOptionPane.showMessageDialog(message, "Record Update SuccessFully");
				}catch(Exception ex){
				
					JOptionPane.showMessageDialog(sub, ex.getMessage());
				}
    
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bNameLable;
    private javax.swing.JLabel branchCodeLable;
    private javax.swing.JTextField branchConNo;
    private javax.swing.JTextField branchMng;
    private javax.swing.JTextField city;
    private javax.swing.JButton clr;
    private javax.swing.JButton clr1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField deleteText;
    private javax.swing.JTextField district;
    private javax.swing.JButton edit;
    private javax.swing.JLabel ifscLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField landMark;
    private javax.swing.JTextField pin;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel serialLable;
    private javax.swing.JComboBox state;
    private javax.swing.JButton sub;
    // End of variables declaration//GEN-END:variables
}
