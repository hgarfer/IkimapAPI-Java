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
public class search { 
    
    public static String searchString(String searchTerm) throws IOException {        
        String url = properties.MAIN_URL + properties.SEARCH_URL;
        url += "?";
        url += "mode=" + "string";        
        url += "&";
        url += "stringsearch=" + searchTerm;
        return common.execConnection(url);
    }

       
    public static String searchlocation(String long_min, String lat_min, String long_max, String lat_max) throws IOException {        
        String url = properties.MAIN_URL + properties.SEARCH_URL;
        url += "?";
        url += "mode=" + "location";        
        url += "&";
        url += "bbox=" + long_min + "," + lat_min + "," + long_max + "," + lat_max;
        return common.execConnection(url);
    }
}
