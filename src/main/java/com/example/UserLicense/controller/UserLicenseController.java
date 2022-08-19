package com.example.UserLicense.controller;

import com.example.UserLicense.LicenseStatus;
import com.example.UserLicense.Order;
import com.example.UserLicense.entity.UserLicense;
import com.example.UserLicense.service.UserLicenseService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserLicenseController {

    @Autowired
    private UserLicenseService userLicenseService;

    @PostMapping("/api/v1/user/{userid}/licenses/{license_Id}")
    public String saveUserLicense(@PathVariable("userid") Long userId, @PathVariable("license_Id") Long licenseId) {
        log.info("Inside saveUser method of UserController");
        return userLicenseService.saveUserLicense(userId,licenseId);
    }

    @GetMapping("/{id}")
    public List<UserLicense> findUserById(@PathVariable("id") Long userId) {
        log.info("Inside findUserById method of UserController");
        return userLicenseService.findUserById(userId);
    }

    @DeleteMapping("/{licenseKey}")
    public void deleteUserById(@PathVariable("licenseKey") String licenseKey) {
        log.info("Inside deleteUserById method of UserController");
        userLicenseService.deleteUserById(licenseKey);
    }
//
//    @GetMapping("/check")
//    public List<Order> connectListOrder()
//    {
//        return userLicenseService.listOrder();
//    }
//
    @PutMapping("/{key}")
    public LicenseStatus connectListLicense(@PathVariable String key)
    {
        return userLicenseService.update(key);
    }

}