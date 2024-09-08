package com.entity.view;

import com.entity.CaigoujinhuodanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 采购进货单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
@TableName("caigoujinhuodan")
public class CaigoujinhuodanView  extends CaigoujinhuodanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaigoujinhuodanView(){
	}
 
 	public CaigoujinhuodanView(CaigoujinhuodanEntity caigoujinhuodanEntity){
 	try {
			BeanUtils.copyProperties(this, caigoujinhuodanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
