package com.example.UserLicense.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLicense {

    @Id
    String licenseKey;
    Long userId;
    String status;
//    public UserLicense(Long userId,String licenseKey){
//
//
//    }
//
//    @Id
////    @NonNull
//    private Long userId;
//    public void setUserId(Long userId){
//
//        this.userId=userId;
//    }
//    public Long getUserId(){
//        return userId;
//    }
//
//    @NonNull
//    private String licenseKey;
//    public void setLicenseKey(String licenseKey){
////        if(licenseKey!=null && licenseKey.isEmpty()){
////            licenseKey = null;
////        }
//        this.licenseKey=licenseKey;
//    }
//    public String getLicenseKey(){
//        return licenseKey;
//    }
//
//    protected String status;
//    public void setStatus(String status){
////        if(licenseKey!=null && licenseKey.isEmpty()){
////            licenseKey = null;
////        }
//        this.status=status;
//    }
//    public String getStatus(){
//        return status;
//    }

}
