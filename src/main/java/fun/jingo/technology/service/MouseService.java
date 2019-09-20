package fun.jingo.technology.service;

import fun.jingo.technology.dao.MouseMapper;
import fun.jingo.technology.pojo.Mouse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MouseService {

    @Resource
    private MouseMapper mouseMapper;

    //查询数据库中所有鼠标信息
    public List<Mouse> getAll(){
        return mouseMapper.getAll();
    }

    //根据品牌查找鼠标信息
    public List<Mouse> getByBrand(String brand){
        return mouseMapper.getByBrand(brand);
    }

    //根据是否有线查找鼠标信息
    public List<Mouse> getByWired(String wired){
        return mouseMapper.getByWired(wired);
    }

    //根据是否支持左手查找鼠标信息
    public List<Mouse> getByHand(String hand){
        return mouseMapper.getByHand(hand);
    }

    //根据是否为电竞鼠标查找鼠标信息
    public List<Mouse> getByEsports(String esports){return mouseMapper.getByEsports(esports);}

    //对鼠标型号进行模糊查询
    public List<Mouse> getByWord(String word){
        return mouseMapper.getByWord(word);
    }

}
