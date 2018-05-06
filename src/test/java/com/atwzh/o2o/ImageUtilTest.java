package com.atwzh.o2o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

import com.atwzh.o2o.util.ImageUtil;
import com.atwzh.o2o.util.PathUtil;

public class ImageUtilTest {
	
	
	@Test
	public void fun() throws FileNotFoundException {
		File shopImg = new File("F:/AABB/chaozaiji3.jpg");
		String dest = PathUtil.getShopImagePath(1);
		InputStream is = new FileInputStream(shopImg);
		String shopImgAddr = ImageUtil.generateThumbnail(is,shopImg.getName(), dest);
		System.out.println(dest + " : " +shopImgAddr);
	}
	
	
	
	
	
}
