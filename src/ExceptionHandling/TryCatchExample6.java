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
public class TryCatchExample6 {
     public static void main(String[] args) {  
        int i=50;  
        int j=0;  
        int data;  
        try  
        {  
        data=i/j; // bisa melempar pengecualian    
        }  
            // menangani pengecualian   
        catch(Exception e)  
        {  
            // menyelesaikan pengecualian di blok tangkap  
            System.out.println(i/(j+2));  
        }  
    }  
}
