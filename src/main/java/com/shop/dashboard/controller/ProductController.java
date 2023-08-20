package com.shop.dashboard.controller;

import com.products.shop.api.products.ShopApiDelegate;
import com.products.shop.model.Product;
import com.products.shop.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ShopApiDelegate {

    @Override
    public ResponseEntity<Result> saveProduct(@RequestBody Product product){
        Result result = new Result();
        return new ResponseEntity<Result>(result, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Result> listProducts(){
        return new ResponseEntity<Result>(new Result(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Result> deleteProductById(@PathVariable Integer productId) {
        System.out.println(productId);
        return new ResponseEntity<Result>(new Result(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Result> listProductById(Integer productId) {
        System.out.println(productId);
        return new ResponseEntity<Result>(new Result(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Result> updateProductById(Integer productId) {
        System.out.println("here");
        return new ResponseEntity<Result>(new Result(), HttpStatus.OK);
    }
}
