package com.example.shopping;

public class OrderResponse {
	int apples = 0;
	int oranges = 0;
	int applesCost = 0;
	int orangesCost = 0;
	int totalCost = 0;
	
	public int getApples() {
		return apples;
	}
	public void setApples(int apples) {
		this.apples = apples;
	}
	public int getOranges() {
		return oranges;
	}
	public void setOranges(int oranges) {
		this.oranges = oranges;
	}
	public int getApplesCost() {
		return applesCost;
	}
	public void setApplesCost(int applesCost) {
		this.applesCost = applesCost;
	}
	public int getOrangesCost() {
		return orangesCost;
	}
	public void setOrangesCost(int orangesCost) {
		this.orangesCost = orangesCost;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
}
