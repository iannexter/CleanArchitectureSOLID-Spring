package com.cleanarch.wishlist.domain.entity;

import com.cleanarch.wishlist.domain.vo.ProductId;

import java.util.HashSet;
import java.util.Set;

//lista de desejos
public class Wishlist {

    private String id;
                    //id do cliente
    private String customerId;

    //colecao de produtos da lista de desejos

    private Set<ProductId> produtcsIds = new HashSet<>();



    public Wishlist() {
    }

    public Wishlist(String id, String customerId, Set<ProductId> produtcsIds) {
        this.id = id;
        this.customerId = customerId;
        this.produtcsIds = produtcsIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Set<ProductId> getProdutcsIds() {
        return produtcsIds;
    }

    public void setProdutcsIds(Set<ProductId> produtcsIds) {
        this.produtcsIds = produtcsIds;
    }
}
