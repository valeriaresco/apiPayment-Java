package com.javaapi.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaapi.demo.model.Pagamento;
import com.javaapi.demo.model.StatusPayment;

//import jakarta.persistence.EntityManager;

@Repository
public interface DeleteRepository extends JpaRepository<Pagamento, Long> {

	List<Pagamento> findByStatus(StatusPayment status);

	/*
	 * private final EntityManager em;
	 * 
	 * public DeleteRepository(EntityManager em) { this.em = em; }
	 * 
	 * public Long deletePaymenteFromStatus(Long id){
	 * 
	 * //Pegando o código do debito String query =
	 * "select d from Pagamento as d where d.cod_debit = :cod_debit ";
	 * 
	 * 
	 * var q = em.createQuery(query, Pagamento.class);
	 * 
	 * if (id != null) { q.setParameter("cod_debit", id); }
	 * //System.out.println(q.getResultList());
	 * 
	 * return id;
	 */

	// }

}
