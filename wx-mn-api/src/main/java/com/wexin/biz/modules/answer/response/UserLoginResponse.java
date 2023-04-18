package com.wexin.biz.modules.answer.response;

import lombok.Builder;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname UserLoginResponse
 * @Description
 * @Date 2023/4/18 23:46
 */
@Builder
@Data
public class UserLoginResponse {

    private Long userId;
    private String token;
}
