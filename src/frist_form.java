
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARTHIK
 */
public class frist_form extends javax.swing.JFrame {

    /**
     * Creates new form frist_form
     */
    String[]  iptext= new String[4];
    int fc=35,hc1=22,hc2=15;
    float cost;
    String count,s;
   
    
    {
        
    }
    public frist_form() {
        initComponents();
        
    }
   public void click()    
   {
       if((t1.getText().equals(""))&&(t2.getText().equals(""))&&(nopt.getText().equals("")))
        {
           
            JOptionPane.showMessageDialog(null,"INVALID","Alert",JOptionPane.WARNING_MESSAGE); ;
        }
       if((t1.getText().equals("")))
        {
           
            JOptionPane.showMessageDialog(null,"INVALID","Alert",JOptionPane.WARNING_MESSAGE); ;
        }
       if((t2.getText().equals("")))
        {
           
            JOptionPane.showMessageDialog(null,"INVALID","Alert",JOptionPane.WARNING_MESSAGE); ;
        }
       if((nopt.getText().equals("")))
        {
           
            JOptionPane.showMessageDialog(null,"INVALID","Alert",JOptionPane.WARNING_MESSAGE); ;
        }
        iptext[0]=t1.getText();
        iptext[1]=t2.getText();
        count=nopt.getText();
        int i= Integer.parseInt(count);
        //System.out.println(iptext[0]);
        //System.out.println(iptext[1]);
        t1.setText("");
        t2.setText("");
        if((iptext[0].equalsIgnoreCase("TIRUPPUR")&&iptext[1].equalsIgnoreCase("PERUNDURAI"))||(iptext[1].equalsIgnoreCase("TIRUPPUR")&&iptext[0].equalsIgnoreCase("PERUNDURAI")))
        {
            //if(iptext[0].equalsIgnoreCase("PERUNDURAI")&&iptext[1].equalsIgnoreCase("TIRUPPUR"))
            cost=hc1*i;
            s=Float.toString(cost);
            t3.setText(s);
            //System.out.println(cost);
        }
        else if((iptext[0].equalsIgnoreCase("PERUNDURAI")&&iptext[1].equalsIgnoreCase("ERODE"))|| (iptext[1].equalsIgnoreCase("PERUNDURAI")&&iptext[0].equalsIgnoreCase("ERODE")))
        {
            cost=hc2*i;
            s=Float.toString(cost);
            t3.setText(s);
            //System.out.println(cost);
        }
        else if((iptext[0].equalsIgnoreCase("TIRUPPUR")&&iptext[1].equalsIgnoreCase("ERODE"))||(iptext[1].equalsIgnoreCase("TIRUPPUR")&&iptext[0].equalsIgnoreCase("ERODE")))
        {
            cost=fc*i;
            s=Float.toString(cost);
            t3.setText(s);
            //System.out.println(cost);
        }
        else
        {
            System.out.println("Invalid");
        } 
   }
   
   public void cost()
   {
       String fin=s;
       //System.out.println(fin);
   }
   
   public void payment()
   {
        payment_online pon=new payment_online();
        p_o_22 p22=new p_o_22();
        p_o_15 p15=new p_o_15();
        p_o_70 p70=new p_o_70();
        p_o_44 p44=new p_o_44();
        p_o_30 p30=new p_o_30();
        System.out.println(t3.getText());
        System.out.println("object created");
        pon.setVisible(false);
        if(t3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"INVALID","Alert",JOptionPane.WARNING_MESSAGE); 
            
        }
        else if(t3.getText().equalsIgnoreCase("35.0"))
                {
                    int loc = Integer.parseInt(nopt.getText());
                    if(loc<=2)
                    {
                         pon.setVisible(true);
                    }
                    
                }
         else if(t3.getText().equalsIgnoreCase("22.0"))
                {
                    int loc = Integer.parseInt(nopt.getText());
                    if(loc<=2)
                    {
                         p22.setVisible(true);
                    }
                    
                }
          else if(t3.getText().equalsIgnoreCase("15.0"))
                {
                    int loc = Integer.parseInt(nopt.getText());
                    if(loc<=2)
                    {
                        p15.setVisible(true);
                    }
                    
                }
           else if(t3.getText().equalsIgnoreCase("70.0"))
                {
                    int loc = Integer.parseInt(nopt.getText());
                    if(loc<=2)
                    {
                        p70.setVisible(true);
                    }
                    
                }
            else if(t3.getText().equalsIgnoreCase("44.0"))
                {
                   int loc = Integer.parseInt(nopt.getText());
                    if(loc<=2)
                    {
                        p44.setVisible(true);
                    }
                    
                }
             else if(t3.getText().equalsIgnoreCase("30.0"))
                {
                    int loc = Integer.parseInt(nopt.getText());
                    if(loc<=2)
                    {
                        p30.setVisible(true);
                    }
                    
                }
        else
        {
            JOptionPane.showMessageDialog(null,"ENTER MAX 2 PERSONS IN ONLINE","Alert",JOptionPane.WARNING_MESSAGE); ;
        
        }
   }
   
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        nopl = new javax.swing.JLabel();
        t3 = new app.bolivia.swing.JCTextField();
        t1 = new app.bolivia.swing.JCTextField();
        nopt = new app.bolivia.swing.JCTextField();
        clear = new javax.swing.JButton();
        to1 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        t2 = new app.bolivia.swing.JCTextField();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticketing_Form");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DEFAULT_PACKAGE/icons8-close-window-65.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 20, 50, 50));

        c1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        c1.setText(":");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 20, 30));

        c2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        c2.setText(":");
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 20, -1));

        c3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        c3.setText(":");
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 20, -1));

        from.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        from.setText("FROM");
        jPanel1.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, 30));

        ok.setBackground(new java.awt.Color(255, 255, 255));
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-ok-button-48.png"))); // NOI18N
        ok.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 260, 70));

        price.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        price.setText("Your price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 120, 30));

        nopl.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        nopl.setText("NO OF PERSONS");
        jPanel1.add(nopl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, -1));

        t3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        t3.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        t1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        t1.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        nopt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        nopt.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
        nopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noptActionPerformed(evt);
            }
        });
        jPanel1.add(nopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-clear-64.png"))); // NOI18N
        clear.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 260, 70));

        to1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        to1.setText("TO");
        jPanel1.add(to1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, -1));

        c4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        c4.setText(":");
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 20, -1));

        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 51)));
        t2.setFont(new java.awt.Font("Calisto MT", 1, 22)); // NOI18N
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        rSMaterialButtonCircle1.setText("OFFLINE");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 300, 80));

        rSMaterialButtonCircle2.setText("ONLINE");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 300, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/8493.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 1111));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 1111));

        setSize(new java.awt.Dimension(2000, 1111));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        nopt.setText("");
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        click();
        cost();
       
    }//GEN-LAST:event_okActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        payment_offline pof=new payment_offline();
        if(t3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"INVALID","Alert",JOptionPane.WARNING_MESSAGE); 
        }
        else
        {
            pof.setVisible(true);
        }
        
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        // TODO add your handling code he
        payment(); 
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void noptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noptActionPerformed

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
            java.util.logging.Logger.getLogger(frist_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frist_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frist_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frist_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frist_form().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JLabel from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nopl;
    private app.bolivia.swing.JCTextField nopt;
    private javax.swing.JButton ok;
    private javax.swing.JLabel price;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private app.bolivia.swing.JCTextField t1;
    private app.bolivia.swing.JCTextField t2;
    private app.bolivia.swing.JCTextField t3;
    private javax.swing.JLabel to1;
    // End of variables declaration//GEN-END:variables
}
