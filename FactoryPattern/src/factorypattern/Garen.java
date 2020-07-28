/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author Nico
 */
public class Garen implements IChampion {

    @Override
    public void attack() {
        System.out.println("Garen has attacked");
    }

    @Override
    public void sayQuote() {
       System.out.println("My heart and sword for Demacia");
    }
    
}
