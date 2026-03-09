package com.cleanarch.wishlist.application.config;

import com.cleanarch.wishlist.domain.entity.Wishlist;
import com.cleanarch.wishlist.domain.repository.WishlistRepository;
import com.cleanarch.wishlist.domain.vo.ProductId;

import java.util.HashSet;

public class WishlistUseCase {

    private final WishlistRepository wishlistRepository;

    public WishlistUseCase(WishlistRepository wishlistRepository){

        this.wishlistRepository = wishlistRepository;

    }


                                    //id do cliente
    public void addProduct(String customerId, String productId){

        //verificar se o cliente já possui uma lista de desejos já criada

        Wishlist wishlist = wishlistRepository.findByCustomerID(customerId).
                orElseGet(() -> new Wishlist(null, customerId, new HashSet<>()));


        //Todo: validar tamanho máximo da lista de desejos

        //Todo: validar se o produto já existe na lista de desejos


        //objeto set tem um metodo chamado add() para adicionar no conjunto
        wishlist.getProdutcsIds().add(new ProductId(productId));


        wishlistRepository.save(wishlist);

    }



}
