package org.junit.test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyclassJunit {
	
	@Test		
    public void myFirstMethod(){					
        String str= "JUnit is working fine";					
        assertEquals("JUnit is working fine",str);					
    }

}
