package pe.opm.springboot.demo01.repositories;

import org.springframework.data.repository.CrudRepository;

import pe.opm.springboot.demo01.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
