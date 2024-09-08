package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigoujinhuodanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigoujinhuodanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigoujinhuodanView;


/**
 * 采购进货单
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface CaigoujinhuodanService extends IService<CaigoujinhuodanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigoujinhuodanVO> selectListVO(Wrapper<CaigoujinhuodanEntity> wrapper);
   	
   	CaigoujinhuodanVO selectVO(@Param("ew") Wrapper<CaigoujinhuodanEntity> wrapper);
   	
   	List<CaigoujinhuodanView> selectListView(Wrapper<CaigoujinhuodanEntity> wrapper);
   	
   	CaigoujinhuodanView selectView(@Param("ew") Wrapper<CaigoujinhuodanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigoujinhuodanEntity> wrapper);
   	
}

