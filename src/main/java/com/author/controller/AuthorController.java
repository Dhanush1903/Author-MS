package com.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;
import com.author.entity.Books;
import com.author.service.IAuthorService;
@CrossOrigin
@RestController
public class AuthorController {
	@Autowired
	IAuthorService authorService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
//	create a new Author
	@PostMapping("/author")
	String createAuthor( @RequestBody Author author) {
		String email= authorService.saveAuthor(author);
		System.out.println("**********************");
		System.out.println(email);
		return email;
	}
	
//	Login
	
@PostMapping("/login")
public boolean login(@RequestBody AuthorDTO authorDTO) {
	authorDTO.getEmail();
	authorDTO.getPassword();
	return authorService.login(authorDTO);
	
}
	
	
	@GetMapping("/{email}")
	public AuthorDTO getbook(@PathVariable("email") String email) {
		Author author = this.authorService.getbook(email);
		
		//http://localhost:8083/getbook/1
		
		List<Books> books = this.restTemplate.getForObject("http://localhost:8083/getbookbyemail/"+email ,List.class);
	
		
		AuthorDTO authorDTO= new AuthorDTO();
		authorDTO.setEmail(author.getEmail());
		authorDTO.setAuthorName(author.getAuthorName());
		authorDTO.setPassword(author.getPassword());
		authorDTO.setBooks(books);
		System.out.println(books);
		return authorDTO;
	}
	
//	security
//	@GetMapping("/")
//	public String Homepage() {
//		return "Welcome User";
//		
//	}

}
