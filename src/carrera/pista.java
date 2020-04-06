/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import sun.swing.ImageIconUIResource;

/**
 *
 * @author USUARIO
 */
public class pista extends JFrame{
    
    JLabel lbAuto1, lbAuto2, lbAuto3, lbPistaFondo;
    JButton btnInicio;
    int x=500,y=0, ancho=600, alto=700;
    
    //Constructor
    public pista(){
        super("Carrera de Autos");
        getContentPane().setLayout(null);//permitir colocar los componentes en la poc}sicion
        
        lbPistaFondo = new JLabel();
        getContentPane().add(lbPistaFondo);// se agrego en Jframe
        lbPistaFondo.setIcon(new ImageIcon(getClass().getResource("pista.png")));
        lbPistaFondo.setBounds(150, 0, 500, 700);
        //Auto1
        lbAuto1 = new JLabel();
        lbPistaFondo.add(lbAuto1);//se le agrega la imagen en el fondo
//        getContentPane().add(lbAuto1);
        lbAuto1.setIcon(new ImageIcon(getClass().getResource("auto1.png")));
        lbAuto1.setBounds(70, alto -150, 73, 100);
        //Auto2
        lbAuto2 = new JLabel();
//        getContentPane().add(lbAuto2);
        lbPistaFondo.add(lbAuto2);
        lbAuto2.setIcon(new ImageIcon(getClass().getResource("auto2.png")));
        lbAuto2.setBounds(160, alto -150, 73, 100);
        //Auto3
        lbAuto3 = new JLabel();
//        getContentPane().add(lbAuto3);
        lbPistaFondo.add(lbAuto3);
        lbAuto3.setIcon(new ImageIcon(getClass().getResource("auto3.png")));
        lbAuto3.setBounds(250, alto -150, 73, 100);
        
        //boton de arranque
        ImageIcon bandera = new ImageIcon(getClass().getResource("bandera.png"));
        Icon IconoBandera = new ImageIcon(bandera.getImage().getScaledInstance(100, 100, 1));
        btnInicio = new JButton(IconoBandera);
        getContentPane().add(btnInicio);
        btnInicio.setOpaque(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setBorderPainted(false);
        btnInicio.setBounds(0, 0, 125, 100);
        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Inicio de carrera");
                arranque hiloAuto1 = new arranque(70, alto, lbAuto1);
                arranque2 hiloAuto2 = new arranque2(160, alto, lbAuto2);
                arranque3 hiloAuto3 = new arranque3(250, alto, lbAuto3);
                
                hiloAuto1.start();
                hiloAuto2.start();
                hiloAuto3.start();
            }
        });
                
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Operacion de salida
        setBounds(x, y, ancho, alto);//posicion inicial
        setVisible(true);//la visibilidad de la ventana
        setResizable(false);
        
    }
    
}
