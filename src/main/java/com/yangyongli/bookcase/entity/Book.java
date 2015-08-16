/**
 * 
 */
package com.yangyongli.bookcase.entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

//JPA标识
@Entity
@Table(name = "bookcase_book")
public class Book extends IdEntity {
	@NotBlank
	private String name;
	
	private String originalName;

    /*

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="bookcase_book_author",
            joinColumns={@JoinColumn(name="bookId", referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="authorId", referencedColumnName="id")})
	private Set<Author> authors;

	*/

    /*
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	*/

	private String summary;
	private String coverImage;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date publishDate;
	
	private Integer pageNumber;

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
}
