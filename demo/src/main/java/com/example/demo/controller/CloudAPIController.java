package com.example.demo.controller;


import com.example.demo.model.CloudVendor;

import com.example.demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIController {



 public  CloudVendorService cloudVendorService;

    public CloudAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public Optional<CloudVendor> getCloudVendorDetails( @PathVariable String vendorId){

          return cloudVendorService.getCloudVendor(vendorId);

    }

    @GetMapping
    public List<CloudVendor> getCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
    }



    @PostMapping
    public String createCloudVendorDetails( @RequestBody CloudVendor cloudVendor){
      return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody  CloudVendor cloudVendor){
      return cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails( @PathVariable  String vendorId){
       return cloudVendorService.deleteCloudVendor(vendorId);
    }
}
