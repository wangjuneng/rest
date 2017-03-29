package com.ztesoft.zsmart.wj.rest.intf.model;

import io.swagger.annotations.ApiModel;

@ApiModel
public class Greeting {
    private String version;

    private String content;

    public Greeting(String version, String content) {
        super();
        this.version = version;
        this.content = content;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
