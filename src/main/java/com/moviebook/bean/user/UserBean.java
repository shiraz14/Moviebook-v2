package com.moviebook.bean.user;

import java.time.LocalDateTime;

import com.moviebook.bean.JsonBean;

public class UserBean extends JsonBean {

	// Password is not retrieved

	private int id;
	private String email;
	private String name;
	private String profilePhotoPath;
	private LocalDateTime creationDateTime;
	private LocalDateTime modificationDateTime;

	public UserBean() {

	}

	public UserBean(int id, String email, String name, String profilePhotoPath, LocalDateTime creationDateTime, LocalDateTime modificationDateTime) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.profilePhotoPath = profilePhotoPath;
		this.creationDateTime = creationDateTime;
		this.modificationDateTime = modificationDateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePhotoPath() {
		return profilePhotoPath;
	}

	public void setProfilePhotoPath(String profilePhotoPath) {
		this.profilePhotoPath = profilePhotoPath;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public LocalDateTime getModificationDateTime() {
		return modificationDateTime;
	}

	public void setModificationDateTime(LocalDateTime modificationDateTime) {
		this.modificationDateTime = modificationDateTime;
	}

}
