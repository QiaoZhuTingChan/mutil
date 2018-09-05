package com.jyd.multi.dao;

import com.jyd.multi.bean.User;
import com.jyd.multi.exception.CreateException;

public interface UserDAO {
	public void save(User user)  throws CreateException;
}
