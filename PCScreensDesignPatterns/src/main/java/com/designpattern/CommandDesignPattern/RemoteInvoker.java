package com.designpattern.CommandDesignPattern;

public class RemoteInvoker {
	 private Command command;
	  public void setCommand(Command command){
	    this.command = command;
	  }
	  public boolean pressButton(){
	    return command.execute();
	  }
}
