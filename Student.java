package org.planning.restfulcrud.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    private String StudNo;
    private String StudName;
    private Date StudDOB;
	private Date StudDOJ;

    // This default constructor is required if there are other constructors.
    public Student() {

    }

    public Student(String StudNo, String StudName, Date StudDOB, Date StudDOJ) {
        this.StudNo = StudNo;
        this.StudName = StudName;
        this.StudDOB = StudDOB;
		this.StudDOJ = StudDOJ;
    
    }

    public String getStudNo() {
        return StudNo;
    }

    public void setStudNo(String StudNo) {
        this.StudNo = StudNo;
    }

    public String getStudName() {
        return StudName;
    }

    public void setStudName(String StudName) {
        this.StudName = StudName;
    }

    public Date getStudDOB() {
        return StudDOB;
    }

    public void setStudDOB(Date StudDOB) {
        this.StudDOB = StudDOB;
    }
	public Date getStudDOJ() {
        return StudDOJ;
    }

    public void setStudDOJ(Date StudDOJ) {
        this.StudDOJ = StudDOJ;
    }

}
