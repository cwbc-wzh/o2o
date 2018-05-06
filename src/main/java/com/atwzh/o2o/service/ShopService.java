package com.atwzh.o2o.service;

import java.io.InputStream;

import com.atwzh.o2o.dto.ShopExecution;
import com.atwzh.o2o.entity.Shop;

public interface ShopService {
	ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName);
}
