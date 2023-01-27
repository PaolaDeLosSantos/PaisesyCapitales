/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Paola
 */
public class segundo extends JFrame{
 JPanel panel;
 JTextField text= new JTextField();
  JLabel ejemplo = new JLabel();

 // ImageIcon ima = new ImageIcon("src/proyecto/imagenes/usa.jpg");
     int pos=0;
    public segundo(LDL P,int aciertos){
    //aqui debo de poner lo de la vetana excepto el visible
   setSize(500, 500);
   setTitle("Banderas ,paises y capitales");
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
        panel= new JPanel();
        panel.setLayout(null);
         this.add(panel);
     
        
         if(aciertos==5){
             JLabel tex1= new JLabel("FELICIDADES OBTUVO 5/5 ACIERTOS \n");
           tex1.setBounds(180,-50, 500, 300);
           
           JButton boton5 = new JButton("Regresar al menu");
           boton5.setBounds(60,220, 160, 40); 
           
           JButton boton6 = new JButton("Salir");
           boton6.setBounds(265,220, 160, 40);
           
           panel.add(tex1);
           panel.add(boton5);
           panel.add(boton6);
           
           ActionListener accion= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } ;
        
        boton6.addActionListener(accion);
         
         
         ActionListener accion1= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
          Interfaz ventana = new Interfaz();
               P.limpiar();
                dispose();
                ventana.setVisible(true);
            }
        } ;
        
        boton5.addActionListener(accion1);
           
         }else{
            JLabel tex2=new JLabel("Obtuvo \n" +aciertos+"/5 aciertos\n");
            tex2.setBounds(180,-50, 500, 300);  
         
           JButton boton2 = new JButton("2do intento");
           boton2.setBounds(60,180, 160, 40); 
           
           JButton boton3 = new JButton("Regresar al menu");
           boton3.setBounds(265,180, 160, 40);
           
           JButton boton4 = new JButton("Salir");
           boton4.setBounds(160,250, 160, 40);
        
           panel.add(boton2);
           panel.add(boton3);
           panel.add(boton4);
           panel.add(tex2);
            
           
           ActionListener accion= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } ;
        
        boton4.addActionListener(accion);
         
         
         ActionListener accion1= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
          Interfaz ventana = new Interfaz();
               P.limpiar();
                dispose();
                ventana.setVisible(true);
            }
        } ;
        
        boton3.addActionListener(accion1);
     
        ActionListener accion2= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
          SegIntento ventana = new SegIntento(P,aciertos);
               P.limpiarcap();
                dispose();
                ventana.setVisible(true);
            }
        } ;
        
        boton2.addActionListener(accion2);
         }
   
    }
}

