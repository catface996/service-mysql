package com.catface996.mysql.repository.mapper;

import com.catface996.mysql.repository.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author catface
 * @since 2020-12-14
 */
public interface TestMapper extends BaseMapper<Test> {

  /**
   * 根据角色名称查询
   *
   * @param userName 角色名称
   * @return test 列表
   */
  List<Test> selectByUserName(@Param("userName") String userName);
}
