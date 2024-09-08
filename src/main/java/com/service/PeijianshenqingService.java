package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeijianshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeijianshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeijianshenqingView;


/**
 * 配件申请
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface PeijianshenqingService extends IService<PeijianshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeijianshenqingVO> selectListVO(Wrapper<PeijianshenqingEntity> wrapper);
   	
   	PeijianshenqingVO selectVO(@Param("ew") Wrapper<PeijianshenqingEntity> wrapper);
   	
   	List<PeijianshenqingView> selectListView(Wrapper<PeijianshenqingEntity> wrapper);
   	
   	PeijianshenqingView selectView(@Param("ew") Wrapper<PeijianshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeijianshenqingEntity> wrapper);
   	
}

