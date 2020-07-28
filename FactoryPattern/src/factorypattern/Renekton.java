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
public class Renekton implements IChampion{
        @Override
    public void attack() {
        System.out.println("Renekton has attacked");
    }

    @Override
    public void sayQuote() {
       System.out.println("White meat dark meant its all the same");
    }
    
}
