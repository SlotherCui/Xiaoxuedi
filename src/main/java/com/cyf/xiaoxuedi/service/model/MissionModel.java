package com.cyf.xiaoxuedi.service.model;

import com.cyf.xiaoxuedi.DO.UserDO;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class MissionModel implements Serializable {

    private Integer id;

    @NotNull(message = "发布人不能为空")
    private Integer userId;

    @NotBlank(message = "任务标题不能不填")
    @Size(max = 20, message = "任务title不能超过20个字")
    private String title;

    @NotBlank(message = "任务详情不能不填")
    @Size(max = 255, message = "任务详情不能超过255个字")
    private String detail;

    @NotNull(message = "任务不能为空")
    @Min(value = 0, message = "任务赏金必须大于0")
    private BigDecimal price;

    @Size(max = 255, message = "地址过长")
    private String location;

    @NotBlank(message = "学校不能不填")
    private String school;


    private Byte status;


    private Date createTime;


    private Date updateTime;


    private UserDO userDO;
}
