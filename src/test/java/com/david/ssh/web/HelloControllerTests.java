package com.david.ssh.web;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase {
	public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
//        assertEquals("hello.jsp", modelAndView.getViewName());
        assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
