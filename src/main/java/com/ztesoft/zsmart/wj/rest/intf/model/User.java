package com.ztesoft.zsmart.wj.rest.intf.model;

import io.swagger.annotations.ApiModel;

@ApiModel
public class User {
    private String userName;

    private String userType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
