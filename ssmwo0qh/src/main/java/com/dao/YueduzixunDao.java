package com.dao;

import com.entity.YueduzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YueduzixunVO;
import com.entity.view.YueduzixunView;


/**
 * 阅读资讯
 * 
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
public interface YueduzixunDao extends BaseMapper<YueduzixunEntity> {
	
	List<YueduzixunVO> selectListVO(@Param("ew") Wrapper<YueduzixunEntity> wrapper);
	
	YueduzixunVO selectVO(@Param("ew") Wrapper<YueduzixunEntity> wrapper);
	
	List<YueduzixunView> selectListView(@Param("ew") Wrapper<YueduzixunEntity> wrapper);

	List<YueduzixunView> selectListView(Pagination page,@Param("ew") Wrapper<YueduzixunEntity> wrapper);
	
	YueduzixunView selectView(@Param("ew") Wrapper<YueduzixunEntity> wrapper);
	
}
