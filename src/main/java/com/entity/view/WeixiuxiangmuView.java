package com.entity.view;

import com.entity.WeixiuxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
@TableName("weixiuxiangmu")
public class WeixiuxiangmuView  extends WeixiuxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiuxiangmuView(){
	}
 
 	public WeixiuxiangmuView(WeixiuxiangmuEntity weixiuxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, weixiuxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
