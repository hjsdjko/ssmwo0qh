package com.dao;

import com.entity.TushudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushudingdanVO;
import com.entity.view.TushudingdanView;


/**
 * 图书订单
 * 
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
public interface TushudingdanDao extends BaseMapper<TushudingdanEntity> {
	
	List<TushudingdanVO> selectListVO(@Param("ew") Wrapper<TushudingdanEntity> wrapper);
	
	TushudingdanVO selectVO(@Param("ew") Wrapper<TushudingdanEntity> wrapper);
	
	List<TushudingdanView> selectListView(@Param("ew") Wrapper<TushudingdanEntity> wrapper);

	List<TushudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<TushudingdanEntity> wrapper);
	
	TushudingdanView selectView(@Param("ew") Wrapper<TushudingdanEntity> wrapper);
	
}
