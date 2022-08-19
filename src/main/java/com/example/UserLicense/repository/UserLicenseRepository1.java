package com.example.UserLicense.repository;

import com.example.UserLicense.entity.UserLicense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLicenseRepository1 extends JpaRepository<UserLicense, Long> {


    void deleteById(Long userId);
}
