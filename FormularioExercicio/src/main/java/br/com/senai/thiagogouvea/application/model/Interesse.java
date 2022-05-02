package br.com.senai.thiagogouvea.application.model;

public class Interesse {
	private int id;
	private String area;
	
	public Interesse(int id, String area) {
		this.id = id;
		this.area = area;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public Interesse() {
		
	}
}
