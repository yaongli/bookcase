/**
 * 
 */
package com.yangyongli.bookcase.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

//JPA标识
@Entity
@Table(name = "bookcase_book")
public class Book extends IdEntity {
	@NotBlank
	private String name;
	
	private String originalName;
	private List<Author> authors;
	private List<Author> translators;
	
	@ManyToOne
	@JoinColumn(name = "catagory_id")
	private Catagory catagory;
	private String summary;
	private String coverImage;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date publishDate;
	
	private Integer pageNumber;
	private List<BookTag> tags;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public List<Author> getTranslators() {
		return translators;
	}
	public void setTranslators(List<Author> translators) {
		this.translators = translators;
	}
	public Catagory getCatagory() {
		return catagory;
	}
	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public List<BookTag> getTags() {
		return tags;
	}
	public void setTags(List<BookTag> tags) {
		this.tags = tags;
	}
}
