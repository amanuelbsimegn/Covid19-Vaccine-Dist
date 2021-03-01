package Entity;

import java.util.ArrayList;
import java.util.List;

public class Vaccine extends Model {
	private Integer id;
	private String name;
	private Supplier supplier;

	// START Constructors
	public Vaccine() {}
	public Vaccine(Integer id, String name, Supplier supplier) {
		this.id = id;
		this.name = name;
		this.supplier = supplier;
	}
	// END Constructors

	// START Getters
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Supplier getSupplier() {
		return supplier;
	}

	@Override
	public List<Model> getData() {
		LoadData();
		return vaccines;
	}
	// END Getters

	// START Data
	private static List<Model> vaccines = null;
	public static void LoadData() {
		if (vaccines != null) return;

		vaccines = new ArrayList<>();
		// Get suppliers and add a vaccine for each of them
		var suppliers = (new Supplier()).getData();
		for ( int it=0; it<suppliers.size(); it++ ) {
			int id = it+1;
			vaccines.add( new Vaccine(id, "Covid19-"+id, (Supplier) suppliers.get(it)) );
		}
	}
	// END Data

	// START Methods
	@Override
	public String toString() {
		return String.format(
			"ID: %d. Name: %s. Supplier: [ "+supplier+" ]", id, name
		);
	}
	// END Methods
}
