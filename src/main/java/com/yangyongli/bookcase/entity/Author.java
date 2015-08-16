package com.yangyongli.bookcase.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

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

    /**
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="bookcase_book_author",
            joinColumns={@JoinColumn(name="authorId", referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="bookId", referencedColumnName="id")})
    private Set<Book> books;
    */

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

}
