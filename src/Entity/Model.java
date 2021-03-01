package Entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Model {
	public abstract List<Model> getData();
	public Integer getId() { return null; }
	public String getName() { return null; }
	public String getCity() { return null; }
	public String getPhoneNumber() { return null; }

	public List<Model> SelectAll() {
		List<Model> result = new ArrayList<>();
		result.addAll(getData());
		return result;
	}
	public List<Model> SelectAllByID( Integer val ) {
		List<Model> result = new ArrayList<>();
		for (Model s : getData()) {
			if( s.getId() != val ) continue;
			result.add(s);
		}
		return result;
	}
	public List<Model> SelectAllByName( String val ) {
		List<Model> result = new ArrayList<>();
		for (Model s : getData()) {
			if(! s.getName().equals(val) ) continue;
			result.add(s);
		}
		return result;
	}
	public List<Model> SelectAllByCity( String val ) {
		List<Model> result = new ArrayList<>();
		for (Model s : getData()) {
			if(! s.getCity().equals(val) ) continue;
			result.add(s);
		}
		return result;
	}
	public List<Model> SelectAllByPhoneNumber( String val ) {
		List<Model> result = new ArrayList<>();
		for (Model s : getData()) {
			if(! s.getPhoneNumber().equals(val) ) continue;
			result.add(s);
		}
		return result;
	}
	public boolean Delete(Model supplier) {
		return getData().remove(supplier);
	}
}
