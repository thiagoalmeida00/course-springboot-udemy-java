package com.aplicacaospringboot.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.aplicacaospringboot.course.entities.Order;
import com.aplicacaospringboot.course.entities.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

// tabela de associação a outras entidades
@Embeddable
public class OrderItemPk implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	@JsonIgnore
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
	
}