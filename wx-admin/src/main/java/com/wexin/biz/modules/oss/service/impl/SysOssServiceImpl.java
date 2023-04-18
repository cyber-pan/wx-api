package com.wexin.biz.modules.oss.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wexin.biz.modules.oss.dao.SysOssDao;
import com.wexin.biz.modules.oss.entity.SysOssEntity;
import com.wexin.biz.modules.oss.service.SysOssService;
import com.wexin.biz.common.utils.PageUtils;
import com.wexin.biz.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysOssEntity> page = this.page(
            new Query<SysOssEntity>().getPage(params)
        );

        return new PageUtils(page);
    }

}
