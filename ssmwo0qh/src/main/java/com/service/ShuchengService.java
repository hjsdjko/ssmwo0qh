package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuchengView;


/**
 * 书城
 *
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
public interface ShuchengService extends IService<ShuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuchengVO> selectListVO(Wrapper<ShuchengEntity> wrapper);
   	
   	ShuchengVO selectVO(@Param("ew") Wrapper<ShuchengEntity> wrapper);
   	
   	List<ShuchengView> selectListView(Wrapper<ShuchengEntity> wrapper);
   	
   	ShuchengView selectView(@Param("ew") Wrapper<ShuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuchengEntity> wrapper);
   	
}

