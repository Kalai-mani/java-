package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	
@Id
@Column(name="ans_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int aid;
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public void setAid(int aid) {
	this.aid = aid;
}
private String answer;
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
public String toString(){
	return "answer[aid="+aid+",answer="+answer+"]";
	
}
public Answer(int aid, String answer) {
	super();
	this.aid = aid;
	this.answer = answer;
}
private int getAid() {
	return aid;
}

}
