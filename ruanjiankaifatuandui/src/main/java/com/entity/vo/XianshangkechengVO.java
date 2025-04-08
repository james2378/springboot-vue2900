package com.entity.vo;

import com.entity.XianshangkechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 线上课程
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xianshangkecheng")
public class XianshangkechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程标题
     */

    @TableField(value = "xianshangkecheng_name")
    private String xianshangkechengName;


    /**
     * 课程封面
     */

    @TableField(value = "xianshangkecheng_photo")
    private String xianshangkechengPhoto;


    /**
     * 课程类型
     */

    @TableField(value = "xianshangkecheng_types")
    private Integer xianshangkechengTypes;


    /**
     * 视频
     */

    @TableField(value = "xianshangkecheng_video")
    private String xianshangkechengVideo;


    /**
     * 课程详情
     */

    @TableField(value = "xianshangkecheng_text")
    private String xianshangkechengText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程标题
	 */
    public String getXianshangkechengName() {
        return xianshangkechengName;
    }


    /**
	 * 获取：课程标题
	 */

    public void setXianshangkechengName(String xianshangkechengName) {
        this.xianshangkechengName = xianshangkechengName;
    }
    /**
	 * 设置：课程封面
	 */
    public String getXianshangkechengPhoto() {
        return xianshangkechengPhoto;
    }


    /**
	 * 获取：课程封面
	 */

    public void setXianshangkechengPhoto(String xianshangkechengPhoto) {
        this.xianshangkechengPhoto = xianshangkechengPhoto;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getXianshangkechengTypes() {
        return xianshangkechengTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setXianshangkechengTypes(Integer xianshangkechengTypes) {
        this.xianshangkechengTypes = xianshangkechengTypes;
    }
    /**
	 * 设置：视频
	 */
    public String getXianshangkechengVideo() {
        return xianshangkechengVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setXianshangkechengVideo(String xianshangkechengVideo) {
        this.xianshangkechengVideo = xianshangkechengVideo;
    }
    /**
	 * 设置：课程详情
	 */
    public String getXianshangkechengText() {
        return xianshangkechengText;
    }


    /**
	 * 获取：课程详情
	 */

    public void setXianshangkechengText(String xianshangkechengText) {
        this.xianshangkechengText = xianshangkechengText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
