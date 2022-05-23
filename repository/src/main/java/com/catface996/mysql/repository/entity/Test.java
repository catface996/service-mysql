package com.catface996.mysql.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author catface
 * @since 2020-12-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Test对象", description = "")
public class Test implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "主键")
  @TableId(value = "id", type = IdType.ASSIGN_ID)
  private Long id;

  @ApiModelProperty(value = "姓名")
  private String userName;

  @ApiModelProperty(value = "年龄")
  private Integer age;

  @ApiModelProperty(value = "创建时间")
  private Date created;

  @ApiModelProperty(value = "修改时间")
  private Date modified;

}
