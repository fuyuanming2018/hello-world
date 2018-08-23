package com.fy.springTransaction.dao;

import java.util.List;
import java.util.Map;

import com.fy.springTransaction.domain.Test;

public interface TestDao {
	 List<Test> findDate(Map<String,Object> parm);

	void add(Test test);
}
