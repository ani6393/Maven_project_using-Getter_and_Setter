package com.apun.Project.Coder;
public class DieselStation {
	private int Price;
	private String State;
	private String City;

		public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

		public String giveMeFuel() 
		{
			return "Diesel Car";
		}
		
		
		}

