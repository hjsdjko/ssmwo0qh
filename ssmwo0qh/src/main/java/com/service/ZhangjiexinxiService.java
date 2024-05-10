package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhangjiexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhangjiexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhangjiexinxiView;


/**
 * 章节信息
 *
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
public interface ZhangjiexinxiService extends IService<ZhangjiexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhangjiexinxiVO> selectListVO(Wrapper<ZhangjiexinxiEntity> wrapper);
   	
   	ZhangjiexinxiVO selectVO(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
   	
   	List<ZhangjiexinxiView> selectListView(Wrapper<ZhangjiexinxiEntity> wrapper);
   	
   	ZhangjiexinxiView selectView(@Param("ew") Wrapper<ZhangjiexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhangjiexinxiEntity> wrapper);
   	
}

