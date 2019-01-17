package vin.ch4;

import net.sourceforge.stripes.action.*;
import vin.common.BaseActionBean;

@UrlBinding("/action/UrlMapping")
public class URLMappingActionBean extends BaseActionBean {

    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/ch4/index.jsp");
    }

    public Resolution eventOne(){
        return new ForwardResolution("/jsp/ch4/another.jsp");
    }

    @HandlesEvent("eventtwo")
    public Resolution eventTwo(){
        return new ForwardResolution("/jsp/ch4/yetanother.jsp");
    }
}
