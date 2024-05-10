package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YueduzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YueduzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YueduzixunView;


/**
 * 阅读资讯
 *
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
public interface YueduzixunService extends IService<YueduzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YueduzixunVO> selectListVO(Wrapper<YueduzixunEntity> wrapper);
   	
   	YueduzixunVO selectVO(@Param("ew") Wrapper<YueduzixunEntity> wrapper);
   	
   	List<YueduzixunView> selectListView(Wrapper<YueduzixunEntity> wrapper);
   	
   	YueduzixunView selectView(@Param("ew") Wrapper<YueduzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YueduzixunEntity> wrapper);
   	
}

