package com.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RestController
public class AuthorController {
	@Autowired
	IAuthorService authorService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@PostMapping("/author")
	Integer createAuthor(@RequestBody Author author) {
		Integer id= authorService.saveAuthor(author);
		System.out.println(id);
		return id;
	}
	
	
	@GetMapping("/{aId}")
	public AuthorDTO getbook(@PathVariable("aId") Integer aId) {
		Author author = this.authorService.getbook(aId);
		
		//http://localhost:8083/getbook/1
		
		Books books = this.restTemplate.getForObject("http://localhost:8083/getbookbyaId/"+aId ,Books.class);
	
		
		AuthorDTO authorDTO= new AuthorDTO();
		authorDTO.setaId(author.getaId());
		authorDTO.setAuthorName(author.getAuthorName());
		authorDTO.setPassword(author.getPassword());
		authorDTO.setBooks(books);
		System.out.println(books);
		return authorDTO;
	}
//	comment
	
	
//	@GetMapping("/allBooks")
//	public List<Books> getallBooks(){
//		return authorService.getallBooks();
//		
//	}
//	
//	@GetMapping("/getbook/{id}")
//	public Optional<Books> getBook(@PathVariable Integer id){
//		Optional<Books> book = authorService.getBook(id);
//		return book;
//	}
//	
//	@DeleteMapping("/book/{id}")
//	public ResponseEntity<Books> deleteEmployee(@PathVariable Integer id){
//		System.out.println(id);
//		ResponseEntity<Books> responseEntity= new ResponseEntity<>(HttpStatus.OK);
//		try {
//			authorService.deleteBook(id);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			responseEntity= new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//		return  responseEntity;
//	}
//
//	@DeleteMapping("/deleteall")
//	public String deleteBooks(){
//		authorService.deleteallBooks();
//		return "Deleted all employees";
//	}
//	
//	@PutMapping("/update/{id}")
//	public ResponseEntity<Books> updateAuthor(@PathVariable("id") Integer id, @RequestBody Books book){
//		return new ResponseEntity<Books>(authorService.updateAuthor(book, id), HttpStatus.OK);
//	}
//	
	

}
