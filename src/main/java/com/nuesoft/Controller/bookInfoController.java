package com.nuesoft.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuesoft.po.BookInfo;
import com.nuesoft.po.BookType;
import com.nuesoft.service.bookInfoService;
import com.nuesoft.service.bookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class bookInfoController {
    @Autowired
    private bookInfoService bookInfoService;
    @Autowired
    private bookTypeService bookTypeService;
    @RequestMapping("index.do")
    public String index(){
        BookInfo bookInfo = bookInfoService.selectByPrimaryKey(1);
        System.out.println(bookInfo);
        return "index";
    }
    @RequestMapping("selectAll.do")
    public String querybook( @RequestParam(value="bookTypeid",required=false,defaultValue="0") Integer bookTypeid,
                             @RequestParam(value="bookname",required=false,defaultValue="")String bookname,
                             @RequestParam(value="isborrow",required=false,defaultValue="-1") Integer borrow,
                             @RequestParam(value="now",required=false,defaultValue ="1")Integer now, ModelMap map){
        PageHelper.startPage(now,5);
        List<BookInfo> bookInfos = bookInfoService.selectAllBook(bookTypeid, bookname, borrow);
        PageInfo<BookInfo> pageInfo=new PageInfo<>(bookInfos);
        map.put("pageInfo",pageInfo);
        List<BookType> bookTypes = bookTypeService.selectAll();
        map.put("bookTypes", bookTypes);
        //将条件添加到map 作为回显
        map.put("bookTypeid", bookTypeid);
        map.put("bookname", bookname);
        map.put("borrow", borrow);
        return "index";
    }
}
