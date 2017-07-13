package foodle.lang.com.foodle.domain;

/**
 * Created by Administrator on 2017/7/13.
 */
public class ShouMerchant {
    private String tv;
    private Integer iv;
    public ShouMerchant(){
        super();
    }
    public ShouMerchant(String tv,Integer iv){
        super();
        this.getIv();
        this.getTv();
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
    public Integer getIv() {
        return iv;
    }
    public void setIv(Integer iv) {
        this.iv = iv;
    }
}

