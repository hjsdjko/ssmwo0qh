package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhangjiexinxiEntity;
import com.entity.view.ZhangjiexinxiView;

import com.service.ZhangjiexinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 章节信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 17:26:39
 */
@RestController
@RequestMapping("/zhangjiexinxi")
public class ZhangjiexinxiController {
    @Autowired
    private ZhangjiexinxiService zhangjiexinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhangjiexinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhangjiexinxiEntity> ew = new EntityWrapper<ZhangjiexinxiEntity>();
		PageUtils page = zhangjiexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhangjiexinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhangjiexinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhangjiexinxiEntity> ew = new EntityWrapper<ZhangjiexinxiEntity>();
		PageUtils page = zhangjiexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhangjiexinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhangjiexinxiEntity zhangjiexinxi){
       	EntityWrapper<ZhangjiexinxiEntity> ew = new EntityWrapper<ZhangjiexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhangjiexinxi, "zhangjiexinxi")); 
        return R.ok().put("data", zhangjiexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhangjiexinxiEntity zhangjiexinxi){
        EntityWrapper< ZhangjiexinxiEntity> ew = new EntityWrapper< ZhangjiexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhangjiexinxi, "zhangjiexinxi")); 
		ZhangjiexinxiView zhangjiexinxiView =  zhangjiexinxiService.selectView(ew);
		return R.ok("查询章节信息成功").put("data", zhangjiexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhangjiexinxiEntity zhangjiexinxi = zhangjiexinxiService.selectById(id);
        return R.ok().put("data", zhangjiexinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhangjiexinxiEntity zhangjiexinxi = zhangjiexinxiService.selectById(id);
        return R.ok().put("data", zhangjiexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){
    	zhangjiexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhangjiexinxi);

        zhangjiexinxiService.insert(zhangjiexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){
    	zhangjiexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhangjiexinxi);
    	zhangjiexinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        zhangjiexinxiService.insert(zhangjiexinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhangjiexinxiEntity zhangjiexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhangjiexinxi);
        zhangjiexinxiService.updateById(zhangjiexinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhangjiexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhangjiexinxiEntity> wrapper = new EntityWrapper<ZhangjiexinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhangjiexinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
