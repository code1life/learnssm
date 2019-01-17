package vin.ch3;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import vin.common.BaseActionBean;

public class ShorterHelloWorldActionBean extends BaseActionBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //@DefaultHandler 注释掉也可以
    public Resolution sayHello(){
        message = "Hello World";
        return new ForwardResolution("/jsp/ch3/helloworld.jsp");
    }
}

//默认的访问URL格式
//http://<server>:<port>/<context_root>/<actionbean_package>/<actionbean_/name(with "ActionBean" removed from the end)>.action
//http://localhost:8080/stripes_war_exploded/vin/ch3/ShorterHelloWorld.action