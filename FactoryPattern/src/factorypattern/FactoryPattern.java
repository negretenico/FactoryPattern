/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;
import java.util.*;
/**
 *
 * @author Nico
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChampionFactory champFact = new ChampionFactory();
        IChampion garen = champFact.getChamp("Garen");
        IChampion cam = champFact.getChamp("Camille");
        IChampion ren = champFact.getChamp("Renekton");
        ArrayList<IChampion> listOfChamps = new ArrayList<IChampion>();
        listOfChamps.add(garen);
        listOfChamps.add(cam);
        listOfChamps.add(ren);
        for(IChampion cham : listOfChamps)
        {
            System.out.println();
            cham.attack();
            cham.sayQuote();
            System.out.println();
        }
        
    }
    
}
