package Entity;

public class Car {
    private int carId;
    private String carMarker;
    private String carModel;
    private String carYearManufacture;
    private String carColor;
    private String carNote;
	public Car(int carId, String carMarker, String carModel, String carYearManufacture, String carColor, String carNote) {
		super();
		this.carId = carId;
		this.carMarker = carMarker;
		this.carModel = carModel;
		this.carYearManufacture = carYearManufacture;
		this.carColor = carColor;
		this.carNote = carNote;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carMarker){
		this.carMarker=carMarker;
	}

	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarMarker() {
		return carMarker;
	}
	public void setCarMarker(String carMarker) {
		this.carMarker = carMarker;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarYearManufacture() {
		return carYearManufacture;
	}
	public void setCarYearManufacture(String carYearManufacture) {
		this.carYearManufacture = carYearManufacture;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarNote() {
		return carNote;
	}
	public void setCarNote(String carNote) {
		this.carNote = carNote;
	}
	
    
}
