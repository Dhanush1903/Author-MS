package com.author.dto;

import java.util.List;

import com.author.entity.Books;

public class AuthorDTO {
	private String email;
	private String authorName;
	private String password;

	private List<Books> books;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public AuthorDTO(String email, String authorName, String password, List<Books> books) {
		super();
		this.email = email;
		this.authorName = authorName;
		this.password = password;
		this.books = books;
	}

	public AuthorDTO() {
		super();
	}

	@Override
	public String toString() {
		return "AuthorDTO [email=" + email + ", authorName=" + authorName + ", password=" + password + ", books="
				+ books + "]";
	} 

}
