package com.taotao.admin.service;

import java.util.List;

import com.taotao.admin.pojo.ItemCat;

public interface ItemCatService {
	
	//分页查询
	List<ItemCat>findItemCatByPage(Integer page, Integer rows);
}
