package com.author.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.entity.Author;

import com.author.exception.ResourceNotFoundException;
@Service
public class AutorServiceImpl implements IAuthorService {
	@Autowired
	IAuthorRepository authorRepository;

	@Override
	public Integer saveAuthor(Author author) {
		Author savedAuthor = authorRepository.save(author);
		return savedAuthor.getaId();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Author getbook(Integer aId) {
		// TODO Auto-generated method stub
	Optional<Author> author=	authorRepository.findById(aId);
		return author.get();
	}

//	@Override
//	public List<Books> getallBooks() {
//		
//		return authorRepository.findAll();
//	}
//
//	@Override
//	public Optional<Books> getBook(Integer id) {
//		// TODO Auto-generated method stub
//		return authorRepository.findById(id);
//	}
//
//	@Override
//	public void deleteBook(Integer id) {
//		authorRepository.deleteById(id);
//		
//	}
//
//	@Override
//	public void deleteallBooks() {
//		authorRepository.deleteAll();
//		
//	}
//
//	@Override
//	public Books updateAuthor(Books book, Integer id) {
//		// TODO Auto-generated method stub
//		Books existingBook = authorRepository.findById(id).orElseThrow(
//				()-> new ResourceNotFoundException("Employee", "id", id));
//				
//		existingBook.setAuthorUserName(book.getAuthorUserName());;
//		existingBook.setActive(book.getActive());
//		existingBook.setCategory(book.getCategory());
//		existingBook.setContent(book.getContent());
//		existingBook.setImage(book.getImage());
//		existingBook.setPrice(book.getPrice());
//		existingBook.setPublisher(book.getPublisher());
//				
//				//the details are updated and then saving the updated value
//		authorRepository.save(existingBook);
//		return existingBook;
//	}
}

	
	
		

