package com.atwzh.o2o.dao;

import java.util.List;

import com.atwzh.o2o.entity.Area;

public interface AreaDao {
	/**
	 * 列出区域信息
	 * @return listArea
	 */
	public List<Area> queryArea(); 
}
