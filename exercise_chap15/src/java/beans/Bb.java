package beans;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.*;

@Named
@RequestScoped
public class Bb implements Serializable{
	
	@NotNull @Size(min = 5, max = 5)
	private String code;
	@Size(min = 1, max = 20)
	private String title;
	@Size(min = 1, max = 10)
	private String author;
	@NotNull
	private Integer price;
	@Inject
	private BookDb db;
	@Inject
	private Logger logger;
	
	
	public String next(){
		create();
		return null;
	}
	
	public void create(){
		Book book = new Book(code,title,author,price);
		try{
			db.create(book);
			clear();
			logger.info(this + "Complete");
		} catch(Exception e){
			logger.fine(this + ":persistErr:" + e.getMessage());
		}
	}
	
	public void clear(){
		code = null;
		title = null;
		author = null;
		price = null;
	}

	@Override
	public String toString() {
		return "Bb{" + "code=" + code + ", title=" + title + ", author=" + author + ", price=" + price + '}';
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

	public BookDb getDb() {
		return db;
	}

	public void setDb(BookDb db) {
		this.db = db;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	
}
