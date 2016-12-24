package cn.edu.ntu.cjcx.web.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ntu.cjcx.web.ILoginController;

/**
 * 登录模块的控制实现层
 * @author daming
 *
 */
@Controller
public class LoginController implements ILoginController {

	@RequestMapping(value="/login.html")
	public String login() {	 
		return "/login";
	}

}
