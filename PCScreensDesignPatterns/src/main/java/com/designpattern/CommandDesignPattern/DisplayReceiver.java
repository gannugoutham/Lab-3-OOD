package com.designpattern.CommandDesignPattern;

public class DisplayReceiver {
	 private boolean disc;
	  public boolean screenOn(){
	    disc = true;
	    return disc;
	  }
	  public boolean screenOff(){
	    disc = false;
	    return disc;
	  }
}
