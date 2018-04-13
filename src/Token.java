
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fabián
 */
public class Token {
    int value1, value2, id;
    ImageIcon image;
    Token ant, sig;
    private Token up, down;
    int trap;
    

    public Token(int value1, int value2, int id, ImageIcon image) {
        this.value1 = value1;
        this.value2 = value2;
        this.id = id;
        this.image = image;
        this.ant = null;
        this.sig = null;
        this.trap = 0;
    }

    public Token(int value1, int value2, int id, ImageIcon image, Token up, Token down) {
        this.value1 = value1;
        this.value2 = value2;
        this.id = id;
        this.image = image;
        this.ant = ant;
        this.sig = null;
        this.up = null;
        this.down = null;
        this.trap = 0;
    }

    public int getTrap() {
        return trap;
    }

    public void setTrap(int trap) {
        this.trap = trap;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }


    public Token getAnt() {
        return ant;
    }

    public void setAnt(Token ant) {
        this.ant = ant;
    }

    public Token getSig() {
        return sig;
    }

    public void setSig(Token sig) {
        this.sig = sig;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Token getUp() {
        return up;
    }

    public void setUp(Token up) {
        this.up = up;
    }

    public Token getDown() {
        return down;
    }

    public void setDown(Token down) {
        this.down = down;
    }
    
}
