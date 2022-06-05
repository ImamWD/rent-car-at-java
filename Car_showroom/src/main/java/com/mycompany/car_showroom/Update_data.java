/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.car_showroom;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author imamm
 */
public class Update_data extends javax.swing.JFrame {

   public long ID ;
   void runn()
   {
                  try {
                   //Database Connection
          DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##imam", "12345");  
        //get customer info .
        String sql ="Select * from USR where SSN =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setLong(1,ID);// x=Integer.parseInt(A.getText());
        ResultSet rs = pst.executeQuery();
        if(rs.next())
        {
          FName.setText(rs.getString(2));
          MName.setText(rs.getString(3));
          LName.setText(rs.getString(4));
          Pass.setText(rs.getString(7));
          String[] date = rs.getString(5).split(" ");
          String[] date1= date[0].split("-");
          Day.setSelectedItem(date1[2]);
          Month.setSelectedItem(date1[1]);
          Year.setSelectedItem(date1[0]);
         if("M".equals(rs.getString(6)))
          {
              Male.setSelected(true);
              Female.setSelected(false);
          }
          else
          {
              Female.setSelected(true);
              
          }
 
                }
                // get user Location.
          String sql1 ="Select * from LOC where SSN =?";
        PreparedStatement pst1 = con.prepareStatement(sql1);
        pst1.setLong(1,ID);// x=Integer.parseInt(A.getText());
        ResultSet rs1 = pst1.executeQuery();
        if(rs1.next())
        {
            City.setText(rs1.getString(2));
            Street.setText(rs1.getString(3));
        }       
        con.close();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e );
        } 
   }
   public Update_data(long ID1)
   {
        initComponents();
       this.ID = ID1;
       runn();
       
   }
    public Update_data() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        MName = new javax.swing.JTextField();
        LName = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        Street = new javax.swing.JTextField();
        Pass = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Day = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        Year = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(215, 196, 158));
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(16, 24, 32));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                          UpDate Your Data");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        jLabel29.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(16, 24, 32));
        jLabel29.setText("First Name :");

        jLabel44.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(16, 24, 32));
        jLabel44.setText("Middle Name :");

        jLabel46.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(16, 24, 32));
        jLabel46.setText("Last Name :");

        jLabel48.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(16, 24, 32));
        jLabel48.setText("Birthdate :");

        jLabel50.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(16, 24, 32));
        jLabel50.setText("City :");

        jLabel52.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(16, 24, 32));
        jLabel52.setText("Street :");

        jLabel56.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(16, 24, 32));
        jLabel56.setText("Password :");

        FName.setBackground(new java.awt.Color(16, 24, 32));
        FName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        FName.setForeground(new java.awt.Color(255, 255, 255));
        FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameActionPerformed(evt);
            }
        });

        MName.setBackground(new java.awt.Color(16, 24, 32));
        MName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        MName.setForeground(new java.awt.Color(255, 255, 255));
        MName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNameActionPerformed(evt);
            }
        });

        LName.setBackground(new java.awt.Color(16, 24, 32));
        LName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LName.setForeground(new java.awt.Color(255, 255, 255));
        LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameActionPerformed(evt);
            }
        });

        City.setBackground(new java.awt.Color(16, 24, 32));
        City.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        City.setForeground(new java.awt.Color(255, 255, 255));
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });

        Street.setBackground(new java.awt.Color(16, 24, 32));
        Street.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Street.setForeground(new java.awt.Color(255, 255, 255));
        Street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetActionPerformed(evt);
            }
        });

        Pass.setBackground(new java.awt.Color(16, 24, 32));
        Pass.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(16, 24, 32));
        jLabel49.setText("Day");

        jLabel51.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(16, 24, 32));
        jLabel51.setText("Year");

        jLabel53.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(16, 24, 32));
        jLabel53.setText("Month");

        Day.setBackground(new java.awt.Color(60, 63, 65));
        Day.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        Day.setForeground(new java.awt.Color(215, 196, 158));
        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Month.setBackground(new java.awt.Color(60, 63, 65));
        Month.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        Month.setForeground(new java.awt.Color(215, 196, 158));
        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        Year.setBackground(new java.awt.Color(60, 63, 65));
        Year.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        Year.setForeground(new java.awt.Color(215, 196, 158));
        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));

        jLabel54.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(16, 24, 32));
        jLabel54.setText("Gender :");

        Male.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Male.setForeground(new java.awt.Color(60, 63, 65));
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Female.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Female.setForeground(new java.awt.Color(60, 63, 65));
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(67, 67, 67)
                .addComponent(FName))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel44)
                .addGap(46, 46, 46)
                .addComponent(MName))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel46)
                .addGap(68, 68, 68)
                .addComponent(LName))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel50)
                .addGap(126, 126, 126)
                .addComponent(City))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addGap(107, 107, 107)
                .addComponent(Street))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel56)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel53)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel51)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Pass)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel48)
                .addGap(76, 76, 76)
                .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(91, 91, 91)
                .addComponent(Male)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Female))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel53)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Male)
                        .addComponent(Female)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
         String birthdate ="to_date('"+this.Year.getSelectedItem()+"-"+this.Month.getSelectedItem()+"-"+this.Day.getSelectedItem()+"','yy-mm-dd')";
         int choose=1 ;
         String gender ;
         if(Male.isSelected())
         {
             gender ="M";
         }
         else
         {
             gender ="F";
         }
        try
        {
                           //Database Connection
          DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##imam", "12345"); 
        
         String sql ="Select * from USR where PASS = ? and SSN = ?";
        PreparedStatement pst4 = con.prepareStatement(sql);
        pst4.setString(1,Pass.getText());
        pst4.setLong(2,ID);

        ResultSet rs1 = pst4.executeQuery();
             if(rs1.next())
             {
                 choose =1;
             }
       
        else
        {
         String sql1 ="Select * from USR where PASS = ?";
        PreparedStatement pst = con.prepareStatement(sql1);
        pst.setString(1,Pass.getText());
        ResultSet rs = pst.executeQuery();
             if(rs.next())
             {
                        choose =0;
              }
             else
             {
                 choose =1;
             }
        }
        if(choose ==1)
        {
       // DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
       // Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "dy_aa", "54321");
        Statement stmt =con.createStatement();
        String Co = "update usr set FNAME = '"+FName.getText() + "' where SSN =" + ID ;
        String Co1 = "update usr set MNAME = '"+MName.getText() + "' where SSN =" + ID ;
        String Co2 = "update usr set LNAME = '"+LName.getText() + "' where SSN =" + ID;
        String Co3 = "update usr set SEX = '" + gender + "' where SSN =" + ID;
        String Co4 = "update usr set PASS = '" +Pass.getText() + "' where SSN =" + ID ;
        String Co7 = "update usr set BOD = "+birthdate+ " where SSN =" + ID ;
        String Co5 = "update LOC set CITY = '" +City.getText() + "' where SSN =" + ID;
        String Co6 = "update LOC set STREET = '" +Street.getText() + "' where SSN =" + ID ;

        stmt.executeUpdate(Co);
        stmt.executeUpdate(Co1);
        stmt.executeUpdate(Co2);
        stmt.executeUpdate(Co3);
        stmt.executeUpdate(Co4);
        stmt.executeUpdate(Co5);
        stmt.executeUpdate(Co6);
        stmt.executeUpdate(Co7);

        //JOptionPane.showMessageDialog(null, "Edited successfully");
        con.commit();

        }
        else
        {
        JOptionPane.showMessageDialog(null, "The password has already been");

        }
        con.close();
        
        
        }catch(SQLException e)
        {
            //JOptionPane.showMessageDialog(null, e);
        }
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameActionPerformed

    private void MNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNameActionPerformed

    private void LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameActionPerformed

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

    private void StreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
if(Female.isSelected())
{
    Male.setSelected(false);
}
else
    Female.setSelected(false);
    }//GEN-LAST:event_FemaleActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
if(Male.isSelected())
{
    Female.setSelected(false);
}
else
    Male.setSelected(false);
    }//GEN-LAST:event_MaleActionPerformed

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
            java.util.logging.Logger.getLogger(Update_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField City;
    private javax.swing.JComboBox<String> Day;
    private javax.swing.JTextField FName;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField MName;
    private javax.swing.JRadioButton Male;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JTextField Pass;
    private javax.swing.JTextField Street;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
