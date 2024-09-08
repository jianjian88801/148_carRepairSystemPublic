package com.dao;

import com.entity.CaigoujinhuodanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigoujinhuodanVO;
import com.entity.view.CaigoujinhuodanView;


/**
 * 采购进货单
 * 
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface CaigoujinhuodanDao extends BaseMapper<CaigoujinhuodanEntity> {
	
	List<CaigoujinhuodanVO> selectListVO(@Param("ew") Wrapper<CaigoujinhuodanEntity> wrapper);
	
	CaigoujinhuodanVO selectVO(@Param("ew") Wrapper<CaigoujinhuodanEntity> wrapper);
	
	List<CaigoujinhuodanView> selectListView(@Param("ew") Wrapper<CaigoujinhuodanEntity> wrapper);

	List<CaigoujinhuodanView> selectListView(Pagination page,@Param("ew") Wrapper<CaigoujinhuodanEntity> wrapper);
	
	CaigoujinhuodanView selectView(@Param("ew") Wrapper<CaigoujinhuodanEntity> wrapper);
	
}
