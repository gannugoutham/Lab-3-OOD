package com.designpattern.CommandDesignPattern;

public class Main {

	public static void main(String[] args) {
		 RemoteInvoker invoker = new RemoteInvoker();
		    DisplayReceiver disp = new DisplayReceiver();
		    Command lightsOn = new ScreenOnCommand(disp);
		    Command lightsOff = new ScreenOffCommand(disp);

		    
		    invoker.setCommand(lightsOn);
		    invoker.pressButton();


		    invoker.setCommand(lightsOff);
		    invoker.pressButton();

	}

}
