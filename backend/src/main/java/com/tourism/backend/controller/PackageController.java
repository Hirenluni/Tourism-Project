package com.tourism.backend.controller;

import com.tourism.backend.entity.Package;
import com.tourism.backend.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/packages")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @GetMapping
    public List<Package> getAllPackages() {
        return packageService.getAllPackages();
    }

    @PostMapping
    public Package createPackage(@RequestBody Package travelPackage) {
        return packageService.savePackage(travelPackage);
    }

    @GetMapping("/{id}")
    public Package getPackageById(@PathVariable Integer id) {
        return packageService.getPackageById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePackage(@PathVariable Integer id) {
        packageService.deletePackage(id);
    }
}
