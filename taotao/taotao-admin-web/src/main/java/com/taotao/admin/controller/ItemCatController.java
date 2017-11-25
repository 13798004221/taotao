package com.taotao.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.admin.pojo.ItemCat;
import com.taotao.admin.service.ItemCatService;

@Controller
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService ;
	
	@GetMapping("/itemcat/{page}")
	@ResponseBody
	public List<ItemCat> selectItemCatByPage(@PathVariable("page") Integer page,
			@RequestParam(name="rows",defaultValue="15") Integer rows
			){
		
		try {
			return itemCatService.findItemCatByPage(page, rows);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
