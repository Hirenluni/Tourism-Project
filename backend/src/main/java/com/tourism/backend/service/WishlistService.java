package com.tourism.backend.service;

import com.tourism.backend.entity.Wishlist;
import com.tourism.backend.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public List<Wishlist> getAllWishlists() {
        return wishlistRepository.findAll();
    }

    public Wishlist saveWishlist(Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

    public Wishlist getWishlistById(Integer id) {
        return wishlistRepository.findById(id).orElse(null);
    }

    public void deleteWishlist(Integer id) {
        wishlistRepository.deleteById(id);
    }
}
