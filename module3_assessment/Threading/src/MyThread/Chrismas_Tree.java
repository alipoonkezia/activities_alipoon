/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyThread;

import java.awt.Color;
import java.util.Random;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Kesiah
 */
public class Chrismas_Tree extends javax.swing.JFrame {

    /**
     * Creates new form Chrismas_Tree
     */
    public Chrismas_Tree() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SIR = new javax.swing.JLabel();
        MC = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        O = new javax.swing.JLabel();
        GIFT = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        A15 = new javax.swing.JLabel();
        A16 = new javax.swing.JLabel();
        K = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        Q = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        U = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        STAND = new javax.swing.JPanel();
        A1 = new javax.swing.JLabel();
        GIFT1 = new javax.swing.JLabel();
        GIFT2 = new javax.swing.JLabel();
        GIFT4 = new javax.swing.JLabel();
        GIFT5 = new javax.swing.JLabel();
        GIFT6 = new javax.swing.JLabel();
        GIFT7 = new javax.swing.JLabel();
        GIFT8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIR.setFont(new java.awt.Font("Ravie", 2, 30)); // NOI18N
        SIR.setText("SIR JAVIER");
        jPanel2.add(SIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 310, -1));

        MC.setFont(new java.awt.Font("Ravie", 3, 30)); // NOI18N
        MC.setText("MERRY CHRISMAS");
        jPanel2.add(MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 470, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_power_off_button_45px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, 40));

        O.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        O.setForeground(new java.awt.Color(255, 255, 255));
        O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O.setText("O");
        O.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        O.setOpaque(true);
        jPanel2.add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 40, -1));

        GIFT.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        GIFT.setForeground(new java.awt.Color(255, 255, 255));
        GIFT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_christmas_star_60px.png"))); // NOI18N
        GIFT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, 60));

        B.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        B.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B.setOpaque(true);
        jPanel2.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 40, -1));

        C.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.setText("C");
        C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        C.setOpaque(true);
        jPanel2.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 40, -1));

        D.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.setText("D");
        D.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        D.setOpaque(true);
        jPanel2.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 40, -1));

        E.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        E.setForeground(new java.awt.Color(255, 255, 255));
        E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E.setText("E");
        E.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        E.setOpaque(true);
        jPanel2.add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 40, -1));

        F.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        F.setForeground(new java.awt.Color(255, 255, 255));
        F.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F.setText("F");
        F.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        F.setOpaque(true);
        jPanel2.add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 40, -1));

        G.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        G.setForeground(new java.awt.Color(255, 255, 255));
        G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G.setText("G");
        G.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        G.setOpaque(true);
        jPanel2.add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 40, -1));

        H.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        H.setForeground(new java.awt.Color(255, 255, 255));
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("H");
        H.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        H.setOpaque(true);
        jPanel2.add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 40, -1));

        I.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        I.setForeground(new java.awt.Color(255, 255, 255));
        I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I.setText("I");
        I.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        I.setOpaque(true);
        jPanel2.add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 40, -1));

        J.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        J.setForeground(new java.awt.Color(255, 255, 255));
        J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J.setText("J");
        J.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        J.setOpaque(true);
        jPanel2.add(J, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 40, -1));

        Z.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        Z.setForeground(new java.awt.Color(255, 255, 255));
        Z.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Z.setText("Z");
        Z.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Z.setOpaque(true);
        jPanel2.add(Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 40, -1));

        L.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        L.setForeground(new java.awt.Color(255, 255, 255));
        L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L.setText("L");
        L.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L.setOpaque(true);
        jPanel2.add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 40, -1));

        M.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        M.setForeground(new java.awt.Color(255, 255, 255));
        M.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M.setText("M");
        M.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        M.setOpaque(true);
        jPanel2.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 40, -1));

        N.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        N.setForeground(new java.awt.Color(255, 255, 255));
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText("N");
        N.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N.setOpaque(true);
        jPanel2.add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 40, -1));

        A15.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        A15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A15.setText("A");
        A15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A15.setOpaque(true);
        jPanel2.add(A15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 40, -1));

        A16.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        A16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A16.setText("A");
        A16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A16.setOpaque(true);
        jPanel2.add(A16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 40, -1));

        K.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        K.setForeground(new java.awt.Color(255, 255, 255));
        K.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        K.setText("K");
        K.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        K.setOpaque(true);
        jPanel2.add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 40, -1));

        P.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        P.setForeground(new java.awt.Color(255, 255, 255));
        P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P.setText("P");
        P.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        P.setOpaque(true);
        jPanel2.add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 40, -1));

        Q.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        Q.setForeground(new java.awt.Color(255, 255, 255));
        Q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Q.setText("Q");
        Q.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q.setOpaque(true);
        jPanel2.add(Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 40, -1));

        R.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        R.setForeground(new java.awt.Color(255, 255, 255));
        R.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R.setText("R");
        R.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        R.setOpaque(true);
        jPanel2.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 40, -1));

        S.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        S.setForeground(new java.awt.Color(255, 255, 255));
        S.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        S.setText("S");
        S.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        S.setOpaque(true);
        jPanel2.add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 40, -1));

        T.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        T.setForeground(new java.awt.Color(255, 255, 255));
        T.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T.setText("T");
        T.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        T.setOpaque(true);
        jPanel2.add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 40, -1));

        U.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        U.setForeground(new java.awt.Color(255, 255, 255));
        U.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U.setText("U");
        U.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        U.setOpaque(true);
        jPanel2.add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 40, -1));

        W.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        W.setForeground(new java.awt.Color(255, 255, 255));
        W.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        W.setText("W");
        W.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        W.setOpaque(true);
        jPanel2.add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 40, -1));

        X.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        X.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        X.setOpaque(true);
        jPanel2.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 40, -1));

        Y.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        Y.setForeground(new java.awt.Color(255, 255, 255));
        Y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Y.setText("Y");
        Y.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Y.setOpaque(true);
        jPanel2.add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 40, -1));

        V.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        V.setForeground(new java.awt.Color(255, 255, 255));
        V.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        V.setText("V");
        V.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        V.setOpaque(true);
        jPanel2.add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 40, -1));

        javax.swing.GroupLayout STANDLayout = new javax.swing.GroupLayout(STAND);
        STAND.setLayout(STANDLayout);
        STANDLayout.setHorizontalGroup(
            STANDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        STANDLayout.setVerticalGroup(
            STANDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel2.add(STAND, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 40, 80));

        A1.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        A1.setForeground(new java.awt.Color(255, 255, 255));
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setText("A");
        A1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A1.setOpaque(true);
        jPanel2.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 40, -1));

        GIFT1.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        GIFT1.setForeground(new java.awt.Color(255, 255, 255));
        GIFT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_gift_45px.png"))); // NOI18N
        GIFT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 40, 50));

        GIFT2.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        GIFT2.setForeground(new java.awt.Color(255, 255, 255));
        GIFT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_gift_50px.png"))); // NOI18N
        GIFT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 60, 50));

        GIFT4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        GIFT4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT4.setText("CLICK THE BUTTON");
        GIFT4.setToolTipText("");
        GIFT4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 50));

        GIFT5.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        GIFT5.setForeground(new java.awt.Color(255, 255, 255));
        GIFT5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_wedding_gift_50px.png"))); // NOI18N
        GIFT5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 50, 50));

        GIFT6.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        GIFT6.setForeground(new java.awt.Color(255, 255, 255));
        GIFT6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_gift_49px.png"))); // NOI18N
        GIFT6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 50, 50));

        GIFT7.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        GIFT7.setForeground(new java.awt.Color(255, 255, 255));
        GIFT7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_gift_39px.png"))); // NOI18N
        GIFT7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 50, 50));

        GIFT8.setFont(new java.awt.Font("Tahoma", 1, 37)); // NOI18N
        GIFT8.setForeground(new java.awt.Color(255, 255, 255));
        GIFT8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GIFT8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_gift_39px.png"))); // NOI18N
        GIFT8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(GIFT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 50, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8_cancel_41px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 40, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        command com = new command();
        Thread th = new Thread(com);
        th.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Chrismas_Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chrismas_Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chrismas_Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chrismas_Tree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chrismas_Tree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A15;
    private javax.swing.JLabel A16;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel G;
    private javax.swing.JLabel GIFT;
    private javax.swing.JLabel GIFT1;
    private javax.swing.JLabel GIFT2;
    private javax.swing.JLabel GIFT4;
    private javax.swing.JLabel GIFT5;
    private javax.swing.JLabel GIFT6;
    private javax.swing.JLabel GIFT7;
    private javax.swing.JLabel GIFT8;
    private javax.swing.JLabel H;
    private javax.swing.JLabel I;
    private javax.swing.JLabel J;
    private javax.swing.JLabel K;
    private javax.swing.JLabel L;
    private javax.swing.JLabel M;
    private javax.swing.JLabel MC;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JLabel Q;
    private javax.swing.JLabel R;
    private javax.swing.JLabel S;
    private javax.swing.JLabel SIR;
    private javax.swing.JPanel STAND;
    private javax.swing.JLabel T;
    private javax.swing.JLabel U;
    private javax.swing.JLabel V;
    private javax.swing.JLabel W;
    private javax.swing.JLabel X;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel Z;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    class command implements Runnable {

        @Override
        public void run() {

            Random rand = new Random();

            try {
                while (true) {
                    Thread.sleep(300);

                    
                    MC.setForeground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    SIR.setForeground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    GIFT.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    A1.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    B.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    C.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    D.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    E.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    F.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    G.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    H.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    I.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    J.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    K.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    L.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    M.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    N.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    O.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    P.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    Q.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    R.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    S.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    T.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    U.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    V.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    W.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    X.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    Y.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    Z.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                    STAND.setBackground(new Color(rand.nextInt(241), rand.nextInt(241), rand.nextInt(241)));
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        }
    
    
}

}
