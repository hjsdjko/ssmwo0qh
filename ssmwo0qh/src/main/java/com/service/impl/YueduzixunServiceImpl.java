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


import com.dao.YueduzixunDao;
import com.entity.YueduzixunEntity;
import com.service.YueduzixunService;
import com.entity.vo.YueduzixunVO;
import com.entity.view.YueduzixunView;

@Service("yueduzixunService")
public class YueduzixunServiceImpl extends ServiceImpl<YueduzixunDao, YueduzixunEntity> implements YueduzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YueduzixunEntity> page = this.selectPage(
                new Query<YueduzixunEntity>(params).getPage(),
                new EntityWrapper<YueduzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YueduzixunEntity> wrapper) {
		  Page<YueduzixunView> page =new Query<YueduzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YueduzixunVO> selectListVO(Wrapper<YueduzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YueduzixunVO selectVO(Wrapper<YueduzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YueduzixunView> selectListView(Wrapper<YueduzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YueduzixunView selectView(Wrapper<YueduzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
