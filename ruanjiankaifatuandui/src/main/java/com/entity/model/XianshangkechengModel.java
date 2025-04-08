package com.entity.model;

import com.entity.XianshangkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 线上课程
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XianshangkechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程标题
     */
    private String xianshangkechengName;


    /**
     * 课程封面
     */
    private String xianshangkechengPhoto;


    /**
     * 课程类型
     */
    private Integer xianshangkechengTypes;


    /**
     * 视频
     */
    private String xianshangkechengVideo;


    /**
     * 课程详情
     */
    private String xianshangkechengText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课程标题
	 */
    public String getXianshangkechengName() {
        return xianshangkechengName;
    }


    /**
	 * 设置：课程标题
	 */
    public void setXianshangkechengName(String xianshangkechengName) {
        this.xianshangkechengName = xianshangkechengName;
    }
    /**
	 * 获取：课程封面
	 */
    public String getXianshangkechengPhoto() {
        return xianshangkechengPhoto;
    }


    /**
	 * 设置：课程封面
	 */
    public void setXianshangkechengPhoto(String xianshangkechengPhoto) {
        this.xianshangkechengPhoto = xianshangkechengPhoto;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getXianshangkechengTypes() {
        return xianshangkechengTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setXianshangkechengTypes(Integer xianshangkechengTypes) {
        this.xianshangkechengTypes = xianshangkechengTypes;
    }
    /**
	 * 获取：视频
	 */
    public String getXianshangkechengVideo() {
        return xianshangkechengVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setXianshangkechengVideo(String xianshangkechengVideo) {
        this.xianshangkechengVideo = xianshangkechengVideo;
    }
    /**
	 * 获取：课程详情
	 */
    public String getXianshangkechengText() {
        return xianshangkechengText;
    }


    /**
	 * 设置：课程详情
	 */
    public void setXianshangkechengText(String xianshangkechengText) {
        this.xianshangkechengText = xianshangkechengText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
