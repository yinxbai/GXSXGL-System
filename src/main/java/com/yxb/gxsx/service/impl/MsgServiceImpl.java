package com.yxb.gxsx.service.impl;

import com.yxb.gxsx.entity.Msg;
import com.yxb.gxsx.mapper.MsgMapper;
import com.yxb.gxsx.service.MsgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言板 服务实现类
 * </p>
 *
 * @author YinXuBai
 * @since 2022-02-12
 */
@Service
public class MsgServiceImpl extends ServiceImpl<MsgMapper, Msg> implements MsgService {

}
