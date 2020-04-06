/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class arranque3 extends Thread{
    int posicionInicialX, limitePista;
    JLabel Auto;
    
    public arranque3(int posicionInicialX, int limitePista, JLabel Auto){//CONSTRUCTOR
        this.posicionInicialX=posicionInicialX;
        this.limitePista=limitePista;
        this.Auto=Auto;
    }
   
    @Override//se va arrancar 
    public void run(){
        for (int i=limitePista -150; i>0; i--) {
            System.out.println(getName()+":"+i);
            Auto.setBounds(posicionInicialX, i, 73, 100);
            try {
                sleep(10);
            } catch (Exception e) {
            }
        }
        System.out.println("Final de Carrera para:"+getName());
        yield();//sirve para que se ejecute cada proceso en determindado tiempo uno por uno
    }
}
