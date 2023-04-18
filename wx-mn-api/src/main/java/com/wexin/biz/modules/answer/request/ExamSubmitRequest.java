package com.wexin.biz.modules.answer.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname ExamSubmitRequest
 * @Description
 * @Date 2023/4/18 23:15
 */
@Data
@Builder
public class ExamSubmitRequest  extends QuesRequest{

    private Integer right;

    private Integer wrong;
}
