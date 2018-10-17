package blog.controller;

import blog.service.IUserService;
import core.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * create by Liujishuai on 2015年9月21日
 */
@Controller
@RequestMapping("/test6")
public class Test6Controller extends BaseController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/test6", method = RequestMethod.GET)
	public String getByController(String id) {
		return "hello";
	}


}
