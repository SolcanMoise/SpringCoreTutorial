package core.models;

import java.util.List;

public class Facultate {
	private String name;
	private Locatie address;
	private String telephone;
	private String email;
	private List<Student> students;

	public Facultate(String name, Locatie address, String telephone, String email, List<Student> students) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.students = students;
	}

	@Override
	public String toString() {
		return "Facultate [name=" + name + ", address=" + address + ", telephone=" + telephone + ", email=" + email
				+ ", students=" + students + "]";
	}

}
