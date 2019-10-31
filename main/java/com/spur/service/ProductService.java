package com.spur.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spur.model.Item;
import com.spur.model.Product;
import com.spur.model.Supplier;
import com.spur.model.Transporter;

@Component
public class ProductService {

	public Product getProductByQRCode(String qrCode) {
		
		Supplier s100 = getSupplier(100);
		Transporter t100 = getTransporter(100);
		
		Supplier s200 = getSupplier(200);
		Transporter t200 = getTransporter(200);
		
		Supplier s300 = getSupplier(300);
		Transporter t300 = getTransporter(300);
		
		Item i31 = getItem(31, s300, t300, null);
		Item i32 = getItem(32, s300, t300, null);
		
		Item i21 = getItem(21, s200, t200, i31);
		Item i22 = getItem(22, s200, t200, i32);
		Item i11 = getItem(11, s100, t100, i21);
		Item i12 = getItem(12, s100, t100, i22);
		
		List<Item> items = new ArrayList<>();
		items.add(i11);items.add(i12);
			
		return getProduct(1, items);
	}

	private Product getProduct(int id, List<Item> items) {
		Product p = new Product();
		p.setId(id);
		p.setName("Product "+id);
		p.setDescription("Product "+id+" Description");
		p.setItems(items);
		return p;
	}

	private Transporter getTransporter(int id) {
		Transporter t100 = new Transporter();
		t100.setId(id);
		t100.setName("Transporter "+id);
		t100.setDescription("Transporter "+id+" Description");
		return t100;
	}

	private Supplier getSupplier(int id) {
		Supplier s100 = new Supplier();
		s100.setId(id);
		s100.setName("Supplier "+id);
		s100.setDescription("Supplier "+id+" Description");
		return s100;
	}

	private Item getItem(int id, Supplier s, Transporter t, Item parentItem){
		Item i1 = new Item();
		i1.setId(id);
		i1.setName("Item "+id);
		i1.setDescription("Item "+id+" Description");
		i1.setSuplyer(s);
		i1.setTransporter(t);
		i1.setParentItem(parentItem);
		return i1;
	}
}
