package com.oklife.lovedirectseeding.model;

/**
 * @author ly
 * @version V1.0
 * @Package com.oklife.lovedirectseeding.model
 * @Description: 直播对象
 * @date 2017/6/13 15:41
 */

public class DirectSeeding {

    //直播地址
    private String url;
    //直播间名称
    private String name;
    //直播间封面图
    private String imgIcon;
    //直播id
    private int id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgIcon() {
        return imgIcon;
    }

    public void setImgIcon(String imgIcon) {
        this.imgIcon = imgIcon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
