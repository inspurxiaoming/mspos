package com.inspur.mspos.os.controller;

import com.inspur.mspos.common.bean.ResponseBean;
import com.inspur.mspos.os.bean.MonitBean;
import com.inspur.mspos.os.service.MonitorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class MonitorController {
    @Autowired
    MonitorService monitorService;
    @PostMapping("/save")
    public ResponseBean insertEvent(@RequestBody MonitBean monitBean){
        return monitorService.saveEvent(monitBean);
    }
}
