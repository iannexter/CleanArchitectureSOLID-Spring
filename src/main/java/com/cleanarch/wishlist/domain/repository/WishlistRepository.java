package com.cleanarch.wishlist.domain.repository;

import com.cleanarch.wishlist.domain.entity.Wishlist;

import java.util.Optional;

public interface WishlistRepository {

    //buscar pelo id do cliente
    //retorna uma WishList
    //para evitar retornos nulos, usa o Optional
    Optional<Wishlist> findByCustomerID(String customerID);

    //salvar lista de desejos
    void save(Wishlist wishlist);

}
