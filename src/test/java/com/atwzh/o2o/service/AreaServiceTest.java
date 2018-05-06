package com.atwzh.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.atwzh.o2o.BaseTest;
import com.atwzh.o2o.entity.Area;

public class AreaServiceTest extends BaseTest{
	
	@Autowired
	private AreaService areaService;
	
	@Test
	public void testAreaService(){
		List<Area> listArea = areaService.queryArea();
		assertEquals("西苑", listArea.get(0).getAreaName());
	}
	
}
