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
public class Example7 {
    public static void main(String[] args) {  
         
      try  
        {  
        int data1=50/0; //may throw exception   
        int data2=50/0;  
         System.out.println("rest of the code");
         
        }catch(Exception data2){
             JOptionPane.showMessageDialog(null,"terjadi Error karena" + data2);
        }
        
    } 
    
}
