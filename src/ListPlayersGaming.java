
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randald
 */
public class ListPlayersGaming {
    int numberOfGamers;
    Player start2, end2;
    public static ArrayList<Token> listTrap = new ArrayList<Token>(14); //this will be used to save all tokens with trap
    public static int auxCont = 0;
    public Player actualUser;//It will have the user logged and the players's info  
    public static Player registredUser;
    public Player player1 = new Player("Player 1","1");
    public Player player2 = new Player("Player 2","1");
    public Player player3 = new Player("Player 3","1");
    public Player player4 = new Player("Player 4","1");
    public Player playerGaming = player1;
    //Singleton
    public static ListPlayersGaming instance = null;
    
    //Constructor
    private ListPlayersGaming() {
        this.start2 = null;
        this.end2 = null;
    }

    public static Player getRegistredUser() {
        return registredUser;
    }

    public static void setRegistredUser(Player registredUser) {
        ListPlayersGaming.registredUser = registredUser;
    }
    
    //set & get actual user
    public Player getActualUser() {
        return actualUser;
    }

    public void setActualUser(Player actualUser) {
        this.actualUser = actualUser;
    }
    
    public static ListPlayersGaming getInstance(){
        if(instance == null)
            instance = new ListPlayersGaming();
        return instance;
    }
    //set y get players and "end, start, tokens bag"

    public Player getStart() {
        return start2;
    }

    public void setStart(Player start) {
        this.start2 = start;
    }

    public Player getEnd() {
        return end2;
    }

    public void setEnd(Player end) {
        this.end2 = end;
    }

    public int getNumberOfGamers() {
        return numberOfGamers;
    }

    public void setNumberOfGamers(int numberOfGamers) {
        this.numberOfGamers = numberOfGamers;
    }

    
    public void makeListofTwoPlayers(){
        player1.setName(actualUser.name);
        insert(player1);
        insert(player2);
    }
    
    public void makeListofThreePlayers(){
        player1.setName(actualUser.name);
        insert(player1);
        insert(player2);
        insert(player3);
    }
    public void makeListofFourPlayers(){
        player1.setName(actualUser.name);
        insert(player1);
        insert(player2);
        insert(player3);
        insert(player4);
    }
    
    public int lenghtListPlayersGaming(){
        Player aux = start2;
        int lenght = 0;
        if(aux == null){
            return 0;
        }
        else if (aux.sig == start2){
            return 1;
        }
        else{
            while(aux.sig != start2){
                lenght += 1;
                aux = aux.sig;  
            }
            if (aux.sig == start2){
                lenght += 1;
            }
            return lenght;
        }
    }
    
    //Insert at end in list of 2 players gaming
    public void insert(Player player) {
        //verifica si la lista esta vacia
        if(start2 == null){       // If the list is empty...
            start2 = player;
            player.ant = player;
            player.sig = player;
            end2 = player;
        }
        else{                      // insert  the object in the list with objects
            end2.sig = player;   // insert the new player at the start
            player.ant = end2;   // previus of newPlayer is end
            player.sig = start2; // new player point to start
            start2.ant = player; // start point to new player
            end2 = player;       // new player is the new end
        }   
    }
    
    
    
    public void setFirstPlayer(){
        // First search the highest token
        Player aux = start2;                        
        ImageIcon image = null;
        Token highestToken = new Token(0,0,0, image,"",0);
        int i = 0;
        while(aux.sig != start2){
            while(i <= 6){
                if(aux.tokens.get(i).id > highestToken.id){
                    highestToken = aux.tokens.get(i); 
                }
                i++;
            }
            i = 0;
            aux = aux.sig;
        }
        i = 0;
        while (i <= 6) {                       //Toma en cuenta el ultimo nodo
            if (aux.tokens.get(i).id > highestToken.id) {
                highestToken = aux.tokens.get(i);
            }
            i++;
        }
        //--------------search the player with the highest token--------------//
        aux = start2;
        while(aux.sig != start2){
            if(aux.getTokens().contains(highestToken)){
                this.playerGaming = aux;
                break;
            }
            aux = aux.sig;
        }
        if(aux.getTokens().contains(highestToken)){
                this.playerGaming = aux;
        }  
    }
}

    

