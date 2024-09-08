package com.dao;

import com.entity.PeijianshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeijianshenqingVO;
import com.entity.view.PeijianshenqingView;


/**
 * 配件申请
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface PeijianshenqingDao extends BaseMapper<PeijianshenqingEntity> {
	
	List<PeijianshenqingVO> selectListVO(@Param("ew") Wrapper<PeijianshenqingEntity> wrapper);
	
	PeijianshenqingVO selectVO(@Param("ew") Wrapper<PeijianshenqingEntity> wrapper);
	
	List<PeijianshenqingView> selectListView(@Param("ew") Wrapper<PeijianshenqingEntity> wrapper);

	List<PeijianshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<PeijianshenqingEntity> wrapper);
	
	PeijianshenqingView selectView(@Param("ew") Wrapper<PeijianshenqingEntity> wrapper);
	
}
