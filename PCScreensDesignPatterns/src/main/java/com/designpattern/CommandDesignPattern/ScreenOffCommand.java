package com.designpattern.CommandDesignPattern;

public class ScreenOffCommand implements Command {

	DisplayReceiver disp;


	public ScreenOffCommand(DisplayReceiver disp) {
		this.disp = disp;
	}


	public boolean execute() {
		return disp.screenOff();

	}
}
