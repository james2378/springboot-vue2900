
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 作品集
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zuopinji")
public class ZuopinjiController {
    private static final Logger logger = LoggerFactory.getLogger(ZuopinjiController.class);

    @Autowired
    private ZuopinjiService zuopinjiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private TuanduiService tuanduiService;

    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private JiaoshiService jiaoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("教师".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = zuopinjiService.queryPage(params);

        //字典表数据转换
        List<ZuopinjiView> list =(List<ZuopinjiView>)page.getList();
        for(ZuopinjiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZuopinjiEntity zuopinji = zuopinjiService.selectById(id);
        if(zuopinji !=null){
            //entity转view
            ZuopinjiView view = new ZuopinjiView();
            BeanUtils.copyProperties( zuopinji , view );//把实体数据重构到view中

                //级联表
                TuanduiEntity tuandui = tuanduiService.selectById(zuopinji.getTuanduiId());
                if(tuandui != null){
                    BeanUtils.copyProperties( tuandui , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setTuanduiId(tuandui.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZuopinjiEntity zuopinji, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zuopinji:{}",this.getClass().getName(),zuopinji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZuopinjiEntity> queryWrapper = new EntityWrapper<ZuopinjiEntity>()
            .eq("tuandui_id", zuopinji.getTuanduiId())
            .eq("zuopinji_name", zuopinji.getZuopinjiName())
            .eq("zuopinji_types", zuopinji.getZuopinjiTypes())
            .eq("zuopinji_zhidaojiaoshi", zuopinji.getZuopinjiZhidaojiaoshi())
            .eq("zuopinji_chengyuan", zuopinji.getZuopinjiChengyuan())
            .eq("zuopinji_text", zuopinji.getZuopinjiText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZuopinjiEntity zuopinjiEntity = zuopinjiService.selectOne(queryWrapper);
        if(zuopinjiEntity==null){
            zuopinji.setCreateTime(new Date());
            zuopinjiService.insert(zuopinji);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZuopinjiEntity zuopinji, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zuopinji:{}",this.getClass().getName(),zuopinji.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ZuopinjiEntity> queryWrapper = new EntityWrapper<ZuopinjiEntity>()
            .notIn("id",zuopinji.getId())
            .andNew()
            .eq("tuandui_id", zuopinji.getTuanduiId())
            .eq("zuopinji_name", zuopinji.getZuopinjiName())
            .eq("zuopinji_types", zuopinji.getZuopinjiTypes())
            .eq("zuopinji_zhidaojiaoshi", zuopinji.getZuopinjiZhidaojiaoshi())
            .eq("zuopinji_chengyuan", zuopinji.getZuopinjiChengyuan())
            .eq("zuopinji_text", zuopinji.getZuopinjiText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZuopinjiEntity zuopinjiEntity = zuopinjiService.selectOne(queryWrapper);
        if("".equals(zuopinji.getZuopinjiPhoto()) || "null".equals(zuopinji.getZuopinjiPhoto())){
                zuopinji.setZuopinjiPhoto(null);
        }
        if(zuopinjiEntity==null){
            zuopinjiService.updateById(zuopinji);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zuopinjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ZuopinjiEntity> zuopinjiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ZuopinjiEntity zuopinjiEntity = new ZuopinjiEntity();
//                            zuopinjiEntity.setTuanduiId(Integer.valueOf(data.get(0)));   //团队 要改的
//                            zuopinjiEntity.setZuopinjiName(data.get(0));                    //作品名称 要改的
//                            zuopinjiEntity.setZuopinjiPhoto("");//详情和图片
//                            zuopinjiEntity.setZuopinjiTypes(Integer.valueOf(data.get(0)));   //作品类型 要改的
//                            zuopinjiEntity.setZuopinjiZhidaojiaoshi(data.get(0));                    //指导教师 要改的
//                            zuopinjiEntity.setZuopinjiChengyuan(data.get(0));                    //参加成员 要改的
//                            zuopinjiEntity.setZuopinjiText(data.get(0));                    //详情 要改的
//                            zuopinjiEntity.setCreateTime(date);//时间
                            zuopinjiList.add(zuopinjiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        zuopinjiService.insertBatch(zuopinjiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = zuopinjiService.queryPage(params);

        //字典表数据转换
        List<ZuopinjiView> list =(List<ZuopinjiView>)page.getList();
        for(ZuopinjiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZuopinjiEntity zuopinji = zuopinjiService.selectById(id);
            if(zuopinji !=null){


                //entity转view
                ZuopinjiView view = new ZuopinjiView();
                BeanUtils.copyProperties( zuopinji , view );//把实体数据重构到view中

                //级联表
                    TuanduiEntity tuandui = tuanduiService.selectById(zuopinji.getTuanduiId());
                if(tuandui != null){
                    BeanUtils.copyProperties( tuandui , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setTuanduiId(tuandui.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ZuopinjiEntity zuopinji, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zuopinji:{}",this.getClass().getName(),zuopinji.toString());
        Wrapper<ZuopinjiEntity> queryWrapper = new EntityWrapper<ZuopinjiEntity>()
            .eq("tuandui_id", zuopinji.getTuanduiId())
            .eq("zuopinji_name", zuopinji.getZuopinjiName())
            .eq("zuopinji_types", zuopinji.getZuopinjiTypes())
            .eq("zuopinji_zhidaojiaoshi", zuopinji.getZuopinjiZhidaojiaoshi())
            .eq("zuopinji_chengyuan", zuopinji.getZuopinjiChengyuan())
            .eq("zuopinji_text", zuopinji.getZuopinjiText())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZuopinjiEntity zuopinjiEntity = zuopinjiService.selectOne(queryWrapper);
        if(zuopinjiEntity==null){
            zuopinji.setCreateTime(new Date());
        zuopinjiService.insert(zuopinji);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
