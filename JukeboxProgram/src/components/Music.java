package components;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Rungphob
 * @author Nutnaree
 */
public class Music{
    static Customer ctm = new Customer();
    static Jukebox jb = new Jukebox();
    static String songs[]={"Sugar","Land","High","Blood","Deep","Careless","Your","Pray","Easy","Normal"};
    boolean status=false;
    String music1;
    char ans;
    int mm;
    
/**
 * To find the music by typing name
 */
    public void findMusic(){
        System.out.print("What's song you want to find : ");
        Scanner a = new Scanner(System.in);
        music1=a.nextLine();
        for(int i=0;i<songs.length;i++){
            if(music1.equals(songs[i])){
                status=true;
                break;
            }
            if(!music1.equals(songs[i])){
                status =false;
            }
                
            
        }
        if(status==true){
            System.out.println("Result : "+music1);
        }
        else{System.out.println("Result : Not Found");}
        
    }
    public void showMusic(){
        System.out.println("List of Songs");
        for(int i=0;i<songs.length;i++){
            System.out.println(songs[i]);
        }
    }
    public void chooseMusic(){
        int num;
       
        Scanner ch = new Scanner(System.in);
        for( int i=0;i<songs.length;i++){
            System.out.println(i+1+" "+songs[i]);
        }
        do{
            System.out.print("Choose song you want to listen: ");
            num=ch.nextInt();
        }while(num<1||num>10);
        System.out.println("Now Listening: "+songs[num-1]);
    }
    
}
  

    
        
        
        
        
        
    
           
            
            
            
   
        
    
        
        
        
         
        
    
/**
 * To choose the music by typing name
 */
   /* public void chooseMusic(){
        Scanner input = new Scanner(System.in);
        System.out.print("Choose song :");
        String music2 = input.nextLine();
            
        if (musicName==null){
            System.out.println("Not Found"); 
        } else if (music2==musicName){
           System.out.println("Now You Play : "+music2);
        } else {
            System.out.println("Error");
        }
    }
    
/**
 * To show lists of the music
 */
    /*public void showMusic() {
        Music[] ms = getMusic();
        for (int i = 0; i < ms.length; i++) {
            System.out.println(ms[i].toString());
        }
    }
    
    @Override
    public String toString() {
        return "Music{" + "orderNumber=" + orderNumber + ", musicName=" + musicName + '}';
    }*/

    
