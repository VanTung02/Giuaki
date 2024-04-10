class motorbike extends vehicle implements ICar {
	String id;
	String brand;
	int publishYear;
	double price;
	String color;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public motorbike(String id, String brand, int publishYear, double price, String color) {
		super(id, brand, publishYear, price, color);
	}

	private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void showInfo() {
        System.out.println("Motorbike ID: " + getId());
        System.out.println("Brand: " + getBrand());
        System.out.println("Publish Year: " + getPublishYear());
        System.out.println("Price: " + getPrice());
        System.out.println("Color: " + getColor());
        System.out.println("Capacity: " + getCapacity());
    }
}
