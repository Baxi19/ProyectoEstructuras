
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class ListTokensGame {
    Token start3;
    Token end3;
    Token subStart;
    Token subEnd;
    Token savePosition;
    public ArrayList<Token> tokensPair = new ArrayList<Token>();
    public static ListTokensGame instance = null;

    public Token getStart3() {
        return start3;
    }

    public void setStart3(Token start3) {
        this.start3 = start3;
    }

    public Token getEnd3() {
        return end3;
    }

    public void setEnd3(Token end3) {
        this.end3 = end3;
    }
    
    public Token insertFinal(Token newToken){  
        if(start3 == null){      
            start3 = newToken;
            newToken.ant = null;
            newToken.sig = null;
            end3 = newToken;
            return newToken;
        }
        else{                     
            newToken.sig = start3;
            start3.ant = newToken;
            newToken.ant = null;
            start3 = newToken;
            return newToken;
        }   
    }
    
    public Token insertStart(Token newToken){  
        if(start3 == null){       
            start3 = newToken;
            newToken.ant = null;
            newToken.sig = null;
            end3 = newToken;
            return newToken;
        }
        else{                      
            newToken.sig = start3;
            start3.ant = newToken;
            newToken.ant = null;
            start3 = newToken;
            return newToken;
        }   
    }
    
    public void insertUp(Token newToken, Token pairToken){
        if(pairToken.getUp() == null){
            pairToken.setUp(newToken);
            newToken.ant = pairToken;
            newToken.sig = null;
            subStart = pairToken;
            subEnd = newToken;
        }
        else{
            subEnd.sig = newToken;
            newToken.ant = subEnd;
            newToken.sig = null;
            subEnd = newToken;            
        }
    }
    
    public void insertDown(Token newToken, Token pairToken){
        if(pairToken.getDown()== null){
            pairToken.setDown(newToken);
            newToken.ant = pairToken;
            newToken.sig = null;
            subStart = pairToken;
            subEnd = newToken;
        }
        else{
            subEnd.sig = newToken;
            newToken.ant = subEnd;
            newToken.sig = null;
            subEnd = newToken;            
        }
    }
    
    
    
    public static ListTokensGame getInstance(){
        if(instance == null)
            instance = new ListTokensGame();
        return instance;
    }
    
    public void removeTokenTrap(){
        
    }
    public void loseTurnTrap(){
        
    }
    
    public void takeTokenTrap(Player playerGaming){
       // playerGaming.
        
    }
    
   /* public Token searchToken(){
        Token aux = start3;
        while(aux != end3){
        
        
     }
    }
    */
    
    
}
