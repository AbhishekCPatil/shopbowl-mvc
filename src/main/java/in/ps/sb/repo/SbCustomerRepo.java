package in.ps.sb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ps.sb.entity.Customer;

public interface SbCustomerRepo extends JpaRepository<Customer, Integer>{

}
