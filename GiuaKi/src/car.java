public class car extends vehicle {
    public car(String id, String brand, int publishYear, double price, String color, int slots2, String engineType2) {
		super(id, brand, publishYear, price, color);
	}

	private int slots;
	private String id;
    private String brand;
    private int publishYear;
    private double price;
    private String color;
    public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	private String engineType;

    public void Car(String id, String brand, int publishYear, double price, String color, int slots, String engineType) {
        this.slots = slots;
        this.engineType = engineType;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Slots: " + slots);
        System.out.println("Engine Type: " + engineType);
    }
}