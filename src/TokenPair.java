
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
public class TokenPair extends Token{
    Token up;
    Token down;
    Token subStart;
    Token subEnd;

    public TokenPair(Token up, Token down, int value1, int value2, int id, ImageIcon image, String address) {
        super(value1, value2, id, image, address);
        this.up = up;
        this.down = down;
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

    @Override
    public int getValue1() {
        return value1;
    }
    @Override
    public void setValue1(int value1) {
        this.value1 = value1;
    }
    @Override
    public int getValue2() {
        return value2;
    }
    @Override
    public void setValue2(int value2) {
        this.value2 = value2;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public ImageIcon getImage() {
        return image;
    }
    @Override
    public void setImage(ImageIcon image) {
        this.image = image;
    }
    @Override
    public Token getAnt() {
        return ant;
    }
    @Override
    public void setAnt(Token ant) {
        this.ant = ant;
    }
    @Override
    public Token getSig() {
        return sig;
    }
    @Override
    public void setSig(Token sig) {
        this.sig = sig;
    }
    @Override
    public int getTrap() {
        return trap;
    }
    @Override
    public void setTrap(int trap) {
        this.trap = trap;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
