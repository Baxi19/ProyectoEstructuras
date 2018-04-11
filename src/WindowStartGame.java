
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randald
 */

public class WindowStartGame extends javax.swing.JFrame {
    int[] tokensRandom = new int[28];
    ArrayList<Integer> tokensDelivered = new ArrayList<Integer>(28);
    public static ArrayList<Token> tokensList = new ArrayList<Token>(28);
    Token t1 = new Token(0, 0, 1);
    Token t2 = new Token(0, 1, 2);
    Token t3 = new Token(0, 2, 3);
    Token t4 = new Token(0, 3, 4);
    Token t5 = new Token(0, 4, 5);
    Token t6 = new Token(0, 5, 6);
    Token t7 = new Token(0, 6, 7);
    Token t8 = new Token(1, 1, 8);
    Token t9 = new Token(1, 2, 9);
    Token t10 = new Token(1, 3, 10);
    Token t11 = new Token(1, 4, 11);
    Token t12 = new Token(1, 5, 12);
    Token t13 = new Token(1, 6, 13);
    Token t14 = new Token(2, 2, 14);
    Token t15 = new Token(2, 3, 15);
    Token t16 = new Token(2, 4, 16);
    Token t17 = new Token(2, 5, 17);
    Token t18 = new Token(2, 6, 18);
    Token t19 = new Token(3, 3, 19);
    Token t20 = new Token(3, 4, 20);
    Token t21 = new Token(3, 5, 21);
    Token t22 = new Token(3, 6, 22);
    Token t23 = new Token(4, 4, 23);
    Token t24 = new Token(4, 5, 24);
    Token t25 = new Token(4, 6, 25);
    Token t26 = new Token(5, 5, 26);
    Token t27 = new Token(5, 6, 27);
    Token t28 = new Token(6, 6, 28);
    
