package com.wexin.biz.modules.answer.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname BaseAnswerReqest
 * @Description
 * @Date 2023/4/18 22:03
 */
@Data
@Builder
public class BaseAnswerRequest extends QuesRequest {
    //答题的题目id
    private Long id;
}
