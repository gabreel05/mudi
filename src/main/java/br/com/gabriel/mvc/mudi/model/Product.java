package br.com.gabriel.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String productName;
  private BigDecimal negotiatedValue;
  private LocalDate deliveryDate;
  private String productURL;
  private String imageURL;
  private String productDescription;

  @Enumerated(EnumType.STRING)
  private ProductStatus status;

  public String getProductName() {
    return this.productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getNegotiatedValue() {
    return this.negotiatedValue;
  }

  public void setNegotiatedValue(BigDecimal negotiatedValue) {
    this.negotiatedValue = negotiatedValue;
  }

  public LocalDate getDeliveryDate() {
    return this.deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public String getProductURL() {
    return this.productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
  }

  public String getImageURL() {
    return this.imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public String getProductDescription() {
    return this.productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public ProductStatus getStatus() {
    return this.status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }
}
