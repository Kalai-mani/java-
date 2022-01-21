package com.demo.Hibernate;
	import java.util.Arrays;
	import java.util.Date;

	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	import javax.persistence.Transient;

	@Entity
	@Table(name = "student_address")
	public class Address {
		@Id
		@Column(name = "Add_ID")
		private int add_id;
		
		@Column(name = "Street", length = 50)
		private String street;
		
		@Column(name = "City", length = 100)
		private String city;
		
		private boolean open;
		
		@Transient
		private double houseno;
		
		@Temporal(TemporalType.DATE)
		private Date add_data;
		
//		private byte[] image;
		
		

		@Override
		public String toString() {
			return "Address [add_id=" + add_id + ", street=" + street + ", city=" + city + ", open=" + open + ", houseno="
					+ houseno + ", add_data=" + add_data + "]";
		}

		public int getAdd_id() {
			return add_id;
		}

		public void setAdd_id(int add_id) {
			this.add_id = add_id;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public boolean isOpen() {
			return open;
		}

		public void setOpen(boolean open) {
			this.open = open;
		}

		public double getHno() {
			return houseno;
		}

		public void setHno(double hno) {
			this.houseno = hno;
		}

		public Date getAdd_data() {
			return add_data;
		}

		public void setAdd_data(Date add_data) {
			this.add_data = add_data;
		}

//		public byte[] getImage() {
//			return image;
//		}
	//
//		public void setImage(byte[] image) {
//			this.image = image;
//		}

		public Address(int add_id, String street, String city, boolean open, double hno, Date add_data) {
			super();
			this.add_id = add_id;
			this.street = street;
			this.city = city;
			this.open = open;
			this.houseno = hno;
			this.add_data = add_data;
//			this.image = image;
		}

		public Address() {
			super();
			// TODO Auto-generated constructor stub
		
		
		
		
		
	}
}
