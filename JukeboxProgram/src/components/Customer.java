package components;

import java.util.Scanner;


public class Customer{
    
    String[] name = new String[50];
    int i=0;
    int menu;
    
    String nameID;
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
    public int mainMenu(){
        System.out.println("Choose Menu\n1.Search Album\n2.Choose Song\n3.List Album\n4.Logout");
        Scanner s4 =new Scanner(System.in);
        menu=s4.nextInt();
        return menu;
    }
  
    public void logout(){
        System.out.println("Logout Success\n");
    }
    
    
}