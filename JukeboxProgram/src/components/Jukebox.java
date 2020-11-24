package components;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanakarn
 */
import java.util.*;
public class Jukebox {
    static Customer ctm = new Customer();
    static Machinist mn = new Machinist();
    static Music ms = new Music();
    public static void main(String[] args) {
        
        
        mainHome(); //Call Jukebox Main Menu//
        
        
    }
    public static void mainHome(){ //Jukebox Main Method//
        int mh;
        
        
        do{
            System.out.println("Welcome to Jukebox");
            System.out.println("1.Customer\n2.Machinist\n3.Exit");
            Scanner s1 = new Scanner(System.in);
            mh= s1.nextInt();
        }while(mh<1||mh>3);
        if(mh==1){ //Customer Option//
            int menu1;
            char ans='a';
            ctm.addCustomer();
            do{
                menu1=ctm.mainMenu(); //Customer Menu: Search Album,Choose Song,Show Album,Logout//
                while(menu1==4){
                    if(menu1==4){
                        ctm.logout();
                        do{
                            System.out.println("Do you want to go Home Menu? (y/n)");
                            Scanner yn = new Scanner(System.in);
                            ans=yn.next().charAt(0);
                            if(ans=='y'){
                                mainHome();
                            }
                            if(ans=='n'){
                                ctm.addCustomer();
                                menu1=ctm.mainMenu();
                            }
                        }while(ans!='y'&&ans!='n');
                        break;
                        
                    }
                    else break;
                    
                    
                }
               
                if(menu1==1){
                    ms.findMusic();
                }
                if(menu1==2){
                     ms.chooseMusic();
                    }
                if(menu1==3){
                    ms.showMusic();
                }
                
                 
            
                
                
                
                
                
            }while(menu1<1||menu1>4);
           
            
        }
        else if(mh==2){ //Matchinist Option//
            int menu2;
            char ans;
            mn.chkAuthen(); //Matchinist Login//
            do{
                menu2=mn.mainMenu(); //Matchinist Menu: Add Album,Add Song,Show Album,Logout//
                while(menu2==4){
                    mn.logout(); //Logout Process//
                    do{
                        System.out.println("Do you want to go Home Menu? (y/n)");
                        Scanner yn = new Scanner(System.in);
                        ans=yn.next().charAt(0);
                    }while(ans!='y'&&ans!='n');
                    if(ans=='y'){
                        mainHome();
                    }
                    if(ans=='n'){
                        mn.chkAuthen();
                        menu2=mn.mainMenu();
                    }
                    break;
                }
            
            }while(menu2<1||menu2>4);
            if(menu2==1){
                 System.out.println("1");
            }
            if(menu2==2){
                 System.out.println("2");
            }
            if(menu2==3){
                 System.out.println("3");
            }
            
        }
        else{System.exit(0);}
    }
    
    
}
