package br.com.poli.LIG4.Graficos;

import br.com.poli.LIG4.Info.Ranking;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Rankingscreen extends javax.swing.JFrame {
    
    private Ranking ranking;
    
    public Rankingscreen(Ranking ranking) {
        this.ranking = ranking;
        ranking.sortRanking();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        returnButton = new javax.swing.JButton();
        winsP1 = new javax.swing.JLabel();
        winsP2 = new javax.swing.JLabel();
        winsP3 = new javax.swing.JLabel();
        winsP4 = new javax.swing.JLabel();
        winsP5 = new javax.swing.JLabel();
        player5 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/botao_return.png"))); // NOI18N
        returnButton.setToolTipText("");
        returnButton.setBorder(null);
        returnButton.setBorderPainted(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.setFocusable(false);
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(returnButton);
        returnButton.setBounds(900, 40, 60, 60);

        winsP1.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        winsP1.setForeground(new java.awt.Color(51, 0, 0));
        winsP1.setText(ranking.getPlayerList().get(0).getWins() + " vitorias");
        jPanel1.add(winsP1);
        winsP1.setBounds(70, 270, 240, 50);

        winsP2.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        winsP2.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 1){
            winsP2.setText(ranking.getPlayerList().get(1).getWins() + " vitorias");
        }
        jPanel1.add(winsP2);
        winsP2.setBounds(400, 270, 240, 50);

        winsP3.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        winsP3.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 2){
            winsP3.setText(ranking.getPlayerList().get(2).getWins() + " vitorias");
        }
        jPanel1.add(winsP3);
        winsP3.setBounds(730, 270, 240, 50);

        winsP4.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        winsP4.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 3){
            winsP4.setText(ranking.getPlayerList().get(3).getWins() + " vitorias");
        }
        jPanel1.add(winsP4);
        winsP4.setBounds(220, 560, 240, 50);

        winsP5.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        winsP5.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 4){
            winsP5.setText(ranking.getPlayerList().get(4).getWins() + " vitorias");
        }
        jPanel1.add(winsP5);
        winsP5.setBounds(580, 560, 240, 50);

        player5.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        player5.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 4){
            player5.setText(ranking.getPlayerList().get(4).getName());
        }
        jPanel1.add(player5);
        player5.setBounds(630, 470, 190, 50);

        player4.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        player4.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 3){
            player4.setText(ranking.getPlayerList().get(3).getName());
        }
        jPanel1.add(player4);
        player4.setBounds(270, 470, 190, 50);

        player3.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        player3.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 2){
            player3.setText(ranking.getPlayerList().get(2).getName());
        }
        jPanel1.add(player3);
        player3.setBounds(780, 190, 190, 50);

        player2.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        player2.setForeground(new java.awt.Color(51, 0, 0));
        if(ranking.getPlayerList().size() > 1){
            player2.setText(ranking.getPlayerList().get(1).getName());
        }
        jPanel1.add(player2);
        player2.setBounds(450, 190, 190, 50);

        player1.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        player1.setForeground(new java.awt.Color(51, 0, 0));
        player1.setText(ranking.getPlayerList().get(0).getName());
        jPanel1.add(player1);
        player1.setBounds(120, 190, 190, 50);

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/rankingScreen.png"))); // NOI18N
        background_image.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(background_image);
        background_image.setBounds(0, 0, 1000, 700);

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

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Homescreen home;
        try {
            home = new Homescreen(ranking);
        } catch (IOException ex) {
            Logger.getLogger(Rankingscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel player3;
    private javax.swing.JLabel player4;
    private javax.swing.JLabel player5;
    public javax.swing.JButton returnButton;
    private javax.swing.JLabel winsP1;
    private javax.swing.JLabel winsP2;
    private javax.swing.JLabel winsP3;
    private javax.swing.JLabel winsP4;
    private javax.swing.JLabel winsP5;
    // End of variables declaration//GEN-END:variables
}
