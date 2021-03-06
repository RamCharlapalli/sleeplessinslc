package com.welflex.example.productgateway.dto;

import java.util.List;

import com.google.common.collect.Lists;

public class Product {
  private Long productId;

  private String description;

  private String imageUrl;

  private List<ProductOption> options = Lists.newArrayList();

  private List<String> reviews = Lists.newArrayList();

  private Double price;

  public Product() {
  }

  public ProductOption getOption(Long optionId) {
	for (ProductOption o : options) {
	  if (optionId.equals(o.getProductId())) {
		return o;
	  }
	}
	return null;
  }

  /**
   * Product's inventory is a sum of inventory of options
   */
  public int getInventory() {
	int inventory = 0;
	for (ProductOption o : options) {
	  inventory += o.getInventory();
	}
	return inventory;
  }

  public List<String> getReviews() {
	return reviews;
  }

  public Double getPrice() {
	return price;
  }

  public void setReviews(List<String> reviews) {
	this.reviews = reviews;
  }

  public Product(Long productId) {
	this.productId = productId;
  }

  public Long getProductId() {
	return productId;
  }

  public void setProductId(Long productId) {
	this.productId = productId;
  }

  public String getDescription() {
	return description;
  }

  public void setDescription(String description) {
	this.description = description;
  }

  public String getImageUrl() {
	return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
  }

  public List<ProductOption> getOptions() {
	return options;
  }

  public void addOption(ProductOption option) {
	options.add(option);
  }

  public void setOptions(List<ProductOption> options) {
	this.options = options;
  }

  public void setPrice(Double price) {
	this.price = price;
  }
  
  public void addReview(String review) {
	reviews.add(review);
  }
}
