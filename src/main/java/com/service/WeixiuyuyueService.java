package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiuyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiuyuyueView;


/**
 * 维修预约
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface WeixiuyuyueService extends IService<WeixiuyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuyuyueVO> selectListVO(Wrapper<WeixiuyuyueEntity> wrapper);
   	
   	WeixiuyuyueVO selectVO(@Param("ew") Wrapper<WeixiuyuyueEntity> wrapper);
   	
   	List<WeixiuyuyueView> selectListView(Wrapper<WeixiuyuyueEntity> wrapper);
   	
   	WeixiuyuyueView selectView(@Param("ew") Wrapper<WeixiuyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuyuyueEntity> wrapper);
   	
}

