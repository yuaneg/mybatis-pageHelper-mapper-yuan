package xyz.xiaomilier.front.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.xiaomilier.front.model.Sn;
import xyz.xiaomilier.front.service.ISnService;

/**
 * Created by 袁恩光 on 2017/3/26.
 */
@RestController
public class FrontController {


    private static final Logger logger = LoggerFactory.getLogger(FrontController.class);

    @Autowired
    private ISnService iSnService;

    @RequestMapping("test")
    public Object frontInfo(){
        Sn snModel = iSnService.selectByKey(1);

        return snModel;
    }


}
