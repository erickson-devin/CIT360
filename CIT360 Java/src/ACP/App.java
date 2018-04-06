/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        ApplicationController app = new ApplicationController();        
        
        app.mapOption("Main Menu", new ApplicationStart());
        app.mapOption("1", new Add());
        app.mapOption("2", new Subtract());
        app.mapOption("3", new Multiply());
        app.mapOption("4", new Divide());
        app.mapOption("5", new Exit());
        app.mapOption("Invalid", new Error());
        
        initiate(app);
    }

    private static void initiate(ApplicationController app) {
        app.handleRequest("Menu");
        
        Scanner in = new Scanner(System.in);
        String option = in.nextLine();

        if (app.operationMap.containsKey(option)==true) {
            app.handleRequest(option);
        } else {
            app.handleRequest("Invalid");
        }
        
        initiate(app);
    }
    
}