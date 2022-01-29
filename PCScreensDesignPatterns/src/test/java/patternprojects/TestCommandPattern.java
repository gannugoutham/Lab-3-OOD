package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import com.designpattern.CommandDesignPattern.Command;
import com.designpattern.CommandDesignPattern.DisplayReceiver;
import com.designpattern.CommandDesignPattern.RemoteInvoker;
import com.designpattern.CommandDesignPattern.ScreenOffCommand;
import com.designpattern.CommandDesignPattern.ScreenOnCommand;


class TestCommandPattern {

	@Test
	void testPCScreen() {
		 RemoteInvoker invoker = new RemoteInvoker();
		    DisplayReceiver disp = new DisplayReceiver();
		    Command lightsOn = new ScreenOnCommand(disp);
		    Command lightsOff = new ScreenOffCommand(disp);

		    
		    invoker.setCommand(lightsOn);
		    invoker.pressButton();


		    invoker.setCommand(lightsOff);
		    invoker.pressButton();
		 
		 //Invoker invokes command 
		 assertEquals(false, invoker.pressButton());
	}
	
	

}
