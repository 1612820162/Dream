package fun.jingo.technology.pojo.ret;

import java.util.List;

public class RetResponse {

    public static <T> RetResult<T> makeRsp(int code,String msg) {
        return new RetResult<T>().setCode(code).setMsg(msg);
    }

    public static <T> RetResult<T> makeRsp(int code, String msg, List<T> data) {
        return new RetResult<T>().setCode(code).setMsg(msg).setData(data);
    }

}
