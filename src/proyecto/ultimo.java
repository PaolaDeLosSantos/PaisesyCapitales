/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Paola
 */
public class ultimo extends  JFrame{
 JPanel panel;
 JTextField text= new JTextField();
  JLabel ejemplo = new JLabel();

 // ImageIcon ima = new ImageIcon("src/proyecto/imagenes/usa.jpg");
     int pos=0;
    public ultimo(LDL P,int aciertos,int total){
    //aqui debo de poner lo de la vetana excepto el visible
       
   setSize(500, 500);
   setTitle("Banderas ,paises y capitales");
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
        panel= new JPanel();
        panel.setLayout(null);
         this.add(panel);
     
        
         if(aciertos==total){
             JLabel tex1= new JLabel("FELICIDADES EN EL SEGUNDO OBTUVO "+aciertos +"/" +total +" ACIERTOS \n");
           tex1.setBounds(100,-50, 500, 300);
           
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
            JLabel tex2=new JLabel("En el segundo intento obtuvo \n" +aciertos+"/"+total+" aciertos\n");
            tex2.setBounds(130,-50, 500, 300);  
         
            JButton boton5 = new JButton("Regresar al menu");
           boton5.setBounds(60,220, 160, 40); 
           
           JButton boton6 = new JButton("Salir");
           boton6.setBounds(265,220, 160, 40);
           
           panel.add(tex2);
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
    }
    
  }
}
