package com.yqx.controller;

import java.io.File;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqx.entity.User;
import com.yqx.service.UserService;
import com.yqx.util.GetIDTool;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Resource
	private UserService userService;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@RequestMapping("/add")
	public void add(User s) throws Exception {
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		try {
			s.setId(GetIDTool.getUUID());
			userService.add(s);
			jo.put("state", 0);
			jo.put("msg", "成功新增记录");
		} catch (Exception e) {
			jo.put("state", -1);
			jo.put("msg", "新增记录失败" + e.getMessage());
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
		
	}

	@RequestMapping("/deleteMore")
	public void deleteMore(String ids) throws Exception {
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		try {
			userService.deleteMore(User.class,ids);
			jo.put("state", 0);
			jo.put("msg", "成功删除记录");
		} catch (Exception e) {
			jo.put("state", -1);
			jo.put("msg", "删除记录失败" + e.getMessage());
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	@RequestMapping("/update")
	public void update(User s) throws Exception {
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		try {
			userService.update(s);
			jo.put("state", 0);
			jo.put("msg", "成功修改记录");
		} catch (Exception e) {
			jo.put("state", -1);
			jo.put("msg", "修改记录失败" + e.getMessage());
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
		
	}
	@RequestMapping("/queryById")
	@ResponseBody
	public User queryById(int id,String currentPage,Map<String,Object> map) {
		String qname = request.getParameter("qname");
		String qUsername = request.getParameter("qUsername");
		String qsex = request.getParameter("qsex");
		
		User s = userService.queryById(User.class,id);
		map.put("User", s);
		map.put("currentPage", currentPage);
//		map.put("qname", qname);
//		map.put("qUsername", qUsername);
//		map.put("qsex", qsex);
		return s;
	}
	
	@RequestMapping("/queryByPage")
	public void queryByPage(String page) throws Exception {
		String qname = request.getParameter("qname");
		String qUsername = request.getParameter("qUsername");
		String qsex = request.getParameter("qsex");
		String qbeginDate = request.getParameter("qbeginDate");
		String qendDate = request.getParameter("qendDate");

		String currentPage = request.getParameter("page");
		String rows = request.getParameter("rows");

		String condition = " where 1=1 ";
		if (qname != null && !qname.equals("") && !qname.equalsIgnoreCase("null")) {
			condition += " and name like '%" + qname + "%'";
		}
		if (qUsername != null && !qUsername.equals("") && !qname.equalsIgnoreCase("null")) {
			condition += " and Username like '%" + qUsername + "%'";
		}
		if (qsex != null && !qsex.equals("") && !qsex.equals("-1") && !qname.equalsIgnoreCase("null")) {
			condition += " and sex = " + qsex;
		}
		if (qbeginDate != null && !qbeginDate.equals("")) {
			condition += " and birthday >= '" + qbeginDate + "'";
		}
		if (qendDate != null && !qendDate.equals("")) {
			condition += " and birthday <= '" + qendDate + "'";
		}

		int sp = 1;

		int totals = userService.getTotals(User.class);

		int pageSize = Integer.parseInt(rows);

		int pageCounts = totals / pageSize;
		if (totals % pageSize != 0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		} catch (Exception e) {
			sp = 1;
		}
		if (sp > pageCounts) {
			sp = pageCounts;
		}
		if (sp < 1) {
			sp = 1;
		}
		List<User> list = userService.queryByPage(User.class,sp, pageSize);

		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		jo.put("total", totals);
		jo.put("rows", list);
		String json = JSON.toJSONString(jo);
		out.write(json);
		out.flush();
		out.close();
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<User> queryAll(){
		List<User> list = userService.queryAll(User.class);
		return list;
	}
	
	//上传图片
	@RequestMapping("/uploadFile")
	public void uploadFile(@RequestParam("file") MultipartFile files[]) {
		String path = request.getServletContext().getRealPath("/upload/");
		System.out.println("文件路径:" + path);

		for (MultipartFile file : files) {
			if (!file.isEmpty()) {
				System.out.println("文件名称:" + file.getOriginalFilename());
				try {
					file.transferTo(new File(path, file.getOriginalFilename()));
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			}
		}
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