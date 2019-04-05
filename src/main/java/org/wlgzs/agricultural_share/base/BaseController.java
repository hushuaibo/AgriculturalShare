package org.wlgzs.agricultural_share.base;

import org.springframework.stereotype.Service;
import org.wlgzs.agricultural_share.dao.BrowseResponsitory;
import org.wlgzs.agricultural_share.dao.CollectResponsitory;
import org.wlgzs.agricultural_share.dao.MessageResponsitory;
import org.wlgzs.agricultural_share.dao.UserRepository;
import org.wlgzs.agricultural_share.service.*;
import org.wlgzs.agricultural_share.util.UploadUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * @author 阿杰
 * @description 简化控制层代码
 */
public abstract class BaseController implements Serializable {

    //自动注入业务层
    @Resource
    protected UserService userService;

    @Resource
    protected CategoryService categoryService;

    @Resource
    protected HttpSession session;


    @Resource
    protected UserRepository userRepository;


    @Resource
    protected MessageResponsitory messageResponsitory;
    @Resource
    protected BrowseResponsitory browseResponsitory;
    @Resource
    protected CollectResponsitory collectResponsitory;

    @Resource
    protected MessageService messageService;
    @Resource
    protected BrowseService browseService;
    @Resource
    protected CollectService collectService;

    protected final int adminRole = 1;
    protected String RootUrl = "/upload/message/";
    protected final String needType = "用户需求";
}
