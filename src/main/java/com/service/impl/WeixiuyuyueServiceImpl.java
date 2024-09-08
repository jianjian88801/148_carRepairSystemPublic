package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WeixiuyuyueDao;
import com.entity.WeixiuyuyueEntity;
import com.service.WeixiuyuyueService;
import com.entity.vo.WeixiuyuyueVO;
import com.entity.view.WeixiuyuyueView;

@Service("weixiuyuyueService")
public class WeixiuyuyueServiceImpl extends ServiceImpl<WeixiuyuyueDao, WeixiuyuyueEntity> implements WeixiuyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiuyuyueEntity> page = this.selectPage(
                new Query<WeixiuyuyueEntity>(params).getPage(),
                new EntityWrapper<WeixiuyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiuyuyueEntity> wrapper) {
		  Page<WeixiuyuyueView> page =new Query<WeixiuyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiuyuyueVO> selectListVO(Wrapper<WeixiuyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiuyuyueVO selectVO(Wrapper<WeixiuyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiuyuyueView> selectListView(Wrapper<WeixiuyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiuyuyueView selectView(Wrapper<WeixiuyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