    /**
     * Creates new form LoadGame
     */
    public WindowStartGame() {                      //Constructor                                                     
        initComponents();                       //Start the windows                                                     
        this.setExtendedState(MAXIMIZED_BOTH);  //set full size                                
        //String gamer = ListPlayersGaming.getInstance().actualUser.getName(); //it get the actual user logged
        
        //******* miss method to distribute the tokens and looking for the first gamer
        
        actualPlayerName.setText(ListPlayersGaming.getInstance().player1.name);// change the player name in the game windows
        ListPlayersGaming.getInstance().playerGaming = ListPlayersGaming.getInstance().start2;
        // mouse events
        MouseListener ml;
        ml = new MouseListener() {              //Listener                                
            @Override                           //Override funtion                                
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {            //When  mouse is pressed                    
                JComponent jc = (JComponent) e.getSource();     //Jc is used to get the dominoes image                      
                TransferHandler th = jc.getTransferHandler();   //th is used to transfer the image to the new position                
                th.exportAsDrag(jc, e, TransferHandler.COPY);   //is used to handle the transfer of a Transferable to and from Swing components                 
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        
        
        //Add mouse click action to trasfer
        token0_0.addMouseListener(ml);
        token0_1.addMouseListener(ml);
        token0_2.addMouseListener(ml);
        token0_3.addMouseListener(ml);
        token0_4.addMouseListener(ml);
        token0_5.addMouseListener(ml);
        token0_6.addMouseListener(ml);
        token0_7.addMouseListener(ml);
        token0_8.addMouseListener(ml);
        token0_9.addMouseListener(ml);

        // set new images
        //This instruction gets the icon("Image") from the tokens and them 
        //it is used to remplace in the position icon on the matriz's game
        token0_1.setTransferHandler(new TransferHandler("icon"));
        token0_2.setTransferHandler(new TransferHandler("icon"));
        token0_0.setTransferHandler(new TransferHandler("icon"));
        token0_3.setTransferHandler(new TransferHandler("icon"));
        token0_4.setTransferHandler(new TransferHandler("icon"));
        token0_5.setTransferHandler(new TransferHandler("icon"));
        token0_6.setTransferHandler(new TransferHandler("icon"));
        token0_7.setTransferHandler(new TransferHandler("icon"));
        token0_8.setTransferHandler(new TransferHandler("icon"));
        token0_9.setTransferHandler(new TransferHandler("icon"));

        //set new possibles positions
        // it instruction get ready the position in the matriz 
        // to will remplace for the new token image
        celda1.setTransferHandler(new TransferHandler("icon"));                 
        celda2.setTransferHandler(new TransferHandler("icon"));                 
        celda3.setTransferHandler(new TransferHandler("icon"));
        celda4.setTransferHandler(new TransferHandler("icon"));
        celda5.setTransferHandler(new TransferHandler("icon"));
        celda6.setTransferHandler(new TransferHandler("icon"));
        celda7.setTransferHandler(new TransferHandler("icon"));
        celda8.setTransferHandler(new TransferHandler("icon"));
        celda9.setTransferHandler(new TransferHandler("icon"));
        celda10.setTransferHandler(new TransferHandler("icon"));
        celda11.setTransferHandler(new TransferHandler("icon"));
        celda12.setTransferHandler(new TransferHandler("icon"));
        celda13.setTransferHandler(new TransferHandler("icon"));
        celda14.setTransferHandler(new TransferHandler("icon"));
        celda15.setTransferHandler(new TransferHandler("icon"));
        celda16.setTransferHandler(new TransferHandler("icon"));
        celda17.setTransferHandler(new TransferHandler("icon"));
        celda18.setTransferHandler(new TransferHandler("icon"));
        celda19.setTransferHandler(new TransferHandler("icon"));
        celda20.setTransferHandler(new TransferHandler("icon"));
        celda21.setTransferHandler(new TransferHandler("icon"));
        celda22.setTransferHandler(new TransferHandler("icon"));
        celda23.setTransferHandler(new TransferHandler("icon"));
        celda24.setTransferHandler(new TransferHandler("icon"));
        celda25.setTransferHandler(new TransferHandler("icon"));
        celda26.setTransferHandler(new TransferHandler("icon"));
        celda27.setTransferHandler(new TransferHandler("icon"));
        celda28.setTransferHandler(new TransferHandler("icon"));
        celda29.setTransferHandler(new TransferHandler("icon"));
        celda30.setTransferHandler(new TransferHandler("icon"));
        celda31.setTransferHandler(new TransferHandler("icon"));
        celda32.setTransferHandler(new TransferHandler("icon"));
        celda33.setTransferHandler(new TransferHandler("icon"));
        celda34.setTransferHandler(new TransferHandler("icon"));
        celda35.setTransferHandler(new TransferHandler("icon"));
        celda36.setTransferHandler(new TransferHandler("icon"));
        celda37.setTransferHandler(new TransferHandler("icon"));
        celda38.setTransferHandler(new TransferHandler("icon"));
        celda39.setTransferHandler(new TransferHandler("icon"));
        celda40.setTransferHandler(new TransferHandler("icon"));
        celda41.setTransferHandler(new TransferHandler("icon"));
        celda42.setTransferHandler(new TransferHandler("icon"));
        celda43.setTransferHandler(new TransferHandler("icon"));
        celda44.setTransferHandler(new TransferHandler("icon"));
        celda45.setTransferHandler(new TransferHandler("icon"));
        celda46.setTransferHandler(new TransferHandler("icon"));
        celda47.setTransferHandler(new TransferHandler("icon"));
        celda48.setTransferHandler(new TransferHandler("icon"));
        celda49.setTransferHandler(new TransferHandler("icon"));
        celda50.setTransferHandler(new TransferHandler("icon"));
        celda51.setTransferHandler(new TransferHandler("icon"));
        celda52.setTransferHandler(new TransferHandler("icon"));
        celda53.setTransferHandler(new TransferHandler("icon"));
        celda54.setTransferHandler(new TransferHandler("icon"));
        celda55.setTransferHandler(new TransferHandler("icon"));
        celda56.setTransferHandler(new TransferHandler("icon"));
        celda57.setTransferHandler(new TransferHandler("icon"));
        celda58.setTransferHandler(new TransferHandler("icon"));
        celda59.setTransferHandler(new TransferHandler("icon"));
        celda60.setTransferHandler(new TransferHandler("icon"));
        celda61.setTransferHandler(new TransferHandler("icon"));
        celda62.setTransferHandler(new TransferHandler("icon"));
        celda63.setTransferHandler(new TransferHandler("icon"));
        celda64.setTransferHandler(new TransferHandler("icon"));
        celda65.setTransferHandler(new TransferHandler("icon"));
        celda66.setTransferHandler(new TransferHandler("icon"));
        celda67.setTransferHandler(new TransferHandler("icon"));
        celda68.setTransferHandler(new TransferHandler("icon"));
        celda69.setTransferHandler(new TransferHandler("icon"));
        celda70.setTransferHandler(new TransferHandler("icon"));
        celda71.setTransferHandler(new TransferHandler("icon"));
        celda72.setTransferHandler(new TransferHandler("icon"));
        celda73.setTransferHandler(new TransferHandler("icon"));
        celda74.setTransferHandler(new TransferHandler("icon"));
        celda75.setTransferHandler(new TransferHandler("icon"));
        celda76.setTransferHandler(new TransferHandler("icon"));
        celda77.setTransferHandler(new TransferHandler("icon"));
        celda78.setTransferHandler(new TransferHandler("icon"));
        celda79.setTransferHandler(new TransferHandler("icon"));
        celda80.setTransferHandler(new TransferHandler("icon"));
        
        insertTokensInGlobalList();
        printTokens();
        makeRandomList();
        distributeTokens();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        addImagen = new javax.swing.JLabel();
        buttonAddToken = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        doneImage = new javax.swing.JLabel();
        buttonDone = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        skipImage = new javax.swing.JLabel();
        buttonSkip = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        actualPlayerName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        trapImage = new javax.swing.JLabel();
        buttonTrap = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        exitImage = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        saveImage = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        celda80 = new javax.swing.JLabel();
        celda79 = new javax.swing.JLabel();
        celda78 = new javax.swing.JLabel();
        celda77 = new javax.swing.JLabel();
        celda76 = new javax.swing.JLabel();
        celda75 = new javax.swing.JLabel();
        celda74 = new javax.swing.JLabel();
        celda73 = new javax.swing.JLabel();
        celda72 = new javax.swing.JLabel();
        celda71 = new javax.swing.JLabel();
        celda70 = new javax.swing.JLabel();
        celda69 = new javax.swing.JLabel();
        celda68 = new javax.swing.JLabel();
        celda67 = new javax.swing.JLabel();
        celda66 = new javax.swing.JLabel();
        celda65 = new javax.swing.JLabel();
        celda64 = new javax.swing.JLabel();
        celda63 = new javax.swing.JLabel();
        celda62 = new javax.swing.JLabel();
        celda61 = new javax.swing.JLabel();
        celda60 = new javax.swing.JLabel();
        celda59 = new javax.swing.JLabel();
        celda58 = new javax.swing.JLabel();
        celda57 = new javax.swing.JLabel();
        celda56 = new javax.swing.JLabel();
        celda55 = new javax.swing.JLabel();
        celda54 = new javax.swing.JLabel();
        celda53 = new javax.swing.JLabel();
        celda52 = new javax.swing.JLabel();
        celda51 = new javax.swing.JLabel();
        celda50 = new javax.swing.JLabel();
        celda1 = new javax.swing.JLabel();
        celda8 = new javax.swing.JLabel();
        celda15 = new javax.swing.JLabel();
        celda22 = new javax.swing.JLabel();
        celda29 = new javax.swing.JLabel();
        celda36 = new javax.swing.JLabel();
        celda43 = new javax.swing.JLabel();
        celda2 = new javax.swing.JLabel();
        celda9 = new javax.swing.JLabel();
        celda16 = new javax.swing.JLabel();
        celda23 = new javax.swing.JLabel();
        celda30 = new javax.swing.JLabel();
        celda37 = new javax.swing.JLabel();
        celda44 = new javax.swing.JLabel();
        celda3 = new javax.swing.JLabel();
        celda10 = new javax.swing.JLabel();
        celda17 = new javax.swing.JLabel();
        celda24 = new javax.swing.JLabel();
        celda31 = new javax.swing.JLabel();
        celda38 = new javax.swing.JLabel();
        celda45 = new javax.swing.JLabel();
        celda4 = new javax.swing.JLabel();
        celda11 = new javax.swing.JLabel();
        celda18 = new javax.swing.JLabel();
        celda25 = new javax.swing.JLabel();
        celda32 = new javax.swing.JLabel();
        celda39 = new javax.swing.JLabel();
        celda46 = new javax.swing.JLabel();
        celda5 = new javax.swing.JLabel();
        celda12 = new javax.swing.JLabel();
        celda19 = new javax.swing.JLabel();
        celda26 = new javax.swing.JLabel();
        celda33 = new javax.swing.JLabel();
        celda40 = new javax.swing.JLabel();
        celda47 = new javax.swing.JLabel();
        celda6 = new javax.swing.JLabel();
        celda13 = new javax.swing.JLabel();
        celda20 = new javax.swing.JLabel();
        celda27 = new javax.swing.JLabel();
        celda34 = new javax.swing.JLabel();
        celda41 = new javax.swing.JLabel();
        celda48 = new javax.swing.JLabel();
        celda7 = new javax.swing.JLabel();
        celda14 = new javax.swing.JLabel();
        celda21 = new javax.swing.JLabel();
        celda28 = new javax.swing.JLabel();
        celda35 = new javax.swing.JLabel();
        celda42 = new javax.swing.JLabel();
        celda49 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        token0_0 = new javax.swing.JLabel();
        token0_1 = new javax.swing.JLabel();
        token0_2 = new javax.swing.JLabel();
        token0_3 = new javax.swing.JLabel();
        token0_4 = new javax.swing.JLabel();
        token0_5 = new javax.swing.JLabel();
        token0_6 = new javax.swing.JLabel();
        token0_7 = new javax.swing.JLabel();
        token0_8 = new javax.swing.JLabel();
        token0_9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 7, 169));

        jPanel4.setBackground(new java.awt.Color(102, 0, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userIcon.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(51, 0, 153));

        addImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/getToken.png"))); // NOI18N

        buttonAddToken.setText("TOKEN");
        buttonAddToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddTokenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(addImagen)
                .addGap(52, 52, 52)
                .addComponent(buttonAddToken, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonAddToken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 0, 153));

        doneImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check.png"))); // NOI18N

        buttonDone.setText("DONE");
        buttonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(doneImage)
                .addGap(53, 53, 53)
                .addComponent(buttonDone, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doneImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(51, 0, 153));

        skipImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/skipIcon.png"))); // NOI18N

        buttonSkip.setText("SKIP");
        buttonSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSkipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(skipImage)
                .addGap(55, 55, 55)
                .addComponent(buttonSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skipImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonSkip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/game.png"))); // NOI18N

        actualPlayerName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        actualPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        actualPlayerName.setText("Player");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("___________________________________");

        jPanel21.setBackground(new java.awt.Color(51, 0, 153));

        trapImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trapIcon.png"))); // NOI18N

        buttonTrap.setText("TRAP");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(trapImage)
                .addGap(55, 55, 55)
                .addComponent(buttonTrap, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trapImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(buttonTrap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(51, 0, 153));

        exitImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/off.png"))); // NOI18N

        buttonExit.setText("EXIT");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(exitImage)
                .addGap(55, 55, 55)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(51, 0, 153));

        saveImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N

        buttonSave.setText("SAVE");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(saveImage)
                .addGap(55, 55, 55)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(actualPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(700, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel2.setLayout(new java.awt.GridLayout(8, 10, 2, 4));
        jPanel2.add(celda80);
        jPanel2.add(celda79);
        jPanel2.add(celda78);
        jPanel2.add(celda77);
        jPanel2.add(celda76);
        jPanel2.add(celda75);
        jPanel2.add(celda74);
        jPanel2.add(celda73);
        jPanel2.add(celda72);
        jPanel2.add(celda71);
        jPanel2.add(celda70);
        jPanel2.add(celda69);
        jPanel2.add(celda68);
        jPanel2.add(celda67);
        jPanel2.add(celda66);
        jPanel2.add(celda65);
        jPanel2.add(celda64);
        jPanel2.add(celda63);
        jPanel2.add(celda62);
        jPanel2.add(celda61);
        jPanel2.add(celda60);
        jPanel2.add(celda59);
        jPanel2.add(celda58);
        jPanel2.add(celda57);
        jPanel2.add(celda56);
        jPanel2.add(celda55);
        jPanel2.add(celda54);
        jPanel2.add(celda53);
        jPanel2.add(celda52);
        jPanel2.add(celda51);
        jPanel2.add(celda50);
        jPanel2.add(celda1);
        jPanel2.add(celda8);
        jPanel2.add(celda15);
        jPanel2.add(celda22);
        jPanel2.add(celda29);
        jPanel2.add(celda36);
        jPanel2.add(celda43);
        jPanel2.add(celda2);
        jPanel2.add(celda9);
        jPanel2.add(celda16);
        jPanel2.add(celda23);
        jPanel2.add(celda30);
        jPanel2.add(celda37);
        jPanel2.add(celda44);
        jPanel2.add(celda3);
        jPanel2.add(celda10);
        jPanel2.add(celda17);
        jPanel2.add(celda24);
        jPanel2.add(celda31);
        jPanel2.add(celda38);
        jPanel2.add(celda45);
        jPanel2.add(celda4);
        jPanel2.add(celda11);
        jPanel2.add(celda18);
        jPanel2.add(celda25);
        jPanel2.add(celda32);
        jPanel2.add(celda39);
        jPanel2.add(celda46);
        jPanel2.add(celda5);
        jPanel2.add(celda12);
        jPanel2.add(celda19);
        jPanel2.add(celda26);
        jPanel2.add(celda33);
        jPanel2.add(celda40);
        jPanel2.add(celda47);
        jPanel2.add(celda6);
        jPanel2.add(celda13);
        jPanel2.add(celda20);
        jPanel2.add(celda27);
        jPanel2.add(celda34);
        jPanel2.add(celda41);
        jPanel2.add(celda48);
        jPanel2.add(celda7);
        jPanel2.add(celda14);
        jPanel2.add(celda21);
        jPanel2.add(celda28);
        jPanel2.add(celda35);
        jPanel2.add(celda42);
        jPanel2.add(celda49);

        jPanel3.setBackground(new java.awt.Color(8, 136, 12));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        token0_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_0.png"))); // NOI18N
        token0_0.setName("token0_0"); // NOI18N
        jPanel3.add(token0_0);

        token0_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(token0_1);

        token0_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(token0_2);

        token0_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_0.png"))); // NOI18N
        jPanel3.add(token0_3);

        token0_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(token0_4);

        token0_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(token0_5);

        token0_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(token0_6);

        token0_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(token0_7);

        token0_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(token0_8);

        token0_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(token0_9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 11082, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDoneActionPerformed
        // it move to the next player's turn
        ListPlayersGaming.getInstance().playerGaming = ListPlayersGaming.getInstance().playerGaming.sig;
        //ListPlayersGaming.getInstance().actualUser.setName("Done");  //ELIMINAR LINEA CUANDO ESTE CARGANDO LOS JUGADORES CON DIFERENTES NOMBRES
        String gamer = ListPlayersGaming.getInstance().playerGaming.name;
        actualPlayerName.setText(gamer);// change the player name in the game windows
    }//GEN-LAST:event_buttonDoneActionPerformed

    private void buttonAddTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddTokenActionPerformed
        // This method will check if in the list are tokens available
        // if are tokens, will return to the player's tokens
        // if not are available will return a msj 
        
    }//GEN-LAST:event_buttonAddTokenActionPerformed

    private void buttonSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSkipActionPerformed

        
    }//GEN-LAST:event_buttonSkipActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
       //Go to destroy Windows
       this.dispose();
        
    }//GEN-LAST:event_buttonExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualPlayerName;
    private javax.swing.JLabel addImagen;
    private javax.swing.JButton buttonAddToken;
    private javax.swing.JButton buttonDone;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSkip;
    private javax.swing.JButton buttonTrap;
    private javax.swing.JLabel celda1;
    private javax.swing.JLabel celda10;
    private javax.swing.JLabel celda11;
    private javax.swing.JLabel celda12;
    private javax.swing.JLabel celda13;
    private javax.swing.JLabel celda14;
    private javax.swing.JLabel celda15;
    private javax.swing.JLabel celda16;
    private javax.swing.JLabel celda17;
    private javax.swing.JLabel celda18;
    private javax.swing.JLabel celda19;
    private javax.swing.JLabel celda2;
    private javax.swing.JLabel celda20;
    private javax.swing.JLabel celda21;
    private javax.swing.JLabel celda22;
    private javax.swing.JLabel celda23;
    private javax.swing.JLabel celda24;
    private javax.swing.JLabel celda25;
    private javax.swing.JLabel celda26;
    private javax.swing.JLabel celda27;
    private javax.swing.JLabel celda28;
    private javax.swing.JLabel celda29;
    private javax.swing.JLabel celda3;
    private javax.swing.JLabel celda30;
    private javax.swing.JLabel celda31;
    private javax.swing.JLabel celda32;
    private javax.swing.JLabel celda33;
    private javax.swing.JLabel celda34;
    private javax.swing.JLabel celda35;
    private javax.swing.JLabel celda36;
    private javax.swing.JLabel celda37;
    private javax.swing.JLabel celda38;
    private javax.swing.JLabel celda39;
    private javax.swing.JLabel celda4;
    private javax.swing.JLabel celda40;
    private javax.swing.JLabel celda41;
    private javax.swing.JLabel celda42;
    private javax.swing.JLabel celda43;
    private javax.swing.JLabel celda44;
    private javax.swing.JLabel celda45;
    private javax.swing.JLabel celda46;
    private javax.swing.JLabel celda47;
    private javax.swing.JLabel celda48;
    private javax.swing.JLabel celda49;
    private javax.swing.JLabel celda5;
    private javax.swing.JLabel celda50;
    private javax.swing.JLabel celda51;
    private javax.swing.JLabel celda52;
    private javax.swing.JLabel celda53;
    private javax.swing.JLabel celda54;
    private javax.swing.JLabel celda55;
    private javax.swing.JLabel celda56;
    private javax.swing.JLabel celda57;
    private javax.swing.JLabel celda58;
    private javax.swing.JLabel celda59;
    private javax.swing.JLabel celda6;
    private javax.swing.JLabel celda60;
    private javax.swing.JLabel celda61;
    private javax.swing.JLabel celda62;
    private javax.swing.JLabel celda63;
    private javax.swing.JLabel celda64;
    private javax.swing.JLabel celda65;
    private javax.swing.JLabel celda66;
    private javax.swing.JLabel celda67;
    private javax.swing.JLabel celda68;
    private javax.swing.JLabel celda69;
    private javax.swing.JLabel celda7;
    private javax.swing.JLabel celda70;
    private javax.swing.JLabel celda71;
    private javax.swing.JLabel celda72;
    private javax.swing.JLabel celda73;
    private javax.swing.JLabel celda74;
    private javax.swing.JLabel celda75;
    private javax.swing.JLabel celda76;
    private javax.swing.JLabel celda77;
    private javax.swing.JLabel celda78;
    private javax.swing.JLabel celda79;
    private javax.swing.JLabel celda8;
    private javax.swing.JLabel celda80;
    private javax.swing.JLabel celda9;
    private javax.swing.JLabel doneImage;
    private javax.swing.JLabel exitImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel saveImage;
    private javax.swing.JLabel skipImage;
    private javax.swing.JLabel token0_0;
    private javax.swing.JLabel token0_1;
    private javax.swing.JLabel token0_2;
    private javax.swing.JLabel token0_3;
    private javax.swing.JLabel token0_4;
    private javax.swing.JLabel token0_5;
    private javax.swing.JLabel token0_6;
    private javax.swing.JLabel token0_7;
    private javax.swing.JLabel token0_8;
    private javax.swing.JLabel token0_9;
    private javax.swing.JLabel trapImage;
    // End of variables declaration//GEN-END:variables

    public void insertTokensInGlobalList() {
        tokensList.add(t1);
        tokensList.add(t2);
        tokensList.add(t3);
        tokensList.add(t4);
        tokensList.add(t5);
        tokensList.add(t6);
        tokensList.add(t7);
        tokensList.add(t8);
        tokensList.add(t9);
        tokensList.add(t10);
        tokensList.add(t11);
        tokensList.add(t12);
        tokensList.add(t13);
        tokensList.add(t14);
        tokensList.add(t15);
        tokensList.add(t16);
        tokensList.add(t17);
        tokensList.add(t18);
        tokensList.add(t19);
        tokensList.add(t20);
        tokensList.add(t21);
        tokensList.add(t22);
        tokensList.add(t23);
        tokensList.add(t24);
        tokensList.add(t25);
        tokensList.add(t26);
        tokensList.add(t27);
        tokensList.add(t28);
    }
    
    public void makeRandomList(){
        //variables
        int i = 0, cantidad = 28, rango = 28;
        //arreglos con tamaño = 7
        int arreglo[] = new int[cantidad];
        // se llama al random a la primera posicion
        arreglo[i] = (int) (Math.random()*rango+1);
        //agregamos el primer valor a los comparaciones
        tokensRandom[i] = arreglo[i];
        //Ciclo para comparacion en la segunda posicion del array en adelante
        for (i = 1; i < cantidad; i++) {
            // se ingresa un valor a la siguiente posicion
            arreglo[i] = (int) (Math.random() * rango+1);
            //agregamos el valor a la siguiente posicion
            tokensRandom[i] = arreglo[i];
            // recorremos la lista nuevamente
            for (int j = 0; j < i; j++) {
                // si la variable existe
                if (arreglo[i] == tokensRandom[j]) {
                    // nos colocamos en la posicion anterior y volvemos al ciclo
                    i--;
                }
            }
        }
        //ciclo para imprimir en consola
        System.out.println("Arreglo 1 \n");
        for (int k = 0; k < cantidad; k++) {
            System.out.print((k + 1) + ".- " + arreglo[k] + "\n");
        }
    }
    
    
    
    /*public void distributeTokens(){
        //System.out.println(ListPlayersGaming.getInstance().player1.addToken(searchToken(5)));
    }
*/ public void distributeTokens(){
         int aux = ListPlayersGaming.getInstance().numberOfGamers;
         if(aux == 2){
             //player1
             for (int i = 0; i <= 6; i++){
                 System.out.println(ListPlayersGaming.getInstance().player1.addToken(searchToken(tokensRandom[i])));
             }
             //player2
             for (int i = 7; i <= 13; i++) {
                 System.out.println(ListPlayersGaming.getInstance().player2.addToken(searchToken(tokensRandom[i])));    
             }
         }
      
         if(aux == 3){
             //player1
             for (int i = 0; i <= 6; i++){
                 System.out.println(ListPlayersGaming.getInstance().player1.addToken(searchToken(tokensRandom[i])));
             }
             //player2
             for (int i = 7; i <= 13; i++) {
                 System.out.println(ListPlayersGaming.getInstance().player2.addToken(searchToken(tokensRandom[i])));    
             }
             //player3
             for (int i = 14; i <= 20; i++) {
                System.out.println(ListPlayersGaming.getInstance().player3.addToken(searchToken(tokensRandom[i])));
             }
         }
         if(aux == 4){
              //player1
             for (int i = 0; i <= 6; i++){
                 System.out.println(ListPlayersGaming.getInstance().player1.addToken(searchToken(tokensRandom[i])));
             }
             //player2
             for (int i = 7; i <= 13; i++) {
                 System.out.println(ListPlayersGaming.getInstance().player2.addToken(searchToken(tokensRandom[i])));    
             }
             //player3
             for (int i = 14; i <= 20; i++) {
                System.out.println(ListPlayersGaming.getInstance().player3.addToken(searchToken(tokensRandom[i])));
             }
             //player4
             for (int i = 21; i <= 27; i++) {
                System.out.println(ListPlayersGaming.getInstance().player4.addToken(searchToken(tokensRandom[i])));
             }
         } 
    }
   
    
    public Token searchToken(int id){
        for(int i = 0; i <= 28; i++){
            if(tokensList.get(i).id == id)
                return tokensList.get(i);
        }
        return null;
    }
    
    public void printTokens(){
        for(int i = 0; i <= 27; i++)
            System.out.println("Lado A:" + tokensList.get(i).value1 + " | Lado B:" + tokensList.get(i).value2 + "       ID: " + (i+1));
    }
    
   //public Player searchHighestToken(){
       
  // }

    

    
}
