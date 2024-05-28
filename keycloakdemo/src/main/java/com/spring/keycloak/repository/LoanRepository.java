package com.spring.keycloak.repository;

import com.spring.keycloak.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends CrudRepository<Loans, Long> {
//	 @PreAuthorize("hasRole('ROOT')")
//@PreAuthorize("hasRole('USER')")
	
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
