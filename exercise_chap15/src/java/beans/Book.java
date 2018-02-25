package beans;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Book implements Serializable{
	@Id @NotNull @Size(min = 5, max = 5)
	private String code;
	@Size(min = 1, max = 20)
	private String title;
	@Size(min = 1, max = 10)
	private String author;
	@NotNull
	private Integer price;

	public Book() {
	}

	public Book(String code, String title, String author, Integer price) {
		this.code = code;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
