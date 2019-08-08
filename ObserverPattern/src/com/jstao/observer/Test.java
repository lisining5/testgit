package com.jstao.observer;

/**
 * 测试类
 * @author jstao
 * 详细解析见： https://www.cnblogs.com/luohanguo/p/7825656.html
 */
public class Test {
	
	public static void main(String[] args) {
	    WechatServer server = new WechatServer();
		
		Observer userZhang = new User("ZhangSan");
		Observer userLi = new User("LiSi");
		Observer userWang = new User("WangWu");
		
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInfomation("PHP是世界上最好用的语言！");
		
		System.out.println("----------------------------------------------");
		server.removeObserver(userZhang);
		server.setInfomation("JAVA是世界上最好用的语言！");
		System.out.println("----------------------------------------------");
		
	}
}
