package components;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class Jukebox {
    public static void main(String[] args) {
        int c1;
        Customer ctm = new Customer();
        do{
            System.out.println("Welcome to Jukebox");
            System.out.println("1.Customer\n2.Machinist\n");
            Scanner s1 = new Scanner(System.in);
             c1 = s1.nextInt();
        }while(c1<1||c1>2);
        if(c1==1){
            int c2;
            ctm.addCustomer();
            
            do{
                c2=ctm.mainMenu();
                while(c2==4){
                    ctm.logout();
                    ctm.addCustomer();
                    c2=ctm.mainMenu();
                }    
                if(c2==3){System.out.println("test");}
            
            }while(c2<1||c2>4);
            
          
            
            
        }
        
    }
    
}
