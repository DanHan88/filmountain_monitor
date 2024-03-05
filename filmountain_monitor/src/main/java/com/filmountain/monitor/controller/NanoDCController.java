package com.filmountain.monitor.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.filmountain.monitor.mapper.NanoDCMapper;
import com.filmountain.monitor.service.NanoDCService;
import com.filmountain.monitor.service.UtilityService;
import com.filmountain.monitor.vo.HardWareInfoVO;
import com.filmountain.monitor.vo.NodeInfoVO;

@Controller
public class NanoDCController {

	 @Autowired
	    NanoDCService nanoDCService;
	 @Autowired
		NanoDCMapper nanoDCMapper;
	 @Autowired
	 	UtilityService util;
	//**>>>          노드 정보           <<<**//
	@GetMapping(value={"/monitor_nodeInfo"})
    public ModelAndView nodeInfo(HttpServletRequest request,@RequestParam(value="minerId", required = false) String minerId) throws IOException {
    	//f01227505 //f01695888
        ModelAndView mav = new ModelAndView();
        NodeInfoVO nodeInfoVO = nanoDCService.initNodeInfo("f01695888");
        mav.addObject("nodeInfoVO", nodeInfoVO);
        mav.setViewName("views/nodeInfo");
        return mav;
    }
	@GetMapping(value={"/nanoDc_nodeInfo"})
    public ModelAndView nanoDc_nodeInfo(HttpServletRequest request,@RequestParam(value="minerId", required = false) String minerId) throws IOException {
    	//f01227505 //f01695888
        ModelAndView mav = new ModelAndView();
        NodeInfoVO nodeInfoVO = nanoDCService.initNodeInfo("f01695888");
        mav.addObject("nodeInfoVO", nodeInfoVO);
        mav.setViewName("views/nanoDc_nodeInfo");
        return mav;
    }
	//**>>>          하드웨어 정보           <<<**//
	@GetMapping(value={"/monitor_hardwareInfo"})
    public ModelAndView hardwareInfo(HttpServletRequest request,@RequestParam(value="minerId",required= false) String minerId, @RequestParam(value="source_link",required=false) String source_link) throws IOException {
    	//f01227505 //f01695888
        ModelAndView mav = new ModelAndView();
        HardWareInfoVO hardWareInfoVO = new HardWareInfoVO();
        hardWareInfoVO.setMiner_id("f01695888"); //"http://121.178.82.230:9100/metrics"
        hardWareInfoVO.setSource_link("http://"+"121.178.82.230:9100/metrics");
        hardWareInfoVO = nanoDCMapper.selectLatestHardWareInfo(hardWareInfoVO);
        mav.addObject("hardWareInfoVO", hardWareInfoVO);
        mav.setViewName("views/hardWareInfo");
        return mav;
    }
	//**>>>          부스트 정보           <<<**//
	@GetMapping(value={"/monitor_boostInfo"})
    public ModelAndView boostInfo(HttpServletRequest request,@RequestParam(value="minerId",required= false) String minerId) throws IOException {
	  	//f01227505 //f01695888
		ModelAndView mav = new ModelAndView();
        NodeInfoVO nodeInfoVO = nanoDCService.initNodeInfo("f01695888");
        mav.addObject("nodeInfoVO", nodeInfoVO);
        mav.setViewName("views/boostInfo"); 
        return mav;
    }
	//**>>>          랙 정보     [미완성]      <<<**//
	@GetMapping(value={"/monitor_rackInfo"})
    public ModelAndView rackInfo(HttpServletRequest request) throws IOException {
	  	//f01227505 //f01695888
		ModelAndView mav = new ModelAndView();
        mav.setViewName("views/rackInfo");
        return mav;
    }
	//**>>>          스위치 정보   [미완성]        <<<**//
	@GetMapping(value={"/monitor_switchInfo"})
    public ModelAndView switchInfo(HttpServletRequest request) throws IOException {
    	//f01227505 //f01695888
		ModelAndView mav = new ModelAndView();
        mav.setViewName("views/switchInfo");
        return mav;
    }
	//**>>>         ups 정보    [미완성]       <<<**//
	@GetMapping(value={"/monitor_upsController"})
    public ModelAndView upsController(HttpServletRequest request) throws IOException {
    	//f01227505 //f01695888
		ModelAndView mav = new ModelAndView();
        mav.setViewName("views/upsController");
        return mav;
    }
	//**>>>          스토리지 정보   [미완성]        <<<**//
	@GetMapping(value={"/monitor_storageInfo"})
    public ModelAndView storageInfo(HttpServletRequest request) throws IOException {
    	//f01227505 //f01695888
		ModelAndView mav = new ModelAndView();
        mav.setViewName("views/storageInfo");
        return mav;
    }
	//**>>>         404           <<<**//
	@GetMapping(value={"/404"})
    public ModelAndView page404(HttpServletRequest request) throws IOException {
    	//f01227505 //f01695888
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/404page");
        return mav;
    }
	//**>>>          홈페이지           <<<**//
	@GetMapping(value={"/monitor_homepage"})
    public ModelAndView hompage(HttpServletRequest request) throws IOException {
	  	//f01227505 //f01695888
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/homepage");
        return mav;
    }
	//**>>>          지도          <<<**//
	@GetMapping(value={"/nanodc_map"})
    public ModelAndView nanoDCMAP(HttpServletRequest request) throws IOException {
	  	//f01227505 //f01695888
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/nanodcmap");
        return mav;
    }
}
