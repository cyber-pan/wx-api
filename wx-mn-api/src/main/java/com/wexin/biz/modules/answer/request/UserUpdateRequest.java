package com.wexin.biz.modules.answer.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname UserUpdateRequest
 * @Description
 * @Date 2023/4/18 23:50
 */
@Data
@Builder
public class UserUpdateRequest {

    private Long uid;//	是	用户id
    private String nickName;//		否	昵称
    private Integer gender;//	integer	否	性别
    private String language;//	string	否	语言
    private Integer city;//	integer	否	城市
    private String province;//	string	否	省份
    private Integer country;//	integer	否	国家
    private String avatarUrl;
}
