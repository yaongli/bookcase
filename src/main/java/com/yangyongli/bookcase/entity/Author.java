package com.yangyongli.bookcase.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

//JPA标识
@Entity
@Table(name = "bookcase_author")
public class Author extends IdEntity{
	@NotBlank
	private String name;
	private String orignalName;
	private String description;
	private String photo;
	private List<AuthorTag> tags;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrignalName() {
		return orignalName;
	}
	public void setOrignalName(String orignalName) {
		this.orignalName = orignalName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<AuthorTag> getTags() {
		return tags;
	}
	public void setTags(List<AuthorTag> tags) {
		this.tags = tags;
	}
	
}
