import java.util.List;

import Entity.*;

public class Main {
	public static void main(String[] args) {
		String hor = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~=========================~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

		System.out.println("\nSuppliers:");
		System.out.println(hor);
		List<Model> suppliers = (new Supplier()).getData();
		suppliers.forEach( System.out::println );
		System.out.println(hor);

		System.out.println("\nVaccines:");
		System.out.println(hor);
		List<Model> vaccines = (new Vaccine()).getData();
		vaccines.forEach( System.out::println );
		System.out.println(hor);


//		GUI.Main.main(args);
	}
}
