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
        int num;
        do{
            System.out.println("Welcome to Jukebox");
            System.out.println("1. Customer\n2.Machinist\n");
            Scanner s = new Scanner(System.in);
             num = s.nextInt();
        }while(num<1||num>2);
    }
    
}
