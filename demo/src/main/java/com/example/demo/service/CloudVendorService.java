package com.example.demo.service;

import com.example.demo.model.CloudVendor;

import java.util.List;
import java.util.Optional;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public Optional<CloudVendor> getCloudVendor(String vendorId);

    public List<CloudVendor> getAllCloudVendors();
}
