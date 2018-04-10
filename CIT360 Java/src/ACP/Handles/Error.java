/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP.Handles;

public class Error implements Handler {
    @Override
    public void handleIt() {
        System.out.println("Please enter a valid command");
    }
}