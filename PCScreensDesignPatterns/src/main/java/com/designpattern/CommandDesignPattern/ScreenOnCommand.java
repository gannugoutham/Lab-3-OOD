package com.designpattern.CommandDesignPattern;

public class ScreenOnCommand implements Command {
	DisplayReceiver disp;
	
	
	public ScreenOnCommand(DisplayReceiver disp) {
		this.disp = disp;
	}


	public boolean execute() {
		return disp.screenOn();

	}

}
