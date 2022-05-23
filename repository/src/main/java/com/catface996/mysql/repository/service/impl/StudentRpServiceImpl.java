package com.catface996.mysql.repository.service.impl;

import com.catface996.mysql.repository.entity.Student;
import com.catface996.mysql.repository.service.StudentRpService;
import com.catface996.mysql.repository.mapper.StudentMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生 服务实现类
 * </p>
 *
 * @author catface
 * @since 2021-07-30
 */
@Service
public class StudentRpServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentRpService {

}
