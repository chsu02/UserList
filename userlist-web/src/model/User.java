package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	private int id;

	private String userId;

	@Column(length = 30)
	private String contactNo;
	@Column(length = 30)
	private String phoneno_home;
	@Column(length = 30)
	private String phoneno_work;
	@Column(length = 30)
	private String phoneno_cell;
	@Column(length = 30)
	private String email;
	@Column(length = 50)
	private String firstname;
	private String lastname;
	@Lob
	private byte[] photo;


	// Constructor
	public User() {}

	// Getter and Setter
	public int getId() {return this.id;}
	public void setId(int studentId) {this.id = studentId;}

	public String getUserId() {return userId;}
	public void setUserId(String param) {this.userId = param;}

	public String getContactNo() {return this.contactNo;}
	public void setContactNo(String contactNo) {this.contactNo = contactNo;}

	public String getPhoneno_home() {return phoneno_home;}
	public void setPhoneno_home(String phoneno_home) {this.phoneno_home = phoneno_home;}

	public String getPhoneno_work() {return phoneno_work;}
	public void setPhoneno_work(String phoneno_work) {this.phoneno_work = phoneno_work;}

	public String getPhoneno_cell() {return phoneno_cell;}
	public void setPhoneno_cell(String phoneno_cell) {this.phoneno_cell = phoneno_cell;}

	public String getEmail() {return this.email;}
	public void setEmail(String email) {this.email = email;}

	public String getFirstname() {return this.firstname;}
	public void setFirstname(String firstname) {this.firstname = firstname;}

	public String getLastname() {return lastname;}
	public void setLastname(String lastname) {this.lastname = lastname;}

	public byte[] getPhoto() {return this.photo;}
	public void setPhoto(byte[] photo) {this.photo = photo;}
}