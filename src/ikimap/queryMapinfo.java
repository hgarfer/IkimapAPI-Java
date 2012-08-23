/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ikimap;

import java.io.IOException;

/**
 *
 * @author holger
 */

/*
 * TODO: create methods for optional query parameters
 */
public class queryMapinfo {
    
    public static String queryMapInfo(String mapID) throws IOException {        
        String url = properties.MAIN_URL + properties.QUERYMAPINFO_URL;
        url += "?";
        url += "mapID=" + mapID;
        return common.execConnection(url);
    }
    
}
