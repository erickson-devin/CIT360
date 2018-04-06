/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import ACP.Handles.Handler;
import java.util.HashMap;

public class ApplicationController {
	
	HashMap<String,Handler> operationMap = new HashMap<String,Handler>();

    public void handleRequest(String option){
        Handler myOption = operationMap.get(option);
        if (myOption != null){
        	myOption.handleIt();
        }
    }

    public void mapOption(String newOption, Handler newHandler){
        operationMap.put(newOption, newHandler);
    }
}