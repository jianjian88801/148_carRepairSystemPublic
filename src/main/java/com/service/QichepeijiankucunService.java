package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichepeijiankucunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichepeijiankucunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichepeijiankucunView;


/**
 * 汽车配件库存
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface QichepeijiankucunService extends IService<QichepeijiankucunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichepeijiankucunVO> selectListVO(Wrapper<QichepeijiankucunEntity> wrapper);
   	
   	QichepeijiankucunVO selectVO(@Param("ew") Wrapper<QichepeijiankucunEntity> wrapper);
   	
   	List<QichepeijiankucunView> selectListView(Wrapper<QichepeijiankucunEntity> wrapper);
   	
   	QichepeijiankucunView selectView(@Param("ew") Wrapper<QichepeijiankucunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichepeijiankucunEntity> wrapper);
   	
}

