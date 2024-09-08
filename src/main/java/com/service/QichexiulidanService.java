package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichexiulidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichexiulidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichexiulidanView;


/**
 * 汽车修理单
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface QichexiulidanService extends IService<QichexiulidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichexiulidanVO> selectListVO(Wrapper<QichexiulidanEntity> wrapper);
   	
   	QichexiulidanVO selectVO(@Param("ew") Wrapper<QichexiulidanEntity> wrapper);
   	
   	List<QichexiulidanView> selectListView(Wrapper<QichexiulidanEntity> wrapper);
   	
   	QichexiulidanView selectView(@Param("ew") Wrapper<QichexiulidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichexiulidanEntity> wrapper);
   	
}

