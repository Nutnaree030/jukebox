package components;

import java.util.Scanner;
/**
 *
 * 
 * @author Thanakarn
 */
public class Customer{
    
    String[] name = new String[50];
    int i=0;
    int menu;
    
    String nameID;
/**
 * To add a customer in this system by typing their name
 */    
    public void addCustomer(){
        System.out.print("Enter your name : ");
        Scanner s3 = new Scanner(System.in);
        nameID = s3.nextLine();
        System.out.println("Login Success\n");
        while(i<name.length){
            if(name[i]!=null){
                i++;
            }
            break;
        }
        name[i]=nameID;
    }

/**
 * To show customer what can they choose
 */
    public int mainMenu(){
        System.out.println("Choose Menu\n1.Search Album\n2.Choose Song\n3.Show Album\n4.Logout");
        Scanner s4 =new Scanner(System.in);
        menu=s4.nextInt();
        return menu;
    }
  
/**
 * To log out of this system when required by the customer
 */
    public void logout(){
        System.out.println("Logout Success\n");
    }
    
    
}