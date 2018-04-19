package com.dfire.core.event.listenter;

import com.dfire.core.event.base.MvcEvent;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午5:57 2018/4/18
 * @desc
 */
public class AbstractListener implements Listener<MvcEvent> {

    @Override
    public void handleEvent(MvcEvent event) {

    }

    public void beforeDispatch(MvcEvent mvcEvent) {

    }

    public void afterDispatch(MvcEvent mvcEvent) {

    }
}
