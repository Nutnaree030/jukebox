package components;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Nutnaree
 */
public class Machinist {
    public Music musics;
    int menu;
    
/**
 * To edit the music by typing name for finding and change it
 */    
   
    public void chkAuthen(){
        String pass;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        pass=sc.nextLine();
        while(!pass.equals("admin")){
            System.out.println("Access Denied!");
            System.out.print("Enter Password: ");
            pass=sc.nextLine();
        }
        System.out.println("Access Granted!");
    }
    public int mainMenu(){
        System.out.println("Choose Menu\n1.Add Song\n2.Edit Song\n3.Show All Songs\n4.Logout");
        Scanner s5 =new Scanner(System.in);
        menu=s5.nextInt();
        return menu;
    }
     public void logout(){
        System.out.println("Logout Success\n");
    }
}
