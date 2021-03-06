package JSON;

import java.io.*;
import java.util.HashMap;
import org.quickconnectfamily.json.*;

/*
 * JSON is JavaScript Object Notation. Simply, it is a lightweight way to store data in a human readable format.
 * qcJSON and other JSON libraries are designed to make JSON easier to use in Java.
 */

public class JsonDemo {

	public static void main(String[] args) {
		
		Player devin = new Player("Devin", "Erickson", "WR", 15);
		String jsonString = null;
		File jsonFile = new File("src/json/output.json");
		
		try {
			jsonString = JSONUtilities.stringify(devin); // create a JSON line of test
			System.out.println("This is a JSON line stringified from a Player object\n"
					+ jsonString);
		} catch(Exception e) {
			e.printStackTrace();
		}

		try {
			FileOutputStream fileStream = new FileOutputStream(jsonFile); // open a file for output
			JSONOutputStream jsonStream = new JSONOutputStream(fileStream); // direct JSON output to open file
			jsonStream.writeObject(devin); // write object to the JSON stream
			jsonStream.close();
			System.out.println("\nThe object was successfully written to output.json");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fileStream = new FileInputStream(jsonFile); // open a file to read
			JSONInputStream jsonStream = new JSONInputStream(fileStream); // direct JSON read from open file
			HashMap jsonInput = (HashMap)jsonStream.readObject(); // read line from JSON stream
			jsonStream.close();

			System.out.println("\nThis is a JSON object read from the file\n"
					+ jsonInput);
			
			// Now we will use the retrieved data...
			
			Player temp = new Player("Matt", "Ryan", "QB", 2);
			System.out.println("\nThis is the temp object before changes\n"
					+ temp);
			
			Long retrievedNumber = (Long)jsonInput.get("number");
			temp.setFirstName((String)jsonInput.get("firstName"));
			temp.setLastName((String)jsonInput.get("lastName"));
			temp.setPosition((String)jsonInput.get("position"));
			temp.setNumber(retrievedNumber.intValue());
			
			System.out.println("\nThis is the temp object after changes\n"
					+ temp);
					
					
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
