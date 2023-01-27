/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Paola
 */
public class Interfaz extends JFrame{
 JPanel panel;

    public Interfaz(){
    //aqui debo de poner lo de la vetana excepto el visible
   setSize(500, 500);
   setTitle("Banderas ,paises y capitales");
   setLocationRelativeTo(null);
   componentes();
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   
    }
    
    private void componentes(){
        panel();
        etiquetas();
        radiobotones();
        
    }
    
    
    private void panel(){
        panel= new JPanel();
        panel.setLayout(null);
         this.add(panel);
     
    }
    
   
    
     private void etiquetas(){
    
        JLabel tex1= new JLabel("Objetivo:\n");
        tex1.setBounds(10,-125, 50, 300);
        JLabel tex2=new JLabel("Evaluar los conocimientos que el usuario posee sobre las capitales del mundo \n");
        tex2.setBounds(10,-100, 500, 300);        
        JLabel tex3=new JLabel("Instrucciones: \n");
        tex3.setBounds(10,-70, 500, 300); 
        JLabel tex4=new JLabel("Seleccione el continente del cual seran las capitales de los paises a preguntar \n");
        tex4.setBounds(10,-50, 500, 300); 
        
        panel.add(tex1);
        panel.add(tex2);
        panel.add(tex3);
        panel.add(tex4);
     }
     
     
     private void radiobotones(){
        JRadioButton bot1 = new JRadioButton("AMÉRICA",false);
        bot1.setBounds(100,120,100,50);
        
        JRadioButton bot2 = new JRadioButton("ÁFRICA",false);
        bot2.setBounds(100,160,100,50);
        JRadioButton bot3 = new JRadioButton("ASIA",false);
        bot3.setBounds(100,200,100,50);
        JRadioButton bot4 = new JRadioButton("OCEANÍA",false);
        bot4.setBounds(100,240,100,50);
        JRadioButton bot5 = new JRadioButton("EUROPA",false);
        bot5.setBounds(100,280,100,50);
        
        
        panel.add(bot1);
        panel.add(bot2);
        panel.add(bot3);
        panel.add(bot4);
        panel.add(bot5);
        
        
        ButtonGroup grupo= new ButtonGroup();
        grupo.add(bot1);
        grupo.add(bot2);
        grupo.add(bot3);
        grupo.add(bot4);
        grupo.add(bot5);
    
       JButton boton2 = new JButton("Comenzar");
        boton2.setBounds(60,350, 160, 40); 
        
        JButton boton3 = new JButton("Salir");
        boton3.setBounds(265,350, 160, 40);
      
        panel.add(boton2);
        panel.add(boton3); 

       ActionListener accion= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } ;
        
        boton3.addActionListener(accion);
    ActionListener acci= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
        
               if(bot1.isSelected()){
                   Paises ventana2 = new Paises();
                  ventana2.P.lectura("src/proyecto/America.txt");
                  ventana2.text.setText(ventana2.P.pais(ventana2.pos));
                  ImageIcon ima = new ImageIcon(ventana2.P.direccion(ventana2.pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ventana2.ejemplo.getWidth(),ventana2.ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ventana2.ejemplo.setIcon(icono);
                  ventana2.setVisible(true);
                  dispose();
                }else if(bot2.isSelected()){
                  Paises ventana2 = new Paises();  
                  ventana2.P.lectura("src/proyecto/Africa.txt");
                  ventana2.text.setText(ventana2.P.pais(ventana2.pos));
                  ImageIcon ima = new ImageIcon(ventana2.P.direccion(ventana2.pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ventana2.ejemplo.getWidth(),ventana2.ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ventana2.ejemplo.setIcon(icono);
                  ventana2.setVisible(true);
                  dispose();
            }else if(bot3.isSelected()){
                  Paises ventana2 = new Paises();
                  ventana2.P.lectura("src/proyecto/Asia.txt");
                  ventana2.text.setText(ventana2.P.pais(ventana2.pos));
                  ImageIcon ima = new ImageIcon(ventana2.P.direccion(ventana2.pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ventana2.ejemplo.getWidth(),ventana2.ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ventana2.ejemplo.setIcon(icono);
                  ventana2.setVisible(true);
                  dispose();
            }else if(bot4.isSelected()){
                  Paises ventana2 = new Paises();
                  ventana2.P.lectura("src/proyecto/Oceania.txt");
                  ventana2.text.setText(ventana2.P.pais(ventana2.pos));
                  ImageIcon ima = new ImageIcon(ventana2.P.direccion(ventana2.pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ventana2.ejemplo.getWidth(),ventana2.ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ventana2.ejemplo.setIcon(icono);
                  ventana2.setVisible(true);
                  dispose();
            }else if(bot5.isSelected()){
                  Paises ventana2 = new Paises();
                  ventana2.P.lectura("src/proyecto/Europa.txt");
                  ventana2.text.setText(ventana2.P.pais(ventana2.pos));
                  ImageIcon ima = new ImageIcon(ventana2.P.direccion(ventana2.pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ventana2.ejemplo.getWidth(),ventana2.ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ventana2.ejemplo.setIcon(icono);
                  ventana2.setVisible(true);
                  dispose();
          
            }
                
          }
                
                          
        } ;
        
        boton2.addActionListener(acci);
    
 
     
     }
     
    
    
}
