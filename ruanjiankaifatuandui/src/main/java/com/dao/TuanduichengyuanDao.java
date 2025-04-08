package com.dao;

import com.entity.TuanduichengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TuanduichengyuanView;

/**
 * 团队成员 Dao 接口
 *
 * @author 
 */
public interface TuanduichengyuanDao extends BaseMapper<TuanduichengyuanEntity> {

   List<TuanduichengyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
