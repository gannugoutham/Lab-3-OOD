package com.designpattern.FacadeDesignPattern;

public class PCScreenFacade {
	private Screen led;
	private Screen lcd;
	private Screen crt;
	
	public PCScreenFacade() {
		led = new LED();
		lcd = new LCD();
		crt = new CRT();
	}
	
	public int makeLEDScreen() {
		return led.display();
	}
	public int makeLCDScreen() {
		return lcd.display();
	}
	public int makeCRTScreen() {
		return crt.display();
	}
	
}
