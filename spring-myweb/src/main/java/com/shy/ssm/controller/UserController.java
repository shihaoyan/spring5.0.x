package com.shy.ssm.controller;

import com.shy.ssm.MyUtils;
import com.shy.ssm.bean.User;
import com.shy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:42
 * 描述：
 */
@Controller
public class UserController {
	private final static String LOCAL_PATH = "\\static\\images\\";
	/**
	 * 用户服务接口
	 */
	@Autowired
	private UserService userService;

	@RequestMapping("/user/list")
	@ResponseBody
	public Map<String, Object> list(Model model) {
		List<User> list = userService.list();
		Map<String, Object> map = new HashMap<>();
		map.put("user", new User(1, "aaa", "aaa"));
		return map;
	}

	@RequestMapping("/user/get/{id}")
	public String get(@PathVariable Integer id, Model model) throws Exception {
		User user = userService.get(id);
		if (!user.equals("aaaa")) {
			throw new Exception();
		}
		model.addAttribute("user", user);
		return "login";
	}

	@RequestMapping("/user/add")
	public void add(User user) {
		userService.add(user);
	}

	@RequestMapping("/user/upload")
	public String upload(MultipartFile[] files, HttpServletRequest request) throws IOException {
		List<String> paths = new ArrayList<>();
		for (MultipartFile file : files) {
			String fileName = MyUtils.getRandomName(file.getOriginalFilename());
			ServletContext servletContext = request.getServletContext();
			String realPath = servletContext.getRealPath(File.separator);
			String contextPath = request.getContextPath();
			file.transferTo(new File(realPath + contextPath + LOCAL_PATH, fileName));
			paths.add(fileName);
		}
		request.setAttribute("paths",paths);

		return "forward:/index.jsp";
	}


	/**
	 * 当用户提交数据转换得时候会调用这个方法，其余时候并不会调用
	 *
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

}
