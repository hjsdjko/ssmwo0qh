package com.entity.view;

import com.entity.YueduzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 阅读资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
@TableName("yueduzixun")
public class YueduzixunView  extends YueduzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YueduzixunView(){
	}
 
 	public YueduzixunView(YueduzixunEntity yueduzixunEntity){
 	try {
			BeanUtils.copyProperties(this, yueduzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
