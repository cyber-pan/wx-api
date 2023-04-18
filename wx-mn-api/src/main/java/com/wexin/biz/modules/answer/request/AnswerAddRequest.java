package com.wexin.biz.modules.answer.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname AnswerAddRequest
 * @Description
 * @Date 2023/4/18 21:31
 */

@Data
@Builder
public class AnswerAddRequest extends BaseAnswerRequest {
    //1- 添加错题 0-移除错题
    private Integer type;
}
