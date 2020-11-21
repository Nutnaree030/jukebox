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
public class Music {
    public int orderNumber = 0;
    public String musicName;

    public Music(String name) {
        orderNumber++;
        this.musicName = name;
    }

    @Override
    public String toString() {
        return "Music{" + "orderNumber=" + orderNumber + ", musicName=" + musicName + '}';
    }
    
}
