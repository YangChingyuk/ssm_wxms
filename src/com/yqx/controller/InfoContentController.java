package com.yqx.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqx.entity.InfoContent;
import com.yqx.service.InfoContentService;
import com.yqx.util.GetIDTool;
import com.yqx.vo.InfoContentVO;

@RequestMapping("/InfoContent")
@Controller
public class InfoContentController {
	
	@Resource
	private InfoContentService infoContentService;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@RequestMapping("/add")
	public void add(InfoContent t) {
		PrintWriter out = null;
		JSONObject jo = new JSONObject();
		try {
			out = response.getWriter();
			t.setId(GetIDTool.getUUID());
			infoContentService.add(t);
			jo.put("state", 0);
			jo.put("msg", "新增信息成功");
		} catch (IOException e) {
			jo.put("state", -1);
			jo.put("msg", "新增信息失败");
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	
	@RequestMapping("/deleteMore")
	public void deleteMore(String ids) {
		PrintWriter out = null;
		JSONObject jo = new JSONObject();
		try {
			out = response.getWriter();
			infoContentService.deleteMore(InfoContent.class, ids);
			jo.put("state", 0);
			jo.put("msg", "删除信息成功");
		} catch (IOException e) {
			jo.put("state", -1);
			jo.put("msg", "删除信息失败");
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	
	@RequestMapping("/update")
	public void update(InfoContent t) {
		PrintWriter out = null;
		JSONObject jo = new JSONObject();
		try {
			out = response.getWriter();
			infoContentService.update(t);
			jo.put("state", 0);
			jo.put("msg", "更新信息成功");
		} catch (IOException e) {
			jo.put("state", -1);
			jo.put("msg", "更新信息失败");
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	
	@RequestMapping("/queryById")
	@ResponseBody
	public InfoContent queryById(int id,String page,Map<String,Object> map) {
		InfoContent t = infoContentService.queryById(InfoContent.class, id);
		map.put("page", page);
		map.put("InfoContent", t);
		return t;
	}
	
	@RequestMapping("/queryByPage")
	public void queryByPage(String page) throws Exception {
		String rows = request.getParameter("rows");
		
		int sp = 1;
		int totals = infoContentService.getTotals(InfoContent.class);
		int pageSize = Integer.parseInt(rows);
		int pageCounts = totals / pageSize;
		if(totals % pageSize !=0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(page);
		}catch(Exception e) {
			sp = 1;
		}
		if(sp > pageCounts) {
			sp = pageCounts;
		}
		if(sp < 1) {
			sp = 1;
		}
		List<InfoContentVO> list = infoContentService.queryViewByPage(sp, pageSize);
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		jo.put("total", totals);
		jo.put("rows", list);
		String json = JSON.toJSONString(jo);
		out.write(json);
		out.flush();
		out.close();
	}
	
	/*
	 * 处理参数为日期格式
	 * */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder){
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
	            true));
	}
	
	@ModelAttribute
	public void setRequestAndResponse(HttpServletRequest request,HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.response.setContentType("text/html;charset=utf-8");
	}
}
