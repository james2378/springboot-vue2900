package com.entity.model;

import com.entity.TuanduichengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 团队成员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TuanduichengyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 团队
     */
    private Integer tuanduiId;


    /**
     * 成员名称
     */
    private String tuanduichengyuanName;


    /**
     * 头像
     */
    private String tuanduichengyuanPhoto;


    /**
     * 奖项类型
     */
    private Integer tuanduichengyuanTypes;


    /**
     * 指导教师
     */
    private String tuanduichengyuanZhidaojiaoshi;


    /**
     * 获得奖项
     */
    private String tuanduichengyuanChengyuan;


    /**
     * 参加项目
     */
    private String tuanduichengyuanXiangmu;


    /**
     * 就业情况
     */
    private Integer jiuyeTypes;


    /**
     * 就业企业
     */
    private String tuanduichengyuanQiye;


    /**
     * 创建时间 photoShow
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
	 * 获取：团队
	 */
    public Integer getTuanduiId() {
        return tuanduiId;
    }


    /**
	 * 设置：团队
	 */
    public void setTuanduiId(Integer tuanduiId) {
        this.tuanduiId = tuanduiId;
    }
    /**
	 * 获取：成员名称
	 */
    public String getTuanduichengyuanName() {
        return tuanduichengyuanName;
    }


    /**
	 * 设置：成员名称
	 */
    public void setTuanduichengyuanName(String tuanduichengyuanName) {
        this.tuanduichengyuanName = tuanduichengyuanName;
    }
    /**
	 * 获取：头像
	 */
    public String getTuanduichengyuanPhoto() {
        return tuanduichengyuanPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setTuanduichengyuanPhoto(String tuanduichengyuanPhoto) {
        this.tuanduichengyuanPhoto = tuanduichengyuanPhoto;
    }
    /**
	 * 获取：奖项类型
	 */
    public Integer getTuanduichengyuanTypes() {
        return tuanduichengyuanTypes;
    }


    /**
	 * 设置：奖项类型
	 */
    public void setTuanduichengyuanTypes(Integer tuanduichengyuanTypes) {
        this.tuanduichengyuanTypes = tuanduichengyuanTypes;
    }
    /**
	 * 获取：指导教师
	 */
    public String getTuanduichengyuanZhidaojiaoshi() {
        return tuanduichengyuanZhidaojiaoshi;
    }


    /**
	 * 设置：指导教师
	 */
    public void setTuanduichengyuanZhidaojiaoshi(String tuanduichengyuanZhidaojiaoshi) {
        this.tuanduichengyuanZhidaojiaoshi = tuanduichengyuanZhidaojiaoshi;
    }
    /**
	 * 获取：获得奖项
	 */
    public String getTuanduichengyuanChengyuan() {
        return tuanduichengyuanChengyuan;
    }


    /**
	 * 设置：获得奖项
	 */
    public void setTuanduichengyuanChengyuan(String tuanduichengyuanChengyuan) {
        this.tuanduichengyuanChengyuan = tuanduichengyuanChengyuan;
    }
    /**
	 * 获取：参加项目
	 */
    public String getTuanduichengyuanXiangmu() {
        return tuanduichengyuanXiangmu;
    }


    /**
	 * 设置：参加项目
	 */
    public void setTuanduichengyuanXiangmu(String tuanduichengyuanXiangmu) {
        this.tuanduichengyuanXiangmu = tuanduichengyuanXiangmu;
    }
    /**
	 * 获取：就业情况
	 */
    public Integer getJiuyeTypes() {
        return jiuyeTypes;
    }


    /**
	 * 设置：就业情况
	 */
    public void setJiuyeTypes(Integer jiuyeTypes) {
        this.jiuyeTypes = jiuyeTypes;
    }
    /**
	 * 获取：就业企业
	 */
    public String getTuanduichengyuanQiye() {
        return tuanduichengyuanQiye;
    }


    /**
	 * 设置：就业企业
	 */
    public void setTuanduichengyuanQiye(String tuanduichengyuanQiye) {
        this.tuanduichengyuanQiye = tuanduichengyuanQiye;
    }
    /**
	 * 获取：创建时间 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
