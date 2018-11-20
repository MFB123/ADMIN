package com.qixin.test;

public class Demo {
	
	 public static void demo1() {  // 第一次提交测试
		 System.out.println("测试1111");
		 System.out.println("测试1111");
		 System.out.println("测试1111");
		 System.out.println("小单卡手机萝莉撒达到啊啊啊");
		 System.out.println("小单卡手机萝莉撒达到啊啊啊");
		 System.out.println("小单卡手机萝莉撒达到啊啊啊");
		 System.out.println("小单卡手机萝莉撒达到啊啊啊");
		 System.out.println("小单卡手机萝莉撒达到啊啊啊");
		 System.out.println("小单卡手机萝莉撒达到啊啊啊");
		 System.out.println("小单卡手机萝莉撒达到啊啊啊");
		 System.out.println("123232132131");
	 }
	 public static void demo2() {  // 第二次提交测试
		 System.out.println("测试222");
		 System.out.println("测试222");
		 System.out.println("测试222");
		 System.out.println("小萝莉撒达到啊啊啊");
		 System.out.println("小萝莉撒达到啊啊啊");
		 System.out.println("小萝莉撒达到啊啊啊");
		 System.out.println("小萝莉撒达到啊啊啊");
		 System.out.println("小萝莉撒达到啊啊啊");
	 }
	 public static void demo3() {  // 第十次提交测试
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
		System.out.println("bittchxiang");
	 }
	 
	 public static void demo4() { // 第十一次提交测试
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
			System.out.println("bittchxiang");
	}
	 
	    @RequestMapping(value="list.do")//第十二次测试
		public String getList(@RequestParam(defaultValue="1") Integer cpage,HttpServletRequest request){
			Integer pageSize = 2;
			List<YuanGong> list = yuanGongService.getList(cpage, pageSize);
			Integer count = yuanGongService.selectCount();
			String url = "list.do";
			PageUtils.getPage(request, cpage, pageSize, count, list, url);
			return "view/list";	
		}
	  
	 
	 
	// 第二次提交测试
	// 第二次提交测试
	// 第二次提交测试
	 
	// 第二次提交测试
	 
	// 第二次提交测试
	// 第二次提交测试
	 
	// 第二次提交测试
}
