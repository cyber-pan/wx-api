package com.wexin.biz.modules.answer.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname UserAuthRequest
 * @Description
 * @Date 2023/4/18 23:41
 */
@Data
@Builder
public class UserAuthRequest {

   private String  code;
  private String  inviteUid;
}
