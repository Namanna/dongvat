/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongvat;

/**
 *
 * @author lenovo
 */
public class Animal {
     public static void main(String[] args) {
        fish f = new fish(0, "Ca");
        cat c = new cat(4, "Meo");
        chicken ck = new chicken(2, "Ga");
        System.out.println("Ten: "+f.Ten()+" Chan: "+f.SoChan());
        System.out.println("Ten: "+c.Ten()+" Chan: "+c.SoChan());
        System.out.println("Ten: "+ck.Ten()+" Chan: "+ck.SoChan());
}
}