package com.entity.view;

import com.entity.ShuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 书城
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
@TableName("shucheng")
public class ShuchengView  extends ShuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuchengView(){
	}
 
 	public ShuchengView(ShuchengEntity shuchengEntity){
 	try {
			BeanUtils.copyProperties(this, shuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
