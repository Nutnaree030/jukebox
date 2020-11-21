package components;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Machinist {
    public Music musics;
    
    public void editMusic(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("which name you like to change : ");
        String name1 = input.nextLine();
            if(name1==null) System.out.println("Not found");
            else if(name1==musics.musicName) {
                System.out.println(musics.toString());
                System.out.println("You will change be : ");
                String name2 = input.nextLine();
                this.musics.musicName = name2;
                System.out.println(musics.toString());
            }
            else System.out.println("Error");
            
    }
}
