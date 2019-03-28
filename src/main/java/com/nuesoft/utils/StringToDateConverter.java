package com.nuesoft.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (StringUtils.isBlank(source)) {
            return null;
        }
        source = source.trim();
        System.out.println(source);
        Date date=null;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

        simpleDateFormat.setLenient(false);// 宽松解析true，严格解析false
        if (source!=null) {
            try {
                date= simpleDateFormat.parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(date);
        }
        return date;
    }
}
