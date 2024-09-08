package com.dao;

import com.entity.QichepeijiankucunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichepeijiankucunVO;
import com.entity.view.QichepeijiankucunView;


/**
 * 汽车配件库存
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface QichepeijiankucunDao extends BaseMapper<QichepeijiankucunEntity> {
	
	List<QichepeijiankucunVO> selectListVO(@Param("ew") Wrapper<QichepeijiankucunEntity> wrapper);
	
	QichepeijiankucunVO selectVO(@Param("ew") Wrapper<QichepeijiankucunEntity> wrapper);
	
	List<QichepeijiankucunView> selectListView(@Param("ew") Wrapper<QichepeijiankucunEntity> wrapper);

	List<QichepeijiankucunView> selectListView(Pagination page,@Param("ew") Wrapper<QichepeijiankucunEntity> wrapper);
	
	QichepeijiankucunView selectView(@Param("ew") Wrapper<QichepeijiankucunEntity> wrapper);
	
}
