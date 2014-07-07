package com.hashedin.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;


@XmlRootElement
@Entity
@Table(name = "users")
@NamedQueries({ @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u") })

public class User {
	
	@Id
    @GeneratedValue
    private Long userId;
	
	private String userName;
	private String userEmail;
	private String userContactNum;
	private String userRole;
	
	@XmlInverseReference(mappedBy="assignedTo")
	@OneToMany (fetch=FetchType.EAGER,mappedBy="assignedTo")
	Set<Task> userTask;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserContactNum() {
		return userContactNum;
	}

	public void setUserContactNum(String userContactNum) {
		this.userContactNum = userContactNum;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Set<Task> getUserTask() {
		return userTask;
	}

	public void setUserTask(Set<Task> userTask) {
		this.userTask = userTask;
	}
	
}