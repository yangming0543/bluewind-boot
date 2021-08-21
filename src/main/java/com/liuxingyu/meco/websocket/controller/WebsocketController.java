package com.liuxingyu.meco.websocket.controller;

import com.liuxingyu.meco.common.base.BaseController;
import com.liuxingyu.meco.common.base.BaseResult;
import com.liuxingyu.meco.configuration.security.SecurityUtil;
import com.liuxingyu.meco.websocket.config.WebSocketServer;
import com.liuxingyu.meco.websocket.vo.WebsocketVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuxingyu01
 * @date 2021-03-24-23:33
 **/
@Api(tags = "后台管理端--websocket")
@Controller
@RequestMapping("/websocket")
public class WebsocketController extends BaseController {

    @Value("${server.servlet.context-path}")
    public String contextPath;

    @Autowired
    private WebSocketServer webSocketServer;


    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("url", "ws://${host}" + contextPath + "/websocket/" + SecurityUtil.getSysUserId());
        return "websocket/websocket_info";
    }


    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult sendMessage(@RequestBody WebsocketVO websocketVO) {
        webSocketServer.sendMessage(websocketVO.getContent(), websocketVO.getReceiveUser());
        return BaseResult.success();
    }

}
