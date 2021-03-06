package com.bird.service.zero.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.bird.service.common.model.AbstractModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("zero_site")
public class Site extends AbstractModel {
    private String name;
    private String key;
    private String host;
    private String indexUrl;
    private String loginNotifyUrl;
    private String remark;
    private Boolean disabled;
    private String permissionName;
}
