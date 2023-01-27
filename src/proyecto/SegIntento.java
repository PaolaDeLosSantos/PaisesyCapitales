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
public class SegIntento extends JFrame{
 JPanel panel;
  LDL P = new LDL();
  JLabel ejemplo = new JLabel();

     int pos=0;
    
    public SegIntento(LDL P,int aciertos){
        int aciertos1=aciertos+1;     
        int error=5-aciertos1;
        
   setSize(500, 500);
   setTitle("Banderas ,paises y capitales");
   setLocationRelativeTo(null);
  
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 


        panel= new JPanel();
        panel.setLayout(null);
         this.add(panel);
              
        JLabel tex1= new JLabel("Escriba correctamente la capital y el pais de la bandera indicada \n");
        tex1.setBounds(10,-125, 500, 300);
        JLabel tex2=new JLabel("Pais:\n");
        tex2.setBounds(100,160, 500, 300);        
        JLabel tex3=new JLabel("Capital:\n");
         tex3.setBounds(250,160, 500, 300); 
  
        panel.add(tex1);
        panel.add(tex2);
        panel.add(tex3);
        
     
        JButton boton1 = new JButton("Evaluar");
        boton1.setBounds(60,400, 160, 40); 
        
        JButton boton2 = new JButton("Regresar al menu");
        boton2.setBounds(265,400, 160, 40);
      
        JButton boton3 = new JButton("<<");
        boton3.setBounds(10,120, 70, 70); 
        
        JButton boton4 = new JButton(">>");
        boton4.setBounds(400,120, 70, 70);
        
        panel.add(boton1);
        panel.add(boton2); 
        panel.add(boton3);
        panel.add(boton4);
        
        JTextField text2= new JTextField();
        text2.setBounds(100,335, 140, 30); 
        panel.add(text2);
        
        JTextField text1= new JTextField();
        text1.setBounds(250,335, 140, 30); 
        panel.add(text1);
         
        ejemplo.setBounds(100, 40, 280, 250);
        ImageIcon ima = new ImageIcon(P.direccion(pos));
        Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ejemplo.getWidth(),ejemplo.getHeight(), Image.SCALE_DEFAULT));
        ejemplo.setIcon(icono);
        panel.add(ejemplo);
        
       

        
       ActionListener accion= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            Interfaz ventana = new Interfaz();
               P.limpiar();
                dispose();
                ventana.setVisible(true);
            }
        } ;
        
        boton2.addActionListener(accion);
        
    ActionListener acci= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
      
         if(pos<error){
             pos++;
                  ImageIcon ima = new ImageIcon(P.direccion(pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ejemplo.getWidth(),ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ejemplo.setIcon(icono);
                     
                  String texto1 = text1.getText();//TEXT1CAP
                  String texto2 = text2.getText();//TEXT2PAIS
                  
                  Nodo act=P.actual(pos);
                  act.resp=texto1;
                  Nodo act1=P.actual1(pos);
                  act.resp1=texto2;
                  
                  if(act1.resp.equals("")){
                    text1.setText("");
                   }else{
                    text1.setText(act1.resp);
                 
                 }
                  
                 if(act1.resp1.equals("")){
                    text2.setText("");
                   }else{
                    text2.setText(act1.resp1);
                 
                 }
                 
         }else{
             Toolkit.getDefaultToolkit().beep();
             
              String texto1 = text1.getText();
                   Nodo act=P.actual(error+1);
                   act.resp=texto1;
                   
              String texto4 = text2.getText();
                   act.resp1=texto4;     
        
             }
                   
          }
                
                
        } ;
        
        boton4.addActionListener(acci);
    
     
   ActionListener acci1= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           
         if(pos>0){
              pos--;
                  ImageIcon ima = new ImageIcon(P.direccion(pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ejemplo.getWidth(),ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ejemplo.setIcon(icono);
                  
                  Nodo act=P.actual1(pos);
                  text1.setText(act.resp); 
                  
                  
                  text2.setText(act.resp1);
                  
         }else{
             Toolkit.getDefaultToolkit().beep();
         }
                  
                
          }
                
                    
        } ;
        
        boton3.addActionListener(acci1);
        
          ActionListener acci2= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
         
           int posi=0;
           posi=P.evaluar2();    
            ultimo seg=new ultimo(P,posi,error+1);
            seg.setVisible(true);
             dispose();
    
           
                
          }
                
                    
        } ;
        
        boton1.addActionListener(acci2);

    }
    
    
}
    

