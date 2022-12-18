package com.ecomoda.controller;

import com.ecomoda.model.ArticleType;
import com.ecomoda.model.Cart;
import com.ecomoda.model.IdType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController("/ui")
public class UiController {

    List<Cart> cartsToProcess = new ArrayList<>();

    @RequestMapping(value="/articles",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<ArticleType> getALlArticles(){
        ArticleType articleType1 = new ArticleType("1","Camisa","100");
        ArticleType articleType2 = new ArticleType("2","Pantalon","100");
        ArticleType articleType3 = new ArticleType("3","Chaqueta","100");
        return Arrays.asList(new ArticleType[]{articleType1, articleType2, articleType3});
    }

    @RequestMapping(value="/idTypes",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<IdType> getALlIdTypes(){
        IdType idtype1 = new IdType("1","CC");
        IdType idtype2 = new IdType("2","TI");
        return Arrays.asList(new IdType[]{idtype1,idtype2});
    }


    @RequestMapping(value="/cart",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public String submitCart(@RequestBody  Cart cart) throws JsonProcessingException {
        cartsToProcess.add(cart);
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(cart);
        System.out.println("New request arrived : \n" + jsonString);
        return "La peticion fue recibida";
    }

}
