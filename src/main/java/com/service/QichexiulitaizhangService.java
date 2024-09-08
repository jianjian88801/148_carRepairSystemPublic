package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichexiulitaizhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichexiulitaizhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichexiulitaizhangView;


/**
 * 汽车修理台账
 *
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public interface QichexiulitaizhangService extends IService<QichexiulitaizhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichexiulitaizhangVO> selectListVO(Wrapper<QichexiulitaizhangEntity> wrapper);
   	
   	QichexiulitaizhangVO selectVO(@Param("ew") Wrapper<QichexiulitaizhangEntity> wrapper);
   	
   	List<QichexiulitaizhangView> selectListView(Wrapper<QichexiulitaizhangEntity> wrapper);
   	
   	QichexiulitaizhangView selectView(@Param("ew") Wrapper<QichexiulitaizhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichexiulitaizhangEntity> wrapper);
   	
}

