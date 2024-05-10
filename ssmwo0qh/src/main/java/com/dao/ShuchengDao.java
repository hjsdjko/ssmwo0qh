package com.dao;

import com.entity.ShuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuchengVO;
import com.entity.view.ShuchengView;


/**
 * 书城
 * 
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
public interface ShuchengDao extends BaseMapper<ShuchengEntity> {
	
	List<ShuchengVO> selectListVO(@Param("ew") Wrapper<ShuchengEntity> wrapper);
	
	ShuchengVO selectVO(@Param("ew") Wrapper<ShuchengEntity> wrapper);
	
	List<ShuchengView> selectListView(@Param("ew") Wrapper<ShuchengEntity> wrapper);

	List<ShuchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShuchengEntity> wrapper);
	
	ShuchengView selectView(@Param("ew") Wrapper<ShuchengEntity> wrapper);
	
}
