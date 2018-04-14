/* * * * * * * * * * * * * * * * * * * * * * * *
 * Instituto Tecnológico de Costa Rica         *
 * Data structures                             *
 * 1st Project: Domino´s game                  *
 * by: Fabián Zamora R. and Randald Villegas B.*
 * * * * * * * * * * * * * * * * * * * * * * * */
/**
 *
 * @author Randald
 */
public class NewPlayersGaming {
    
    String nombre;
    int tokens;
    NewPlayersGaming sig, ant;
    
    //constructor
    public NewPlayersGaming(String nombre, int tokens) {
        this.tokens = tokens;
        this.nombre = nombre;
        this.sig = this.ant = null;
    }
    
    //Getter and setters
    public String getNombre() {
        return nombre;
    }

    public int getTokens() {
        return tokens;
    }

    public NewPlayersGaming getSig() {
        return sig;
    }

    public NewPlayersGaming getAnt() {
        return ant;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public void setSig(NewPlayersGaming sig) {
        this.sig = sig;
    }
    
    public void setAnt(NewPlayersGaming ant) {
        this.ant = ant;
    }   
    
}
