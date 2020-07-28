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
public class ChampionFactory {
    
      public IChampion getChamp(String champ){
      if(champ == null){
         return null;
      }		
      if(champ.equalsIgnoreCase("Garen")){
         return new Garen();
         
      } else if(champ.equalsIgnoreCase("Renekton")){
         return new Renekton();
         
      } else if(champ.equalsIgnoreCase("Camille")){
         return new Camille();
      }
      
      return null;
   }
    
}
