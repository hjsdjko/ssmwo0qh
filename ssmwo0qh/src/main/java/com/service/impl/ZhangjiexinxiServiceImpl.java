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


import com.dao.ZhangjiexinxiDao;
import com.entity.ZhangjiexinxiEntity;
import com.service.ZhangjiexinxiService;
import com.entity.vo.ZhangjiexinxiVO;
import com.entity.view.ZhangjiexinxiView;

@Service("zhangjiexinxiService")
public class ZhangjiexinxiServiceImpl extends ServiceImpl<ZhangjiexinxiDao, ZhangjiexinxiEntity> implements ZhangjiexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhangjiexinxiEntity> page = this.selectPage(
                new Query<ZhangjiexinxiEntity>(params).getPage(),
                new EntityWrapper<ZhangjiexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhangjiexinxiEntity> wrapper) {
		  Page<ZhangjiexinxiView> page =new Query<ZhangjiexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhangjiexinxiVO> selectListVO(Wrapper<ZhangjiexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhangjiexinxiVO selectVO(Wrapper<ZhangjiexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhangjiexinxiView> selectListView(Wrapper<ZhangjiexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhangjiexinxiView selectView(Wrapper<ZhangjiexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
