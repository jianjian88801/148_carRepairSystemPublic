package com.entity.view;

import com.entity.PeijianleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配件类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
@TableName("peijianleixing")
public class PeijianleixingView  extends PeijianleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeijianleixingView(){
	}
 
 	public PeijianleixingView(PeijianleixingEntity peijianleixingEntity){
 	try {
			BeanUtils.copyProperties(this, peijianleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
