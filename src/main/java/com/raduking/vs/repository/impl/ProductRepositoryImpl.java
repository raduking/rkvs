package com.raduking.vs.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.raduking.vs.domain.entity.Product;
import com.raduking.vs.repository.ProductRepository;

/**
 * Repository implementing methods on {@link DID}.
 *
 * @author Radu Sebastian LAZIN
 */
@Repository
@Transactional
public class ProductRepositoryImpl extends QueryDslJpaRepository<Product, Long> implements ProductRepository {

	@SuppressWarnings("unchecked")
	public ProductRepositoryImpl(final EntityManager em) {
		super((JpaEntityInformationSupport<Product, Long>) JpaEntityInformationSupport
				.getEntityInformation(Product.class, em), em);
	}

}
