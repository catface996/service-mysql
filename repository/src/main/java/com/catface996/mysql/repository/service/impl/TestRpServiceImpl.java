package com.catface996.mysql.repository.service.impl;

import com.catface996.mysql.repository.entity.Test;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catface996.mysql.repository.mapper.TestMapper;
import com.catface996.mysql.repository.service.TestRpService;

import org.springframework.stereotype.Service;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author catface
 * @since 2020-12-14
 */
@Slf4j
@Service
public class TestRpServiceImpl extends ServiceImpl<TestMapper, Test> implements TestRpService {

  /**
   * 根据角色名称查询列表
   *
   * @param userName 角色名称
   * @return test 列表
   */
  @Override
  public List<Test> queryByUserName(String userName) {
    return baseMapper.selectByUserName(userName);
  }
}
