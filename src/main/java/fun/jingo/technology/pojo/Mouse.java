package fun.jingo.technology.pojo;

public class Mouse {
    //鼠标在数据库中的id
    private Integer id;
    //鼠标型号
    private String model;
    //图片路径
    private String imgurl;
    //价格
    private String price;
    //品牌（英文）
    private String brand;
    //品牌（中文）
    private String brandC;
    //是否有线
    private String wired;
    //鼠标dpi
    private String dpi;
    //是否支持左手
    private String hand;
    //一些告知信息
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandC() {
        return brandC;
    }

    public void setBrandC(String brandC) {
        this.brandC = brandC;
    }

    public String getWired() {
        return wired;
    }

    public void setWired(String wired) {
        this.wired = wired;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
