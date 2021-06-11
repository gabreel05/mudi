package br.com.gabriel.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;
import br.com.gabriel.mvc.mudi.model.Product;
import br.com.gabriel.mvc.mudi.model.ProductStatus;

public class RequestNewProduct {

  @NotBlank
  private String productName;
  @NotBlank
  private String productURL;
  @NotBlank
  private String imageURL;
  private String description;

  public String getProductName() {
    return this.productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product toProduct() {
    Product product = new Product();
    product.setProductName(productName);
    product.setProductURL(productURL);
    product.setImageURL(imageURL);
    product.setProductDescription(description);
    product.setStatus(ProductStatus.WAITING);
    return product;
  }
}
