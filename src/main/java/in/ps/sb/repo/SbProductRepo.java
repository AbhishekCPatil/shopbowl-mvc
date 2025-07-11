package in.ps.sb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ps.sb.entity.Product;

public interface SbProductRepo extends JpaRepository<Product, Integer>{

}
