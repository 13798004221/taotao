package com.taotao.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.taotao.admin.mapper.ItemCatMapper;
import com.taotao.admin.pojo.ItemCat;
import com.taotao.admin.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {
	
	
	@Autowired
	private ItemCatMapper itemCatMapper;
	
	@Override
	public List<ItemCat> findItemCatByPage(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<ItemCat> list = itemCatMapper.selectAll();
		return list;
	}

}
