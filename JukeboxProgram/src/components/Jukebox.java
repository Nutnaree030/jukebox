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
        do{
            System.out.println("Welcome to Jukebox");
            System.out.println("1.Customer\n2.Machinist\n");
            Scanner s1 = new Scanner(System.in);
             c1 = s1.nextInt();
        }while(c1<1||c1>2);
        if(c1==1){
            int c2;
            String name;
            int id;
            do{
                System.out.println("1.New Customer\n2.Old Customer\n");
                Scanner s2 = new Scanner(System.in);
                c2=s2.nextInt();
                if(c2==1){
                    System.out.print("Enter your name : ");
                    Scanner s3 = new Scanner(System.in);
                    name = s3.nextLine();
                    Customer ctm = new Customer();
                    id=ctm.addCustomer(name);
                    System.out.println("Register Success\nYour ID is "+id);
                }
                else{
                    
                }
            }while(c2<1||c2>2);
            
            
        }
    }
    
}