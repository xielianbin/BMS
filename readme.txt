
	工作纪要:
		6月23号、写系统设置菜单里的改用户名和用户密码(已完成)，写好登录界面的登录按钮的功能(已完成),写好查询界面的搜索按钮的事件处理器(已完成)


	初始登录输入账户与密码:账户:steve 密码:123

数据库设计:
	1.用户表
		create table customer (
			id int(20) auto_increment,
			name varchar(50),
			password varchar(50),
			primary key(id)
			) DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
	2.书籍表
		图书编号、图书名、作者、出版社、所属分类、发布时间、图书ISBN、价格、类容简介、
		
		图书名、作者、发布时间、
		出版社、价格、图书ISBN、
		所属分类、
		类容简介、
		作者简介
		图书编号、图书名、作者、作者简介、出版社、所属分类、发布时间、图书ISBN、价格、类容简介、
		
		create table book(
			id int(20) auto_increment,
			name varchar(50),
			author varchar(50),
			authors varchar(50),
			publish varchar(50),
			bookclass varchar(50),
			time varchar(50),
			isbn varchar(50),
			price double(20,2),
			content varchar(500),
			primary key(id)
			) DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
			
			
	