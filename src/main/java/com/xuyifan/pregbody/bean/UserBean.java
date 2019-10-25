package com.xuyifan.pregbody.bean;
import lombok.Data;
/**
 * @author Xu yifan
 * @Ddecription 
 * @date 2019-10-25 15:31:55
 * @Version 1.0
 */
@Data
public class UserBean {
    private Integer id;   //
    private String name;   //姓名
    private String openId;   //小程序id
    private String avatarurl;   //图片url
    private String updatetime;   //更新时间
}
