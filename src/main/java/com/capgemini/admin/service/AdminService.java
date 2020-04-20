package com.capgemini.admin.service;

import java.util.List;

import com.capgemini.admin.dto.UserInfoBean;

public interface AdminService {
	public boolean updateManufacturerDetails(UserInfoBean manufacturer);
	public List<UserInfoBean> getAllManufacturersDetails();
	public boolean removeManufacturer(int userId);
}
