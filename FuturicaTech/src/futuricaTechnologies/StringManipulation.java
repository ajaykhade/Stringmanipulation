package futuricaTechnologies;

import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

public class StringManipulation {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){

			//taking 3 inputs
			System.out.println("Please Enter Your Name");
			String name = sc.nextLine();
			System.out.println("Please Enter Your Designation");
			String designation = sc.nextLine();
			System.out.println("Please Enter Your Company Name");
			String company = sc.nextLine();


			//performing string operations on inputs
			String updatedName = name.trim().toUpperCase();
			String updatedDesignation = designation.substring(0, 5);
			String updatedCompany = new StringBuilder(company).reverse().toString();
			String updatedString = updatedName.concat(" works with ").concat(updatedCompany)
					.concat(" at designation ").concat(updatedDesignation);
			
			System.out.println();
			System.out.println("Output after performing String Operations");
			System.out.println(updatedString);


			//CRUD operations
			String crud1 = updatedString.replace(updatedCompany, company)
					.replace(updatedDesignation, designation);
			String crud2 = crud1.replaceAll("[ao]", "");
			
			System.out.println();
			System.out.println("Output After Performing CRUD Operations");
			System.out.println(crud2);


			//JSON object
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Name", name);
			jsonObject.put("Designation", designation);
			jsonObject.put("Company", company);
			
			System.out.println();
			System.out.println("Json Object");
			System.out.println(jsonObject.toString());


			//loop activity
			String[] strArray = crud1.split(" ");
			int count = 1;
			
			System.out.println();
			System.out.println("Loop Activity :");
			for(String s : strArray) {
				System.out.println(count + ") " + s);
				count++;
			}
			
			
		} catch (JSONException | IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
