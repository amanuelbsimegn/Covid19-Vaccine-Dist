import java.util.Arrays;
import java.util.List;

import Entity.*;

public class Main {
	public static void main(String[] args) {
		List<Supplier> suppliers = Model.getSuppliers();
		suppliers.forEach( System.out::println );

		GUI.Main.main(args);
	}
}
