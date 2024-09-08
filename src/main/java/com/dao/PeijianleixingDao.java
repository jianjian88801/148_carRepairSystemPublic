package com.dao;

import com.entity.PeijianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeijianleixingVO;
import com.entity.view.PeijianleixingView;


/**
 * 配件类型
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface PeijianleixingDao extends BaseMapper<PeijianleixingEntity> {
	
	List<PeijianleixingVO> selectListVO(@Param("ew") Wrapper<PeijianleixingEntity> wrapper);
	
	PeijianleixingVO selectVO(@Param("ew") Wrapper<PeijianleixingEntity> wrapper);
	
	List<PeijianleixingView> selectListView(@Param("ew") Wrapper<PeijianleixingEntity> wrapper);

	List<PeijianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<PeijianleixingEntity> wrapper);
	
	PeijianleixingView selectView(@Param("ew") Wrapper<PeijianleixingEntity> wrapper);
	
}
