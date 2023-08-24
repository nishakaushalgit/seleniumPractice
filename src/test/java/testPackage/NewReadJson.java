package testPackage;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NewReadJson {

	public static void main(String[] args) throws Exception {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader("/Users/kshitijchaudhary/eclipse-workspace/seleniumPractice/src/test/java/testPackage/testdata.json");
		Object obj= jsonparser.parse(reader);
		JSONObject jsonobj= (JSONObject)obj;
		String fname =(String) jsonobj.get("firstName");
		String lname =(String) jsonobj.get("lastName");
		System.out.println("Firstname "+ fname);
		System.out.println("Lastname "+ lname);
		JSONArray array=(JSONArray) jsonobj.get("address");
		for(int i=0;i<array.size();i++) {
			JSONObject address1= (JSONObject) array.get(i);
			String street=(String) address1.get("street");
			String city=(String) address1.get("city");
			String state=(String) address1.get("state");
			System.out.println("ADDRESS "+ i+ " "+ street+ " "+ city+ " "+state);
			
		}

	}

}
