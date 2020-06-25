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
public class TryCatchExample4 {
 public static void main(String[] args) {  
        try  
        {  
        int data=50/0; // bisa melempar pengecualian     
        }  
            // menangani pengecualian dengan menggunakan kelas Exception   
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
         
}
