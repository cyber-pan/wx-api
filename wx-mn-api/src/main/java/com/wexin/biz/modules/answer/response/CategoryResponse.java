package com.wexin.biz.modules.answer.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author cyber.pan
 * @Classname CategoryResponse
 * @Description
 * @Date 2023/4/18 23:07
 */

@Data
@Builder
public class CategoryResponse {

    private Long id;

    private String name;

    List<CategoryResponse> children;
}
