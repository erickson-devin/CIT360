/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurl;


import java.io.*;    
import java.net.*;  

/**
 *
 * @author devinerickson, with help from oracle.com
 */

public class Example {    


    public static void main(String[] args) throws MalformedURLException, IOException {
        
        //Set choose a URL and creat a new URL object for it
        String url = "https://www.byui.edu";
        URL webpage = new URL(url);
        
        //Open the URL connection
        try {
        HttpURLConnection connect = (HttpURLConnection) webpage.openConnection();
        
        //Create a new bufferedreader to the webpage
        BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        
        int status = connect.getResponseCode();
        System.out.println("Response code: " + status);
        
        //While the page has more lines, read and print out that new line
        String page;              
        while((page = in.readLine()) != null) {
            System.out.println(page);
        }
        
        //close the bufferedreader
        in.close();
        connect.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(url + ": Check the URL is correct");
        } catch (UnknownHostException e) {
            System.out.println(url + " no results, check your network connection or the URL path");
        }
    }
    
}