package com.author.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private String title;
		private String category;
		private String image;
		private long price;
		private String publisher;
		private Boolean active;
		private String content;
		private String authorUserName;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public long getPrice() {
			return price;
		}
		public void setPrice(long price) {
			this.price = price;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public Boolean getActive() {
			return active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getAuthorUserName() {
			return authorUserName;
		}
		public void setAuthorUserName(String authorUserName) {
			this.authorUserName = authorUserName;
		}
		public Books(Integer id, String title, String category, String image, long price, String publisher,
				Boolean active, String content, String authorUserName) {
			super();
			this.id = id;
			this.title = title;
			this.category = category;
			this.image = image;
			this.price = price;
			this.publisher = publisher;
			this.active = active;
			this.content = content;
			this.authorUserName = authorUserName;
		}
		public Books() {
			super();
		}
		
		
}
