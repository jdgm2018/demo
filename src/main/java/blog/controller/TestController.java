package blog.controller;

import blog.dao.Role;
import blog.dao.User;
import blog.dto.input.UserEditDetails;
import blog.dto.output.UserDetails;
import blog.service.IUserService;
import core.ajaxResult.AjaxResult;
import core.controller.BaseController;
import core.exception.MyException;
import core.utils.MD5Util;
import core.utils.StringUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 
 * create by Liujishuai on 2015年9月21日
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getByController(String id) {
		return "hello";
	}


}
