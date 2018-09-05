package com.jyd.multi.dao;

import com.jyd.multi.bean.ViewLog;
import com.jyd.multi.exception.CreateException;

public interface ViewLogDAO {
	public void save(ViewLog viewLog)  throws CreateException;
}
