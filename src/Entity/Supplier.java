package Entity;

import java.util.List;
import java.util.ArrayList;

public class Supplier extends Model {
	private Integer id;
	private String name;
	private String city;
	private String phoneNumber;

	// START Constructors
	public Supplier() {}
	public Supplier(Integer id, String name, String city, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	// END Constructors

	// START Getters
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public List<Model> getData() {
		LoadData();
		return suppliers;
	}
	// END Getters

	// START Data
	private static List<Model> suppliers = null;
	public static void LoadData() {
		if (suppliers != null) return;

		suppliers = new ArrayList<>();
		suppliers.add( new Supplier(1, "Moderna", "Des Moines", "123-456-7890") );
		suppliers.add( new Supplier(2, "Pfizer", "Fair Field", "123-456-7890") );
		suppliers.add( new Supplier(3, "AstraZeneca", "New York", "123-456-7890") );
	}
	// END Data

	// START Methods
	@Override
	public String toString() {
		return String.format(
			"ID: %d. Name: %s. City: %s. Phone Number: %s.", id, name, city, phoneNumber
		);
	}
	// END Methods
}
