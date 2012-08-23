/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ikimap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/**
 *
 * @author holger
 */
public class common {
     protected static String getResponse(HttpURLConnection con) throws IOException {        
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        
        String line = null;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    protected static void authorize(HttpURLConnection con) {
        String userpassword = properties.USER + ":" + properties.PASSWORD;
        String encodedAuthorization = javax.xml.bind.DatatypeConverter.printBase64Binary(userpassword.getBytes());
        con.setRequestProperty("Authorization", "Basic " + encodedAuthorization);
    }
    
     protected static String execConnection(String url) throws ProtocolException, IOException {
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();        
        con.setRequestMethod("POST");
        common.authorize(con);
        return common.getResponse(con);
    }
}
