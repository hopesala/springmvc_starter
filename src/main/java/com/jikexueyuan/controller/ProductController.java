package com.jikexueyuan.controller;

import com.jikexueyuan.model.Product;
import com.jikexueyuan.model.ProductForm;
import com.jikexueyuan.service.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by caochenghua on 2017/4/23.
 */

@Controller
public class ProductController {
    private static final Log logger= LogFactory.getLog(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product_input")
    public String inputProduct() {
        logger.info("InputProductController called");
        return "ProductForm";
    }

//    public String saveProduct(ProductForm productForm, Model model) {
    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
    public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes) {
        logger.info("SaveProductController called");
//        ProductForm productForm=new ProductForm();
//        productForm.setName(httpServletRequest.getParameter("name"));
//        productForm.setDescription(httpServletRequest.getParameter("description"));
//        productForm.setPrice(httpServletRequest.getParameter("price"));

        Product product=new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        } catch (NumberFormatException e){

        }
        //model.addAttribute()
        //model.addAttribute("product",product);
        Product savedProduct=productService.add(product);
        redirectAttributes.addFlashAttribute("message","The product was successfully added.");
        return "redirect:/product_view/"+savedProduct.getId();
    }



    @RequestMapping(value = "/product_view/{id}")
    public String viewProduct(@PathVariable Long id, Model model) {
        Product product=productService.get(id);
        model.addAttribute("product",product);
        return "ProductDetails";
    }


}
