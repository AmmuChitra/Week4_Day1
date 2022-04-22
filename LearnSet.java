package week4_Day1;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> company=new HashSet<String>();
		
		
		company.add("Infosys");
		company.add("CTS");
		company.add("TCS");
		company.add("Infosys");
		company.add("cts");
		company.add("accenture");
		company.add("TCS");
		company.add("");
		company.add("");
		
	//Print the set value
		System.out.println(company);
		boolean add = company.add("Amazon");
		System.out.println(company.contains("amazon"));
		System.out.println(company.remove("TCS"));
		System.out.println(company);
		company.clear();
	}

}
//table[@class='DataTable TrainList TrainListHeader']//tr[1]/td[3]
