package fun.jingo.technology.controller;

import fun.jingo.technology.pojo.Mouse;
import fun.jingo.technology.pojo.ret.RetResponse;
import fun.jingo.technology.pojo.ret.RetResult;
import fun.jingo.technology.service.MouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mouse")
public class MouseController {

    @Autowired
    private MouseService mouseService;

    //获取数据库中所有鼠标信息
    @GetMapping(value = "/getall")
    public RetResult<Mouse> getAll(){
        List<Mouse> mouseList=mouseService.getAll();
        if (mouseList.size()>0){
            return RetResponse.makeRsp(200,"查找成功", mouseList);
        }else {
            return RetResponse.makeRsp(201,"暂无数据");
        }
    }

    //根据品牌查找鼠标信息
    @GetMapping(value = "/getbybrand/{brand}")
    public RetResult<Mouse> getByBrand(@PathVariable("brand") String brand){
        List<Mouse> mouseList=mouseService.getByBrand(brand);
        if (mouseList.size()>0){
            return RetResponse.makeRsp(200,"查找成功", mouseList);
        }else {
            return RetResponse.makeRsp(201,"暂无数据");
        }
    }

    //根据是否有线查找鼠标信息
    @GetMapping(value = "/getbywired/{wired}")
    public RetResult<Mouse> getByWired(@PathVariable("wired") String wired){
        List<Mouse> mouseList=mouseService.getByWired(wired);
        if (mouseList.size()>0){
            return RetResponse.makeRsp(200,"查找成功",mouseList);
        }else {
            return RetResponse.makeRsp(201,"暂无数据");
        }
    }

    //根据是否支持左手查找鼠标信息
    @GetMapping(value = "/getbyhand/{hand}")
    public RetResult<Mouse> getByHand(@PathVariable("hand") String hand){
        List<Mouse> mouseList=mouseService.getByHand(hand);
        if (mouseList.size()>0){
            return RetResponse.makeRsp(200,"查找成功",mouseList);
        }else {
            return RetResponse.makeRsp(201,"暂无数据");
        }
    }

    //根据是否为电竞鼠标查找鼠标信息
    @GetMapping(value = "/getbyesports/{esports}")
    public RetResult<Mouse> getByEsports(@PathVariable("esports") String esports){
        List<Mouse> mouseList=mouseService.getByEsports(esports);
        if (mouseList.size()>0){
            return RetResponse.makeRsp(200,"查找成功",mouseList);
        }else {
            return RetResponse.makeRsp(201,"暂无数据");
        }
    }

}
