package com.author.service;


import java.util.List;
import java.util.Optional;

import com.author.entity.Author;


public interface IAuthorService {

	Integer saveAuthor(Author author);

	Author getbook(Integer aId);

//	List<Books> getallBooks();
//	
//	public Optional<Books> getBook(Integer id);
//
//	void deleteBook(Integer id);
//
//	void deleteallBooks();
//
//	Books updateAuthor(Books book, Integer id);
}
