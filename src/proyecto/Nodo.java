/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Paola
 */
public class Nodo {
    String pais,capital,direccion,resp,resp1;
    
    Nodo anterior,siguiente;
    
       public Nodo (String pais, String capital, String direccion,String resp,String resp1){
         this.pais=pais;
          this.capital=capital; 
          this.direccion=direccion;
          this.resp=resp;
          this.resp1=resp1;
          anterior=siguiente=null;
        }
        @Override
       public String toString(){
            return "<-"+pais+capital+direccion+resp+resp1+"->";
    
       }
}
