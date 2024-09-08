package com.dao;

import com.entity.QichexiulitaizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichexiulitaizhangVO;
import com.entity.view.QichexiulitaizhangView;


/**
 * 汽车修理台账
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface QichexiulitaizhangDao extends BaseMapper<QichexiulitaizhangEntity> {
	
	List<QichexiulitaizhangVO> selectListVO(@Param("ew") Wrapper<QichexiulitaizhangEntity> wrapper);
	
	QichexiulitaizhangVO selectVO(@Param("ew") Wrapper<QichexiulitaizhangEntity> wrapper);
	
	List<QichexiulitaizhangView> selectListView(@Param("ew") Wrapper<QichexiulitaizhangEntity> wrapper);

	List<QichexiulitaizhangView> selectListView(Pagination page,@Param("ew") Wrapper<QichexiulitaizhangEntity> wrapper);
	
	QichexiulitaizhangView selectView(@Param("ew") Wrapper<QichexiulitaizhangEntity> wrapper);
	
}
