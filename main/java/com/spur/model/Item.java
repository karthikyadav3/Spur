package com.spur.model;

public class Item {
	private int id;
	private String name;
	private String description;
	private Supplier suplyer;
	private Transporter transporter;
	private Item parentItem;

	public Item() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Item getParentItem() {
		return parentItem;
	}

	public void setParentItem(Item parentItem) {
		this.parentItem = parentItem;
	}
	
	public Supplier getSuplyer() {
		return suplyer;
	}

	public void setSuplyer(Supplier suplyer) {
		this.suplyer = suplyer;
	}

	public Transporter getTransporter() {
		return transporter;
	}

	public void setTransporter(Transporter transporter) {
		this.transporter = transporter;
	}
}
