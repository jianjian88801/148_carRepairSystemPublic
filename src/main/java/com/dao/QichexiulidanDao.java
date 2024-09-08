package com.dao;

import com.entity.QichexiulidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichexiulidanVO;
import com.entity.view.QichexiulidanView;


/**
 * 汽车修理单
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface QichexiulidanDao extends BaseMapper<QichexiulidanEntity> {
	
	List<QichexiulidanVO> selectListVO(@Param("ew") Wrapper<QichexiulidanEntity> wrapper);
	
	QichexiulidanVO selectVO(@Param("ew") Wrapper<QichexiulidanEntity> wrapper);
	
	List<QichexiulidanView> selectListView(@Param("ew") Wrapper<QichexiulidanEntity> wrapper);

	List<QichexiulidanView> selectListView(Pagination page,@Param("ew") Wrapper<QichexiulidanEntity> wrapper);
	
	QichexiulidanView selectView(@Param("ew") Wrapper<QichexiulidanEntity> wrapper);
	
}
