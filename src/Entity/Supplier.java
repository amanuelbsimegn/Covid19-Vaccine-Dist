package Entity;

import java.util.List;
import java.util.ArrayList;

public class Supplier {
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
	// END Getters

	// START Models
//	public List<Supplier> SelectAll() {
//		List<Supplier> result = new ArrayList<>();
//		result.addAll(suppliersData);
//		return result;
//	}
//	public List<Supplier> SelectAllBy( String att, String val ) {
//		List<Supplier> result = new ArrayList<>();
//
//		for (Supplier s : suppliersData) {
//
//		}
//
//		return result;
//	}
//	public boolean Delete(Supplier supplier) {
//		return suppliersData.remove(supplier);
//	}
	// END Models

	// START Methods
	@Override
	public String toString() {
		return String.format(
			"ID: %d.\nName: %s.\nCity: %s.\nPhone Number: %s.\n", id, name, city, phoneNumber
		);
	}
	// END Methods
}
