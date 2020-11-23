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
public class Music {
    public int orderNumber = 0;
    public String musicName;

    public Music(String name) {
        orderNumber++;
        this.musicName = name;
    }

    public void findMusic(){
        Scanner a = new Scanner(System.in);
        System.out.print("What's song you want to find : ");
        String music1 = a.nextLine();
        
        if (musicName==null){
            System.out.println("Result : Not Found"); 
        } else if (music1==musicName) {
            System.out.println("Result : "+ music1); /* รอใส่ตัวชื่อเพลง */
        } else {
            System.out.println("Error");
        }
        
    }
    public void chooseMusic(){
        Scanner input = new Scanner(System.in);
        System.out.print("Choose song :");
        String music2 = input.nextLine();
            
        if (musicName==null){
            System.out.println("Not Found"); /* รอใส่ตัวชื่อเพลง */
        } else if (music2==musicName){
           System.out.println("Now You Play : "+music2);
        } else {
            System.out.println("Error");
        }
    }
    
    
    @Override
    public String toString() {
        return "Music{" + "orderNumber=" + orderNumber + ", musicName=" + musicName + '}';
    }
    
}
