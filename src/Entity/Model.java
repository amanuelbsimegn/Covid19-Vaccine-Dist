package Entity;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class Model {
	// START Data
	private static List<Supplier> suppliers = null;
	public static List<Supplier> getSuppliers() {
		LoadSuppliers();
		return suppliers;
	}

	public static void LoadSuppliers() {
//		String dbURL = "jdbc:sqlserver:amanu;databaseName=Covid19Dist;";
//		String userName = "a";
//		String password = "123456";
//
//		try {
//			String connectionUrl = "jdbc:sqlserver://localhost;databaseName=Covid19Dist;user=cvdmsuser;password=123456";
//
//			Connection cn = DriverManager.getConnection(connectionUrl);
//			cn.getCatalog();
//		} catch (SQLException sqlException) {
//			sqlException.printStackTrace();
//		}

		if (suppliers != null) return;

		suppliers = new ArrayList<>();
		suppliers.add( new Supplier(1, "Moderna", "Des Moines", "123-456-7890") );
		suppliers.add( new Supplier(2, "Pfizer", "Fair Field", "123-456-7890") );
		suppliers.add( new Supplier(3, "AstraZeneca", "New York", "123-456-7890") );
	}
	// END Data

	// START Read
	public static <T> List<T> SelectAll(String entity) {
		List<T> result = new ArrayList<>();

//		result.addAll();

		return result;
	}
	// END Read

	// START

	// END
}
