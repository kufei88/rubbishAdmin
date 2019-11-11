package com.example.rubbish.services;

import com.example.rubbish.POJO.Region;
import com.example.rubbish.mapper.RubbishMapper;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 田易
 */
@Service
public class RubbishServices {
    @Autowired
    private RubbishMapper rubbishMapper;

    /**
     * 设置日期格式
     */
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
    private SimpleDateFormat df2 = new SimpleDateFormat("MM");
    private int date=Integer.parseInt(df2.format(new Date()));

    /**
     * 查询所有信息
     * @return
     */
    public List<Region> getRegionInfo(){
        return rubbishMapper.getRegionInfo();
    }

    /**
     * 厨余垃圾1-12月份的通过率
     * @return
     */
    public JSONArray getKitchenWastePassing(){
        List<Map<String,Object>> rows = new ArrayList<>();
        JSONArray json = new JSONArray();
        String type = "日期";
        String type1 = "厨余垃圾";
        int i;
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getkitchenWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,Float.valueOf(string)));
                }else {
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,0));
                }
                time=RubbishUtil.subMonth(time);
            }
            json=JSONArray.fromObject(rows);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return json;
    }

    /**
     * 有害垃圾1-12月份的通过率
     * @return
     */
    public JSONArray getHarmfulWastePassing(){
        List<Map<String,Object>> rows = new ArrayList<>();
        JSONArray json = new JSONArray();
        String type = "日期";
        String type1 = "有害垃圾";
        int i;
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getHarmfulWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,Float.valueOf(string)));
                }else {
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,0));
                }
                time=RubbishUtil.subMonth(time);
            }
            json=JSONArray.fromObject(rows);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return json;
    }
    /**
     * 可回收垃圾1-12月份的通过率
     * @return
     */
    public JSONArray getRecyclableWastePassing(){
        List<Map<String,Object>> rows = new ArrayList<>();
        JSONArray json = new JSONArray();
        String type = "日期";
        String type1 = "可回收垃圾";
        int i;
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getRecyclableWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,Float.valueOf(string)));
                }else {
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,0));
                }
                time=RubbishUtil.subMonth(time);
            }
            json=JSONArray.fromObject(rows);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return json;
    }
    /**
     * 其他垃圾1-12月份的通过率
     * @return
     */
    public JSONArray getOtherWastePassing(){
        List<Map<String,Object>> rows = new ArrayList<>();
        JSONArray json = new JSONArray();
        String type = "日期";
        String type1 = "其他垃圾";
        int i;
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getOtherWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,Float.valueOf(string)));
                }else {
                    rows.add(RubbishUtil.map(type,String.valueOf(i)+"月",type1,0));
                }
                time=RubbishUtil.subMonth(time);

            }
            json=JSONArray.fromObject(rows);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return json;
    }


    /**
     * 金华各地区1-12月份的学习通过率
     * @return
     */
    public JSONArray getLearnPassing(){
        int i,j;
        List<Region> list = rubbishMapper.getRegionAll();
        List<Map<String,Object>> rows = new ArrayList<>();
        JSONArray json = new JSONArray();
        String type = "日期";
        for(i=0;i<list.size();i++){
            try {
                String time = RubbishUtil.subMonth(df.format(new Date()), date - 1);
                for(j=1; j<=date; j++){
                    String string = rubbishMapper.getLearnPassing(list.get(i).getRegion(),time);
                    if(string !=null){
                        rows.add(RubbishUtil.map(type,String.valueOf(j)+"月",list.get(i).getRegion(),Float.valueOf(string)));
                    }else {
                        rows.add(RubbishUtil.map(type,String.valueOf(j)+"月",list.get(i).getRegion(),0));
                    }
                    time=RubbishUtil.subMonth(time);
                }
                json=JSONArray.fromObject(rows);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return json;
    }

    /**
     * 年龄分布
     * @return
     */
    public JSONArray getAgeCrowd(){
        int sum = rubbishMapper.getUserSum();
        float children = rubbishMapper.getChildrenSum()/sum;
        float student = rubbishMapper.getStudentSum()/sum;
        float youth = rubbishMapper.getYouthSum()/sum;
        float middle = rubbishMapper.getMiddleSum()/sum;
        float old = rubbishMapper.getOldSum()/sum;
        List<Map<String,Object>> rows = new ArrayList<>();
        String type = "type";
        String type1 = "分布";
        List<String> list = new ArrayList<>();
        list.add("学前儿童");
        list.add("在校学生");
        list.add("青年群体");
        list.add("中年群体");
        list.add("老年群体");
        Map<String, Float> row = new HashMap<>();
        row.put("学前儿童",children);
        row.put("在校学生",student);
        row.put("青年群体",youth);
        row.put("中年群体",middle);
        row.put("老年群体",old);
        int i;
        for(i=0;i<row.size();i++){
            rows.add(RubbishUtil.map(type,list.get(i),type1,row.get(list.get(i))));
        }

        JSONArray json =JSONArray.fromObject(rows);
        return json;
    }


    /**
     * 金华各地区错误率
     * @return
     */
    public JSONArray getErrorPassing(){
        String type="地区";
        String type1 = "错误率";
        List<Map<String,Object>> rows = new ArrayList<>();
        JSONArray json = new JSONArray();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {
            for(Region region : rubbishMapper.getRegionAll()){
                Float erro = rubbishMapper.getErrorPassing(region.getRegion(),sdf.format(new Date()));
                rows.add(RubbishUtil.map(type,region.getRegion(),type1,erro));
            }
            json=JSONArray.fromObject(rows);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;
    }

    /**
     * 地区总人数与掌握人数
     * @return
     */
    public JSONArray getUserAll(){
        String type = "地区";
        String type1 = "总目标人数";
        String type2 = "掌握目标人数";
        List<Map<String,Object>> rows = new ArrayList<>();
        for (Region region : rubbishMapper.getRrgion()){
           float value =  rubbishMapper.getUserAll(region.getRegion())/10000;
           float value1 = rubbishMapper.getAll(region.getRegion())/10000;
           rows.add(RubbishUtil.map(type,region.getRegion(),type1,value,type2,value1));
        }
        JSONArray json = JSONArray.fromObject(rows);
        return json;
    }
}
class RubbishUtil {
    /**
     * 时间月份加一个月
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static String subMonth(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date dt = sdf.parse(date);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, +1);
        Date dt1 = rightNow.getTime();
        String reStr = sdf.format(dt1);
        return reStr;
    }

    /**
     * 时间减n月
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static String subMonth(String date, int a) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date dt = sdf.parse(date);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, -a);
        Date dt1 = rightNow.getTime();
        String reStr = sdf.format(dt1);
        return reStr;
    }

    /**
     * map
     * @param type
     * @param string
     * @param type1
     * @param value1
     * @return
     */
    public static Map<String, Object> map(String type, String string, String type1, float value1) {
        Map<String, Object> row = new HashMap<>();
        row.put("" + type + "", string);
        row.put("" + type1 + "", value1);
        return row;
    }

    /**
     * map
     * @param type
     * @param string
     * @param type1
     * @param value1
     * @param type2
     * @param value2
     * @return
     */
    public static Map<String, Object> map(String type, String string, String type1, float value1, String type2, float value2) {
        Map<String, Object> row = new HashMap<>();
        row.put("" + type + "", string);
        row.put("" + type1 + "", value1);
        row.put("" + type2 + "", value2);
        return row;
    }
}

