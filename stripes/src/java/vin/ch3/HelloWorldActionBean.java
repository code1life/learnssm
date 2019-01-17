package vin.ch3;

import net.sourceforge.stripes.action.*;

public class HelloWorldActionBean implements ActionBean {
    private ActionBeanContext actionBeanContext;
    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setContext(ActionBeanContext context) {
        this.actionBeanContext = context;
    }

    @Override
    public ActionBeanContext getContext() {
        return actionBeanContext;
    }

    @DefaultHandler
    public Resolution sayHello(){
        message="Hello World ~ from sayHello()";
        return new ForwardResolution("/jsp/ch3/helloworld.jsp");
    }
}
