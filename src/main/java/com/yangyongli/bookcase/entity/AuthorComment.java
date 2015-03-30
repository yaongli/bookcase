package com.yangyongli.bookcase.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


//JPA标识
@Entity
@Table(name = "bookcase_author_comment")
public class AuthorComment extends IdEntity{
	private Author author;
	private User commenter;
	private Date commentDate;
	private String content;
	private AuthorComment reference;
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public User getCommenter() {
		return commenter;
	}
	public void setCommenter(User commenter) {
		this.commenter = commenter;
	}
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
	public AuthorComment getReference() {
		return reference;
	}
	public void setReference(AuthorComment reference) {
		this.reference = reference;
	}
}