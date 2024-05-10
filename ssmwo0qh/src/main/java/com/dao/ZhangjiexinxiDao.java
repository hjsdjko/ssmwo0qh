package com.dao;

import com.entity.ZhangjiexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhangjiexinxiVO;
import com.entity.view.ZhangjiexinxiView;


/**
 * 章节信息
 * 
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
public interface ZhangjiexinxiDao extends BaseMapper<ZhangjiexinxiEntity> {
	
	List<ZhangjiexinxiVO> selectListVO(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
	
	ZhangjiexinxiVO selectVO(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
	
	List<ZhangjiexinxiView> selectListView(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);

	List<ZhangjiexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
	
	ZhangjiexinxiView selectView(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
	
}
