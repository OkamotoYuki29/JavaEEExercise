package beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmployeeDb {

    @PersistenceContext
    private EntityManager em;

    public void create(Employee employee) {
        em.persist(employee);
    }

    public void update(Employee employee) {
        em.merge(employee);
    }

    public void delete(Employee employee) {
        em.remove(em.merge(employee));  // mergしてから削除する
    }

    public Employee find(Integer key) {
        return em.find(Employee.class, key);
    }

    public List<Employee> getAll() {
        return em.createQuery("SELECT c FROM Employee c").getResultList();
    }
}
