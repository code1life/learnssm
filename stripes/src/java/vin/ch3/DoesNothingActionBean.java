package vin.ch3;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public class DoesNothingActionBean implements ActionBean {
    @Override
    public void setContext(ActionBeanContext context) {

    }

    @Override
    public ActionBeanContext getContext() {
        return null;
    }
}
