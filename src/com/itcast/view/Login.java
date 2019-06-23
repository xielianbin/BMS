package com.itcast.view;

import com.itcast.utils.FrameCenterUtil;

public interface Login {
	int sizeY = 400;
	int sizeX = 500;
	int width = new FrameCenterUtil().getCenterX(sizeX);
	int height = new FrameCenterUtil().getCenterY(sizeY);
	public void init();

}
