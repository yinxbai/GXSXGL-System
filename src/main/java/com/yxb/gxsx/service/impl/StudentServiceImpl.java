package com.yxb.gxsx.service.impl;

import com.yxb.gxsx.entity.Student;
import com.yxb.gxsx.mapper.StudentMapper;
import com.yxb.gxsx.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生表 服务实现类
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
