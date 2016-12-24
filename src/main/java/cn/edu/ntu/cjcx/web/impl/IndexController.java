package cn.edu.ntu.cjcx.web.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ntu.cjcx.web.IIndexController;

@Controller
public class IndexController implements IIndexController {

	@Override
	@RequestMapping(value="/index.html")
	public String index() {
		return "index";
	}

}
