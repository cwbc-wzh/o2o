package com.atwzh.o2o.dao;

import com.atwzh.o2o.entity.Shop;

public interface ShopDao {
	/**
	 * 添加店铺
	 * @return 添加店铺的id
	 * @author wzh
	 */
	int insertShop(Shop shop);
	
	/**
	 * 更新商铺信息
	 * @param shop
	 * @return
	 */
	
	int updateShop(Shop shop);
}
