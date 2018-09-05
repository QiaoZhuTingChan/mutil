package com.jyd.multi.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jyd.multi.bean.ViewLog;
import com.jyd.multi.dao.ViewLogDAO;
import com.jyd.multi.exception.CreateException;

@Repository
public class ViewLogDAOImpl extends HibernateBaseTemplate<ViewLog> implements ViewLogDAO{
	@Autowired
    @Qualifier("sessionFactory_B")
	public void ViewLogDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
	@Override
	public void save(ViewLog viewLog)  throws CreateException{
		add(viewLog);		
	}

}
