package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeijianleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeijianleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeijianleixingView;


/**
 * 配件类型
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface PeijianleixingService extends IService<PeijianleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeijianleixingVO> selectListVO(Wrapper<PeijianleixingEntity> wrapper);
   	
   	PeijianleixingVO selectVO(@Param("ew") Wrapper<PeijianleixingEntity> wrapper);
   	
   	List<PeijianleixingView> selectListView(Wrapper<PeijianleixingEntity> wrapper);
   	
   	PeijianleixingView selectView(@Param("ew") Wrapper<PeijianleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeijianleixingEntity> wrapper);
   	
}

