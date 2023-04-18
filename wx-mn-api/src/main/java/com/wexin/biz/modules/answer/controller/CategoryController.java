package com.wexin.biz.modules.answer.controller;

import com.wexin.biz.common.utils.Rt;
import com.wexin.biz.modules.answer.response.CategoryResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyber.pan
 * @Classname CategoryController
 * @Description
 * @Date 2023/4/18 23:00
 */

@RestController
@RequestMapping("category")
@Api(tags = {"分类管理"})
public class CategoryController {
    @GetMapping("/list")
    @ApiOperation(value = "题库分类")
    public Rt<CategoryResponse> categoryList(@RequestParam Integer pid) {
        //上级分类id
        return Rt.ok(null);
    }


    @GetMapping("/exam/list")
    @ApiOperation(value = "试卷分类")
    public Rt<CategoryResponse> examList(@RequestParam Integer pid) {
        //上级分类id
        return Rt.ok(null);
    }
}
