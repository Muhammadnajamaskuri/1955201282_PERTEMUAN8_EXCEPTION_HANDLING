/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author WINDOWS 10
 */
public class TryCatchExample7 {
   public static void main(String[] args) {  
          
        try  
        {  
        int data1=50/0; //bisa melempar pengecualian     
  
        }  
              // menangani pengecualian  
        catch(Exception e)  
        {  
             // menghasilkan pengecualian di blok tangkap  
        int data2=50/0; // bisa melempar pengecualian  
  
        }  
    System.out.println("rest of the code");  
    }    
}
