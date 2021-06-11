package br.com.gabriel.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.gabriel.mvc.mudi.model.Product;
import br.com.gabriel.mvc.mudi.model.ProductStatus;
import br.com.gabriel.mvc.mudi.repository.ProductRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

  @Autowired
  ProductRepository productRepository;

  @GetMapping
  public String home(Model model) {
    List<Product> products = productRepository.findAll();
    model.addAttribute("products", products);

    return "home";
  }

  @GetMapping("/{status}")
  public String byStatus(@PathVariable("status") String status, Model model) {
    List<Product> products =
        productRepository.findByStatus(ProductStatus.valueOf(status.toUpperCase()));
    model.addAttribute("products", products);
    model.addAttribute("status", status);
    return "home";
  }

  @ExceptionHandler(IllegalArgumentException.class)
  public String onError() {
    return "redirect:/home";
  }
}
