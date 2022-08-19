package com.example.UserLicense.Feign;

import com.example.UserLicense.LicenseStatus;
import com.example.UserLicense.Order;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name="ORDER-MANAGEMENT")
public interface OrderFeignClient {

    @GetMapping("/api/v1/orders/")
    public List<Order> listAll();

    @GetMapping("/api/v1/licenses/{licenseId}")
    public List<LicenseStatus> getLicenseById(@PathVariable long licenseId);

    @PutMapping("/api/v1/license_keys/{licenseKey}")
    public LicenseStatus updateStatus(@PathVariable String licenseKey);

}