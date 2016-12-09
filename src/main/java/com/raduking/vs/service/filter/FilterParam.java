package com.raduking.vs.service.filter;

import com.github.vineey.rql.querydsl.filter.QuerydslFilterParam;
import com.google.common.collect.Maps;
import com.raduking.vs.domain.entity.QProduct;

/**
 * Holds the filtering parameters for the {@link DID} class. Whenever a new
 * filtering field is required, a new line in the static initializer can be
 * added with the associated field from the {@link QDID} class.
 * 
 * @author Radu Sebastian LAZIN
 */
public class FilterParam extends QuerydslFilterParam {

	public static FilterParam instance = new FilterParam();

	/**
	 * Filtering fields.
	 */
	static {
		instance.getMapping().put("id", QProduct.product.id);
	}

	public static FilterParam getInstance() {
		return instance;
	}

	private FilterParam() {
		setMapping(Maps.newHashMap());
	}
}
