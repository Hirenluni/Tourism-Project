package com.tourism.backend.controller;

import com.tourism.backend.entity.Wishlist;
import com.tourism.backend.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public List<Wishlist> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }

    @PostMapping
    public Wishlist createWishlist(@RequestBody Wishlist wishlist) {
        return wishlistService.saveWishlist(wishlist);
    }

    @GetMapping("/{id}")
    public Wishlist getWishlistById(@PathVariable Integer id) {
        return wishlistService.getWishlistById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlist(@PathVariable Integer id) {
        wishlistService.deleteWishlist(id);
    }
}
