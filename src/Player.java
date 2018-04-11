
import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Fabián
 */
public class Player implements Serializable{
    String name, password;
    int wins;
    ArrayList<Token> tokens;
    Player ant, sig;
    
    public Player(){
        this.name = "";
        this.password = "";
        this.wins = 0;
        this.tokens = new ArrayList<>(14);
        this.ant = null;
        this.sig = null;
}

    public Player(String name, String password) {
        this.name = name;
        this.password = password;
        this.wins = 0;
        this.tokens = new ArrayList<>(14);
        this.ant = null;
        this.sig = null;
    }
    
    public Player(String name, String password, int wins) {
        this.name = name;
        this.password = password;
        this.wins = wins;
        this.tokens = new ArrayList<>(14);
        this.ant = null;
        this.sig = null;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public Player getAnt() {
        return ant;
    }

    public void setAnt(Player ant) {
        this.ant = ant;
    }

    public Player getSig() {
        return sig;
    }

    public void setSig(Player sig) {
        this.sig = sig;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public void setTokens(ArrayList<Token> tokens) {
        this.tokens = tokens;
    }
 
    public String addToken(Token nToken){
        this.tokens.add(nToken);
        return "Token: " + nToken.value1 + " | " + nToken.value2 +" ID: "  + nToken.getId() + " gived to " + this.name;
    }  
}
