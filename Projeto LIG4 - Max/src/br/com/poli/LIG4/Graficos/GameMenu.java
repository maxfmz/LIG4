package br.com.poli.LIG4.Graficos;

import br.com.poli.LIG4.Info.Player;
import br.com.poli.LIG4.Info.Ranking;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class GameMenu extends javax.swing.JFrame {
    
    
    private Player player1;
    private Player player2;
    private int num;
    private Ranking ranking;
    
    public GameMenu(Player p1, Player p2, Ranking r) {
        this.player1 = p1;
        this.player2 = p2;
        this.ranking = r;
        this.num = 0;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseModeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        normalModeOne = new javax.swing.JRadioButton();
        normalModeMore = new javax.swing.JRadioButton();
        turboModeOne = new javax.swing.JRadioButton();
        turboModeMore = new javax.swing.JRadioButton();
        malucoModeFacil = new javax.swing.JRadioButton();
        malucoModeMedio = new javax.swing.JRadioButton();
        malucoModeDificil = new javax.swing.JRadioButton();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/confirm_button.png"))); // NOI18N
        confirmButton.setToolTipText("");
        confirmButton.setBorder(null);
        confirmButton.setBorderPainted(false);
        confirmButton.setContentAreaFilled(false);
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmButton.setFocusable(false);
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmButton);
        confirmButton.setBounds(420, 560, 140, 59);

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/botao_sair.png"))); // NOI18N
        returnButton.setToolTipText("");
        returnButton.setBorder(null);
        returnButton.setBorderPainted(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.setFocusable(false);
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonnone(evt);
            }
        });
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(returnButton);
        returnButton.setBounds(910, 20, 70, 60);

        chooseModeGroup.add(normalModeOne);
        normalModeOne.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        normalModeOne.setForeground(new java.awt.Color(153, 0, 0));
        normalModeOne.setText("Primeiro ponto vence");
        normalModeOne.setContentAreaFilled(false);
        normalModeOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        normalModeOne.setFocusable(false);
        normalModeOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalModeOneActionPerformed(evt);
            }
        });
        jPanel1.add(normalModeOne);
        normalModeOne.setBounds(180, 430, 170, 20);

        chooseModeGroup.add(normalModeMore);
        normalModeMore.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        normalModeMore.setForeground(new java.awt.Color(153, 0, 0));
        normalModeMore.setText("Mais pontos vence");
        normalModeMore.setContentAreaFilled(false);
        normalModeMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        normalModeMore.setFocusable(false);
        normalModeMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalModeMoreActionPerformed(evt);
            }
        });
        jPanel1.add(normalModeMore);
        normalModeMore.setBounds(180, 470, 160, 20);

        chooseModeGroup.add(turboModeOne);
        turboModeOne.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        turboModeOne.setForeground(new java.awt.Color(153, 0, 0));
        turboModeOne.setText("Primeiro ponto vence");
        turboModeOne.setContentAreaFilled(false);
        turboModeOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turboModeOne.setFocusable(false);
        turboModeOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turboModeOneActionPerformed(evt);
            }
        });
        jPanel1.add(turboModeOne);
        turboModeOne.setBounds(430, 430, 170, 20);

        chooseModeGroup.add(turboModeMore);
        turboModeMore.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        turboModeMore.setForeground(new java.awt.Color(153, 0, 0));
        turboModeMore.setText("Mais pontos vence");
        turboModeMore.setContentAreaFilled(false);
        turboModeMore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        turboModeMore.setFocusable(false);
        turboModeMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turboModeMoreActionPerformed(evt);
            }
        });
        jPanel1.add(turboModeMore);
        turboModeMore.setBounds(430, 470, 160, 20);

        chooseModeGroup.add(malucoModeFacil);
        malucoModeFacil.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        malucoModeFacil.setForeground(new java.awt.Color(153, 0, 0));
        malucoModeFacil.setText("Fácil");
        malucoModeFacil.setContentAreaFilled(false);
        malucoModeFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        malucoModeFacil.setFocusable(false);
        malucoModeFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malucoModeFacilActionPerformed(evt);
            }
        });
        jPanel1.add(malucoModeFacil);
        malucoModeFacil.setBounds(670, 430, 170, 20);

        chooseModeGroup.add(malucoModeMedio);
        malucoModeMedio.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        malucoModeMedio.setForeground(new java.awt.Color(153, 0, 0));
        malucoModeMedio.setText("Médio");
        malucoModeMedio.setContentAreaFilled(false);
        malucoModeMedio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        malucoModeMedio.setFocusable(false);
        malucoModeMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malucoModeMedioActionPerformed(evt);
            }
        });
        jPanel1.add(malucoModeMedio);
        malucoModeMedio.setBounds(670, 470, 160, 20);

        chooseModeGroup.add(malucoModeDificil);
        malucoModeDificil.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        malucoModeDificil.setForeground(new java.awt.Color(153, 0, 0));
        malucoModeDificil.setText("Díficil");
        malucoModeDificil.setContentAreaFilled(false);
        malucoModeDificil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        malucoModeDificil.setFocusable(false);
        malucoModeDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malucoModeDificilActionPerformed(evt);
            }
        });
        jPanel1.add(malucoModeDificil);
        malucoModeDificil.setBounds(670, 510, 160, 20);

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/chooseModeScreen.png"))); // NOI18N
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

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
    
        
        
        
        /*
            Cria o tipo do jogo dependendo da escolha do player.
        */   
        
        
        
        if(num == 0){
            JOptionPane.showMessageDialog(null, "Escolha um modo de jogo!");
        }else if(num == 1){
            try {
                this.dispose();
                GameNormal game = new GameNormal(player1,player2,true,ranking);
            } catch (IOException ex) {
                Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(num == 2){
            try {
                this.dispose();
                GameNormal game = new GameNormal(player1,player2,false,ranking);
            } catch (IOException ex) {
                Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(num == 3){
            try {
                this.dispose();
                GameTurbo game = new GameTurbo(player1,player2,true,ranking);
            } catch (IOException ex) {
                Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(num == 4){
            try {
                this.dispose();
                GameTurbo game = new GameTurbo(player1,player2,false,ranking);
            } catch (IOException ex) {
                Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(num == 5){
            try {
                this.dispose();
                GameTurboMaluco game = new GameTurboMaluco(player1,player2,20,ranking);
            } catch (IOException ex) {
                Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(num == 6){
            try {
                this.dispose();
                GameTurboMaluco game = new GameTurboMaluco(player1,player2,30,ranking);
            } catch (IOException ex) {
                Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(num == 7){
            try {
                this.dispose();
                GameTurboMaluco game = new GameTurboMaluco(player1,player2,40,ranking);
            } catch (IOException ex) {
                Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void normalModeOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalModeOneActionPerformed
        // TODO add your handling code here:
        num = 1;
    }//GEN-LAST:event_normalModeOneActionPerformed

    private void normalModeMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalModeMoreActionPerformed
        // TODO add your handling code here:
        num = 2;
    }//GEN-LAST:event_normalModeMoreActionPerformed

    private void turboModeOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turboModeOneActionPerformed
        // TODO add your handling code here:
        num = 3;
    }//GEN-LAST:event_turboModeOneActionPerformed

    private void turboModeMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turboModeMoreActionPerformed
        // TODO add your handling code here:
        num = 4;
    }//GEN-LAST:event_turboModeMoreActionPerformed

    private void malucoModeFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malucoModeFacilActionPerformed
        // TODO add your handling code here:
        num = 5;
    }//GEN-LAST:event_malucoModeFacilActionPerformed

    private void malucoModeDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malucoModeDificilActionPerformed
        // TODO add your handling code here:
        num = 7;
    }//GEN-LAST:event_malucoModeDificilActionPerformed

    private void malucoModeMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malucoModeMedioActionPerformed
        // TODO add your handling code here:
        num = 6;
    }//GEN-LAST:event_malucoModeMedioActionPerformed

    private void returnButtonnone(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonnone
        // TODO add your handling code here:
    }//GEN-LAST:event_returnButtonnone

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
    private javax.swing.ButtonGroup chooseModeGroup;
    public javax.swing.JButton confirmButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton malucoModeDificil;
    private javax.swing.JRadioButton malucoModeFacil;
    private javax.swing.JRadioButton malucoModeMedio;
    private javax.swing.JRadioButton normalModeMore;
    private javax.swing.JRadioButton normalModeOne;
    public javax.swing.JButton returnButton;
    private javax.swing.JRadioButton turboModeMore;
    private javax.swing.JRadioButton turboModeOne;
    // End of variables declaration//GEN-END:variables
}
