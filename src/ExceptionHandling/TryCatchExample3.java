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
public class TryCatchExample3 {
     public static void main(String[] args) {  
        try  
        {  
        int data=50/0; // bisa melempar pengecualian   
                         // jika pengecualian terjadi, pernyataan yang tersisa tidak akan muncul  
        System.out.println("rest of the code");  
        }  
               // menangani pengecualian    
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
          
    }  
      
}
