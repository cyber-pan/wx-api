package com.wexin.biz.modules.answer.response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author cyber.pan
 * @Classname ExamRankResponse
 * @Description
 * @Date 2023/4/18 23:21
 */
@Builder
@Data
public class ExamRankResponse {

    private String nickName;
    private Integer score;
    private String avatarUrl;
    private Date createTime;
}
