package dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TransactionDao {
	EntityManagerFactory ef=Persistence.createEntityManagerFactory("TRANSACTION");
	public EntityManager em=ef.createEntityManager();
	
	public void begin() {
		em.getTransaction().begin();
	}
	
	public void save(Transaction t) {
		em.persist(t);
	}
	
	public Transaction findByRef(int id) {
		return em.find(Transaction.class, id);
	}
	
	public ArrayList<Transaction> findAllTransactions(){
	    Query query = em.createQuery("SELECT e FROM Transaction e");
	    return (ArrayList<Transaction>)query.getResultList();
	}
	
	public void flush() {
		em.flush();
	}
	
	public void commit() {
		em.getTransaction().commit();
	}
}
