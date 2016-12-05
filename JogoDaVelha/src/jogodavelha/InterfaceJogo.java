/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;



/**
 *
 * String Nome = "Rafael Andrade";String RA = "2215100617";
 */
public class InterfaceJogo extends javax.swing.JFrame {

    boolean P1Ativo = true;
    boolean P2Ativo = false;
    public String p1nome;
    public String p2nome;
    
    
   int perguntanew;
   static int NumeroDeVitoriaP1 = 0;
   static int NumeroDeVitoriaP2 = 0;
    int PartidasEmpatadas = 0;
    
    SobreoJogo FrmSobre;
       
    
    /**
     * Creates new form InterfaceJogo
     */
    public InterfaceJogo() {
        initComponents();
        Pergunta();
        Icone();
        
    }
    
    URL caminhoImagem;
    Image iconeTitulo;

    /**
     *Coloca icone
     */
    private void Icone(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("glider.png")));       
        
    }

    /**
     *  PERGUNTA O NOME DOS JOGADORES
     */
    public void Pergunta(){
    p1nome = JOptionPane.showInputDialog(null,"Qual o nome do Jogador(a) 1 ?: ");
    p2nome = JOptionPane.showInputDialog(null,"Qual o nome do Jogador(a) 2 ?: ");
    
    
    
    if("".equals(p1nome)){
         p1nome = "X";
    } if ("".equals(p2nome)) {
        p2nome = "O";
        }
    if(p1nome == null){
        p1nome = "X";
    }
    if(p2nome == null){
        p2nome = "O";
    }
    
    lblP1.setText("Jogador(a): "+p1nome);
    lblP2.setText("Jogador(a): "+p2nome);
    PlayerAtivo();
    
}
   /**
     *  ATIVA O PLAYER
     */ 
public void PlayerAtivo(){
   if(P1Ativo == true){
       P1Ativo = false;
       P2Ativo = true;
       VezJogador.setText("Jogador(a): "+p2nome+", é sua vez");
   } else{
       P1Ativo = true;
       P2Ativo = false;
       VezJogador.setText("Jogador(a): "+p1nome+", é sua vez");
       
   }
   JogadorVencedor("X");
   JogadorVencedor("O");
}
/**
     *  LIMPA PLACAR
     */
public void Limpajogo(){
        NumeroDeVitoriaP1 = 0;
        NumeroDeVitoriaP2 = 0;
        PartidasEmpatadas = 0;
        VitoriasP1.setText("Número de Vitorias: "+NumeroDeVitoriaP1);
        VitoriasP2.setText("Número de Vitorias: "+NumeroDeVitoriaP2);
        lblEmpates.setText("Número de Empates: "+PartidasEmpatadas);
        LimparCampos();
}

/**
     *  VERIFICAR VENCEDOR
     * @param Jogador
     */
