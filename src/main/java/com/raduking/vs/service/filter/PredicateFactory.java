package com.raduking.vs.service.filter;

import org.springframework.stereotype.Component;

import com.github.vineey.rql.querydsl.filter.QuerydslFilterParam;
import com.github.vineey.rql.querydsl.filter.QuerydslRsqlVisitor;
import com.querydsl.core.types.Predicate;

import cz.jirutka.rsql.parser.RSQLParser;
import cz.jirutka.rsql.parser.ast.Node;

/**
 * @author Radu Sebastian LAZIN
 */
@Component
public class PredicateFactory {

	final RSQLParser rsqlParser;

	public PredicateFactory() {
		this.rsqlParser = new RSQLParser();
	}

	public Predicate getPredicate(final String query) {
		final Node rootNode = rsqlParser.parse(query);
		final QuerydslRsqlVisitor visitor = QuerydslRsqlVisitor.getInstance();
		final QuerydslFilterParam params = FilterParam.getInstance();
		return rootNode.accept(visitor, params);
	}
}
