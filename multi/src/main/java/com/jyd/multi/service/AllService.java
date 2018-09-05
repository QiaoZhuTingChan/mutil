package com.jyd.multi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jyd.multi.bean.User;
import com.jyd.multi.bean.ViewLog;
import com.jyd.multi.dao.UserDAO;
import com.jyd.multi.dao.ViewLogDAO;
import com.jyd.multi.exception.CreateException;

@Component("allService")
public class AllService {
	@Autowired(required = true)
	private UserDAO userDAO;
	@Autowired(required = true)
	private ViewLogDAO viewLogDAO;

	private String CNS_MANUAL_FAIL_MSG = "Test failure, and the tx should rollback here!";

//	@Transactional
	public void save(User user, ViewLog viewLog) throws CreateException {
		userDAO.save(user);
		viewLogDAO.save(viewLog);
	}
}
