package br.com.gabriel.mvc.mudi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gabriel.mvc.mudi.model.Product;
import br.com.gabriel.mvc.mudi.model.ProductStatus;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

  List<Product> findByStatus(ProductStatus status);
}
