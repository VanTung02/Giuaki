import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Truck extends vehicle {
	double loadWeight;
    String id;
    String brand;
    int publishYears;
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


	public int getPublishYears() {
		return publishYears;
	}


	public void setPublishYears(int publishYears) {
		this.publishYears = publishYears;
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


	public Truck(String id, String brand, int publishYear, double price, String color) {
		super(id, brand, publishYear, price, color);
		// TODO Auto-generated constructor stub
	}
	

        public double getLoadWeight() {
            return loadWeight;
        }

        public void setLoadWeight(double loadWeight) {
            this.loadWeight = loadWeight;
        }

        @Override
        public void showInfo() {
            System.out.println("Truck ID: " + getId());
            System.out.println("Brand: " + getBrand());
            System.out.println("Publish Year: " + getpublishYear());
            System.out.println("Price: " + getPrice());
            System.out.println("Color: " + getColor());
            System.out.println("Load Weight: " + getLoadWeight());
        }


		private String getpublishYear() {
			return null;
		}
    }

    



