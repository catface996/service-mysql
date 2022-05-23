package com.catface996.mysql.repository.service;

import com.catface996.mysql.repository.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author catface
 * @since 2020-12-14
 */
public interface TestRpService extends IService<Test> {

  /**
   * 根据角色名称查询列表
   *
   * @param userName 角色名称
   * @return test 列表
   */
  List<Test> queryByUserName(String userName);

}
