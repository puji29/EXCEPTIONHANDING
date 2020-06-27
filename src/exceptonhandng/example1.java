/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptonhandng;

import javax.swing.JOptionPane;

/**
 *
 * @author puji
 */
public class example1 {

    /**
     * @param args the command line arguments
     */ 
  
    public static void main(String[] args) {  
       try{  
        int data=50/0; //may throw exception   
          
        System.out.println("rest of the code");  
       }catch (Exception data){
        JOptionPane.showMessageDialog(null,"terjadi Error karena" + data);  
    }
      
  }  

}
    

