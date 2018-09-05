package com.jyd.multi.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jyd.multi.bean.User;
import com.jyd.multi.dao.UserDAO;
import com.jyd.multi.exception.CreateException;

@Repository
public class UserDAOImpl extends HibernateBaseTemplate<User> implements UserDAO {
	@Override
	public void save(User user) throws CreateException {
		add(user);
	}

}
