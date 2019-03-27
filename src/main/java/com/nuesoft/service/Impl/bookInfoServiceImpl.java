package com.nuesoft.service.Impl;

import com.nuesoft.dao.BookInfoMapper;
import com.nuesoft.po.BookInfo;
import com.nuesoft.po.BookInfoExample;
import com.nuesoft.service.bookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class bookInfoServiceImpl implements bookInfoService {
    @Autowired
    private BookInfoMapper bookInfoDao;
    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return bookInfoDao.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(BookInfo record) {
        return bookInfoDao.insert(record);
    }

    @Override
    public int insertSelective(BookInfo record) {
        return bookInfoDao.insertSelective(record);
    }

    @Override
    public List<BookInfo> selectByExample(BookInfoExample example) {
        return bookInfoDao.selectByExample(example);
    }

    @Override
    public BookInfo selectByPrimaryKey(Integer bookId) {
        return bookInfoDao.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(BookInfo record) {
        return bookInfoDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BookInfo record) {
        return bookInfoDao.updateByPrimaryKey(record);
    }

    @Override
    public List<BookInfo> selectAllBook(Integer bookid, String bookname, Integer borrow) {
        return bookInfoDao.selectAllBook(bookid,bookname,borrow);
    }
}
