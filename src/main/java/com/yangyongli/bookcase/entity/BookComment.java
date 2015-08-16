package com.yangyongli.bookcase.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

//JPA标识
@Entity
@Table(name = "bookcase_book_comment")
public class BookComment extends IdEntity {
	

	private Book book;

	private User commenter;

	private Date commentDate;
	private String content;

	private BookComment reference;

	@ManyToOne
	@JoinColumn(name = "book_id")
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}


	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getCommenter() {
		return commenter;
	}
	public void setCommenter(User commenter) {
		this.commenter = commenter;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reference_id")
	public BookComment getReference() {
		return reference;
	}
	public void setReference(BookComment reference) {
		this.reference = reference;
	}
	
	
}
