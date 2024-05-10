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


import com.dao.ShuchengDao;
import com.entity.ShuchengEntity;
import com.service.ShuchengService;
import com.entity.vo.ShuchengVO;
import com.entity.view.ShuchengView;

@Service("shuchengService")
public class ShuchengServiceImpl extends ServiceImpl<ShuchengDao, ShuchengEntity> implements ShuchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuchengEntity> page = this.selectPage(
                new Query<ShuchengEntity>(params).getPage(),
                new EntityWrapper<ShuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuchengEntity> wrapper) {
		  Page<ShuchengView> page =new Query<ShuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuchengVO> selectListVO(Wrapper<ShuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuchengVO selectVO(Wrapper<ShuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuchengView> selectListView(Wrapper<ShuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuchengView selectView(Wrapper<ShuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
