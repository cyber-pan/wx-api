package com.wexin.biz.modules.oss.cloud;


import com.wexin.biz.common.utils.Constant;
import com.wexin.biz.modules.sys.service.SysConfigService;
import com.wexin.biz.common.utils.ConfigConstant;
import com.wexin.biz.common.utils.SpringContextUtils;

/**
 * 文件上传Factory
 * @author Mark sunlightcs@gmail.com
 */
public final class OSSFactory {
    private static SysConfigService sysConfigService;

    static {
        OSSFactory.sysConfigService = (SysConfigService) SpringContextUtils.getBean("sysConfigService");
    }

    public static AbstractCloudStorageService build() {
        //获取云存储配置信息
        CloudStorageConfig config = sysConfigService.getConfigObject(ConfigConstant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if (config.getType() == Constant.CloudService.QINIU.getValue()) {
            return new QiniuAbstractCloudStorageService(config);
        } else if (config.getType() == Constant.CloudService.ALIYUN.getValue()) {
            return new AliyunAbstractCloudStorageService(config);
        } else if (config.getType() == Constant.CloudService.QCLOUD.getValue()) {
            return new QcloudAbstractCloudStorageService(config);
        }

        return null;
    }

}
