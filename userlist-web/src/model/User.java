package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name = "Users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	private int id;

	@Column(length = 30)
	private String contactNo;

	@Column(length = 30)
	private String email;

	@Column(length = 50)
	private String firstname;

	@Lob
	private byte[] photo;

	private String lastname;

	private String userId;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int studentId) {
		this.id = studentId;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String name) {
		this.firstname = name;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String param) {
		this.lastname = param;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String param) {
		this.userId = param;
	}

}