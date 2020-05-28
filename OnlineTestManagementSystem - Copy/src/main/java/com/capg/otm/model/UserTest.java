package com.capg.otm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="USERTEST")
public class UserTest {
	@Column(name = "START_TIME")
	private String starttime;
	@Column(name = "END_TIME")
	private String endtime;
	
	public String getStarttime() {
	return starttime;
}
public void setStarttime(String starttime) {
	this.starttime = starttime;
}
public String getEndtime() {
	return endtime;
}
public void setEndtime(String endtime) {
	this.endtime = endtime;
}
@Override
public String toString() {
	return "UserTest [starttime=" + starttime + ", endtime=" + endtime + "]";
}

}
