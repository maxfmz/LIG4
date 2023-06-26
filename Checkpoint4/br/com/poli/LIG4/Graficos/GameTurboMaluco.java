package br.com.poli.LIG4.Graficos;

import br.com.poli.LIG4.Game.ModeTurboMaluco;
import br.com.poli.LIG4.Info.Player;
import br.com.poli.LIG4.Info.Ranking;
import br.com.poli.LIG4.Tabuleiro.Board;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GameTurboMaluco extends javax.swing.JFrame implements GameConnection {
    
    private boolean move;
    private int choice;
    private boolean gameOn;
    private Ranking ranking;
    private Player playing;
    private Player standby;
    private ModeTurboMaluco game;
    
    public GameTurboMaluco(Player p1, Player p2, int p, Ranking r) throws IOException {
        this.move = true;
        this.choice = 0;
        this.gameOn = true;
        this.playing = p1;
        this.standby = p2;
        this.game = new ModeTurboMaluco(p1,p2, p,false);
        this.ranking = r;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        p_hand = new javax.swing.JLabel();
        botao00 = new javax.swing.JLabel();
        botao01 = new javax.swing.JLabel();
        botao02 = new javax.swing.JLabel();
        botao03 = new javax.swing.JLabel();
        botao04 = new javax.swing.JLabel();
        botao05 = new javax.swing.JLabel();
        botao06 = new javax.swing.JLabel();
        botao10 = new javax.swing.JLabel();
        botao11 = new javax.swing.JLabel();
        botao12 = new javax.swing.JLabel();
        botao13 = new javax.swing.JLabel();
        botao14 = new javax.swing.JLabel();
        botao15 = new javax.swing.JLabel();
        botao16 = new javax.swing.JLabel();
        botao20 = new javax.swing.JLabel();
        botao21 = new javax.swing.JLabel();
        botao22 = new javax.swing.JLabel();
        botao23 = new javax.swing.JLabel();
        botao24 = new javax.swing.JLabel();
        botao25 = new javax.swing.JLabel();
        botao26 = new javax.swing.JLabel();
        botao30 = new javax.swing.JLabel();
        botao31 = new javax.swing.JLabel();
        botao32 = new javax.swing.JLabel();
        botao33 = new javax.swing.JLabel();
        botao34 = new javax.swing.JLabel();
        botao35 = new javax.swing.JLabel();
        botao36 = new javax.swing.JLabel();
        botao40 = new javax.swing.JLabel();
        botao41 = new javax.swing.JLabel();
        botao42 = new javax.swing.JLabel();
        botao43 = new javax.swing.JLabel();
        botao44 = new javax.swing.JLabel();
        botao45 = new javax.swing.JLabel();
        botao46 = new javax.swing.JLabel();
        botao50 = new javax.swing.JLabel();
        botao51 = new javax.swing.JLabel();
        botao52 = new javax.swing.JLabel();
        botao53 = new javax.swing.JLabel();
        botao54 = new javax.swing.JLabel();
        botao55 = new javax.swing.JLabel();
        botao56 = new javax.swing.JLabel();
        return_button = new javax.swing.JButton();
        confirm_button = new javax.swing.JButton();
        left_button = new javax.swing.JButton();
        right_button = new javax.swing.JButton();
        player1_points = new javax.swing.JLabel();
        player2_points = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);

        p_hand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/standby_peca_azul.png"))); // NOI18N
        jPanel1.add(p_hand);
        p_hand.setBounds(40, -120, 220, 250);
        jPanel1.add(botao00);
        botao00.setBounds(80, 150, 60, 60);
        jPanel1.add(botao01);
        botao01.setBounds(170, 150, 60, 60);
        jPanel1.add(botao02);
        botao02.setBounds(260, 150, 60, 60);
        jPanel1.add(botao03);
        botao03.setBounds(350, 150, 60, 60);
        jPanel1.add(botao04);
        botao04.setBounds(440, 150, 60, 60);
        jPanel1.add(botao05);
        botao05.setBounds(530, 150, 60, 60);
        jPanel1.add(botao06);
        botao06.setBounds(620, 150, 60, 60);
        jPanel1.add(botao10);
        botao10.setBounds(80, 230, 60, 60);
        jPanel1.add(botao11);
        botao11.setBounds(170, 230, 60, 60);
        jPanel1.add(botao12);
        botao12.setBounds(260, 230, 60, 60);
        jPanel1.add(botao13);
        botao13.setBounds(350, 230, 60, 60);
        jPanel1.add(botao14);
        botao14.setBounds(440, 230, 60, 60);
        jPanel1.add(botao15);
        botao15.setBounds(530, 230, 60, 60);
        jPanel1.add(botao16);
        botao16.setBounds(620, 230, 60, 60);
        jPanel1.add(botao20);
        botao20.setBounds(80, 310, 60, 60);
        jPanel1.add(botao21);
        botao21.setBounds(170, 310, 60, 60);
        jPanel1.add(botao22);
        botao22.setBounds(260, 310, 60, 60);
        jPanel1.add(botao23);
        botao23.setBounds(350, 310, 60, 60);
        jPanel1.add(botao24);
        botao24.setBounds(440, 310, 60, 60);
        jPanel1.add(botao25);
        botao25.setBounds(530, 310, 60, 60);
        jPanel1.add(botao26);
        botao26.setBounds(620, 310, 60, 60);
        jPanel1.add(botao30);
        botao30.setBounds(80, 390, 60, 60);
        jPanel1.add(botao31);
        botao31.setBounds(170, 390, 60, 60);
        jPanel1.add(botao32);
        botao32.setBounds(260, 390, 60, 60);
        jPanel1.add(botao33);
        botao33.setBounds(350, 390, 60, 60);
        jPanel1.add(botao34);
        botao34.setBounds(440, 390, 60, 60);
        jPanel1.add(botao35);
        botao35.setBounds(530, 390, 60, 60);
        jPanel1.add(botao36);
        botao36.setBounds(620, 390, 60, 60);
        jPanel1.add(botao40);
        botao40.setBounds(80, 470, 60, 60);
        jPanel1.add(botao41);
        botao41.setBounds(170, 470, 60, 60);
        jPanel1.add(botao42);
        botao42.setBounds(260, 470, 60, 60);
        jPanel1.add(botao43);
        botao43.setBounds(350, 470, 60, 60);
        jPanel1.add(botao44);
        botao44.setBounds(440, 470, 60, 60);
        jPanel1.add(botao45);
        botao45.setBounds(530, 470, 60, 60);
        jPanel1.add(botao46);
        botao46.setBounds(620, 470, 60, 60);
        jPanel1.add(botao50);
        botao50.setBounds(80, 550, 60, 60);
        jPanel1.add(botao51);
        botao51.setBounds(170, 550, 60, 60);
        jPanel1.add(botao52);
        botao52.setBounds(260, 550, 60, 60);
        jPanel1.add(botao53);
        botao53.setBounds(350, 550, 60, 60);
        jPanel1.add(botao54);
        botao54.setBounds(440, 550, 60, 60);
        jPanel1.add(botao55);
        botao55.setBounds(530, 550, 60, 60);
        jPanel1.add(botao56);
        botao56.setBounds(620, 550, 60, 60);

        return_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/botao_return.png"))); // NOI18N
        return_button.setToolTipText("");
        return_button.setBorder(null);
        return_button.setBorderPainted(false);
        buttonGroup1.add(return_button);
        return_button.setContentAreaFilled(false);
        return_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_button.setFocusable(false);
        return_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_buttonMouseClicked(evt);
            }
        });
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(return_button);
        return_button.setBounds(890, 30, 60, 60);

        confirm_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/confirm_button.png"))); // NOI18N
        confirm_button.setToolTipText("");
        confirm_button.setBorder(null);
        confirm_button.setBorderPainted(false);
        buttonGroup1.add(confirm_button);
        confirm_button.setContentAreaFilled(false);
        confirm_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm_button.setFocusable(false);
        confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(confirm_button);
        confirm_button.setBounds(800, 600, 130, 60);

        left_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/botao_esquerda.png"))); // NOI18N
        left_button.setToolTipText("");
        left_button.setBorder(null);
        left_button.setBorderPainted(false);
        buttonGroup1.add(left_button);
        left_button.setContentAreaFilled(false);
        left_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        left_button.setFocusable(false);
        left_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                left_buttonMouseClicked(evt);
            }
        });
        left_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(left_button);
        left_button.setBounds(740, 490, 76, 80);

        right_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/botao_direita.png"))); // NOI18N
        right_button.setToolTipText("");
        right_button.setBorder(null);
        right_button.setBorderPainted(false);
        buttonGroup1.add(right_button);
        right_button.setContentAreaFilled(false);
        right_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        right_button.setFocusable(false);
        right_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(right_button);
        right_button.setBounds(900, 490, 82, 80);

        player1_points.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        player1_points.setForeground(new java.awt.Color(204, 0, 0));
        player1_points.setText(Integer.toString(game.getPoints(0)) + " pontos");
        jPanel1.add(player1_points);
        player1_points.setBounds(800, 210, 120, 40);

        player2_points.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        player2_points.setForeground(new java.awt.Color(255, 0, 0));
        player2_points.setText(Integer.toString(game.getPoints(0)) + " pontos");
        jPanel1.add(player2_points);
        player2_points.setBounds(800, 340, 120, 40);

        player2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 0, 0));
        player2.setText(standby.getName());
        jPanel1.add(player2);
        player2.setBounds(760, 300, 160, 40);

        player1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        player1.setForeground(new java.awt.Color(204, 0, 0));
        player1.setText(playing.getName());
        jPanel1.add(player1);
        player1.setBounds(760, 170, 150, 40);

        background_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/game_background.png"))); // NOI18N
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

    private void confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_buttonActionPerformed
        // TODO add your handling code here:
        try {
            makeMove();
            if(playing.getBot() && gameOn == true){
                botMove();
            }
        } catch (IOException ex) {
            Logger.getLogger(GameNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirm_buttonActionPerformed

    private void left_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left_buttonActionPerformed
        // TODO add your handling code here:
        this.choice--;
        if(choice == -1){
            choice = 0;
        }
        updateX(playing,choice);
    }//GEN-LAST:event_left_buttonActionPerformed

    private void right_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right_buttonActionPerformed
        // TODO add your handling code here:
        this.choice++;
        if(choice == 7){
            choice = 6;
        }
        updateX(playing,choice);
    }//GEN-LAST:event_right_buttonActionPerformed

    private void left_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_left_buttonMouseClicked

    private void return_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_return_buttonMouseClicked

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            Homescreen home = new Homescreen(ranking);
        } catch (IOException ex) {
            Logger.getLogger(GameNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_return_buttonActionPerformed

    /**
     * @throws java.io.IOException
     */
    
    
        /*
            Chama a função de turno, enviando o player que está jogando, e o x
            escohido. Testa se há um fim de jogo, e muda os players CASO a jogada
            tenha sido válida.
        */      
    
    @Override
    public void makeMove() throws IOException{
        move = game.turn(playing, standby, choice);
        updateGraphs(game.tab);
        endTest();
        switchPlayers(move);
        updateGraphs(game.tab);
    }
    
        /*
            Chama a função de turno, enviando o player que está jogando, e o x
            escohido. Testa se há um fim de jogo, e muda os players CASO a jogada
            tenha sido válida, será chamada logo após da jogada do Player1 no botão
            de confirm.
        */      
    
    @Override
    public void botMove() throws IOException{
        boolean apropriada = false;
        if(playing.getBot() == true){
            while(apropriada == false){
                move = game.turn(playing, standby, choice);
                updateGraphs(game.tab);
                endTest();
                apropriada = move;
            }
            switchPlayers(move);
            updateGraphs(game.tab);
        }
    }
    
        /*
            Se a jogada em questão foi válida, os players mudarão, e as condições
            serão reinicilizadas.
        */      
    
    @Override
    public void switchPlayers(boolean condition){
        if(condition == true){
            Player p = playing;
            playing = standby;
            standby = p;
            choice = 0;
            updateX(playing,choice);
        }
    }
    
        /*
            Testa se o jogo terminou ou não, e quem foi o vencedor. Logo após
            atualiza o ranking, e inicia a tela de Home.
        */      
    
    @Override
    public void endTest() throws IOException{
        Player p1 = null;
        Player p2 = null;
        if(playing.getNum() == 1){
            p1 = playing;
        }else if(playing.getNum() == 2){
            p2 = playing;
        }
        
        if(standby.getNum() == 1){
            p1 = standby;
        }else if(standby.getNum() == 2){
            p2 = standby;
        }
        
        boolean test = game.endGame(game.onePoint);
        if(test == true){
            if(game.getPoints(0) > game.getPoints(1)){
                JOptionPane.showMessageDialog(null, "Player 1 venceu!");
                ranking.addWins(p1);
            }else if(game.getPoints(1) > game.getPoints(0)){
                ranking.addWins(p2);
                JOptionPane.showMessageDialog(null, "Player 2 venceu!");
            }else{
                JOptionPane.showMessageDialog(null, "Empate!");
            }
            this.gameOn = false;
            this.dispose();
            Homescreen home = new Homescreen(ranking);
        }
    }
    
        /*
            Função que apenas muda os gráficos do jogo.
        */    
    
    public void updateX(Player p, int x){
            if(p.getNum() == 1){
                p_hand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/standby_peca_azul.png")));
            }else if(p.getNum() == 2){
                p_hand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/standby_peca_amarela.png")));
            }
            if(x == 0){
                p_hand.setBounds(40, -120, 220, 250);
            }else if(x == 1){
                p_hand.setBounds(130, -120, 220, 250);
            }else if(x == 2){
                p_hand.setBounds(220, -120, 220, 250);
            }else if(x == 3){
                p_hand.setBounds(310, -120, 220, 250);
            }else if(x == 4){
                p_hand.setBounds(400, -120, 220, 250);
            }else if(x == 5){
                p_hand.setBounds(490, -120, 220, 250);
            }else if(x == 6){
                p_hand.setBounds(580, -120, 220, 250);
            }
    }
    
        /*
            Função que apenas muda os gráficos do jogo.
        */   
    
    public void updateGraphs(Board tab){
        
        player1_points.setText(Integer.toString(game.getPoints(0)) + " ponto(s)");
        player2_points.setText(Integer.toString(game.getPoints(1)) + " ponto(s)");
        
        if(tab.getPiece(0,0).getExists() == false){
            botao00.setEnabled(false);
        }else if(tab.getPiece(0,0).getExists() == true){
            botao00.setEnabled(true);
            if(tab.getPiece(0, 0).getPlayer() != null){
                if(tab.getPiece(0,0).getPlayer().getNum() == 1){
                    if(tab.getPiece(0,0).getCanScore() == true){
                        botao00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(0,0).getCanScore() == false){
                        botao00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(0,0).getPlayer().getNum() == 2){
                    if(tab.getPiece(0,0).getCanScore() == true){
                        botao00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(0,0).getCanScore() == false){
                        botao00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(0,1).getExists() == false){
            botao01.setEnabled(false);
        }else if(tab.getPiece(0,1).getExists() == true){
            botao01.setEnabled(true);
            if(tab.getPiece(0, 1).getPlayer() != null){
                if(tab.getPiece(0,1).getPlayer().getNum() == 1){
                    if(tab.getPiece(0,1).getCanScore() == true){
                        botao01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(0,1).getCanScore() == false){
                        botao01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(0,1).getPlayer().getNum() == 2){
                    if(tab.getPiece(0,1).getCanScore() == true){
                        botao01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(0,1).getCanScore() == false){
                        botao01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(0,2).getExists() == false){
            botao02.setEnabled(false);
        }else if(tab.getPiece(0,2).getExists() == true){
            botao02.setEnabled(true);
            if(tab.getPiece(0, 2).getPlayer() != null){
                if(tab.getPiece(0,2).getPlayer().getNum() == 1){
                    if(tab.getPiece(0,2).getCanScore() == true){
                        botao02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(0,2).getCanScore() == false){
                        botao02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(0,2).getPlayer().getNum() == 2){
                    if(tab.getPiece(0,2).getCanScore() == true){
                        botao02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(0,2).getCanScore() == false){
                        botao02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(0,3).getExists() == false){
            botao03.setEnabled(false);
        }else if(tab.getPiece(0,3).getExists() == true){
            botao03.setEnabled(true);
            if(tab.getPiece(0, 3).getPlayer() != null){
                if(tab.getPiece(0,3).getPlayer().getNum() == 1){
                    if(tab.getPiece(0,3).getCanScore() == true){
                        botao03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(0,1).getCanScore() == false){
                        botao03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(0,3).getPlayer().getNum() == 2){
                    if(tab.getPiece(0,3).getCanScore() == true){
                        botao03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(0,3).getCanScore() == false){
                        botao03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(0,4).getExists() == false){
            botao04.setEnabled(false);
        }else if(tab.getPiece(0,4).getExists() == true){
            botao04.setEnabled(true);
            if(tab.getPiece(0, 4).getPlayer() != null){
                if(tab.getPiece(0,4).getPlayer().getNum() == 1){
                    if(tab.getPiece(0,4).getCanScore() == true){
                        botao04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(0,4).getCanScore() == false){
                        botao04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(0,4).getPlayer().getNum() == 2){
                    if(tab.getPiece(0,4).getCanScore() == true){
                        botao04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(0,4).getCanScore() == false){
                        botao04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(0,5).getExists() == false){
            botao05.setEnabled(false);
        }else if(tab.getPiece(0,5).getExists() == true){
            botao05.setEnabled(true);
            if(tab.getPiece(0, 5).getPlayer() != null){
                if(tab.getPiece(0,5).getPlayer().getNum() == 1){
                    if(tab.getPiece(0,5).getCanScore() == true){
                        botao05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(0,5).getCanScore() == false){
                        botao05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(0,5).getPlayer().getNum() == 2){
                    if(tab.getPiece(0,5).getCanScore() == true){
                        botao05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(0,5).getCanScore() == false){
                        botao05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(0,6).getExists() == false){
            botao06.setEnabled(false);
        }else if(tab.getPiece(0,6).getExists() == true){
            botao06.setEnabled(true);
            if(tab.getPiece(0, 6).getPlayer() != null){
                if(tab.getPiece(0,6).getPlayer().getNum() == 1){
                    if(tab.getPiece(0,6).getCanScore() == true){
                        botao06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(0,6).getCanScore() == false){
                        botao06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(0,6).getPlayer().getNum() == 2){
                    if(tab.getPiece(0,6).getCanScore() == true){
                        botao06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(0,6).getCanScore() == false){
                        botao06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }
        
        
        if(tab.getPiece(1,0).getExists() == false){
            botao10.setEnabled(false);
        }else if(tab.getPiece(1,0).getExists() == true){
            botao10.setEnabled(true);
            if(tab.getPiece(1,0).getPlayer() != null){
                if(tab.getPiece(1,0).getPlayer().getNum() == 1){
                    if(tab.getPiece(1,0).getCanScore() == true){
                        botao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(1,0).getCanScore() == false){
                        botao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(1,0).getPlayer().getNum() == 2){
                    if(tab.getPiece(1,0).getCanScore() == true){
                        botao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(1,0).getCanScore() == false){
                        botao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(1,1).getExists() == false){
            botao11.setEnabled(false);
        }else if(tab.getPiece(1,1).getExists() == true){
            botao11.setEnabled(true);
            if(tab.getPiece(1,1).getPlayer() != null){
                if(tab.getPiece(1,1).getPlayer().getNum() == 1){
                    if(tab.getPiece(1,1).getCanScore() == true){
                        botao11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(1,1).getCanScore() == false){
                        botao11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(1,1).getPlayer().getNum() == 2){
                    if(tab.getPiece(1,1).getCanScore() == true){
                        botao11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(1,1).getCanScore() == false){
                        botao11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(1,2).getExists() == false){
            botao12.setEnabled(false);
        }else if(tab.getPiece(1,2).getExists() == true){
            botao12.setEnabled(true);
            if(tab.getPiece(1,2).getPlayer() != null){
                if(tab.getPiece(1,2).getPlayer().getNum() == 1){
                    if(tab.getPiece(1,2).getCanScore() == true){
                        botao12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(1,2).getCanScore() == false){
                        botao12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(1,2).getPlayer().getNum() == 2){
                    if(tab.getPiece(1,2).getCanScore() == true){
                        botao12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(1,2).getCanScore() == false){
                        botao12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(1,3).getExists() == false){
            botao13.setEnabled(false);
        }else if(tab.getPiece(1,3).getExists() == true){
            botao13.setEnabled(true);
            if(tab.getPiece(1,3).getPlayer() != null){
                if(tab.getPiece(1,3).getPlayer().getNum() == 1){
                    if(tab.getPiece(1,3).getCanScore() == true){
                        botao13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(1,3).getCanScore() == false){
                        botao13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(1,3).getPlayer().getNum() == 2){
                    if(tab.getPiece(1,3).getCanScore() == true){
                        botao13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(1,3).getCanScore() == false){
                        botao13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(1,4).getExists() == false){
            botao14.setEnabled(false);
        }else if(tab.getPiece(1,4).getExists() == true){
            botao14.setEnabled(true);
            if(tab.getPiece(1,4).getPlayer() != null){
                if(tab.getPiece(1,4).getPlayer().getNum() == 1){
                    if(tab.getPiece(1,4).getCanScore() == true){
                        botao14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(1,4).getCanScore() == false){
                        botao14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(1,4).getPlayer().getNum() == 2){
                    if(tab.getPiece(1,4).getCanScore() == true){
                        botao14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(1,4).getCanScore() == false){
                        botao14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(1,5).getExists() == false){
            botao15.setEnabled(false);
        }else if(tab.getPiece(1,5).getExists() == true){
            botao15.setEnabled(true);
            if(tab.getPiece(1,5).getPlayer() != null){
                if(tab.getPiece(1,5).getPlayer().getNum() == 1){
                    if(tab.getPiece(1,5).getCanScore() == true){
                        botao15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(1,5).getCanScore() == false){
                        botao15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(1,5).getPlayer().getNum() == 2){
                    if(tab.getPiece(1,5).getCanScore() == true){
                        botao15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(1,5).getCanScore() == false){
                        botao15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(1,6).getExists() == false){
            botao16.setEnabled(false);
        }else if(tab.getPiece(1,6).getExists() == true){
            botao16.setEnabled(true);
            if(tab.getPiece(1,6).getPlayer() != null){
                if(tab.getPiece(1,6).getPlayer().getNum() == 1){
                    if(tab.getPiece(1,6).getCanScore() == true){
                        botao16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(1,6).getCanScore() == false){
                        botao16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(1,6).getPlayer().getNum() == 2){
                    if(tab.getPiece(1,6).getCanScore() == true){
                        botao16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(1,6).getCanScore() == false){
                        botao16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }
        
        
        if(tab.getPiece(2,0).getExists() == false){
            botao20.setEnabled(false);
        }else if(tab.getPiece(2,0).getExists() == true){
            botao20.setEnabled(true);
            if(tab.getPiece(2,0).getPlayer() != null){
                if(tab.getPiece(2,0).getPlayer().getNum() == 1){
                    if(tab.getPiece(2,0).getCanScore() == true){
                        botao20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(2,0).getCanScore() == false){
                        botao20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(2,0).getPlayer().getNum() == 2){
                    if(tab.getPiece(2,0).getCanScore() == true){
                        botao20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(2,0).getCanScore() == false){
                        botao20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(2,1).getExists() == false){
            botao21.setEnabled(false);
        }else if(tab.getPiece(2,1).getExists() == true){
            botao21.setEnabled(true);
            if(tab.getPiece(2,1).getPlayer() != null){
                if(tab.getPiece(2,1).getPlayer().getNum() == 1){
                    if(tab.getPiece(2,1).getCanScore() == true){
                        botao21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(2,1).getCanScore() == false){
                        botao21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(2,1).getPlayer().getNum() == 2){
                    if(tab.getPiece(2,1).getCanScore() == true){
                        botao21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(2,1).getCanScore() == false){
                        botao21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(2,2).getExists() == false){
            botao22.setEnabled(false);
        }else if(tab.getPiece(2,2).getExists() == true){
            botao22.setEnabled(true);
            if(tab.getPiece(2,2).getPlayer() != null){
                if(tab.getPiece(2,2).getPlayer().getNum() == 1){
                    if(tab.getPiece(2,2).getCanScore() == true){
                        botao22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(2,2).getCanScore() == false){
                        botao22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(2,2).getPlayer().getNum() == 2){
                    if(tab.getPiece(2,2).getCanScore() == true){
                        botao22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(2,2).getCanScore() == false){
                        botao22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(2,3).getExists() == false){
            botao23.setEnabled(false);
        }else if(tab.getPiece(2,3).getExists() == true){
            botao23.setEnabled(true);
            if(tab.getPiece(2,3).getPlayer() != null){
                if(tab.getPiece(2,3).getPlayer().getNum() == 1){
                    if(tab.getPiece(2,3).getCanScore() == true){
                        botao23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(2,3).getCanScore() == false){
                        botao23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(2,3).getPlayer().getNum() == 2){
                    if(tab.getPiece(2,3).getCanScore() == true){
                        botao23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(2,3).getCanScore() == false){
                        botao23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(2,4).getExists() == false){
            botao24.setEnabled(false);
        }else if(tab.getPiece(2,4).getExists() == true){
            botao24.setEnabled(true);
            if(tab.getPiece(2,4).getPlayer() != null){
                if(tab.getPiece(2,4).getPlayer().getNum() == 1){
                    if(tab.getPiece(2,4).getCanScore() == true){
                        botao24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(2,4).getCanScore() == false){
                        botao24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(2,4).getPlayer().getNum() == 2){
                    if(tab.getPiece(2,4).getCanScore() == true){
                        botao24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(2,4).getCanScore() == false){
                        botao24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(2,5).getExists() == false){
            botao25.setEnabled(false);
        }else if(tab.getPiece(2,5).getExists() == true){
            botao25.setEnabled(true);
            if(tab.getPiece(2,5).getPlayer() != null){
                if(tab.getPiece(2,5).getPlayer().getNum() == 1){
                    if(tab.getPiece(2,5).getCanScore() == true){
                        botao25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(2,5).getCanScore() == false){
                        botao25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(2,5).getPlayer().getNum() == 2){
                    if(tab.getPiece(2,5).getCanScore() == true){
                        botao25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(2,5).getCanScore() == false){
                        botao25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(2,6).getExists() == false){
            botao26.setEnabled(false);
        }else if(tab.getPiece(2,6).getExists() == true){
            botao26.setEnabled(true);
            if(tab.getPiece(2,6).getPlayer() != null){
                if(tab.getPiece(2,6).getPlayer().getNum() == 1){
                    if(tab.getPiece(2,6).getCanScore() == true){
                        botao26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(2,6).getCanScore() == false){
                        botao26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(2,6).getPlayer().getNum() == 2){
                    if(tab.getPiece(2,6).getCanScore() == true){
                        botao26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(2,6).getCanScore() == false){
                        botao26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }
        
        
        if(tab.getPiece(3,0).getExists() == false){
            botao30.setEnabled(false);
        }else if(tab.getPiece(3,0).getExists() == true){
            botao30.setEnabled(true);
            if(tab.getPiece(3,0).getPlayer() != null){
                if(tab.getPiece(3,0).getPlayer().getNum() == 1){
                    if(tab.getPiece(3,0).getCanScore() == true){
                        botao30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(3,0).getCanScore() == false){
                        botao30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(3,0).getPlayer().getNum() == 2){
                    if(tab.getPiece(3,0).getCanScore() == true){
                        botao30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(3,0).getCanScore() == false){
                        botao30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(3,1).getExists() == false){
            botao31.setEnabled(false);
        }else if(tab.getPiece(3,1).getExists() == true){
            botao31.setEnabled(true);
            if(tab.getPiece(3,1).getPlayer() != null){
                if(tab.getPiece(3,1).getPlayer().getNum() == 1){
                    if(tab.getPiece(3,1).getCanScore() == true){
                        botao31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(3,1).getCanScore() == false){
                        botao31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(3,1).getPlayer().getNum() == 2){
                    if(tab.getPiece(3,1).getCanScore() == true){
                        botao31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(3,1).getCanScore() == false){
                        botao31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(3,2).getExists() == false){
            botao32.setEnabled(false);
        }else if(tab.getPiece(3,2).getExists() == true){
            botao32.setEnabled(true);
            if(tab.getPiece(3,2).getPlayer() != null){
                if(tab.getPiece(3,2).getPlayer().getNum() == 1){
                    if(tab.getPiece(3,2).getCanScore() == true){
                        botao32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(3,2).getCanScore() == false){
                        botao32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(3,2).getPlayer().getNum() == 2){
                    if(tab.getPiece(3,2).getCanScore() == true){
                        botao32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(3,2).getCanScore() == false){
                        botao32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(3,3).getExists() == false){
            botao33.setEnabled(false);
        }else if(tab.getPiece(3,3).getExists() == true){
            botao33.setEnabled(true);
            if(tab.getPiece(3,3).getPlayer() != null){
                if(tab.getPiece(3,3).getPlayer().getNum() == 1){
                    if(tab.getPiece(3,3).getCanScore() == true){
                        botao33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(3,3).getCanScore() == false){
                        botao33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(3,3).getPlayer().getNum() == 2){
                    if(tab.getPiece(3,3).getCanScore() == true){
                        botao33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(3,3).getCanScore() == false){
                        botao33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(3,4).getExists() == false){
            botao34.setEnabled(false);
        }else if(tab.getPiece(3,4).getExists() == true){
            botao34.setEnabled(true);
            if(tab.getPiece(3,4).getPlayer() != null){
                if(tab.getPiece(3,4).getPlayer().getNum() == 1){
                    if(tab.getPiece(3,4).getCanScore() == true){
                        botao34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(3,4).getCanScore() == false){
                        botao34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(3,4).getPlayer().getNum() == 2){
                    if(tab.getPiece(3,4).getCanScore() == true){
                        botao34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(3,4).getCanScore() == false){
                        botao34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(3,5).getExists() == false){
            botao35.setEnabled(false);
        }else if(tab.getPiece(3,5).getExists() == true){
            botao35.setEnabled(true);
            if(tab.getPiece(3,5).getPlayer() != null){
                if(tab.getPiece(3,5).getPlayer().getNum() == 1){
                    if(tab.getPiece(3,5).getCanScore() == true){
                        botao35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(3,5).getCanScore() == false){
                        botao35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(3,5).getPlayer().getNum() == 2){
                    if(tab.getPiece(3,5).getCanScore() == true){
                        botao35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(3,5).getCanScore() == false){
                        botao35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(3,6).getExists() == false){
            botao36.setEnabled(false);
        }else if(tab.getPiece(3,6).getExists() == true){
            botao36.setEnabled(true);
            if(tab.getPiece(3,6).getPlayer() != null){
                if(tab.getPiece(3,6).getPlayer().getNum() == 1){
                    if(tab.getPiece(3,6).getCanScore() == true){
                        botao36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(3,6).getCanScore() == false){
                        botao36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(3,6).getPlayer().getNum() == 2){
                    if(tab.getPiece(3,6).getCanScore() == true){
                        botao36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(3,6).getCanScore() == false){
                        botao36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }
        
        
        
        if(tab.getPiece(4,0).getExists() == false){
            botao40.setEnabled(false);
        }else if(tab.getPiece(4,0).getExists() == true){
            botao40.setEnabled(true);
            if(tab.getPiece(4,0).getPlayer() != null){
                if(tab.getPiece(4,0).getPlayer().getNum() == 1){
                    if(tab.getPiece(4,0).getCanScore() == true){
                        botao40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(4,0).getCanScore() == false){
                        botao40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(4,0).getPlayer().getNum() == 2){
                    if(tab.getPiece(4,0).getCanScore() == true){
                        botao40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(4,0).getCanScore() == false){
                        botao40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(4,1).getExists() == false){
            botao41.setEnabled(false);
        }else if(tab.getPiece(4,1).getExists() == true){
            botao41.setEnabled(true);
            if(tab.getPiece(4,1).getPlayer() != null){
                if(tab.getPiece(4,1).getPlayer().getNum() == 1){
                    if(tab.getPiece(4,1).getCanScore() == true){
                        botao41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(4,1).getCanScore() == false){
                        botao41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(4,1).getPlayer().getNum() == 2){
                    if(tab.getPiece(4,1).getCanScore() == true){
                        botao41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(4,1).getCanScore() == false){
                        botao41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(4,2).getExists() == false){
            botao42.setEnabled(false);
        }else if(tab.getPiece(4,2).getExists() == true){
            botao42.setEnabled(true);
            if(tab.getPiece(4,2).getPlayer() != null){
                if(tab.getPiece(4,2).getPlayer().getNum() == 1){
                    if(tab.getPiece(4,2).getCanScore() == true){
                        botao42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(4,2).getCanScore() == false){
                        botao42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(4,2).getPlayer().getNum() == 2){
                    if(tab.getPiece(4,2).getCanScore() == true){
                        botao42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(4,2).getCanScore() == false){
                        botao42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(4,3).getExists() == false){
            botao43.setEnabled(false);
        }else if(tab.getPiece(4,3).getExists() == true){
            botao43.setEnabled(true);
            if(tab.getPiece(4,3).getPlayer() != null){
                if(tab.getPiece(4,3).getPlayer().getNum() == 1){
                    if(tab.getPiece(4,3).getCanScore() == true){
                        botao43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(4,3).getCanScore() == false){
                        botao43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(4,3).getPlayer().getNum() == 2){
                    if(tab.getPiece(4,3).getCanScore() == true){
                        botao43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(4,3).getCanScore() == false){
                        botao43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(4,4).getExists() == false){
            botao44.setEnabled(false);
        }else if(tab.getPiece(4,4).getExists() == true){
            botao44.setEnabled(true);
            if(tab.getPiece(4,4).getPlayer() != null){
                if(tab.getPiece(4,4).getPlayer().getNum() == 1){
                    if(tab.getPiece(4,4).getCanScore() == true){
                        botao44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(4,4).getCanScore() == false){
                        botao44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(4,4).getPlayer().getNum() == 2){
                    if(tab.getPiece(4,4).getCanScore() == true){
                        botao44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(4,4).getCanScore() == false){
                        botao44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(4,5).getExists() == false){
            botao45.setEnabled(false);
        }else if(tab.getPiece(4,5).getExists() == true){
            botao45.setEnabled(true);
            if(tab.getPiece(4,5).getPlayer() != null){
                if(tab.getPiece(4,5).getPlayer().getNum() == 1){
                    if(tab.getPiece(4,5).getCanScore() == true){
                        botao45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(4,5).getCanScore() == false){
                        botao45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(4,5).getPlayer().getNum() == 2){
                    if(tab.getPiece(4,5).getCanScore() == true){
                        botao45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(4,5).getCanScore() == false){
                        botao45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(4,6).getExists() == false){
            botao46.setEnabled(false);
        }else if(tab.getPiece(4,6).getExists() == true){
            botao46.setEnabled(true);
            if(tab.getPiece(4,6).getPlayer() != null){
                if(tab.getPiece(4,6).getPlayer().getNum() == 1){
                    if(tab.getPiece(4,6).getCanScore() == true){
                        botao46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(4,6).getCanScore() == false){
                        botao46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(4,6).getPlayer().getNum() == 2){
                    if(tab.getPiece(4,6).getCanScore() == true){
                        botao46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(4,6).getCanScore() == false){
                        botao46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }
        
        
        
        
        if(tab.getPiece(5,0).getExists() == false){
            botao50.setEnabled(false);
        }else if(tab.getPiece(5,0).getExists() == true){
            botao50.setEnabled(true);
            if(tab.getPiece(5,0).getPlayer() != null){
                if(tab.getPiece(5,0).getPlayer().getNum() == 1){
                    if(tab.getPiece(5,0).getCanScore() == true){
                        botao50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(5,0).getCanScore() == false){
                        botao50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(5,0).getPlayer().getNum() == 2){
                    if(tab.getPiece(5,0).getCanScore() == true){
                        botao50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(5,0).getCanScore() == false){
                        botao50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(5,1).getExists() == false){
            botao51.setEnabled(false);
        }else if(tab.getPiece(5,1).getExists() == true){
            botao51.setEnabled(true);
            if(tab.getPiece(5,1).getPlayer() != null){
                if(tab.getPiece(5,1).getPlayer().getNum() == 1){
                    if(tab.getPiece(5,1).getCanScore() == true){
                        botao51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(5,1).getCanScore() == false){
                        botao51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(5,1).getPlayer().getNum() == 2){
                    if(tab.getPiece(5,1).getCanScore() == true){
                        botao51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(5,1).getCanScore() == false){
                        botao51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(5,2).getExists() == false){
            botao52.setEnabled(false);
        }else if(tab.getPiece(5,2).getExists() == true){
            botao52.setEnabled(true);
            if(tab.getPiece(5,2).getPlayer() != null){
                if(tab.getPiece(5,2).getPlayer().getNum() == 1){
                    if(tab.getPiece(5,2).getCanScore() == true){
                        botao52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(5,2).getCanScore() == false){
                        botao52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(5,2).getPlayer().getNum() == 2){
                    if(tab.getPiece(5,2).getCanScore() == true){
                        botao52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(5,2).getCanScore() == false){
                        botao52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(5,3).getExists() == false){
            botao53.setEnabled(false);
        }else if(tab.getPiece(5,3).getExists() == true){
            botao53.setEnabled(true);
            if(tab.getPiece(5,3).getPlayer() != null){
                if(tab.getPiece(5,3).getPlayer().getNum() == 1){
                    if(tab.getPiece(5,3).getCanScore() == true){
                        botao53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(5,3).getCanScore() == false){
                        botao53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(5,3).getPlayer().getNum() == 2){
                    if(tab.getPiece(5,3).getCanScore() == true){
                        botao53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(5,3).getCanScore() == false){
                        botao53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(5,4).getExists() == false){
            botao54.setEnabled(false);
        }else if(tab.getPiece(5,4).getExists() == true){
            botao54.setEnabled(true);
            if(tab.getPiece(5,4).getPlayer() != null){
                if(tab.getPiece(5,4).getPlayer().getNum() == 1){
                    if(tab.getPiece(5,4).getCanScore() == true){
                        botao54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(5,4).getCanScore() == false){
                        botao54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(5,4).getPlayer().getNum() == 2){
                    if(tab.getPiece(5,4).getCanScore() == true){
                        botao54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(5,4).getCanScore() == false){
                        botao54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }


        if(tab.getPiece(5,5).getExists() == false){
            botao55.setEnabled(false);
        }else if(tab.getPiece(5,5).getExists() == true){
            botao55.setEnabled(true);
            if(tab.getPiece(5,5).getPlayer() != null){
                if(tab.getPiece(5,5).getPlayer().getNum() == 1){
                    if(tab.getPiece(5,5).getCanScore() == true){
                        botao55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(5,5).getCanScore() == false){
                        botao55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(5,5).getPlayer().getNum() == 2){
                    if(tab.getPiece(5,5).getCanScore() == true){
                        botao55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(5,5).getCanScore() == false){
                        botao55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }



        if(tab.getPiece(5,6).getExists() == false){
            botao56.setEnabled(false);
        }else if(tab.getPiece(5,6).getExists() == true){
            botao56.setEnabled(true);
            if(tab.getPiece(5,6).getPlayer() != null){
                if(tab.getPiece(5,6).getPlayer().getNum() == 1){
                    if(tab.getPiece(5,6).getCanScore() == true){
                        botao56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_azul.png")));
                    }else if(tab.getPiece(5,6).getCanScore() == false){
                        botao56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_azul.png")));
                    }
                }else if(tab.getPiece(5,6).getPlayer().getNum() == 2){
                    if(tab.getPiece(5,6).getCanScore() == true){
                        botao56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/peca_amarela.png")));
                    }else if(tab.getPiece(5,6).getCanScore() == false){
                        botao56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/poli/LIG4/Graficos/graficos/ponto_amarela.png")));
                    }
                }
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_image;
    private javax.swing.JLabel botao00;
    private javax.swing.JLabel botao01;
    private javax.swing.JLabel botao02;
    private javax.swing.JLabel botao03;
    private javax.swing.JLabel botao04;
    private javax.swing.JLabel botao05;
    private javax.swing.JLabel botao06;
    private javax.swing.JLabel botao10;
    private javax.swing.JLabel botao11;
    private javax.swing.JLabel botao12;
    private javax.swing.JLabel botao13;
    private javax.swing.JLabel botao14;
    private javax.swing.JLabel botao15;
    private javax.swing.JLabel botao16;
    private javax.swing.JLabel botao20;
    private javax.swing.JLabel botao21;
    private javax.swing.JLabel botao22;
    private javax.swing.JLabel botao23;
    private javax.swing.JLabel botao24;
    private javax.swing.JLabel botao25;
    private javax.swing.JLabel botao26;
    private javax.swing.JLabel botao30;
    private javax.swing.JLabel botao31;
    private javax.swing.JLabel botao32;
    private javax.swing.JLabel botao33;
    private javax.swing.JLabel botao34;
    private javax.swing.JLabel botao35;
    private javax.swing.JLabel botao36;
    private javax.swing.JLabel botao40;
    private javax.swing.JLabel botao41;
    private javax.swing.JLabel botao42;
    private javax.swing.JLabel botao43;
    private javax.swing.JLabel botao44;
    private javax.swing.JLabel botao45;
    private javax.swing.JLabel botao46;
    private javax.swing.JLabel botao50;
    private javax.swing.JLabel botao51;
    private javax.swing.JLabel botao52;
    private javax.swing.JLabel botao53;
    private javax.swing.JLabel botao54;
    private javax.swing.JLabel botao55;
    private javax.swing.JLabel botao56;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirm_button;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton left_button;
    private javax.swing.JLabel p_hand;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player1_points;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel player2_points;
    public javax.swing.JButton return_button;
    private javax.swing.JButton right_button;
    // End of variables declaration//GEN-END:variables
}
