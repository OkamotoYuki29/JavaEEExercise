package beans;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RequestScoped
@Transactional
public class BookDb {
	
	@PersistenceContext
	private EntityManager em;
	
	public void create(Book book){
		em.persist(book);
	}
	public Book update(Book book){
		return em.merge(book);
	}
	public Book find(Object code){
		return em.find(Book.class, code);
	}
}
