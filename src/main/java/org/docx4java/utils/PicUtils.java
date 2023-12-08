package org.docx4java.utils;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PicUtils {
    public static int get_pic_type(String imageUrl) {
        String picType = extractImageType(imageUrl);
        return mapImageType(picType);
    }
    public static int mapImageType(String picType) {
        HashMap<String, Integer> typeMap = new HashMap<>();
        typeMap.put("EMF", 2);
        typeMap.put("WMF", 3);
        typeMap.put("PICT", 4);
        typeMap.put("JPG", 5);
        typeMap.put("JPEG", 5);
        typeMap.put("PNG", 6);
        typeMap.put("DIB", 7);
        typeMap.put("GIF", 8);
        typeMap.put("TIFF", 9);
        typeMap.put("EPS", 10);
        typeMap.put("BMP", 11);
        typeMap.put("WPG", 12);

        return typeMap.getOrDefault(picType, 1);
    }
    private static String extractImageType(String imageUrl) {
        // 定义匹配图片类型的正则表达式
        Pattern pattern = Pattern.compile("\\.([a-zA-Z]+)$");
        Matcher matcher = pattern.matcher(imageUrl);

        // 如果找到匹配的扩展名，则返回
        if (matcher.find()) {
            return matcher.group(1).toUpperCase();
        } else {
            return "unknown";
        }
    }

}
