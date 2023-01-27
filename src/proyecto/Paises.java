package proyecto;

import java.awt.Image;
import java.awt.Toolkit;
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
import javax.swing.JTextField;

/**
 *
 * @author Paola
 */
public class Paises extends JFrame{
 JPanel panel;
  LDL P = new LDL();
 JTextField text= new JTextField();
  JLabel ejemplo = new JLabel();

 // ImageIcon ima = new ImageIcon("src/proyecto/imagenes/usa.jpg");
     int pos=0;
    public Paises(){
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
    }
  
  
    private void panel(){
        panel= new JPanel();
        panel.setLayout(null);
         this.add(panel);
     
    }
    private void etiquetas(){
    
      
         
        JLabel tex1= new JLabel("Escriba correctamente la capital del pais \n");
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
        
      
         text.setBounds(100,335, 140, 30); 
            panel.add(text);
        
        JTextField text1= new JTextField();
        text1.setBounds(250,335, 140, 30); 
        panel.add(text1);
       
//  JLabel ejemplo = new JLabel();
      //       ejemplo=new JLabel(new ImageIcon(ho));
        //ejemplo.setIcon(new ImageIcon("src/proyecto/imagenes/usa.jpg"));
             ejemplo.setBounds(100, 40, 280, 250);
           // ImageIcon ima = new ImageIcon();
         
           
        
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
              
         if(pos<4){
             pos++;
             text.setText(P.pais(pos));
            // ejemplo.setIcon(new ImageIcon(P.direccion(pos)));
                   ImageIcon ima = new ImageIcon(P.direccion(pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ejemplo.getWidth(),ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ejemplo.setIcon(icono);
                     
                   String texto = text1.getText();
                  Nodo act=P.actual(pos);
                  act.resp=texto;
                  Nodo act1=P.actual1(pos);
              
                  if(act1.resp.equals("")){
                    text1.setText("");
                   }else{
                    text1.setText(act1.resp);
                  
                 }
              
                  
         }else{
             Toolkit.getDefaultToolkit().beep();
              String texto = text1.getText();
                   Nodo act=P.actual(5);
                   act.resp=texto;
         }
                
          }
                
                    
        } ;
        
        boton4.addActionListener(acci);
    
     
   ActionListener acci1= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
         if(pos>0){
              pos--;
             text.setText(P.pais(pos));
            // ejemplo.setIcon(new ImageIcon(P.direccion(pos)));
              ImageIcon ima = new ImageIcon(P.direccion(pos));
                  Icon icono =new ImageIcon(ima.getImage().getScaledInstance(ejemplo.getWidth(),ejemplo.getHeight(), Image.SCALE_DEFAULT));
                  ejemplo.setIcon(icono);
                  Nodo act=P.actual1(pos);
                  text1.setText(act.resp); 
                  
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
          posi=P.evaluar();    
                
            segundo seg=new segundo(P,posi);
            seg.setVisible(true);
            dispose();
          
           
                
          }
                
                    
        } ;
        
        boton1.addActionListener(acci2);

    }
    
    
}


