package com.itcast.listener;

import com.itcast.view.Page;
public abstract class SuperMenu{
	//初始化当前界面
	protected Page page;
	public void setPage(Page page) {
		this.page=page;
	}
}
