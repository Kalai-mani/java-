package com.demo.Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	 
		private String mobile;
		private String dob;
		private String course;
		private String duration;
		
		@Override
		public String toString() {
			return "Certificate [mobile=" + mobile + ", dob=" + dob + ", course=" + course + ", duration=" + duration + "]";
		}
		
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		
		public Certificate(String mobile, String dob, String course, String duration) {
			super();
			this.mobile = mobile;
			this.dob = dob;
			this.course = course;
			this.duration = duration;
		}
		
		public Certificate() {
			super();
			// TODO Auto-generated constructor stub
		}
		

	}