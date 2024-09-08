package com.dao;

import com.entity.WeixiuxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiuxiangmuVO;
import com.entity.view.WeixiuxiangmuView;


/**
 * 维修项目
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface WeixiuxiangmuDao extends BaseMapper<WeixiuxiangmuEntity> {
	
	List<WeixiuxiangmuVO> selectListVO(@Param("ew") Wrapper<WeixiuxiangmuEntity> wrapper);
	
	WeixiuxiangmuVO selectVO(@Param("ew") Wrapper<WeixiuxiangmuEntity> wrapper);
	
	List<WeixiuxiangmuView> selectListView(@Param("ew") Wrapper<WeixiuxiangmuEntity> wrapper);

	List<WeixiuxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuxiangmuEntity> wrapper);
	
	WeixiuxiangmuView selectView(@Param("ew") Wrapper<WeixiuxiangmuEntity> wrapper);
	
}
