/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ikimap;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author holger
 */
public class Search { 
    
    public static String searchString(String searchTerm) throws IOException {        
        String url = Properties.MAIN_URL + Properties.SEARCH_URL;
        url += "?";
        url += "mode=" + "string";        
        url += "&";
        url += "stringsearch=" + searchTerm;
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();        
        con.setRequestMethod("POST");
        Common.authorize(con);
        return Common.getResponse(con);
    }
}
