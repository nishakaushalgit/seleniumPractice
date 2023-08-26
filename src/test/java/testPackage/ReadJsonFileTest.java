package testPackage;


import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadJsonFileTest {
	String fname;
	String lname;
	String street;
	String city;
	String state;
	@Test
	public  void jsonReading() throws Exception {
		try {
			// write test case here
			System.out.println("Firstname " + fname);
			System.out.println("Lastname " + lname);
			System.out.println("Address is "+ street+ city+state);
			System.out.println("Address is "+ street+ city+state);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeTest
	public  void commonJsonRead() throws Exception {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader("/Users/kshitijchaudhary/eclipse-workspace/seleniumPractice/src/test/java/testPackage/testdata.json");
		Object obj = jsonparser.parse(reader);
		JSONObject jsonobj = (JSONObject) obj;
		fname = (String) jsonobj.get("firstName");
		lname = (String) jsonobj.get("lastName");
		//System.out.println("Firstname " + fname);
		//System.out.println("Lastname " + lname);
		JSONArray array = (JSONArray) jsonobj.get("address");
		for (int i = 0; i < array.size(); i++) {
			JSONObject address1 = (JSONObject) array.get(i);
			street = (String) address1.get("street");
			city = (String) address1.get("city");
			state = (String) address1.get("state");
			//System.out.println("ADDRESS " + i + " " + street + " " + city + " " + state);

		}
	}
}
