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
import java.io.FileNotFoundException;  
import java.io.PrintWriter; 
public class TryCatchExample10 {
  
    public static void main(String[] args) {  
          
          
        PrintWriter pw;  
        try {  
            pw = new PrintWriter("jtp.txt"); // bisa melempar pengecualian   
            pw.println("saved");  
        }  
// menyediakan penangan pengecualian yang diperiksa  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  
    }  
}  

