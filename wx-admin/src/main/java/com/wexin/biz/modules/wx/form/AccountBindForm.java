package com.wexin.biz.modules.wx.form;

import com.wexin.biz.common.utils.Json;
import lombok.Data;

@Data
public class AccountBindForm {
    String phoneNum;
    String idCodeSuffix;

    @Override
    public String toString() {
        return Json.toJsonString(this);
    }
}
