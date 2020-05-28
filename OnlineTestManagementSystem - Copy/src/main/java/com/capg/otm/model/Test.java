package com.capg.otm.model;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Test")
public class Test {

	
	@Id
	@Column(name = "TEST_ID")
	private int id;
	@Column(name = "TEST_TOTALMARKS")
	private int totalmarks;
	@Column(name = "TEST_TITLE")
	private String title;
	@Column(name = "TEST_DURATION")
	private int duration;
	
	
	@Override
	public String toString() {
		return "Test [id=" + id + ", totalmarks=" + totalmarks + ", title=" + title + ", duration=" + duration + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	

	
}