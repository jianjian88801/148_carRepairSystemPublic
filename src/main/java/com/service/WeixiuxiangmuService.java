package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiuxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiuxiangmuView;


/**
 * 维修项目
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface WeixiuxiangmuService extends IService<WeixiuxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuxiangmuVO> selectListVO(Wrapper<WeixiuxiangmuEntity> wrapper);
   	
   	WeixiuxiangmuVO selectVO(@Param("ew") Wrapper<WeixiuxiangmuEntity> wrapper);
   	
   	List<WeixiuxiangmuView> selectListView(Wrapper<WeixiuxiangmuEntity> wrapper);
   	
   	WeixiuxiangmuView selectView(@Param("ew") Wrapper<WeixiuxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuxiangmuEntity> wrapper);
   	
}

