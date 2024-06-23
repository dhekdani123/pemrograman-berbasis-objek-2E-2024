/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author LENOVO
 */
public class MODUL6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        human orang = new human ();
        Kucing cat = new Kucing ();
        
        orang.name();
        orang.breath();
        orang.eat();
        orang.breath();
        orang.walk();
        orang.charateristic();
        orang.minds();
        
        
        cat.name();
        cat.eat();
        cat.breath();
        cat.charateristic();
        cat.walk();
        
    }
    
}
