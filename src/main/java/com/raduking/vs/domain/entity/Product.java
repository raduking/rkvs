package com.raduking.vs.domain.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * @author Radu Sebastian LAZIN
 */
@Entity
@Table(name = "T_PRODUCT")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Product {

	/**
	 * Product ID. Generated.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Generated("SparkTools")
	private Product(final Builder builder) {
		this.id = builder.id;
	}

	/**
	 * Default constructor needed for {@link Entity}
	 */
	public Product() {
		// empty
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Creates builder to build {@link Product}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Product}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private Long id;

		private Builder() {
		}

		public Builder withId(final Long id) {
			this.id = id;
			return this;
		}

		public Product build() {
			return new Product(this);
		}
	}

}
