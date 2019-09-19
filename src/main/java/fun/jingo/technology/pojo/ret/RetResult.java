package fun.jingo.technology.pojo.ret;

import java.util.List;

public class RetResult<T> {
    //状态码
    private int code;
    //提示信息
    private String msg;
    //数据
    private List<T> data;


    public int getCode() {
        return code;
    }

    public RetResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RetResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public RetResult<T> setData(List<T> data) {
        this.data = data;
        return this;
    }

}
