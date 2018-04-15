
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
 
    Token savePosition;
    public ArrayList<TokenPair> tokensPair = new ArrayList<TokenPair>();
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
    
    public void insertUp(Token newToken, TokenPair pairToken){
        if(pairToken.up == null){
            pairToken.up = newToken;
            newToken.ant = pairToken;
            newToken.sig = null;
            pairToken.subStart = newToken;
            pairToken.subEnd = newToken;
        }
        else{
            newToken.sig = null;
            pairToken.subEnd.sig = newToken;
            newToken.ant = pairToken.subEnd;
            pairToken.subEnd = newToken;            
        }
    }
    
    public void insertDown(Token newToken, TokenPair pairToken){
         if(pairToken.down == null){
            pairToken.down = newToken;
            newToken.ant = pairToken;
            newToken.sig = null;
            pairToken.subStart = newToken;
            pairToken.subEnd = newToken;
        }
        else{
            newToken.sig = null;
            pairToken.subEnd.sig = newToken;
            newToken.ant = pairToken.subEnd;
            pairToken.subEnd = newToken;            
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
    
    public void addTokenPair(TokenPair token){
        tokensPair.add(token);
    }
   
        
        
    
    
    
}
