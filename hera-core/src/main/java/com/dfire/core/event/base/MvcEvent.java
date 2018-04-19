package com.dfire.core.event.base;

import lombok.Builder;
import lombok.Data;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午5:19 2018/4/18
 * @desc
 */
@Builder
@Data
public class MvcEvent extends AbstractEvent {

    private ApplicationEvent applicationEvent;
    private String name;


    public MvcEvent(EventType type) {
        super(type);
    }
}
