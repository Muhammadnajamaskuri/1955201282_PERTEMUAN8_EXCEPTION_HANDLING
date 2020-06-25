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
public class TryCatchExample5 {
     public static void main(String[] args) {  
        try  
        {  
        int data=50/0; // bisa melempar pengecualian    
        }  
              // menangani pengecualian    
        catch(Exception e)  
        {  
                  // menampilkan pesan khusus  
            System.out.println("Can't divided by zero");  
        }  
    }  
      
}
