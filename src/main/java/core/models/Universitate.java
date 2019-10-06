package core.models;

import java.util.List;

public class Universitate {
	private List<Facultate> facultati;

	public Universitate(List<Facultate> facultati) {
		this.facultati = facultati;
	}

	@Override
	public String toString() {
		return "Universitate [facultati=" + facultati + "]";
	}

}
