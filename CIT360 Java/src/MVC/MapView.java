/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;



/**
 *
 * @author devin erickson
 */
public class MapView {
    
    public MapView() {                          
    }
    
    public void displayMap(){
        Game game = LostInSpace.getCurrentGame();
        ModelMap map = game.getMap();
        Planet[] location = map.getLocation();
        
        for(int i=0; i < location.length; i++){
            System.out.println(
            "Planet " + location[i].getName() + ": "
            + location[i].getDesc());
        }
    }
}