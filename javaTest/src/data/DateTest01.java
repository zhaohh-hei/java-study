package data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaohonghong
 * @version 1.0
 * @Description: date测试
 * @date 2021/7/2 1:22
 */
public class DateTest01 {
    public static void main(String[] args){
        System.out.println(new Date());
        //当前系统日期到1970年1月1日 00:00:00 经历了多少毫秒
        System.out.println(System.currentTimeMillis());

        // 创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        String str = format.format(date);
        String str1 = df.format(date);
        System.out.println(str);
        System.out.println(str1);
    }
}
