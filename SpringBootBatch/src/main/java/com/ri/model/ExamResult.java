package com.ri.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@Data
@XmlRootElement(name = "ExamResult")
public class ExamResult {
	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "semester")
	private String sementer;
	@XmlElement(name = "dob")
	private String dob;
	@XmlElement(name = "percentage")
	private float percentage;

}
