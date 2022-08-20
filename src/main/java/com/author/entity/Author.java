package com.author.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

	@Id
	
		private Integer aId;
		private String authorName;
		private String password;
		public Integer getaId() {
			return aId;
		}
		public void setaId(Integer aId) {
			this.aId = aId;
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
		public Author(Integer aId, String authorName, String password) {
			super();
			this.aId = aId;
			this.authorName = authorName;
			this.password = password;
		}
		public Author() {
			super();
		}
	
		

		
}
