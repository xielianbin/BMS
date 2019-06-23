package com.itcast.utils;

import java.awt.Toolkit;

public class FrameCenterUtil {
	//获取电脑屏幕的宽度
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	//获取电脑屏幕的高度
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	//获取窗体居中的X
	public int getCenterX(int sizeX) {
		System.out.println("FrameCenterUtil运行中,自动获取屏幕宽度");
		return (width-sizeX)/2;
	}
	//获取窗体居中的Y
	public int getCenterY(int sizeY) {
		System.out.println("FrameCenterUtil运行中,自动获取屏幕高度");
		return (height-sizeY)/2;
	}
}
