package vin.ch10;

import net.sourceforge.stripes.action.*;
import vin.common.BaseActionBean;

import javax.servlet.http.HttpServletResponse;
import java.io.StringReader;

@UrlBinding("/action/otherresolutions")
public class OtherResolutionActionBean extends BaseActionBean {

    private static String message; //Be very careful when using static fields.
    private String whichResolution = "";

    @DefaultHandler
    @HandlesEvent("forwardresolution")
    public Resolution forwardResolution() {
        return new ForwardResolution("/jsp/ch10/resolutions.jsp"); //We've seen this before
    }

    @HandlesEvent("simpleredirectresolution")
    public Resolution simpleRedirectResolution() {
        message = "Simple RedirectResolution was executed";
        return new RedirectResolution(OtherResolutionActionBean.class); //Will execute @DefaultHandler
    }

    @HandlesEvent("complexredirectresolution")
    public Resolution complexRedirectResolution() {

        if ("withEvent".equals(whichResolution)) {
            message = "RedirectResolution With Specified Event was executed";
            return new RedirectResolution(OtherResolutionActionBean.class, "forwardresolution");  //(Class, event)

        } else if ("addParameter".equals(whichResolution)) {
            message = "RedirectResolution With Add Parameter was executed";
            return new RedirectResolution(OtherResolutionActionBean.class).addParameter("someParam", "myValue"); //Added as GET params to the URL.
            //.addParameter("someParam2", "myValue"); //These can be chained

        } else if ("includeRequestParameters".equals(whichResolution)) {
            message = "RedirectResolution With includeRequestParameters was executed";
            return new RedirectResolution(OtherResolutionActionBean.class).includeRequestParameters(true); //Add all existing params to the URL
        } else if ("setPermanent".equals(whichResolution)) {
            message = "RedirectResolution With setPermanent(true) was executed";
            return new RedirectResolution(OtherResolutionActionBean.class).setPermanent(true); //Returns a 301 (Permanet move -- which browsers will remember), instead of a 302 (temporary move)

        } else {
            return new ErrorResolution(500, "Invalid resolution String [" + whichResolution + "]");

        }

    }

    @HandlesEvent("error1")
    public Resolution errorResolutionOne(){
        return new ErrorResolution(404, "Page not found");
    }

    @HandlesEvent("error2")
    public Resolution errorResolutionTwo(){
        return new ErrorResolution(500, "Database connection failure");
    }

    @HandlesEvent("error3")
    public Resolution errorResolutionThee(){
        return new ErrorResolution(503, "Website down for maintenance");
    }

    @HandlesEvent("simplestreamingresolution")
    public Resolution simpleStreamingResolution(){
        String str = "Simple text";
        return new StreamingResolution("text", new StringReader(str));
    }

    @HandlesEvent("ajaxresponsestreamingresolution")
    public Resolution ajaxResponseStreamingResolution(){
        return new StreamingResolution("text", new StringReader("ajax response from server"));
    }

    @HandlesEvent("streamfilestreamingresolution")
    public Resolution streamFileStreamingResolution(){
        return new StreamingResolution("text/plain") {
            @Override
            public void stream(HttpServletResponse response) throws Exception {
                response.getWriter().write("READ ME\n");
                response.getWriter().write("=======\n");
                response.getWriter().write("Some important info...\n");
            }
        }.setFilename("readme.txt");
    }

    // <editor-fold desc="Getters and Setters...">
    public String getWhichResolution() {
        return whichResolution;
    }

    public void setWhichResolution(String whichResolution) {
        this.whichResolution = whichResolution;
    }

    public String getMessage() {
        return OtherResolutionActionBean.message;
    }

    public void setMessage(String message) {
        OtherResolutionActionBean.message = message;
    }
    // </editor-fold>

}
