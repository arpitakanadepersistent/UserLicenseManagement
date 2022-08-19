package com.example.UserLicense.repository;

import com.example.UserLicense.entity.UserLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLicenseRepository extends JpaRepository<UserLicense, String> {

    List<UserLicense> findByUserId(Long userId);

}



