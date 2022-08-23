package com.author.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;

import com.author.exception.ResourceNotFoundException;
@Service
public class AutorServiceImpl implements IAuthorService, UserDetailsService {
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

	@Override
	public boolean login(AuthorDTO authorDTO) {
		
		authorDTO.getaId(); authorDTO.getPassword();
		
		Author author = authorRepository.findById(authorDTO.getaId()).get();
		if(author!= null && author.getPassword().equals(authorDTO.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		return  new User("admin","password", new ArrayList<>());
	
	}
}
	
	
		

