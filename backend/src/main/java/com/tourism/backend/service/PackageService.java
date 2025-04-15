package com.tourism.backend.service;

import com.tourism.backend.entity.Package;
import java.util.List;
import java.util.Optional;

public interface PackageService {
    List<Package> getAllPackages();

    Optional<Package> getPackageById(int packageId);

    Package savePackage(Package tourpackage);

    void deletePackage(int packageId);
}
