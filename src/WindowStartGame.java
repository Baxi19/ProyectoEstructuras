
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
    public static int availableTokens = 28; //this will be used to count the avaible tokens
    int[] tokensRandom = new int[28];       //this will be used to save a ramdom numbers
    Token tokenSelected;                    //this will be used to get the actual token 
    ArrayList<Integer> tokensDelivered = new ArrayList<Integer>(28);//this will be used to save the tokens delivered info
    public static ArrayList<Token> tokensList = new ArrayList<Token>(28); //this will be used to save all tokens in the start
    
    public static boolean moveDone;     //this will be used to check if the user insert a token 
    public static int tokensPair = 0;   //this will be used to count the pair's tokens
    public static int count = 0;        //this will be used to select the position in the list'names
    public static ArrayList<String> imagesNames = new ArrayList<String>(21);//this will be used to save the images names
    
    public static int numberOfTokens = 0; //this will be used to count the tokens's number
    public static boolean winner = false; //this will be activate when the actual gamer is without tokens
    ArrayList<Integer> listPossibilities = new ArrayList<Integer>();//this will be used to save the game and posibilities in the logical  game
    
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
    TokenPair t1 = new TokenPair(null,null,null,null,null, null, 0, 0, 1, I1,"0_0.png",0);
    Token t2 = new Token(0, 1, 2, I2,"0_1.png",0);
    Token t3 = new Token(0, 2, 3, I3,"0_2.png",0);
    Token t4 = new Token(0, 3, 4, I4,"0_3.png",0);
    Token t5 = new Token(0, 4, 5, I5,"0_4.png",0);
    Token t6 = new Token(0, 5, 6, I6,"0_5.png",0);
    Token t7 = new Token(0, 6, 7, I7,"0_6.png",0);
    TokenPair t8 = new TokenPair(null,null,null,null,null, null, 1, 1, 8, I8,"1_1.png",0);
    Token t9 = new Token(1, 2, 9, I9,"1_2.png",0);
    Token t10 = new Token(1, 3, 10, I10,"1_3.png",0);
    Token t11 = new Token(1, 4, 11, I11,"1_4.png",0);
    Token t12 = new Token(1, 5, 12, I12,"1_5.png",0);
    Token t13 = new Token(1, 6, 13, I13,"1_6.png",0);
    TokenPair t14 = new TokenPair(null,null,null,null,null, null, 2, 2, 14, I14 ,"2_2.png",0);
    Token t15 = new Token(2, 3, 15, I15,"2_3.png",0);
    Token t16 = new Token(2, 4, 16, I16,"2_4.png",0);
    Token t17 = new Token(2, 5, 17, I17,"2_5.png",0);
    Token t18 = new Token(2, 6, 18, I18,"2_6.png",0);
    TokenPair t19 = new TokenPair(null,null,null,null, null, null, 3, 3, 19, I19,"3_3.png",0);
    Token t20 = new Token(3, 4, 20, I20,"3_4.png",0);
    Token t21 = new Token(3, 5, 21, I21,"3_5.png",0);
    Token t22 = new Token(3, 6, 22, I22,"3_6.png",0);
    TokenPair t23 = new TokenPair(null,null,null,null,null, null, 4, 4, 23, I23,"4_4.png",0);
    Token t24 = new Token(4, 5, 24, I24,"4_5.png",0);
    Token t25 = new Token(4, 6, 25, I25,"4_6.png",0);
    TokenPair t26 = new TokenPair(null,null,null,null,null, null,5, 5, 26, I26, "5_5.png",0);
    Token t27 = new Token(5, 6, 27, I27,"5_6.png",0);
    TokenPair t28 = new TokenPair(null,null,null,null,null, null, 6, 6, 28, I28, "6_6.png",0);
    
    /**
     * Creates new form LoadGame
     */
    public WindowStartGame() {                      //Constructor                                                     
        initComponents();                       //Start the windows                                                     
        moveDone = false;                       //insert validation
        MouseListener ml;
        ml = new MouseListener() {              //Listener                                

            @Override                           //Override funtion                                
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {//if the mouse is pressed
                while (moveDone == false) {         //loop to compare possibilities
                    setTranfer();                   //It will preparate the Jlabels to recive information
                    JComponent jlabelInfo = (JComponent) e.getSource();                 //get Jlabel  info
                    TransferHandler tranferHandler = jlabelInfo.getTransferHandler();   //th is used to transfer the image to the new position                
                    String nam = imagesNames.get(count);//Get the actual token name
                    Token newToken = searchTokenName(nam);  //token grabbed
                    //add token with trap in a arrayList
                    if(newToken.trap != 0){
                        int id = newToken.id;
                        Token token = searchToken(id);
                        ListPlayersGaming.listTrap.add(token);
                    }
                    System.out.println("_______________Data of token_______________\n");
                    System.out.println(newToken.value1 + "|" + newToken.value2);
                    //It insert the first token in the list
                    if (ListTokensGame.getInstance().start3 == null) { //if the list is empty...
                        // Search if are tokens with tramps
                        verify();
                        tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY);   //is used to handle the transfer of a Transferable to and from Swing components                 
                        callInsertAtStart(newToken); //this will insert the first tokens
                        deleteToken(nam);            //this will eliminate the token in the player list   
                        listPossibilities.add (0,newToken.value1);// this will save the start position
                        listPossibilities.add(1,newToken.value2);// this will save the end position
                        tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY);//is used copy the token image in the graphical matrix                
                        // this will check if is pair to save the possibles moves
                        if(newToken.value1 == newToken.value2){
                            listPossibilities.add( newToken.value1);
                            listPossibilities.add( newToken.value1);
                        }
                        moveDone = true;
                        // this will check if the actual user is without tokens
                        if( ListPlayersGaming.getInstance().playerGaming.tokens.size() == 0 ){
                            winner = true;
                        }
                        if (winner == true){
                            int wins = ListPlayersGaming.getInstance().playerGaming.getWins();
                            ListPlayersGaming.getInstance().playerGaming.setWins(wins+1);
                            JOptionPane.showMessageDialog(rootPane, "You Win This Round");
                        }
                        System.out.println("First token Inserted.");
                        System.out.println(newToken.value1 + "|" + newToken.value2);
                        break;
                    }
                    else{ 
                    
                        
                        // this will check the start position
                        if (newToken.value2 == listPossibilities.get(0)){ // if is the same valor to start
                            // Search if are tokens with tramps
                            verify();
                            int aux = listPossibilities.get(0);
                            tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY); // copy the info   //is used to handle the transfer of a Transferable to and from Swing components                 
                            callInsertAtStart(newToken); // insert at start
                            deleteToken(nam);// delete the token
                            listPossibilities.set(0, newToken.value1);// move the first value
                            // this will check if is pair
                            if(newToken.value1 == newToken.value2){
                                listPossibilities.add( newToken.value1);
                                listPossibilities.add( newToken.value1);
                            }
                            moveDone = true;
                            if( ListPlayersGaming.getInstance().playerGaming.tokens.size() == 0 ){
                                winner = true;
                            }
                            if (winner == true){
                                int wins = ListPlayersGaming.getInstance().playerGaming.getWins();
                                ListPlayersGaming.getInstance().playerGaming.setWins(wins+1);
                                JOptionPane.showMessageDialog(rootPane, "You Win This Round");
                            }
                            System.out.println("Inserted: value 2 is the same valor to start");
                            break;
                            }
                        }
                        if (newToken.value1 == listPossibilities.get(0)) { // if is different valor to start
                            // Search if are tokens with tramps
                            verify();
                            tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY);   //is used to handle the transfer of a Transferable to and from Swing components                 
                            int[] arrayChanged = changeValors(newToken.value1, newToken.value2);
                            newToken.value1 = arrayChanged[0];
                            newToken.value2 = arrayChanged[1];
                            callInsertAtStart(newToken);
                            deleteToken(nam);
                            listPossibilities.set(0, newToken.value1);// move the first value
                            if(newToken.value1 == newToken.value2){
                                listPossibilities.add( newToken.value1);
                                listPossibilities.add( newToken.value1);
                            }
                            if( ListPlayersGaming.getInstance().playerGaming.tokens.size() == 0 ){
                                winner = true;
                            }
                            if (winner == true){
                                int wins = ListPlayersGaming.getInstance().playerGaming.getWins();
                                ListPlayersGaming.getInstance().playerGaming.setWins(wins+1);
                                JOptionPane.showMessageDialog(rootPane, "You Win This Round");
                            }
                            moveDone = true;
                            System.out.println("Inserted: new value 1  changed to  valor 2  to insert in start");
                            break;
                        }
                        if (newToken.value1 == listPossibilities.get(1)) { // if is the same valor to start
                            // Search if are tokens with tramps
                            verify();
                            tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY);   //is used to handle the transfer of a Transferable to and from Swing components                 
                            callInserToTheRight(newToken);
                            deleteToken(nam);
                            listPossibilities.set(1, newToken.value2);// move the first value
                            if(newToken.value1 == newToken.value2){
                                listPossibilities.add( newToken.value1);
                                listPossibilities.add( newToken.value1);
                            }
                            if( ListPlayersGaming.getInstance().playerGaming.tokens.size() == 0 ){
                                winner = true;
                            }
                            if (winner == true){
                                int wins = ListPlayersGaming.getInstance().playerGaming.getWins();
                                ListPlayersGaming.getInstance().playerGaming.setWins(wins+1);
                                JOptionPane.showMessageDialog(rootPane, "You Win This Round");
                                }
                            moveDone = true;
                            System.out.println("Inserted: new value 1 is the same valor to end");
                            break;
                        }
                        if (newToken.value2 == listPossibilities.get(1)) { // if is different valor to start
                            // Search if are tokens with tramps
                            verify();
                            tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY);   //is used to handle the transfer of a Transferable to and from Swing components                 
                            int[] arrayChanged = changeValors(newToken.value1, newToken.value2);
                            newToken.value1 = arrayChanged[0];
                            newToken.value2 = arrayChanged[1];
                            callInserToTheRight(newToken);
                            deleteToken(nam);
                            listPossibilities.set(1, newToken.value2);// move the first value
                            if(newToken.value1 == newToken.value2){
                                listPossibilities.add( newToken.value1);
                                listPossibilities.add( newToken.value1);
                            }
                            if( ListPlayersGaming.getInstance().playerGaming.tokens.size() == 0 ){
                                winner = true;
                            }
                            if (winner == true){
                                int wins = ListPlayersGaming.getInstance().playerGaming.getWins();
                                ListPlayersGaming.getInstance().playerGaming.setWins(wins+1);
                                JOptionPane.showMessageDialog(rootPane, "You Win This Round");
                            }
                            moveDone = true;
                            System.out.println("Inserted: new value 1  changed to  valor 2  to insert in end");
                            break;
                        }

                        for (int i = 2; i < listPossibilities.size() ; i++) {
                            int var = listPossibilities.get(i);
                                
                                if (var == newToken.value1) {
                                    // Search if are tokens with tramps
                                    verify();
                                    tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY);   //is used to handle the transfer of a Transferable to and from Swing components                 
                                    callInserToTheRight(newToken);
                                    deleteToken(nam);
                                    listPossibilities.set(i, newToken.value2);

                                if( ListPlayersGaming.getInstance().playerGaming.tokens.size() == 0 ){
                                    winner = true;
                                }
                                if (winner == true){
                                    int wins = ListPlayersGaming.getInstance().playerGaming.getWins();
                                    ListPlayersGaming.getInstance().playerGaming.setWins(wins+1);
                                    JOptionPane.showMessageDialog(rootPane, "You Win This Round");
                                }
                                moveDone = true;
                                System.out.println("Inserted: new value 1  is in tokens pair");
                                break;
                                
                            }
                            if(var == newToken.value2){
                                verify();
                                tranferHandler.exportAsDrag(jlabelInfo, e, TransferHandler.COPY);   //is used to handle the transfer of a Transferable to and from Swing components                 
                                int[] arrayChanged = changeValors(newToken.value1, newToken.value2);
                                newToken.value1 = arrayChanged[0];
                                newToken.value2 = arrayChanged[1];
                                callInserToTheRight(newToken);
                                deleteToken(nam);
                                listPossibilities.set(i, newToken.value2);
                                if( ListPlayersGaming.getInstance().playerGaming.tokens.size() == 0 ){
                                    winner = true;
                                }
                                if (winner == true){
                                    int wins = ListPlayersGaming.getInstance().playerGaming.getWins();
                                    ListPlayersGaming.getInstance().playerGaming.setWins(wins+1);
                                    JOptionPane.showMessageDialog(rootPane, "You Win This Round");
                                }
                            
                                moveDone = true;
                                System.out.println("Inserted: new value 1  changed to  valor 2  to insert in tokens pair");
                                break;
                            }

                        }
                        // this will check if the token is incompatible
                        if(moveDone == false){
                            JOptionPane.showMessageDialog(rootPane, "This Token is incompatible");
                            System.out.println("Token not inserted");
                            break;
                        }
                    }
                    
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
        
        // set new images
        //This instruction gets the icon("Image") from the tokens and them 
        //it is used to remplace in the position icon on the matriz's game
        position1.setTransferHandler(new TransferHandler("icon"));
        position2.setTransferHandler(new TransferHandler("icon"));
        position3.setTransferHandler(new TransferHandler("icon"));
        position4.setTransferHandler(new TransferHandler("icon"));
        
        insertTokensInGlobalList();//insert the tokens in a global list
        printTokens();// print tokens info
        makeRandomList();//make a random list
        distributeTokens();//distribute the token's by the number of random list
        callSearchHighestToken();// search the tokens hight

        actualPlayerName.setText(ListPlayersGaming.getInstance().playerGaming.name);// change the player name in the game windows
        setNumberOfTokensAvailable();// set the tokens avaible
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageTable = new javax.swing.JLabel();
        userControls = new javax.swing.JPanel();
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
        tipoTrampa = new javax.swing.JComboBox<>();
        buttonTrap = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        exitImage = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        saveImage = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        availableInfo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        doneImage1 = new javax.swing.JLabel();
        bNext = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        logicalMatrix = new javax.swing.JPanel();
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
        showTokens = new javax.swing.JPanel();
        Information = new javax.swing.JLabel();
        position1 = new javax.swing.JLabel();
        position7 = new javax.swing.JLabel();
        position3 = new javax.swing.JLabel();
        position8 = new javax.swing.JLabel();
        position2 = new javax.swing.JLabel();
        position9 = new javax.swing.JLabel();
        position4 = new javax.swing.JLabel();
        position6 = new javax.swing.JLabel();
        position10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imageTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/table.jpg"))); // NOI18N
        imageTable.setLabelFor(logicalMatrix);
        imageTable.setMaximumSize(new java.awt.Dimension(1000, 800));
        imageTable.setMinimumSize(new java.awt.Dimension(1000, 800));
        imageTable.setPreferredSize(new java.awt.Dimension(1000, 800));

        userControls.setBackground(new java.awt.Color(12, 7, 169));

        jPanel4.setBackground(new java.awt.Color(102, 0, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userIcon.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(51, 0, 153));

        addImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/getToken.png"))); // NOI18N

        buttonAddToken.setBackground(new java.awt.Color(0, 0, 0));
        buttonAddToken.setForeground(new java.awt.Color(102, 0, 255));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addImagen)
                .addGap(62, 62, 62)
                .addComponent(buttonAddToken, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAddToken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(addImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 0, 153));

        doneImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check.png"))); // NOI18N

        buttonDone.setBackground(new java.awt.Color(0, 0, 0));
        buttonDone.setForeground(new java.awt.Color(102, 0, 255));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneImage)
                .addGap(63, 63, 63)
                .addComponent(buttonDone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doneImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/game.png"))); // NOI18N

        actualPlayerName.setFont(new java.awt.Font("Script MT Bold", 2, 20)); // NOI18N
        actualPlayerName.setForeground(new java.awt.Color(255, 255, 255));
        actualPlayerName.setText("Player");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("___________________________________");

        jPanel21.setBackground(new java.awt.Color(51, 0, 153));

        trapImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trapIcon.png"))); // NOI18N

        tipoTrampa.setBackground(new java.awt.Color(0, 0, 0));
        tipoTrampa.setForeground(new java.awt.Color(102, 0, 255));
        tipoTrampa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remove token", "Lose 1 turn", "Take another token" }));
        tipoTrampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTrampaActionPerformed(evt);
            }
        });

        buttonTrap.setBackground(new java.awt.Color(0, 0, 0));
        buttonTrap.setForeground(new java.awt.Color(102, 0, 255));
        buttonTrap.setText("Trap");
        buttonTrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(trapImage)
                .addGap(66, 66, 66)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonTrap, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(tipoTrampa, 0, 0, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(tipoTrampa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTrap))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(trapImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(51, 0, 153));

        exitImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/off.png"))); // NOI18N

        buttonExit.setBackground(new java.awt.Color(0, 0, 0));
        buttonExit.setForeground(new java.awt.Color(102, 0, 255));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitImage)
                .addGap(65, 65, 65)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(exitImage))
        );

        jPanel23.setBackground(new java.awt.Color(51, 0, 153));

        saveImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N

        buttonSave.setBackground(new java.awt.Color(0, 0, 0));
        buttonSave.setForeground(new java.awt.Color(102, 0, 255));
        buttonSave.setText("SAVE");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveImage)
                .addGap(60, 60, 60)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(saveImage)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Available tokens :");

        availableInfo.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        availableInfo.setForeground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(51, 0, 153));

        doneImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selection.png"))); // NOI18N

        bNext.setBackground(new java.awt.Color(0, 0, 0));
        bNext.setForeground(new java.awt.Color(102, 0, 255));
        bNext.setText("Next");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        bBack.setBackground(new java.awt.Color(0, 0, 0));
        bBack.setForeground(new java.awt.Color(102, 0, 255));
        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneImage1)
                .addGap(65, 65, 65)
                .addComponent(bBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bNext)
                .addGap(44, 44, 44))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doneImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNext)
                    .addComponent(bBack))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(57, 57, 57)
                        .addComponent(actualPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actualPlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availableInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout userControlsLayout = new javax.swing.GroupLayout(userControls);
        userControls.setLayout(userControlsLayout);
        userControlsLayout.setHorizontalGroup(
            userControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        userControlsLayout.setVerticalGroup(
            userControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        logicalMatrix.setMaximumSize(new java.awt.Dimension(1000, 1000));
        logicalMatrix.setMinimumSize(new java.awt.Dimension(1000, 1000));
        logicalMatrix.setOpaque(false);
        logicalMatrix.setPreferredSize(new java.awt.Dimension(1000, 1000));
        logicalMatrix.setLayout(new java.awt.GridLayout(7, 11));
        logicalMatrix.add(celda80);
        logicalMatrix.add(celda79);
        logicalMatrix.add(celda78);
        logicalMatrix.add(celda77);
        logicalMatrix.add(celda76);
        logicalMatrix.add(celda75);
        logicalMatrix.add(celda74);
        logicalMatrix.add(celda73);
        logicalMatrix.add(celda72);
        logicalMatrix.add(celda71);
        logicalMatrix.add(celda70);
        logicalMatrix.add(celda69);
        logicalMatrix.add(celda68);
        logicalMatrix.add(celda67);
        logicalMatrix.add(celda66);
        logicalMatrix.add(celda65);
        logicalMatrix.add(celda64);
        logicalMatrix.add(celda63);
        logicalMatrix.add(celda62);
        logicalMatrix.add(celda61);
        logicalMatrix.add(celda60);
        logicalMatrix.add(celda59);
        logicalMatrix.add(celda58);
        logicalMatrix.add(celda57);
        logicalMatrix.add(celda56);
        logicalMatrix.add(celda55);
        logicalMatrix.add(celda54);
        logicalMatrix.add(celda53);
        logicalMatrix.add(celda52);
        logicalMatrix.add(celda51);
        logicalMatrix.add(celda50);
        logicalMatrix.add(celda1);
        logicalMatrix.add(celda8);
        logicalMatrix.add(celda15);
        logicalMatrix.add(celda22);
        logicalMatrix.add(celda29);
        logicalMatrix.add(celda36);
        logicalMatrix.add(celda43);
        logicalMatrix.add(celda2);
        logicalMatrix.add(celda9);
        logicalMatrix.add(celda16);
        logicalMatrix.add(celda23);
        logicalMatrix.add(celda30);
        logicalMatrix.add(celda37);
        logicalMatrix.add(celda44);
        logicalMatrix.add(celda3);
        logicalMatrix.add(celda10);
        logicalMatrix.add(celda17);
        logicalMatrix.add(celda24);
        logicalMatrix.add(celda31);
        logicalMatrix.add(celda38);
        logicalMatrix.add(celda45);
        logicalMatrix.add(celda4);
        logicalMatrix.add(celda11);
        logicalMatrix.add(celda18);
        logicalMatrix.add(celda25);
        logicalMatrix.add(celda32);
        logicalMatrix.add(celda39);
        logicalMatrix.add(celda46);
        logicalMatrix.add(celda5);
        logicalMatrix.add(celda12);
        logicalMatrix.add(celda19);
        logicalMatrix.add(celda26);
        logicalMatrix.add(celda33);
        logicalMatrix.add(celda40);
        logicalMatrix.add(celda47);
        logicalMatrix.add(celda6);
        logicalMatrix.add(celda13);
        logicalMatrix.add(celda20);
        logicalMatrix.add(celda27);
        logicalMatrix.add(celda34);
        logicalMatrix.add(celda41);
        logicalMatrix.add(celda48);
        logicalMatrix.add(celda7);
        logicalMatrix.add(celda14);
        logicalMatrix.add(celda21);
        logicalMatrix.add(celda28);
        logicalMatrix.add(celda35);
        logicalMatrix.add(celda42);
        logicalMatrix.add(celda49);

        showTokens.setBackground(new java.awt.Color(51, 0, 153));
        showTokens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        showTokens.setMinimumSize(new java.awt.Dimension(1000, 120));
        showTokens.setPreferredSize(new java.awt.Dimension(1000, 120));
        showTokens.setLayout(new java.awt.GridLayout(1, 0));

        Information.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Information.setForeground(new java.awt.Color(255, 255, 255));
        Information.setText("Select Position:");
        Information.setToolTipText("");
        Information.setMaximumSize(new java.awt.Dimension(100, 100));
        Information.setMinimumSize(new java.awt.Dimension(100, 100));
        Information.setName("Information"); // NOI18N
        Information.setPreferredSize(new java.awt.Dimension(100, 100));
        showTokens.add(Information);

        position1.setMaximumSize(new java.awt.Dimension(100, 100));
        position1.setMinimumSize(new java.awt.Dimension(100, 100));
        position1.setPreferredSize(new java.awt.Dimension(100, 100));
        showTokens.add(position1);
        showTokens.add(position7);
        showTokens.add(position3);
        showTokens.add(position8);

        position2.setMaximumSize(new java.awt.Dimension(100, 100));
        position2.setMinimumSize(new java.awt.Dimension(100, 100));
        position2.setPreferredSize(new java.awt.Dimension(100, 100));
        showTokens.add(position2);
        showTokens.add(position9);
        showTokens.add(position4);
        showTokens.add(position6);
        showTokens.add(position10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(userControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logicalMatrix, javax.swing.GroupLayout.DEFAULT_SIZE, 1629, Short.MAX_VALUE)
                    .addComponent(showTokens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 363, Short.MAX_VALUE)
                    .addComponent(imageTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1637, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(showTokens, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logicalMatrix, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imageTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 780, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // this will delete the token in a list of player gaming
    public String deleteToken(String name){
        for(int i = 0; i < ListPlayersGaming.getInstance().playerGaming.tokens.size(); i++){
         if(ListPlayersGaming.getInstance().playerGaming.tokens.get(i).name.equals(name)){
             ListPlayersGaming.getInstance().playerGaming.tokens.remove(i);
             return "Token deleted";
         }
     }
     return "Token to delete not found";
    }
    
    public void setTranfer(){
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
        
            
        }
    
    
    // this will change the valors at token to insert 
    public int[] changeValors(int value1,int value2){
        int aux = value1;//guardamos el valor 1
        value1 = value2;//se cambia el valor 1 por el valor 2
        value2 = aux;   // sustituimos el valor 2 por el valor que guardo el aux
        int[] arrayAux = new int[2];
        arrayAux[0] = value1;
        arrayAux[1] = value2;
        return arrayAux;
    }
    //it will check if there are token's available & the gamer don't finish his round yet
    public boolean checkTokens(int bag) {
            //if aren't any token
            if(this.availableTokens == 0){
                return true;
            }
            //if are  token, the gamer have to take a token
            else{
                return false;
            }
        }
        
    // this will move to the next gamer
    private void buttonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDoneActionPerformed

        // it move to the next player's turn
        if (moveDone == false) {
            if (checkTokens(availableTokens)) {
                ListPlayersGaming.getInstance().playerGaming = ListPlayersGaming.getInstance().playerGaming.sig;
                moveDone = false;
                //ListPlayersGaming.getInstance().actualUser.setName("Done");  //ELIMINAR LINEA CUANDO ESTE CARGANDO LOS JUGADORES CON DIFERENTES NOMBRES
                String gamer = ListPlayersGaming.getInstance().playerGaming.name;
                actualPlayerName.setText(gamer);// change the player name in the game windows
                position1.setIcon(null);
                position2.setIcon(null);
                position3.setIcon(null);
                position4.setIcon(null);
                count = 0;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please select Button's Token to get a new possibility");
            }
        }
        if(moveDone == true){
            ListPlayersGaming.getInstance().playerGaming = ListPlayersGaming.getInstance().playerGaming.sig;
                moveDone = false;
                //ListPlayersGaming.getInstance().actualUser.setName("Done");  //ELIMINAR LINEA CUANDO ESTE CARGANDO LOS JUGADORES CON DIFERENTES NOMBRES
                String gamer = ListPlayersGaming.getInstance().playerGaming.name;
                actualPlayerName.setText(gamer);// change the player name in the game windows
                position1.setIcon(null);
                position2.setIcon(null);
                position3.setIcon(null);
                position4.setIcon(null);
                count = 0;
        
        }
    }//GEN-LAST:event_buttonDoneActionPerformed

    private void buttonAddTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddTokenActionPerformed
        takeToken();
        
    }//GEN-LAST:event_buttonAddTokenActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
       //Go to destroy Windows
       this.dispose();
        
    }//GEN-LAST:event_buttonExitActionPerformed

    private void tipoTrampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTrampaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTrampaActionPerformed

    private void buttonTrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrapActionPerformed
        addTrap();
        
    }//GEN-LAST:event_buttonTrapActionPerformed
    public void addTrap(){
        if (tipoTrampa.getSelectedItem().equals("Remove token")) {
            if (ListPlayersGaming.getInstance().listTrap.contains(1)) {
                JOptionPane.showMessageDialog(rootPane, "That trap was already activated");
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Trap 1 activeted");
                Token auxToken = tokenSelected;
                auxToken.setTrap(1);
                ListPlayersGaming.getInstance().listTrap.add(tokenSelected);
                
                return;
            }
        } else if (tipoTrampa.getSelectedItem().equals("Lose 1 turn")) {
            if (ListPlayersGaming.getInstance().playerGaming.trapsActivated.contains(1)) {
                JOptionPane.showMessageDialog(rootPane, "That trap was already activated");
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Trap 2 activeted");
                Token auxToken = tokenSelected;
                auxToken.setTrap(2);
                ListPlayersGaming.getInstance().listTrap.add(auxToken);
                
                return;
            }
        } else if (tipoTrampa.getSelectedItem().equals("Take another token")) {
            if (ListPlayersGaming.getInstance().playerGaming.trapsActivated.contains(1)) {
                JOptionPane.showMessageDialog(rootPane, "That trap was already activated");
                return ;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Trap 3 activeted");
                Token auxToken = tokenSelected;
                auxToken.setTrap(1);
                ListPlayersGaming.getInstance().listTrap.add(auxToken);
                
                return;
            }
        }

    }

    public void verify() {
         
        for (int i = 0; i < ListPlayersGaming.getInstance().listTrap.size(); i++) {
            int trap = ListPlayersGaming.getInstance().listTrap.get(i).trap;
            if (trap != 0) {
                searchTrap(trap);
                System.out.println("Token with trap : " + trap);
            }
        }
    }

    public void searchTrap(int number) {
        if (number == 1) {
            activateTrap1();
        }
        if (number == 2) {
            activateTrap2();
        }
        if (number == 3) {
            activateTrap3();
        }
    }

    public void activateTrap1() {
        JOptionPane.showMessageDialog(rootPane, "Trap 1 activated, your token was returned ");
        moveDone = true;
        
    }

    public void activateTrap2() {
        JOptionPane.showMessageDialog(rootPane, "Trap 2 activated, you lost 1 turn");
        done();
    }

    public void activateTrap3() {
        // it will given a new token if is available
        if (availableTokens != 0) {
            JOptionPane.showMessageDialog(rootPane, "Trap 3 was activated, you were given a new token");
            takeToken();
        }
        if (availableTokens == 0) {
            JOptionPane.showMessageDialog(rootPane, "Trap 3 was activated \n you will lost your round \n because isn't token's available");
            done();
        }
    }

    public void done() {
        // it change to the another round
        ListPlayersGaming.getInstance().playerGaming = ListPlayersGaming.getInstance().playerGaming.sig;
        moveDone = false;
        //ListPlayersGaming.getInstance().actualUser.setName("Done");  //ELIMINAR LINEA CUANDO ESTE CARGANDO LOS JUGADORES CON DIFERENTES NOMBRES
        String gamer = ListPlayersGaming.getInstance().playerGaming.name;
        actualPlayerName.setText(gamer);// change the player name in the game windows
        position1.setIcon(null);
        position2.setIcon(null);
        position3.setIcon(null);
        position4.setIcon(null);
        count = 0;

    }



    // this will insert images in the actual tokens list 
    public void insertImage(String button){
        imagesNames.clear(); //clean the list of names in every movement
        String var = "";     //var will be used to save the token name
        int tokensSize = ListPlayersGaming.getInstance().playerGaming.tokens.size(); //actual tokens size 
        for (int i = 0; i < tokensSize; i++) {
            var = ListPlayersGaming.getInstance().playerGaming.tokens.get(i).name;// save the token's name
            imagesNames.add(var); // add the name in a arrayList
        }
        // 4 lists will be used to save every token image from every actual gamer
        ImageIcon[] imagenList = new ImageIcon[tokensSize];
        ImageIcon[] imagenList2 = new ImageIcon[tokensSize];
        ImageIcon[] imagenList3 = new ImageIcon[tokensSize];
        ImageIcon[] imagenList4 = new ImageIcon[tokensSize];
        
        //loop to save the actual user token's images in 4 diferents positions
        for (int i = 0; i < imagenList.length; i++) {
            imagenList[i] = new ImageIcon(getClass().getResource("/ImagesDominoes/"+imagesNames.get(i)));
            imagenList2[i] = new ImageIcon(getClass().getResource("/ImagesDominoes180/"+imagesNames.get(i)));
            imagenList3[i] = new ImageIcon(getClass().getResource("/ImagesDominoesLeft/"+imagesNames.get(i)));
            imagenList4[i] = new ImageIcon(getClass().getResource("/ImagesDominoesRight/"+imagesNames.get(i)));         
        }
        //this will check when is the first position and the button is back
        if(count == 0  & "Back".equals(button)){
            count = (tokensSize-1);
            position1.setIcon(imagenList[count]);
            position2.setIcon(imagenList2[count]);
            position3.setIcon(imagenList3[count]);
            position4.setIcon(imagenList4[count]);
        }
        //this will check when is the last position and the button is next
        else if(count == (tokensSize -1) & "Next".equals(button)){
            count = 0;
            position1.setIcon(imagenList[count]);
            position2.setIcon(imagenList2[count]);
            position3.setIcon(imagenList3[count]);
            position4.setIcon(imagenList4[count]);
            
        }
        //this will move to the next position
        else if(count >= 0 & "Next".equals(button)){
            count ++;
            position1.setIcon(imagenList[count]);
            position2.setIcon(imagenList2[count]);
            position3.setIcon(imagenList3[count]);
            position4.setIcon(imagenList4[count]);
            
        }
        //this will move to the back position
        else if(count <= (tokensSize-1) &"Back".equals(button) ) {
            count --;
            position1.setIcon(imagenList[count]);
            position2.setIcon(imagenList2[count]);
            position3.setIcon(imagenList3[count]);
            position4.setIcon(imagenList4[count]);
            
        }        
    }

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
        insertImage("Next");
        
    }//GEN-LAST:event_bNextActionPerformed
    
    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
      insertImage("Back");
        
    }//GEN-LAST:event_bBackActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        try {
            // TODO add your handling code here:
            capturarPantalla(ListPlayersGaming.getInstance().playerGaming.name);
        } catch (AWTException ex) {
            Logger.getLogger(WindowStartGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WindowStartGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Information;
    private javax.swing.JLabel actualPlayerName;
    private javax.swing.JLabel addImagen;
    private javax.swing.JLabel availableInfo;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bNext;
    private javax.swing.JButton buttonAddToken;
    private javax.swing.JButton buttonDone;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
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
    private javax.swing.JLabel doneImage1;
    private javax.swing.JLabel exitImage;
    private javax.swing.JLabel imageTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel logicalMatrix;
    private javax.swing.JLabel position1;
    private javax.swing.JLabel position10;
    private javax.swing.JLabel position2;
    private javax.swing.JLabel position3;
    private javax.swing.JLabel position4;
    private javax.swing.JLabel position6;
    private javax.swing.JLabel position7;
    private javax.swing.JLabel position8;
    private javax.swing.JLabel position9;
    private javax.swing.JLabel saveImage;
    private javax.swing.JPanel showTokens;
    private javax.swing.JComboBox<String> tipoTrampa;
    private javax.swing.JLabel trapImage;
    private javax.swing.JPanel userControls;
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
    //this make a random list with diferents numbers
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
    
 //this will give the  random numbers used to give the token's ID    
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
   
    //this will return the token searched by ID
    public Token searchToken(int id){
        for(int i = 0; i <= 28; i++){
            if(tokensList.get(i).id == id)
                return tokensList.get(i);
        }
        return null;
    }
    
    //this will print the tokens's info 
    public void printTokens(){
        for(int i = 0; i <= 27; i++)
            System.out.println("Lado A:" + tokensList.get(i).value1 + " | Lado B:" + tokensList.get(i).value2 + "       ID: " + (i+1));
    }
    //this will search the hight token and set the first gamer in a new game
    private void callSearchHighestToken(){
        ListPlayersGaming.getInstance().setFirstPlayer();
    }
    //this will set the number of token's available
    public void setNumberOfTokensAvailable(){
        availableInfo.setText(Integer.toString(availableTokens));
    }
    //this will get the  token to actual user
    public void takeToken(){
        if (availableTokens > 0) {
            int i = 0;
            while (i < 28) {
                if(tokensDelivered.contains(tokensRandom[i])) {
                    i++;
                } else {
                    ListPlayersGaming.getInstance().playerGaming.addToken(searchToken(tokensRandom[i]));
                    tokensDelivered.add(tokensRandom[i]);
                    availableTokens--;
                    setNumberOfTokensAvailable();
                    break;
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, " Oops!!! There are not tokens available!  ");
        }
    }
    
    //this will search tokens by name
    public Token searchTokenName(String name){
        for(int i = 0; i < ListPlayersGaming.getInstance().playerGaming.tokens.size(); i++){
            if(ListPlayersGaming.getInstance().playerGaming.tokens.get(i).name.equals(name)){
                return ListPlayersGaming.getInstance().playerGaming.tokens.get(i);
            }
        }
        return null;       
    }
    
    //this will catch the imagen for the game to save in file
    public static void capturarPantalla(String Nombre) throws AWTException, IOException {
     BufferedImage captura = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );
     ListPlayersGaming.getInstance().playerGaming.addGame(captura);
     // Save as JPEG
     File file = new File(Nombre + ".jpg");
     ImageIO.write(captura, "jpg", file);
     JOptionPane.showMessageDialog(null, ListPlayersGaming.getInstance().actualUser.name + "'s game saved");
  }
    //this will insert token in the start
    public void callInsertAtStart(Token nToken){
        ListTokensGame.getInstance().insertStart(nToken);
        if (nToken.id == 1 | nToken.id == 8 | nToken.id == 14
          | nToken.id == 19 | nToken.id == 23 | nToken.id == 28) {
            TokenPair tok = new TokenPair(null,null,null,null,null, null, nToken.value1, nToken.value2, nToken.id, nToken.image, nToken.name,0);
            ListTokensGame.getInstance().addTokenPair(tok);
        }    
    }
    //this will insert token in the end
    public void callInserToTheRight(Token nToken){
        ListTokensGame.getInstance().insertFinal(nToken); 
        if (nToken.id == 1 | nToken.id == 8 | nToken.id == 14
          | nToken.id == 19 | nToken.id == 23 | nToken.id == 28) {
             TokenPair tok = new TokenPair(null,null,null,null,null, null, nToken.value1, nToken.value2, nToken.id, nToken.image, nToken.name,0);
             ListTokensGame.getInstance().addTokenPair(tok);
        }    
    }
    //this will insert token in a token's pair to up
    public void callInsertUp(Token nToken, TokenPair tokenPair) {
        ListTokensGame.getInstance().insertUp(nToken, tokenPair);
        if (nToken.id == 1 | nToken.id == 8 | nToken.id == 14
          | nToken.id == 19 | nToken.id == 23 | nToken.id == 28) {
             TokenPair tok = new TokenPair(null,null,null,null,null, null, nToken.value1, nToken.value2, nToken.id, nToken.image, nToken.name,0);
             ListTokensGame.getInstance().addTokenPair(tok);
        }
    }
    //this will insert token in a token's pair to down
    public void callInsertDown(Token nToken, TokenPair tokenPair) {
        ListTokensGame.getInstance().insertDown(nToken, tokenPair);
        if (nToken.id == 1 | nToken.id == 8 | nToken.id == 14
          | nToken.id == 19 | nToken.id == 23 | nToken.id == 28) {
             TokenPair tok = new TokenPair(null,null,null,null,null, null, nToken.value1, nToken.value2, nToken.id, nToken.image, nToken.name,0);
             ListTokensGame.getInstance().addTokenPair(tok);
        }
    }

}
