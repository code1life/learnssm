package vin.ch6;

import net.sourceforge.stripes.action.*;
import vin.common.BaseActionBean;

@UrlBinding("/action/form")
public class FormActionBean extends BaseActionBean {
    private String dvdTitle;
    private double dvdCost;
    private String dvdGenre;
    private String message;

    public String getDvdTitle() {
        return dvdTitle;
    }

    public void setDvdTitle(String dvdTitle) {
        this.dvdTitle = dvdTitle;
    }

    public double getDvdCost() {
        return dvdCost;
    }

    public void setDvdCost(double dvdCost) {
        this.dvdCost = dvdCost;
    }

    public String getDvdGenre() {
        return dvdGenre;
    }

    public void setDvdGenre(String dvdGenre) {
        this.dvdGenre = dvdGenre;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("/jsp/ch6/form.jsp");
    }

    @HandlesEvent("/save")
    public Resolution save(){
        message = "Submitted: " + dvdTitle + "\na " + dvdGenre + "movie.\n" + "which cost $" + dvdCost + ".";
        return new ForwardResolution("/jsp/ch6/result.jsp");
    }
}
