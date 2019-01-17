package vin.ch5;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import vin.common.BaseActionBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UrlBinding("/action/jspvariables")
public class JspExamplesActionBean extends BaseActionBean {
    private String bookTitle;
    private List<String> bookTopics = new ArrayList<>();
    private Map<String,String> chapters = new HashMap<>();

    @HandlesEvent("variable") //not required, because if annotation is missing the method name will be used.
    public Resolution variable(){
        bookTitle="Stripes by Example";
        return new ForwardResolution("/jsp/ch5/variables.jsp");
    }

    @HandlesEvent("complex")
    public Resolution complexVariables(){
        bookTopics.add("Environment Setup");
        bookTopics.add("Getting Started with Stripes");
        bookTopics.add("Form Data");
        bookTopics.add("...");

        chapters.put("ch1","Introduction");
        chapters.put("ch2","Getting Started");
        chapters.put("ch3","Action");
        chapters.put("ch4","View");

        return new ForwardResolution("/jsp/ch5/complexVariables.jsp");
    }

    //必须要get/set方法 ->否则500
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public List<String> getBookTopics() {
        return bookTopics;
    }

    public void setBookTopics(List<String> bookTopics) {
        this.bookTopics = bookTopics;
    }

    public Map<String, String> getChapters() {
        return chapters;
    }

    public void setChapters(Map<String, String> chapters) {
        this.chapters = chapters;
    }
}
