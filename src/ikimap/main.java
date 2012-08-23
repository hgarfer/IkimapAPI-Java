/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ikimap;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author holger
 */
public class main {

    /**
     * @param args the command line arguments
     */
    //just for testing purposes
    public static void main(String[] args) {
        try {
            String searchString = search.searchString("rutas");   
            //TODO: returns an error, how are the values formated?
            String searchLocation = search.searchlocation("7", "47", "15", "60");
            String queryMapInfo = queryMapinfo.queryMapInfo("1502");            
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
