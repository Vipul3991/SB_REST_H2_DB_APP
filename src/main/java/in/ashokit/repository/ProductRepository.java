package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	

}
