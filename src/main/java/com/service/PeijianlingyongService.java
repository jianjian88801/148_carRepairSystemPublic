package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeijianlingyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeijianlingyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeijianlingyongView;


/**
 * 配件领用
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface PeijianlingyongService extends IService<PeijianlingyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeijianlingyongVO> selectListVO(Wrapper<PeijianlingyongEntity> wrapper);
   	
   	PeijianlingyongVO selectVO(@Param("ew") Wrapper<PeijianlingyongEntity> wrapper);
   	
   	List<PeijianlingyongView> selectListView(Wrapper<PeijianlingyongEntity> wrapper);
   	
   	PeijianlingyongView selectView(@Param("ew") Wrapper<PeijianlingyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeijianlingyongEntity> wrapper);
   	
}

