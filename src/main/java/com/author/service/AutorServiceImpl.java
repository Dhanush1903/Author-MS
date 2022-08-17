package com.author.service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.entity.Books;
@Service
public class AutorServiceImpl implements IAuthorService {
	@Autowired
	IAuthorRepository authorRepository;

	@Override
	public Integer saveBook(Books books) {
		Books savedAuthor = authorRepository.save(books);
		return savedAuthor.getId();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Books> getallBooks() {
		
		return authorRepository.findAll();
	}

	@Override
	public Optional<Books> getBook(Integer id) {
		// TODO Auto-generated method stub
		return authorRepository.findById(id);
	}

	@Override
	public void deleteBook(Integer id) {
		authorRepository.deleteById(id);
		
	}

}
