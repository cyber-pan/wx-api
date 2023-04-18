package com.wexin.biz.modules.answer.controller;

import com.wexin.biz.common.utils.Rt;
import com.wexin.biz.modules.answer.request.AnswerAddRequest;
import com.wexin.biz.modules.answer.request.BaseAnswerRequest;
import com.wexin.biz.modules.answer.request.QuesRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyber.pan
 * @Classname AnswerController
 * @Description
 * @Date 2023/4/18 21:29
 */

@RestController
@RequestMapping("answer")
@Api(tags = {"答题管理"})
public class AnswerController {

    @PostMapping("/wrong")
    @ApiOperation(value = "保存或移除错题")
    public Rt<Integer> saveWrong(@RequestBody AnswerAddRequest request) {
        return Rt.ok(1);
    }


    @PostMapping("/favorite")
    @ApiOperation(value = "保存或移除错题")
    public Rt<Integer> saveFavorite(@RequestBody AnswerAddRequest request) {
        return Rt.ok(1);
    }


    @PostMapping("/isfavorite")
    @ApiOperation(value = "判断是否收藏该题")
    public Rt<Integer> isFavorite(@RequestBody BaseAnswerRequest request) {
        return Rt.ok(1);
    }

    @PostMapping("/favoriteCount")
    @ApiOperation(value = " 用户收藏题目数量")
    public Rt<Integer> favoriteCount(@RequestBody QuesRequest request) {
        return Rt.ok(1);
    }

    @PostMapping("/wrongCount")
    @ApiOperation(value = " 用户答题错题题目数量")
    public Rt<Integer> wrongCount(@RequestBody QuesRequest request) {
        return Rt.ok(1);
    }
}
