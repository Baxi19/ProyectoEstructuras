/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author toshib
 * @modified 16/03/2018
 * @version Expression version is undefined on line 14, column 15 in Templates/Classes/P5Library.java.
 */

import processing.core.PApplet;

public class P5Library {

    private static PApplet parent;
    public final String VERSION = "0.01";
    /**
    * P5Library constructor
    * @param parent PApplet
    */
    public P5Library(PApplet parent) {
        this.parent = parent;
        this.parent.registerMethod("dispose", this);
    }

    
    public void dispose() {
         //this is a required method
    }

}
