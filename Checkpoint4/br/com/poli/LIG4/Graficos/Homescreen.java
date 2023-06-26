package br.com.poli.LIG4.Graficos;

import br.com.poli.LIG4.Info.Ranking;
import java.io.IOException;



public class Homescreen extends javax.swing.JFrame {
    
    
    private Ranking ranking;
    
    public Homescreen(Ranking r) throws IOException {
        this.ranking = r;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit_button = new javax.swing.JButton();
        background_image = new javax.swing.JLabel();
        botaoJogar = new javax.swing.JButton();
        rankingBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        exit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/botao_sair.png"))); // NOI18N
        exit_button.setToolTipText("");
        exit_button.setBorder(null);
        exit_button.setBorderPainted(false);
        exit_button.setContentAreaFilled(false);
        exit_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_button.setFocusable(false);
        exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(exit_button);
        exit_button.setBounds(900, 40, 70, 60);

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/homescreen.png"))); // NOI18N
        background_image.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(background_image);
        background_image.setBounds(0, 0, 1000, 700);

        botaoJogar.setBorderPainted(false);
        botaoJogar.setContentAreaFilled(false);
        botaoJogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoJogar.setFocusPainted(false);
        botaoJogar.setFocusable(false);
        botaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoJogar);
        botaoJogar.setBounds(340, 380, 330, 50);

        rankingBotao.setBorderPainted(false);
        rankingBotao.setContentAreaFilled(false);
        rankingBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rankingBotao.setFocusPainted(false);
        rankingBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(rankingBotao);
        rankingBotao.setBounds(270, 450, 460, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PlayerMenu pMenu = new PlayerMenu(this.ranking);
        pMenu.setVisible(true); 
    }//GEN-LAST:event_botaoJogarActionPerformed

    private void rankingBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingBotaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Rankingscreen ranking = new Rankingscreen(this.ranking);
        ranking.setVisible(true);
    }//GEN-LAST:event_rankingBotaoActionPerformed

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private javax.swing.JButton botaoJogar;
    public javax.swing.JButton exit_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rankingBotao;
    // End of variables declaration//GEN-END:variables
}
