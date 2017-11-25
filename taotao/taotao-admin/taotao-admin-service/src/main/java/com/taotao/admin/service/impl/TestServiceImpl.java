package com.taotao.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.admin.mapper.TestMapper;
import com.taotao.admin.service.TestService;

/**
 * TestServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年11月22日 下午12:29:22
 * @version 1.0
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestMapper testMapper;

	@Override
	public String queryCurrentDate() {
		return testMapper.queryDate();
	}

}
