
package com.capg.otm.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="QUESTION")
public class Question3 {
	@Id
	@Column(name="QUESTION_ID")
private int questionId;
	@Column(name="QUESTION_TITLE")
private String questionTitle;
	@Column(name="OPTION_A")
private String option_A;
	@Column(name="OPTION_B")
private String option_B;
	@Column(name="OPTION_C")
private String option_C;
	@Column(name="OPTION_D")
private String option_D;
	@Column(name="QUESTION_ANSWER")
private int questionAnswer;
	@Column(name="QUESTION_MARKS")
private int questionMarks;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getOption_A() {
		return option_A;
	}
	public void setOption_A(String option_A) {
		this.option_A = option_A;
	}
	public String getOption_B() {
		return option_B;
	}
	public void setOption_B(String option_B) {
		this.option_B = option_B;
	}
	public String getOption_C() {
		return option_C;
	}
	public void setOption_C(String option_C) {
		this.option_C = option_C;
	}
	public String getOption_D() {
		return option_D;
	}
	public void setOption_D(String option_D) {
		this.option_D = option_D;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public int getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionTitle=" + questionTitle + ", option_A=" + option_A
				+ ", option_B=" + option_B + ", option_C=" + option_C + ", option_D=" + option_D + ", questionAnswer="
				+ questionAnswer + ", questionMarks=" + questionMarks + "]";
	}



}