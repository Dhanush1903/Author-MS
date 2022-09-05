package com.author.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;

import com.author.exception.ResourceNotFoundException;
@Service
public class AutorServiceImpl implements IAuthorService 
//UserDetailsService 
{
	@Autowired
	IAuthorRepository authorRepository;

	@Override
	public String saveAuthor(Author author) {
		Author savedAuthor = authorRepository.save(author);
		return savedAuthor.getEmail();
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public boolean login(AuthorDTO authorDTO) {
		
		authorDTO.getEmail(); authorDTO.getPassword();
		
		Author author = authorRepository.findById(authorDTO.getEmail()).get();
		if(author!= null && author.getPassword().equals(authorDTO.getPassword())) {
			return true;
		}
		return false;
	}

//	@Override
//	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//		
//		return  new User("admin","password", new ArrayList<>());
//	
//	}

	@Override
	public Author getbook(String email) {
		// TODO Auto-generated method stub
		Optional<Author> author=	authorRepository.findById(email);
		return author.get();
	
	}
}
	
	
		

