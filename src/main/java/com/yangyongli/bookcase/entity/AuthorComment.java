package com.yangyongli.bookcase.entity;

import javax.persistence.*;
import java.util.Date;


//JPA标识
@Entity
@Table(name = "bookcase_author_comment")
public class AuthorComment extends IdEntity{
	private Author author;
	private User commenter;
	private Date commentDate;
	private String content;
	private AuthorComment reference;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commenter_id")
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reference_id")
	public AuthorComment getReference() {
		return reference;
	}
	public void setReference(AuthorComment reference) {
		this.reference = reference;
	}
}