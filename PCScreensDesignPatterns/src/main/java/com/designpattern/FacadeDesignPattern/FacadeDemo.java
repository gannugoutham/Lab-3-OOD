package com.designpattern.FacadeDesignPattern;

public class FacadeDemo {

	public static void main(String[] args) {
		PCScreenFacade pcscreen = new PCScreenFacade();
		
		pcscreen.makeLCDScreen();
		pcscreen.makeLEDScreen();
		pcscreen.makeCRTScreen();

	}

}
