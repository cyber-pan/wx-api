package com.wexin.biz.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wexin.biz.common.utils.PageUtils;
import com.wexin.biz.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 * @author Mark sunlightcs@gmail.com
 */
public interface SysLogService extends IService<SysLogEntity> {
    /**
     * 分页查询用户数据
     * @param params 查询参数
     * @return PageUtils 分页结果
     */
    PageUtils queryPage(Map<String, Object> params);


}
