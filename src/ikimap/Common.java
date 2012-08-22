/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ikimap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/**
 *
 * @author holger
 */
public class Common {
     protected static String getResponse(HttpURLConnection con) throws IOException {
        //con.setDoOutput(true);
        //con.getOutputStream();
        // read the output from the server
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        
        String line = null;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + "\n");
        }
        return stringBuilder.toString();
    }

    protected static void authorize(HttpURLConnection con) {
        String userpassword = Properties.USER + ":" + Properties.PASSWORD;
        String encodedAuthorization = javax.xml.bind.DatatypeConverter.printBase64Binary(userpassword.getBytes());
        con.setRequestProperty("Authorization", "Basic "
                + encodedAuthorization);
    }
}
