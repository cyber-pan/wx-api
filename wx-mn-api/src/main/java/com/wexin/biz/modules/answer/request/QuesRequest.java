package com.wexin.biz.modules.answer.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname QuesRequest
 * @Description
 * @Date 2023/4/18 22:07
 */
@Data
@Builder
public class QuesRequest {
    //用户授权登录后返回的uid
    private Integer uid;
    //题库id，选择题库后选择的id
    private Long cid;
}
