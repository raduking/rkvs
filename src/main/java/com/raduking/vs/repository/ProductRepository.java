package com.raduking.vs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.raduking.vs.domain.entity.Product;

/**
 * Repository for {@link Customer}.
 *
 * @author Radu Sebastian LAZIN
 */
@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long>, QueryDslPredicateExecutor<Product> {

}
