package com.raduking.vs.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import com.raduking.vs.domain.entity.Product;
import com.raduking.vs.domain.entity.QProduct;
import com.raduking.vs.repository.ProductRepository;
import com.raduking.vs.service.filter.PredicateFactory;

/**
 * Service for handling Products.
 * 
 * @author Radu Sebastian LAZIN
 */
@Component
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	PredicateFactory predicateFactory;

	public Product createProduct(final Product did) {
		getProductRepository().save(did);
		return did;
	}

	public List<Product> retrieveProducts() {
		final Iterable<Product> dids = getProductRepository().findAll();
		return Lists.newArrayList(dids);
	}

	public List<Product> retrieveDIDs(final String filter) {
		Objects.requireNonNull(filter);
		final QProduct qProduct = QProduct.product;
		final Predicate predicate = filter.isEmpty() ? qProduct.id.isNotNull() : getPredicateFactory().getPredicate(filter);
		final Iterable<Product> dids = getProductRepository().findAll(predicate);
		return Lists.newArrayList(dids);
	}

	@VisibleForTesting
	protected ProductRepository getProductRepository() {
		return productRepository;
	}

	@VisibleForTesting
	protected PredicateFactory getPredicateFactory() {
		return predicateFactory;
	}

}
