package core.models;

public class Student {
	private String name;
	private String surname;
	private String address;
	private Long CNP;
	private String telephone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getCNP() {
		return CNP;
	}

	public void setCNP(Long CNP) {
		this.CNP = CNP;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		String number = telephone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		this.telephone = number;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", address=" + address + ", CNP=" + CNP
				+ ", telephone=" + telephone + "]";
	}

}
