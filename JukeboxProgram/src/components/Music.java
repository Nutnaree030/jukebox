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
public class Music {
    public int orderNumber = 0;
    public String musicName;

    public Music(String name) {
        orderNumber++;
        this.musicName = name;
    }
    
    public Music[] getMusic() {
        Music[] ms = new Music[100];
        return ms; 
    }
    
/**
 * To find the music by typing name
 */
    public void findMusic(){
        Scanner a = new Scanner(System.in);
        System.out.print("What's song you want to find : ");
        String music1 = a.nextLine();
        
        if (musicName==null){
            System.out.println("Result : Not Found"); 
        } else if (music1==musicName) {
            System.out.println("Result : "+ music1);
        } else {
            System.out.println("Error");
        }
    }
    
/**
 * To choose the music by typing name
 */
    public void chooseMusic(){
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
    public void showMusic() {
        Music[] ms = getMusic();
        for (int i = 0; i < ms.length; i++) {
            System.out.println(ms[i].toString());
        }
    }
    
    @Override
    public String toString() {
        return "Music{" + "orderNumber=" + orderNumber + ", musicName=" + musicName + '}';
    }
    
}
