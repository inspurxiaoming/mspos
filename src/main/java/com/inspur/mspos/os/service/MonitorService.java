package com.inspur.mspos.os.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inspur.mspos.common.bean.ResponseBean;
import com.inspur.mspos.os.bean.MonitBean;
import com.inspur.mspos.os.dao.MonitorDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class MonitorService extends ServiceImpl<MonitorDao, MonitBean> {
    public ResponseBean saveEvent(MonitBean monitBean) {
        monitBean.setCreateDate(new Date());
        if(this.save(monitBean)){
            return new ResponseBean("记录成功");
        }else{
            return  new ResponseBean("保存失败");
        }
    }
}
