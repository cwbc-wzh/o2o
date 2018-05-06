package com.atwzh.o2o.service;

import java.util.List;


import com.atwzh.o2o.entity.ShopCategory;

public interface ShopCategoryService {
	
	List<ShopCategory> queryShopCategory(ShopCategory shopCategoryCondition);

	
}
