package com.example.TlabApi.users;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "users")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="fullname")
	private String fullname;
	@Column(name="email")
	private String email;
	@Column(name="phone_num")
	private String phone_num;
	@Column(name="photo")
	private String photo;
	@Column(name="govt_id")
	private String govt_id;
	@Column(name="user_role")
	private String user_role;
	@Column(name="account_status")
	private String account_status;
	
	
	@Override
	public String toString() {
		return "Users [" + (id != null ? "id=" + id + ", " : "")
                + (fullname != null ? "fullname=" + fullname + ", " : "")
                + (email != null ? "email=" + email + ", " : "") + (phone_num != null ? "phone_num=" + phone_num + ", " : "")
                + (photo != null ? "photo=" + photo + ", " : "") + (govt_id != null ? "govtId=" + govt_id + ", " : "")
                + (user_role != null ? "user_role=" + user_role + ", " : "")
                + (account_status != null ? "account_status=" + account_status : "") + "]";
    }
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGovt_id() {
		return govt_id;
	}
	public void setGovt_id(String govt_id) {
		this.govt_id = govt_id;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	


}
