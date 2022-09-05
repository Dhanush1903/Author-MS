package com.author.entity;



import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Author {

	@Id
	
		private String email;
		private String authorName;
		private String password;
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
		public Author(String email, String authorName, String password) {
			super();
			this.email = email;
			this.authorName = authorName;
			this.password = password;
		}
		public Author() {
			super();
		}
		@Override
		public String toString() {
			return "Author [email=" + email + ", authorName=" + authorName + ", password=" + password + "]";
		}
		
		

		
}
