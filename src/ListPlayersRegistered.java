/* * * * * * * * * * * * * * * * * * * * * * * *
 * Instituto Tecnológico de Costa Rica         *
 * Data structures                             *
 * 1st Project: Domino´s game                  *
 * by: Fabián Zamora R. and Randald Villegas B.*
 * * * * * * * * * * * * * * * * * * * * * * * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListPlayersRegistered {   // singletone class PlayerList
     Player actualRegistred;
     Player start;           // start pointer
     Player end;             // final pointer
    public static ListPlayersRegistered instance = null; //Instance to return

    //private constructor for singleton class
    private ListPlayersRegistered() {
        this.start = null;
        this.end = null;
    }
    // get and set "start & end"

    public Player getStart() {
        return start;
    }

    public void setStart(Player start) {
        this.start = start;
    }

    public Player getEnd() {
        return end;
    }

    public void setEnd(Player end) {
        this.end = end;
    }

    public Player getActualRegistred() {
        return actualRegistred;
    }

    public void setActualRegistred(Player actualRegistred) {
        this.actualRegistred = actualRegistred;
    }
    
    // Method to insert an player to the end of the list
    public Player insertFinal(String name, String password, int wins){  
        Player newPlayer = new Player(name, password, wins);
        if(start == null){       // If the list is empty...
            start = newPlayer;
            newPlayer.ant = newPlayer;
            newPlayer.sig = newPlayer;
            end = newPlayer;
            return newPlayer;
        }
        else{                      // insert  the object in the list with objects
            end.sig = newPlayer;   // insert the new player at the start
            newPlayer.ant = end;   // previus of newPlayer is end
            newPlayer.sig = start; // new player point to start
            start.ant = newPlayer; // start point to new player
            end = newPlayer;       // new player is the new end
            return newPlayer;
        }   
    }
    
    // Method for search an player in the player's list
    public Player searchPlayer(String name){
        Player aux = start;                   // pointer declaration
        if(aux == null){                      // if the list is empty
            return null;                      // return null
        }
        else if(aux.name.equals(name)){       // if the first element is equal to the search
            return aux;                       // return the object found 
        }     
        else if(aux.sig == start & aux.getName().equals(name)){ //if the unique element in the list is equal to the search     
            return aux;                                         // return the object found
        }
        else if(end.name.equals(name)){
                    return end;
        }
        else{                                     // else...
            while(aux.sig != end.sig){              // go through list until the start
                if(aux.getName().equals(name)){   // if aux is in the position of the list
                    return aux;                   // return the object found              
                }
                aux = aux.sig;
                }
                                                    // pointer points to the next object
            }                         
            return null;                          // if the object isn't in the list return null
    }
     
// method to delete an player to the player's list
    public void deletePlayer(String name){       
        Player aux = searchPlayer(name);         // call method search and save the result in aux
        aux.ant.sig = aux.sig;
        aux.sig.ant = aux.ant;
        if(aux == start){
            start = aux.sig;
        }
        else if(aux == end){
            end = aux.sig;
        }
        aux.sig = null;
        aux.ant = null;
        aux = null;
    }
    
    public void editPlayer(String name, String newName, String newPassword, int wins){
        Player aux = searchPlayer(name);
        if(aux != null){
            aux.setName(newName);
            aux.setPassword(newPassword);
            aux.setWins(wins);
        }    
    }
    
    public void editSelfData(String name, String newName, String newPassword){
        Player aux = searchPlayer(name);
        if(aux != null){
            aux.setName(newName);
            aux.setPassword(newPassword);
        }    
    }
    
    public int lenghtList(){
        Player aux = start;
        int lenght = 0;
        if(aux == null){
            return 0;
        }
        else if (aux.sig == start){
            return 1;
        }
        else{
            while(aux.sig != end.sig){
                lenght += 1;
                aux = aux.sig;  
            }
            return lenght + 1;
        }
    }
    //this method will return the first
    public Player searchStart(){
        Player aux = start;                   // pointer declaration
        return aux;                      // return start
    }
    //this method will return the first
    public Player searchEnd(){
        Player aux = end;                   // pointer declaration
            return aux;                      // return start
    }
    
    //return an "unique global object"  of ListPlayersRegistered
    public static ListPlayersRegistered getInstance(){
        if(instance == null)
            instance = new ListPlayersRegistered();
        return instance;
    }
    

    public void savePlayer(Player newPlayer){
        String playerToRegister = JsonUtil.converPlayerToJson(newPlayer);
         try {
            FileWriter writer = new FileWriter("Players.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(playerToRegister);
            bufferedWriter.newLine();     
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         System.out.println("Player: " + newPlayer.name + " succesfully saved in text file 'Players.txt'.");
    }
        
    
    public void reWriteUsers(){
        Player aux = start;
        while(aux.sig != end){
            Player auxAnt = aux.ant;
            Player auxSig = aux.sig;
            aux.ant = null;
            aux.sig = null;
            savePlayer(aux);
            aux.ant = auxAnt;
            aux.sig = auxSig;
            aux = aux.sig;
        }
        Player auxAnt = aux.ant;
        Player auxSig = aux.sig;
        aux.ant = null;
        aux.sig = null;
        savePlayer(aux);
        aux.ant = auxAnt;
        aux.sig = auxSig;
    }
}
