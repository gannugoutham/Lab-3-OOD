package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.designpattern.FacadeDesignPattern.PCScreenFacade;


class TestFacadePattern {

	@Test
	void testLEDScreen() {
		PCScreenFacade pcScreen = new PCScreenFacade();

		pcScreen.makeCRTScreen();
		pcScreen.makeLCDScreen();
		pcScreen.makeLEDScreen();
		
		assertEquals(0, pcScreen.makeLEDScreen());
	}

	@Test
	void testLCDScreen() {
		PCScreenFacade pcScreen = new PCScreenFacade();

		pcScreen.makeCRTScreen();
		pcScreen.makeLCDScreen();
		pcScreen.makeLEDScreen();
		
		assertEquals(1, pcScreen.makeLCDScreen());
	}
	

	@Test
	void testCRTScreen() {
		PCScreenFacade pcScreen = new PCScreenFacade();

		pcScreen.makeCRTScreen();
		pcScreen.makeLCDScreen();
		pcScreen.makeLEDScreen();
		
		assertEquals(0, pcScreen.makeCRTScreen());
	}

}
