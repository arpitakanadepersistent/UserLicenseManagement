package com.example.UserLicense;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.UserLicense.controller.UserLicenseController;
import com.example.UserLicense.entity.UserLicense;
//import com.example.user;
import com.example.UserLicense.repository.UserLicenseRepository;
import com.example.UserLicense.service.UserLicenseService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UsersLicenseApplicationTests {

	@Mock
	private UserLicenseRepository userLicenseRepository;
	@InjectMocks
	private UserLicenseService userLicenseService;
//	@DisplayName("JUnit test for saveUser method")
//	@Test
//	public void test_saveUser(){
//		UserLicense userLicense = new UserLicense(1L,"first_key_1");
//		when(userLicenseRepository.save(userLicense)).thenReturn(userLicense);
//		assertEquals(userLicense, userLicenseService.saveUserLicense(userLicense));
//	}

//	@DisplayName("JUnit test for deleteUserById method")
//	@Test
//	public void testDeleteUser() {
//		Long userId=1L;
//		userLicenseService.deleteUserById(userId);
//		verify(userLicenseRepository,times(1)).deleteById(userId);
//	}

//	@Test
//	public void getUserByIdTest() {
//		long userId = 5L;
//		UserLicense userLicense = new UserLicense(1L,"first_key_1");
//		userLicense.setUserId(5L);
//		when(userLicenseService.findUserById(userId)).thenReturn(userId);
//		UserLicense use = UserLicenseController.findUserById(userId);
//		assertEquals(userId, use.getUserId());
//	}


}