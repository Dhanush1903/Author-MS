package com.author.service;


import java.util.List;
import java.util.Optional;

import com.author.entity.Books;

public interface IAuthorService {

	Integer saveBook(Books books);

	List<Books> getallBooks();
	
	public Optional<Books> getBook(Integer id);

	void deleteBook(Integer id);
}
