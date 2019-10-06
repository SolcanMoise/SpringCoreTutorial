package core.models;

public class Locatie {
	private String country;
	private String city;
	private String street;
	private Integer number;

	public Locatie(String country, String city, String street, Integer number) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Locatie [country=" + country + ", city=" + city + ", street=" + street + ", number=" + number + "]";
	}

}
