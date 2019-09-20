package fun.jingo.technology.dao;

import fun.jingo.technology.pojo.Mouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MouseMapper {

    //获取数据库中所有鼠标信息
    List<Mouse> getAll();
    //根据品牌查找鼠标信息
    List<Mouse> getByBrand(String brand);
    //根据是否有线查找鼠标信息
    List<Mouse> getByWired(String wired);
    //根据是否支持左手查询
    List<Mouse> getByHand(String hand);
    //根据是否为电竞鼠标查询
    List<Mouse> getByEsports(String esports);
    //对鼠标型号进行模糊查询
    List<Mouse> getByWord(String word);

}
