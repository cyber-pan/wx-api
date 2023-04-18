package com.wexin.biz.modules.answer.controller;

import com.wexin.biz.common.utils.Rt;
import com.wexin.biz.modules.answer.request.CidRequest;
import com.wexin.biz.modules.answer.request.ExamSubmitRequest;
import com.wexin.biz.modules.answer.response.CategoryResponse;
import com.wexin.biz.modules.answer.response.ExamRankResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cyber.pan
 * @Classname ExamController
 * @Description TODO
 * @Date 2023/4/18 23:11
 */

@RestController
@RequestMapping("exam")
@Api(tags = {"考试管理"})
public class ExamController {

    @GetMapping("/submit")
    @ApiOperation(value = "提交题库")
    public Rt<Integer> examSubmit(ExamSubmitRequest request) {
        //上级分类id
        return Rt.ok(1);
    }

    @GetMapping("/rank")
    @ApiOperation(value = "模拟考试排名")
    public Rt<List<ExamRankResponse>> examRank(CidRequest request) {
        //上级分类id
        return Rt.ok(null);
    }


}
