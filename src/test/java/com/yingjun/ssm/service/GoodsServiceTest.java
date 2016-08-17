package com.yingjun.ssm.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yingjun.ssm.entity.Goods;

/**
 *
 *@author dlf
 *@date 2016-8-17上午11:56:50
 *@version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
	                  "classpath:spring/spring-service.xml",
	                  "classpath:spring/spring-redis.xml"})
public class GoodsServiceTest {
	
	@Autowired
	private GoodsService goodsService;
	
	@Test
	public void testQueryByField(){
		List<Goods> list= goodsService.queryByField(0, 10, "帽子");
		
	}

}
