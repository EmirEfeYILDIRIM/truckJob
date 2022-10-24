package truckJob;

public class Truck {
	private String numberPlate;
	private String Brand;
	private String model;
	private Driver driver;
	public Truck() {
		super();
	}
	public Truck(String numberPlate, String brand, String model) {
		super();
		this.numberPlate = numberPlate;
		Brand = brand;
		this.model = model;
	}
	public Truck(String numberPlate, String brand, String model, Driver driver) {
		super();
		this.numberPlate = numberPlate;
		Brand = brand;
		this.model = model;
		this.driver = driver;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
