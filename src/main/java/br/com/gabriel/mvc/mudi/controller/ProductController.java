package br.com.gabriel.mvc.mudi.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.gabriel.mvc.mudi.dto.RequestNewProduct;
import br.com.gabriel.mvc.mudi.model.Product;
import br.com.gabriel.mvc.mudi.repository.ProductRepository;

@Controller
@RequestMapping("product")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("form")
  public String form(RequestNewProduct request) {
    return "product/form";
  }

  @PostMapping("newProduct")
  public String newProduct(@Valid RequestNewProduct request, BindingResult result) {
    if (result.hasErrors()) {
      return "product/form";
    }

    Product product = request.toProduct();

    productRepository.save(product);

    return "redirect:/home";
  }
}
