package roomReservationServicePublisher;

public class Room {
	private String roomNumber;
	private String roomType;
	private double roomPrice;
	private String roomFeatures;
	
	public Room(String roomNumber, String roomType, double roomPrice, String roomFeatures) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomFeatures = roomFeatures;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomFeatures() {
		return roomFeatures;
	}

	public void setRoomFeatures(String roomFeatures) {
		this.roomFeatures = roomFeatures;
	}
	
	
}
