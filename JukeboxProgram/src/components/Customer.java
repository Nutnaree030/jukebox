package components;

import java.util.Scanner;


public class Customer{
    
    String[] name = new String[50];
    int i=0;
    
    String nameID;
    public int addCustomer(){
        System.out.print("Enter your name : ");
        Scanner s3 = new Scanner(System.in);
        nameID = s3.nextLine();
        while(i<name.length){
            if(name[i]!=null){
                i++;
            }
            break;
        }
        name[i]=nameID;
        return i;
    }
    
}