package br.com.poli.LIG4.Graficos;

import br.com.poli.LIG4.Exceptions.InvalidValue;
import br.com.poli.LIG4.Info.Player;
import br.com.poli.LIG4.Info.Ranking;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PlayerMenu extends javax.swing.JFrame {
    
    private Ranking ranking;
    
    public PlayerMenu(Ranking ranking) {
        this.ranking = ranking;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        return_button = new javax.swing.JButton();
        background_image = new javax.swing.JLabel();
        vsMachine = new javax.swing.JButton();
        vsPlayer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        return_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/botao_return.png"))); // NOI18N
        return_button.setToolTipText("");
        return_button.setBorder(null);
        return_button.setBorderPainted(false);
        return_button.setContentAreaFilled(false);
        return_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_button.setFocusable(false);
        return_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(return_button);
        return_button.setBounds(900, 40, 70, 60);

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/choosePlayer_screen.png"))); // NOI18N
        background_image.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(background_image);
        background_image.setBounds(0, 0, 1000, 700);

        vsMachine.setBorderPainted(false);
        vsMachine.setContentAreaFilled(false);
        vsMachine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vsMachine.setFocusPainted(false);
        vsMachine.setFocusable(false);
        vsMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsMachineActionPerformed(evt);
            }
        });
        jPanel1.add(vsMachine);
        vsMachine.setBounds(320, 190, 350, 100);

        vsPlayer.setBorderPainted(false);
        vsPlayer.setContentAreaFilled(false);
        vsPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vsPlayer.setFocusPainted(false);
        vsPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsPlayerActionPerformed(evt);
            }
        });
        jPanel1.add(vsPlayer);
        vsPlayer.setBounds(320, 360, 370, 110);

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

    private void vsMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsMachineActionPerformed
   
        
        
        /*
            Recebe uma string e checa a sua validade. Caso seja válida, ela será
            passada como parametro para checar se já existe algum player no ranking
            com aquele nome, caso sim, seus dados serão usados como Player. Caso
            contrário, um novo player será criado. Depois ele pega os dados do
            bot que já está no ranking, se certifica que ele será um bot, e cria
            um novo jogo com os dois players.
        */   
        
        
        String nomeP1 = JOptionPane.showInputDialog("Nome do player");      
	if (nomeP1 == null || nomeP1.isEmpty()) {
		JOptionPane.showMessageDialog(null, "Voce precisa dizer seu nome para comecar a jogar!");
        }else if (nomeP1.length() > 10) {
            JOptionPane.showMessageDialog(null, "Escolha um nome de ate 10 caracteres");
        }else if (nomeP1.equals("Maquina")) {
            JOptionPane.showMessageDialog(null, "Nome invalido!");
        }else{
            Player p1 = ranking.checkPlayers(nomeP1);
            if(p1 == null){
                p1 = new Player(nomeP1, 1);
                try {
                    ranking.addPlayer(p1); //adiciona player1 no ranking
                } catch (IOException ex) {
                    Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    p1.setNum(1);
                } catch (InvalidValue ex) {
                    Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Player p2 = ranking.checkPlayers("Maquina");
            try {
                p2.setNum(2);
                p2.setBot(true);
            } catch (InvalidValue ex) {
                Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            GameMenu gMenu = new GameMenu(p1,p2,ranking);
        }
    }//GEN-LAST:event_vsMachineActionPerformed

    private void vsPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsPlayerActionPerformed
   
        
        /*
            Recebe uma string e checa a sua validade. Caso seja válida, ela será
            passada como parametro para checar se já existe algum player no ranking
            com aquele nome, caso sim, seus dados serão usados como Player. Caso
            contrário, um novo player será criado. Repete o processo para o segundo
            player, e cria um jogo com os dois valores válidos.
        */   
        
        
        String nomeP1 = JOptionPane.showInputDialog("Nome do player");      
	if (nomeP1 == null || nomeP1.isEmpty()) {
		JOptionPane.showMessageDialog(null, "Voce precisa dizer seu nome para comecar a jogar!");
        }else if (nomeP1.length() > 10) {
            JOptionPane.showMessageDialog(null, "Escolha um nome de ate 10 caracteres");
        }else if (nomeP1.equals("Maquina")) {
            JOptionPane.showMessageDialog(null, "Nome invalido!");
        }else{
            Player p1 = ranking.checkPlayers(nomeP1);
            if(p1 == null){
                p1 = new Player(nomeP1, 1);
                try {
                    ranking.addPlayer(p1);
                } catch (IOException ex) {
                    Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    p1.setNum(1);
                } catch (InvalidValue ex) {
                    Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            String nomeP2 = JOptionPane.showInputDialog("Nome do player 2");
            if (nomeP2 == null || nomeP2.isEmpty()) {
		JOptionPane.showMessageDialog(null, "Voce precisa dizer seu nome para comecar a jogar!");
            }else if (nomeP2.length() > 10) {
                JOptionPane.showMessageDialog(null, "Escolha um nome de ate 10 caracteres");
            }else if (nomeP2.equals("Maquina")) {
                JOptionPane.showMessageDialog(null, "Nome invalido!");
            }else if (nomeP2.equals(nomeP1)) {
                JOptionPane.showMessageDialog(null, "Nome invalido!");
            }else{
            Player p2 = ranking.checkPlayers(nomeP2);
            if(p2 == null){
                p2 = new Player(nomeP2, 2);
                try {
                    ranking.addPlayer(p2);
                } catch (IOException ex) {
                    Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    p2.setNum(2);
                } catch (InvalidValue ex) {
                    Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.dispose();
            GameMenu gMenu = new GameMenu(p1,p2,ranking);
            }
        }
    }//GEN-LAST:event_vsPlayerActionPerformed

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Homescreen home;
        try {
            home = new Homescreen(ranking);
        } catch (IOException ex) {
            Logger.getLogger(PlayerMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_return_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton return_button;
    private javax.swing.JButton vsMachine;
    private javax.swing.JButton vsPlayer;
    // End of variables declaration//GEN-END:variables
}
