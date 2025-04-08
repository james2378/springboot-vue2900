package com.dao;

import com.entity.XianshangkechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XianshangkechengView;

/**
 * 线上课程 Dao 接口
 *
 * @author 
 */
public interface XianshangkechengDao extends BaseMapper<XianshangkechengEntity> {

   List<XianshangkechengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
