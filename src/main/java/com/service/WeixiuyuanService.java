package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiuyuanView;


/**
 * 维修员
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface WeixiuyuanService extends IService<WeixiuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiuyuanVO> selectListVO(Wrapper<WeixiuyuanEntity> wrapper);
   	
   	WeixiuyuanVO selectVO(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
   	
   	List<WeixiuyuanView> selectListView(Wrapper<WeixiuyuanEntity> wrapper);
   	
   	WeixiuyuanView selectView(@Param("ew") Wrapper<WeixiuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiuyuanEntity> wrapper);
   	
}

