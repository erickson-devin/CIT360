/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.*;

public class Divide implements Handler {
    @Override
    public void handleIt() {
        int firstNumber, secondNumber;

        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter a number:");
        firstNumber = in.nextInt();
        System.out.println("Enter another number:");
        secondNumber = in.nextInt();

        System.out.println("\nThe quotient of " + firstNumber + " and " + secondNumber + " is " + (firstNumber/secondNumber));

    }
}