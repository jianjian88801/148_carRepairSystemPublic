package com.dao;

import com.entity.PeijianlingyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeijianlingyongVO;
import com.entity.view.PeijianlingyongView;


/**
 * 配件领用
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface PeijianlingyongDao extends BaseMapper<PeijianlingyongEntity> {
	
	List<PeijianlingyongVO> selectListVO(@Param("ew") Wrapper<PeijianlingyongEntity> wrapper);
	
	PeijianlingyongVO selectVO(@Param("ew") Wrapper<PeijianlingyongEntity> wrapper);
	
	List<PeijianlingyongView> selectListView(@Param("ew") Wrapper<PeijianlingyongEntity> wrapper);

	List<PeijianlingyongView> selectListView(Pagination page,@Param("ew") Wrapper<PeijianlingyongEntity> wrapper);
	
	PeijianlingyongView selectView(@Param("ew") Wrapper<PeijianlingyongEntity> wrapper);
	
}
