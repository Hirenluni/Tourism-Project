package com.tourism.backend.service;

import com.tourism.backend.entity.Package;
import com.tourism.backend.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageRepository packageRepository;

    @Override
    public List<Package> getAllPackages() {
        return packageRepository.findAll();
    }

    @Override
    public Optional<Package> getPackageById(int packageId) {
        return packageRepository.findById(packageId);
    }

    @Override
    public Package savePackage(Package tourpackage) {
        return packageRepository.save(tourpackage);
    }

    @Override
    public void deletePackage(int packageId) {
        packageRepository.deleteById(packageId);
    }
}
