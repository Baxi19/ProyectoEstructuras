
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import javax.swing.JOptionPane;

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
    int availableTokens = 28;
    int[] tokensRandom = new int[28];
    Token tokenSelected;                
    ArrayList<Integer> tokensDelivered = new ArrayList<Integer>(28);
    public static ArrayList<Token> tokensList = new ArrayList<Token>(28);
    
    /*Variables to use for token image*/
    ImageIcon  I1 = new ImageIcon("/ImagesDominoes/0_0.png");
    ImageIcon I2 = new ImageIcon("/ImagesDominoes/0_1.png");
    ImageIcon I3 = new ImageIcon("/ImagesDominoes/0_2.png");
    ImageIcon I4 = new ImageIcon("/ImagesDominoes/0_3.png");
    ImageIcon I5 = new ImageIcon("/ImagesDominoes/0_4.png");
    ImageIcon I6 = new ImageIcon("/ImagesDominoes/0_5.png");
    ImageIcon I7 = new ImageIcon("/ImagesDominoes/0_6.png");
    ImageIcon I8 = new ImageIcon("/ImagesDominoes/1_1.png");
    ImageIcon I9 = new ImageIcon("/ImagesDominoes/1_2.png");
    ImageIcon I10 = new ImageIcon("/ImagesDominoes/1_3.png");
    ImageIcon I11 = new ImageIcon("/ImagesDominoes/1_4.png");
    ImageIcon I12 = new ImageIcon("/ImagesDominoes/1_5.png");
    ImageIcon I13 = new ImageIcon("/ImagesDominoes/1_6.png");
    ImageIcon I14 = new ImageIcon("/ImagesDominoes/2_2.png");
    ImageIcon I15 = new ImageIcon("/ImagesDominoes/2_3.png");
    ImageIcon I16 = new ImageIcon("/ImagesDominoes/2_4.png");
    ImageIcon I17 = new ImageIcon("/ImagesDominoes/2_5.png");
    ImageIcon I18 = new ImageIcon("/ImagesDominoes/2_6.png");
    ImageIcon I19 = new ImageIcon("/ImagesDominoes/3_3.png");
    ImageIcon I20 = new ImageIcon("/ImagesDominoes/3_4.png");
    ImageIcon I21 = new ImageIcon("/ImagesDominoes/3_5.png");
    ImageIcon I22 = new ImageIcon("/ImagesDominoes/3_6.png");
    ImageIcon I23 = new ImageIcon("/ImagesDominoes/4_4.png");
    ImageIcon I24 = new ImageIcon("/ImagesDominoes/4_5.png");
    ImageIcon I25 = new ImageIcon("/ImagesDominoes/4_6.png");
    ImageIcon I26 = new ImageIcon("/ImagesDominoes/5_5.png");
    ImageIcon I27 = new ImageIcon("/ImagesDominoes/5_6.png");
    ImageIcon I28 = new ImageIcon("/ImagesDominoes/6_6.png");
    
    //Tokens with 4 parameters have only ant and sig pointers
    //Tokens with 6 parameters have ant, sig, up, and down pointers
    Token t1 = new Token(0, 0, 1, I1, null, null);
    Token t2 = new Token(0, 1, 2, I2);
    Token t3 = new Token(0, 2, 3, I3);
    Token t4 = new Token(0, 3, 4, I4);
    Token t5 = new Token(0, 4, 5, I5);
    Token t6 = new Token(0, 5, 6, I6);
    Token t7 = new Token(0, 6, 7, I7);
    Token t8 = new Token(1, 1, 8, I8, null, null);
    Token t9 = new Token(1, 2, 9, I9);
    Token t10 = new Token(1, 3, 10, I10);
    Token t11 = new Token(1, 4, 11, I11);
    Token t12 = new Token(1, 5, 12, I12);
    Token t13 = new Token(1, 6, 13, I13);
    Token t14 = new Token(2, 2, 14, I14, null, null);
    Token t15 = new Token(2, 3, 15, I15);
    Token t16 = new Token(2, 4, 16, I16);
    Token t17 = new Token(2, 5, 17, I17);
    Token t18 = new Token(2, 6, 18, I18);
    Token t19 = new Token(3, 3, 19, I19, null, null);
    Token t20 = new Token(3, 4, 20, I20);
    Token t21 = new Token(3, 5, 21, I21);
    Token t22 = new Token(3, 6, 22, I22);
    Token t23 = new Token(4, 4, 23, I23, null, null);
    Token t24 = new Token(4, 5, 24, I24);
    Token t25 = new Token(4, 6, 25, I25);
    Token t26 = new Token(5, 5, 26, I26, null, null);
    Token t27 = new Token(5, 6, 27, I27);
    Token t28 = new Token(6, 6, 28, I28, null, null);
    
    /**
     * Creates new form LoadGame
     */
    public WindowStartGame() {                      //Constructor                                                     
        initComponents();                       //Start the windows                                                     
        this.setExtendedState(MAXIMIZED_BOTH);  //set full size                                
        //String gamer = ListPlayersGaming.getInstance().actualUser.getName(); //it get the actual user logged
        
        //******* miss method to distribute the tokens and looking for the first gamer

        
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
        position1.addMouseListener(ml);
        position2.addMouseListener(ml);
        position3.addMouseListener(ml);
        position4.addMouseListener(ml);
        position5.addMouseListener(ml);
        position6.addMouseListener(ml);
        position7.addMouseListener(ml);
        position8.addMouseListener(ml);
        position9.addMouseListener(ml);
        position10.addMouseListener(ml);

        // set new images
        //This instruction gets the icon("Image") from the tokens and them 
        //it is used to remplace in the position icon on the matriz's game
        position2.setTransferHandler(new TransferHandler("icon"));
        position3.setTransferHandler(new TransferHandler("icon"));
        position1.setTransferHandler(new TransferHandler("icon"));
        position4.setTransferHandler(new TransferHandler("icon"));
        position5.setTransferHandler(new TransferHandler("icon"));
        position6.setTransferHandler(new TransferHandler("icon"));
        position7.setTransferHandler(new TransferHandler("icon"));
        position8.setTransferHandler(new TransferHandler("icon"));
        position9.setTransferHandler(new TransferHandler("icon"));
        position10.setTransferHandler(new TransferHandler("icon"));

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
        callSearchHighestToken();
        loopToPrintImages();
        actualPlayerName.setText(ListPlayersGaming.getInstance().playerGaming.name);// change the player name in the game windows
        setNumberOfTokensAvailable();
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
        jLabel7 = new javax.swing.JLabel();
        actualPlayerName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        trapImage = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        exitImage = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        saveImage = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        actualDomino = new javax.swing.JLabel();
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
        position1 = new javax.swing.JLabel();
        position2 = new javax.swing.JLabel();
        position3 = new javax.swing.JLabel();
        position4 = new javax.swing.JLabel();
        position5 = new javax.swing.JLabel();
        position6 = new javax.swing.JLabel();
        position7 = new javax.swing.JLabel();
        position8 = new javax.swing.JLabel();
        position9 = new javax.swing.JLabel();
        position10 = new javax.swing.JLabel();

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
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(addImagen)
                .addGap(52, 52, 52)
                .addComponent(buttonAddToken, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAddToken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(doneImage)
                .addGap(53, 53, 53)
                .addComponent(buttonDone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doneImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remove token", "Lose 1 turn", "Take another token" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Trap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(trapImage)
                .addGap(57, 57, 57)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(trapImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
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
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(exitImage)
                .addGap(57, 57, 57)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(51, 0, 153));

        saveImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N

        buttonSave.setText("SAVE");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(saveImage)
                .addGap(55, 55, 55)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Available tokens");

        jLabel4.setFont(new java.awt.Font("MS Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Select Token");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("<<");

        jButton3.setText(">>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(actualPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actualDomino, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)))))
                        .addGap(91, 91, 91))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualPlayerName)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualDomino, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        position1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_0.png"))); // NOI18N
        position1.setName("position1"); // NOI18N
        jPanel3.add(position1);

        position2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(position2);

        position3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(position3);

        position4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_0.png"))); // NOI18N
        jPanel3.add(position4);

        position5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(position5);

        position6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(position6);

        position7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(position7);

        position8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(position8);

        position9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_2.png"))); // NOI18N
        jPanel3.add(position9);

        position10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/token0_1.png"))); // NOI18N
        jPanel3.add(position10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 11042, Short.MAX_VALUE)
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
                .addGap(0, 482, Short.MAX_VALUE))
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
        takeToken();
        
        
    }//GEN-LAST:event_buttonAddTokenActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
       //Go to destroy Windows
       this.dispose();
        
    }//GEN-LAST:event_buttonExitActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: , Lose 1 turn, Take another token
        if(tokenSelected == null){
            JOptionPane.showMessageDialog(rootPane, "Select one token first");
        }
        else{
            if (jComboBox1.getSelectedItem().equals("Remove token")) {
                if(ListPlayersGaming.getInstance().playerGaming.trapsActivated.contains(1)){
                    JOptionPane.showMessageDialog(rootPane, "That trap was already activated");
                }
                else{
                    tokenSelected.setTrap(1);
                }
                
            } else if (jComboBox1.getSelectedItem().equals("Lose 1 turn")) {
                if(ListPlayersGaming.getInstance().playerGaming.trapsActivated.contains(1)){
                    JOptionPane.showMessageDialog(rootPane, "That trap was already activated");
                }
                else{
                    tokenSelected.setTrap(2);
                }
            } else {
                if(ListPlayersGaming.getInstance().playerGaming.trapsActivated.contains(1)){
                    JOptionPane.showMessageDialog(rootPane, "That trap was already activated");
                }
                else{
                    tokenSelected.setTrap(3);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Icon i1 = ListPlayersGaming.getInstance().player1.tokens.get(0).image;
        actualDomino.setIcon(i1);
        actualDomino.setVisible(true);
    
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualDomino;
    private javax.swing.JLabel actualPlayerName;
    private javax.swing.JLabel addImagen;
    private javax.swing.JButton buttonAddToken;
    private javax.swing.JButton buttonDone;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel position1;
    private javax.swing.JLabel position10;
    private javax.swing.JLabel position2;
    private javax.swing.JLabel position3;
    private javax.swing.JLabel position4;
    private javax.swing.JLabel position5;
    private javax.swing.JLabel position6;
    private javax.swing.JLabel position7;
    private javax.swing.JLabel position8;
    private javax.swing.JLabel position9;
    private javax.swing.JLabel saveImage;
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
        //vars
        int position = 0, size = 28, range = 28;
        //array size = 7
        int[] array = new int[size];
        // call random to the first position
        array[position] = (int) (Math.random()*range+1);
        //add the first 
        tokensRandom[position] = array[position];
        // loop to compare from the second position to the final
        for (position = 1; position < size; position++) {
            // add to the next position
            array[position] = (int) (Math.random() * range+1);
            tokensRandom[position] = array[position];
            // loop to check the array again
            for (int position2 = 0; position2 < position; position2++) {
                // if last value is in array
                if (array[position] == tokensRandom[position2]) {
                    // come back one position and position the loop again until the number 
                    //will not in the array
                    position--;
                }
            }
        }
        //loop to print in console
        System.out.println("Arreglo 1 \n");
        for (int position3 = 0; position3 < size; position3++) {
            System.out.print((position3 + 1) + ".- " + array[position3] + "\n");
        }
    }
    
    
 public void distributeTokens(){
         int aux = ListPlayersGaming.getInstance().numberOfGamers;
         if(aux == 2){
             //player1
             for (int i = 0; i <= 6; i++){
                 tokensDelivered.add(tokensRandom[i]);
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player1.addToken(searchToken(tokensRandom[i])));
             }
             //player2
             for (int i = 7; i <= 13; i++) {
                 tokensDelivered.add(tokensRandom[i]);
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player2.addToken(searchToken(tokensRandom[i])));    
             }
         }
        if(aux == 3){
             //player1
             for (int i = 0; i <= 6; i++){
                 tokensDelivered.add(tokensRandom[i]);
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player1.addToken(searchToken(tokensRandom[i])));
             }
             //player2
             for (int i = 7; i <= 13; i++) {
                 tokensDelivered.add(tokensRandom[i]);
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player2.addToken(searchToken(tokensRandom[i])));    
             }
             //player3
             for (int i = 14; i <= 20; i++) {
                 tokensDelivered.add(tokensRandom[i]);
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player3.addToken(searchToken(tokensRandom[i])));
             }
         }
         if(aux == 4){
              //player1
             for (int i = 0; i <= 6; i++){
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player1.addToken(searchToken(tokensRandom[i])));
             }
             //player2
             for (int i = 7; i <= 13; i++) {
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player2.addToken(searchToken(tokensRandom[i])));    
             }
             //player3
             for (int i = 14; i <= 20; i++) {
                 availableTokens--;
                 System.out.println(ListPlayersGaming.getInstance().player3.addToken(searchToken(tokensRandom[i])));
             }
             //player4
             for (int i = 21; i <= 27; i++) {
                 availableTokens--;
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
    
    private void callSearchHighestToken(){
        ListPlayersGaming.getInstance().setFirstPlayer();
    }
    
    public void setNumberOfTokensAvailable(){
        jLabel4.setText(Integer.toString(availableTokens));
    }
    
    public void takeToken(){
         for(int i = 0; i <= 28; i++){
           if(availableTokens > 0){
               if(tokensDelivered.contains(tokensRandom[i])){
                    i++;
               }
               else{
                   ListPlayersGaming.getInstance().playerGaming.addToken(searchToken(tokensRandom[i])); 
                   availableTokens--;
                   setNumberOfTokensAvailable();
                   break;
               }
           }
           else{
               JOptionPane.showMessageDialog(null," Oops!!! There are not tokens available!  ");
               break;
           }
   
       }
    }
    public void loopToPrintImages(){
        
    }   
    
    
    
}
