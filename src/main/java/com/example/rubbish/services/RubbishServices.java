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
    private int i;
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
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getkitchenWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,i,type1,string));
                }else {
                    rows.add(RubbishUtil.map(type,i,type1,"0"));
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
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getHarmfulWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,i,type1,string));
                }else {
                    rows.add(RubbishUtil.map(type,i,type1,"0"));
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
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getRecyclableWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,i,type1,string));
                }else {
                    rows.add(RubbishUtil.map(type,i,type1,"0"));
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
        try {
            String time=RubbishUtil.subMonth(df.format(new Date()),date-1);
            for(i=1; i<=date; i++){
                String string = rubbishMapper.getOtherWastePassing(time);
                if(string !=null){
                    rows.add(RubbishUtil.map(type,i,type1,string));
                }else {
                    rows.add(RubbishUtil.map(type,i,type1,"0"));
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
    public List<Region> getLearnPassing(){
        return rubbishMapper.getLearnPassing(df.format(new Date()));
    }

    /**
     * 金华各地区错误率
     * @return
     */
    public List<Region> getErrorPassing(){
        return rubbishMapper.getErrorPassing();
    }

    /**
     * 总人数
     * @return
     */
    public ArrayList getUserAll(){
        ArrayList array = new ArrayList();
        for (Region region : rubbishMapper.getRrgion()){
            ArrayList arrayList = new ArrayList();
            arrayList.add(region.getRegion());
            arrayList.add(rubbishMapper.getUserAll(region.getRegion())/10000);
            array.add(arrayList);
        }
        return array;
    }

    /**
     * 掌握人数
     * @return
     */
    public ArrayList getAll(){
        ArrayList array = new ArrayList();
        for (Region region : rubbishMapper.getRrgion()){
            ArrayList arrayList = new ArrayList();
            arrayList.add(region.getRegion());
            arrayList.add(rubbishMapper.getAll(region.getRegion())/10000);
            array.add(arrayList);
        }
        return array;
    }
}
class RubbishUtil{
    /**
     * 时间月份加一个月
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
     * 减n月
     * @param date
     * @return
     * @throws ParseException
     */
    public static String subMonth(String date,int a) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date dt = sdf.parse(date);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, -a);
        Date dt1 = rightNow.getTime();
        String reStr = sdf.format(dt1);
        return reStr;
    }


    public static Map<String,Object> map(String type,int date,String type1,String value){
        Map<String,Object> row = new HashMap<>();
        row.put(""+type+"", date+"月");
        row.put(""+type1+"", value);
        return row;
    }

}