public void JogadorVencedor(String Jogador){

    
String A1,A2,A3,A4,A5,A6,A7,A8,A9;  

A1 = b1.getText();
A2 = b2.getText();
A3 = b3.getText();
A4 = b4.getText();
A5 = b5.getText();
A6 = b6.getText();
A7 = b7.getText();
A8 = b8.getText();
A9 = b9.getText();

    
    
    
        

//Verifica Linhas
    if(b1.getText().equals(Jogador) && 
            b2.getText().equals(Jogador) &&
            b3.getText().equals(Jogador)){
        
        if(b1.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }//--------------------
    
    if(b4.getText().equals(Jogador) && 
            b5.getText().equals(Jogador) &&
            b6.getText().equals(Jogador)){
        
        if(b4.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }
    if(b7.getText().equals(Jogador) && 
            b8.getText().equals(Jogador) &&
            b9.getText().equals(Jogador)){
        
        if(b7.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }
    
    //Verifica Colunas
    if(b1.getText().equals(Jogador) && 
            b4.getText().equals(Jogador) &&
            b7.getText().equals(Jogador)){
        
        if(b1.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }
    if(b2.getText().equals(Jogador) && 
            b5.getText().equals(Jogador) &&
            b8.getText().equals(Jogador)){
        
        if(b2.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }
    if(b3.getText().equals(Jogador) && 
            b6.getText().equals(Jogador) &&
            b9.getText().equals(Jogador)){
        
        if(b3.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }
    //Verifica Diagonais
    if(b1.getText().equals(Jogador) && 
            b5.getText().equals(Jogador) &&
            b9.getText().equals(Jogador)){
        
        if(b1.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }
    if(b3.getText().equals(Jogador) && 
            b5.getText().equals(Jogador) &&
            b7.getText().equals(Jogador)){
        
        if(b3.getText().equals("X")) Vencedor(p1nome);
        else
            Vencedor(p2nome);
        
    }
    //Verifica Empates  
    
      if(!b1.getText().equals("")&&
              !b2.getText().equals("")&&
              !b3.getText().equals("")&&
              !b4.getText().equals("")&&
              !b5.getText().equals("")&&
              !b6.getText().equals("")&&
              !b7.getText().equals("")&&
              !b8.getText().equals("")&&
              !b9.getText().equals(""))
    Vencedor("Empate");
}
/**
     *  Verifica o vencedor
     * @param JogadorVencedor
     */
public void Vencedor(String JogadorVencedor){
    
    if(JogadorVencedor.equals(p1nome)){
        JOptionPane.showMessageDialog(InterfaceJogo.this, p1nome+" Ganhou, Parabéns!" );
        NumeroDeVitoriaP1++;
        VitoriasP1.setText("Número de Vitorias: "+NumeroDeVitoriaP1);
        P1Ativo = true;
        P2Ativo = false;
        VezJogador.setText("Jogador: "+p1nome+", é sua vez");
        LimparCampos();
    }
   else if(JogadorVencedor.equals(p2nome)){
        JOptionPane.showMessageDialog(InterfaceJogo.this, p2nome+" Ganhou, Parabéns!");
        NumeroDeVitoriaP2++;
        VitoriasP2.setText("Número de Vitorias: "+NumeroDeVitoriaP2);
        P1Ativo = false;
        P2Ativo = true;
        VezJogador.setText("Jogador: "+p2nome+", é sua vez");
        LimparCampos();
    }
   else if (JogadorVencedor.equals("Empate")){
        JOptionPane.showMessageDialog(InterfaceJogo.this, "Empate!");
        PartidasEmpatadas++; 
        lblEmpates.setText("Número de Empates: "+PartidasEmpatadas);
        
        LimparCampos();
    }
     
    
}
/**
     *  Limpar botões
     */
public void LimparCampos(){
    b1.setText("");
    b2.setText("");
    b3.setText("");
    b4.setText("");
    b5.setText("");
    b6.setText("");
    b7.setText("");
    b8.setText("");
    b9.setText("");
    
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pjogo = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        pInfo = new javax.swing.JPanel();
        lblP1 = new javax.swing.JLabel();
        VitoriasP1 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        VitoriasP2 = new javax.swing.JLabel();
        lblEmpates = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        VezJogador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmJogo = new javax.swing.JMenu();
        NovoJogo = new javax.swing.JMenuItem();
        jmResetarGame = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOGO DA VELHA");
        setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(601, 435));
        setResizable(false);

        Pjogo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JOGO DA VELHA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        b1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PjogoLayout = new javax.swing.GroupLayout(Pjogo);
        Pjogo.setLayout(PjogoLayout);
        PjogoLayout.setHorizontalGroup(
            PjogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PjogoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PjogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PjogoLayout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PjogoLayout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PjogoLayout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PjogoLayout.setVerticalGroup(
            PjogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PjogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PjogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PjogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PjogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N

        lblP1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblP1.setText("Jogador 1");

        VitoriasP1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        VitoriasP1.setText("Número de Vitorias: 0");

        lblP2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblP2.setText("Jogador 2");

        VitoriasP2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        VitoriasP2.setText("Número de Vitorias: 0");

        lblEmpates.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblEmpates.setText("Número de Empates: 0");

        javax.swing.GroupLayout pInfoLayout = new javax.swing.GroupLayout(pInfo);
        pInfo.setLayout(pInfoLayout);
        pInfoLayout.setHorizontalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblP1)
                    .addComponent(VitoriasP1)
                    .addComponent(lblP2)
                    .addComponent(VitoriasP2)
                    .addComponent(lblEmpates))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(178, 178, 178))
        );
        pInfoLayout.setVerticalGroup(
            pInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoLayout.createSequentialGroup()
                .addComponent(lblP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VitoriasP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblP2)
                .addGap(18, 18, 18)
                .addComponent(VitoriasP2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmpates)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        VezJogador.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        VezJogador.setText("Jogador: ");

        jmJogo.setText("Jogo");

        NovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });
        jmJogo.add(NovoJogo);

        jmResetarGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmResetarGame.setText("Resetar Jogo");
        jmResetarGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmResetarGameActionPerformed(evt);
            }
        });
        jmJogo.add(jmResetarGame);

        jmSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmSobre.setText("Sobre");
        jmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSobreActionPerformed(evt);
            }
        });
        jmJogo.add(jmSobre);

        jMenuBar1.add(jmJogo);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pjogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(VezJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VezJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pjogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if (P1Ativo == true){
            if(b1.getText().equals("")){
                b1.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b1.getText().equals("")){
                b1.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (P1Ativo == true){
            if(b2.getText().equals("")){
                b2.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b2.getText().equals("")){
                b2.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (P1Ativo == true){
            if(b3.getText().equals("")){
                b3.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b3.getText().equals("")){
                b3.setText("O");
                PlayerAtivo();
            }
        }
            
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (P1Ativo == true){
            if(b4.getText().equals("")){
                b4.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b4.getText().equals("")){
                b4.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (P1Ativo == true){
            if(b5.getText().equals("")){
                b5.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b5.getText().equals("")){
                b5.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (P1Ativo == true){
            if(b6.getText().equals("")){
                b6.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b6.getText().equals("")){
                b6.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (P1Ativo == true){
            if(b7.getText().equals("")){
                b7.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b7.getText().equals("")){
                b7.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (P1Ativo == true){
            if(b8.getText().equals("")){
                b8.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b8.getText().equals("")){
                b8.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       if (P1Ativo == true){
            if(b9.getText().equals("")){
                b9.setText("X");
                PlayerAtivo();
            }
        }else{
            if(b9.getText().equals("")){
                b9.setText("O");
                PlayerAtivo();
            }
        }
    }//GEN-LAST:event_b9ActionPerformed

   
    
    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
         perguntanew = JOptionPane.showConfirmDialog(null,"Deseja continuar com os mesmo jogadores?",
            "To te perguntando meuuooo !!!",JOptionPane.YES_NO_OPTION);
        if(perguntanew == JOptionPane.YES_OPTION){
            Limpajogo();
        }else{
            Limpajogo();
            Pergunta();
        }
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void jmResetarGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmResetarGameActionPerformed
        Limpajogo();
    }//GEN-LAST:event_jmResetarGameActionPerformed

    private void jmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSobreActionPerformed
        if (FrmSobre == null){
        FrmSobre = new SobreoJogo();
        FrmSobre.setLocationRelativeTo(null);
        
        }
        FrmSobre.setVisible(true);
    }//GEN-LAST:event_jmSobreActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmSairMouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceJogo().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem NovoJogo;
    private javax.swing.JPanel Pjogo;
    private javax.swing.JLabel VezJogador;
    private javax.swing.JLabel VitoriasP1;
    private javax.swing.JLabel VitoriasP2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenu jmJogo;
    private javax.swing.JMenuItem jmResetarGame;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JLabel lblEmpates;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JPanel pInfo;
    // End of variables declaration//GEN-END:variables
}
