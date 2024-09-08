package com.dao;

import com.entity.WeixiuyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiuyuyueVO;
import com.entity.view.WeixiuyuyueView;


/**
 * 维修预约
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface WeixiuyuyueDao extends BaseMapper<WeixiuyuyueEntity> {
	
	List<WeixiuyuyueVO> selectListVO(@Param("ew") Wrapper<WeixiuyuyueEntity> wrapper);
	
	WeixiuyuyueVO selectVO(@Param("ew") Wrapper<WeixiuyuyueEntity> wrapper);
	
	List<WeixiuyuyueView> selectListView(@Param("ew") Wrapper<WeixiuyuyueEntity> wrapper);

	List<WeixiuyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiuyuyueEntity> wrapper);
	
	WeixiuyuyueView selectView(@Param("ew") Wrapper<WeixiuyuyueEntity> wrapper);
	
}
