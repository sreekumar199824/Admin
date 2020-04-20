package com.capgemini.admin.dao;

import java.util.List;

import com.capgemini.admin.dto.UserInfoBean;


public interface AdminDAO {
	public boolean updateManufacturerDetails(UserInfoBean manufacturer);
	public List<UserInfoBean> getAllManufacturersDetails();
	public boolean removeManufacturer(int userId);
}
