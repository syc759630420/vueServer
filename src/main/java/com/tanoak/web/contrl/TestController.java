package com.tanoak.web.contrl;

import com.tanoak.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 656443534@qq.com
 * @date 2018/6/1 20:13
 * @Desc 测试类
 */
@RestController
@CrossOrigin
public class TestController {

	@GetMapping
	public Map<String ,Object> test(){
		Map<String,Object> map = new HashMap<>(6) ;
		map.put("name","张三") ;
		map.put("年龄","14") ;
		return  map;
	}

	@PostMapping("login")
	public Map<String,Object> login(@RequestBody User user){
		Map<String,Object> map = new HashMap<>(6) ;
		if("123".equals(user.getUsername())&&"123".equals(user.getPassword())){
			map.put("flag",true) ;
			map.put("msg","登录成功") ;
			return map ;
		}
			map.put("flag","false") ;
			map.put("msg","用户名或密码错误") ;
			return map ;
	}
}
