package guru.springframework.controllers;

import guru.springframework.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 1/20/16.
 */
@Controller
public class IndexController {

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    private ProductService productService;

    @Autowired
    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"/", "index"})
    public String getIndex(Model model){

        log.info("Loading products");
        model.addAttribute("products", productService.listProducts());

        return "index";
    }

}
