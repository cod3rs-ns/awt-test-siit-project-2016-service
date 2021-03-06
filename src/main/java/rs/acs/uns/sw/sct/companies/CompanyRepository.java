package rs.acs.uns.sw.sct.companies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Spring Data JPA repository for the Company entity.
 */
public interface CompanyRepository extends JpaRepository<Company, Long>, QueryDslPredicateExecutor<Company> {

}
