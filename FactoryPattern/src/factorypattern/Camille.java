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
public class Camille  implements IChampion{
            @Override
    public void attack() {
        System.out.println("Camille has attacked");
    }

    @Override
    public void sayQuote() {
       System.out.println("Precision is the difference between a butcher and a surgeon");
    }
    
}
